package cn.aikuiba.controller;

import cn.aikuiba.core.aop.annotation.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 蛮小满Sama at 2024-02-19 18:12
 *
 * @description
 */
@RequestMapping("/test")
@RestController
public class TestController {

    @Log
    @GetMapping
    public String getOne() {
        return "123";
    }
}
