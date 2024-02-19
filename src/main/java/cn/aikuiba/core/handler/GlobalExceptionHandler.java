package cn.aikuiba.core.handler;

import cn.aikuiba.core.resp.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 蛮小满Sama at 2024-02-19 19:42
 *
 * @description
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public R globalException(Exception e, HttpServletRequest request) {
        log.info("系统出现异常!!!");
        e.printStackTrace();
        return R.failure(500, "服务器异常");
    }
}
