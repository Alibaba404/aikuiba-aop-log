package cn.aikuiba.core.aop;

import cn.aikuiba.mapper.LogMapper;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.Arrays;

/**
 * Created by 蛮小满Sama at 2024-02-19 18:08
 *
 * @description
 */
@Slf4j
@Aspect
@Component
public class LogAspect {

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private LogMapper logMapper;

    @Pointcut("@annotation(cn.aikuiba.core.aop.annotation.Log)")
    public void pointcut() {

    }


    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoint) {
        try {
            // 操作的类名
            String className = joinPoint.getTarget().getClass().getName();
            // 操作的方法名
            String methodName = joinPoint.getSignature().getName();
            // 操作方法的参数列表
            Object[] args = joinPoint.getArgs();
            // 方法执行开始毫秒值
            long millisBegin = System.currentTimeMillis();
            // 操作方法的返回值
            Object proceed = joinPoint.proceed();
            // 方法执行结束时毫秒值
            long millisFinish = System.currentTimeMillis();
            // 日志对象
            LogInfo logInfo = new LogInfo();
            logInfo.setUserId(1L);
            logInfo.setUsername("小至");
            logInfo.setCreateAt(LocalDateTime.now());
            logInfo.setClassName(className);
            logInfo.setMethodName(methodName);
            logInfo.setMethodParams(Arrays.toString(args));
            logInfo.setReturnValue(String.valueOf(proceed));
            logInfo.setCostTime(millisFinish - millisBegin);
            logInfo.setIp(request.getRemoteAddr());
            logMapper.insert(logInfo);
            return proceed;
        } catch (Throwable e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
