package cn.aikuiba.service.impl;

import cn.aikuiba.domain.User;
import cn.aikuiba.mapper.UserMapper;
import cn.aikuiba.service.IUserService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by 蛮小满Sama at 2024-02-19 19:13
 *
 * @description
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Override
    public List<User> listUsers() {
        return super.list(new Page<>(1, 10));
    }

    @Transactional
    @Override
    public Boolean addUser(User user) {
        System.out.println(1 / 0);
        return super.save(user);
    }
}
