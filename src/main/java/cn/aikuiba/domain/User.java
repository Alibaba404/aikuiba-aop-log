package cn.aikuiba.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by 蛮小满Sama at 2024-02-19 19:08
 *
 * @description
 */
@TableName("t_user")
@Accessors(chain = true)
@Data
public class User {

    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    private String username;

    private String password;

    private String nickName;

    private Integer age;

    @TableLogic
    private Integer deleted;

    @Version
    private Integer version;


}
