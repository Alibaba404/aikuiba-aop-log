package cn.aikuiba.core.aop;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * Created by 蛮小满Sama at 2024-02-19 18:24
 *
 * @description 日志对象
 */
@Accessors(chain = true)
@Data
@TableName("t_logs")
public class LogInfo {
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private Long userId;
    private String username;
    private LocalDateTime createAt;
    private String className;
    private String methodName;
    private String methodParams;
    private String returnValue;
    private Long costTime;
    private String ip;
    /*逻辑删除*/
    @TableLogic
    private Integer deleted;

    @Version
    private Integer version;
}
