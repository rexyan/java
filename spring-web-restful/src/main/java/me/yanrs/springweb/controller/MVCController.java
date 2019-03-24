package me.yanrs.springweb.controller;

import me.yanrs.springweb.model.User;
import org.springframework.web.bind.annotation.*;

// RestController = @Controller + @ResponseBody。是 Spring4 后新增的注解，功能是用于返回字符串或 json 数据
@RestController
public class MVCController {

    // value 是 URL 的地址，method 是该地址的请求方法
    @RequestMapping(value = "/boot/getUser", method = RequestMethod.GET)
    public Object getUser(){
        User user = new User();
        user.setId(1);
        user.setName("汪汪");
        return user;
    }

    // @GetMapping = RequestMethod.GET 请求 + @RequestMapping。和上面的功能等价。
    @GetMapping("/boot/getUser1")
    public Object getUser1(){
        User user = new User();
        user.setId(1);
        user.setName("汪汪");
        return user;
    }

    // @PostMapping = RequestMethod.POST 请求 + @RequestMapping
    @PostMapping("/boot/getUser2")
    public Object getUser2(){
        User user = new User();
        user.setId(1);
        user.setName("汪汪");
        return user;
    }

    // 同理，还有 PutMapping，DeleteMapping
}
