package cn.aikuiba.service;

import cn.aikuiba.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * Created by 蛮小满Sama at 2024-02-19 19:13
 *
 * @description
 */
public interface IUserService extends IService<User> {
    List<User> listUsers();

    Boolean addUser(User user);
}
