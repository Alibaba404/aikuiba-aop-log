package cn.aikuiba.controller;

import cn.aikuiba.core.aop.annotation.Log;
import cn.aikuiba.core.resp.R;
import cn.aikuiba.domain.User;
import cn.aikuiba.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 蛮小满Sama at 2024-02-19 19:11
 *
 * @description
 */
@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private IUserService iUserService;

    @GetMapping
    public R listUsers() {
        return R.ok(iUserService.listUsers());
    }


    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    @Log
    @PutMapping
    public R addUser(@RequestBody User user) {
        iUserService.addUser(user);
        return R.ok(200, "新增用户成功");
    }
}
