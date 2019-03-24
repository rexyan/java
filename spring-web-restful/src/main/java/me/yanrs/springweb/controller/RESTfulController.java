package me.yanrs.springweb.controller;

import me.yanrs.springweb.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class RESTfulController {

    // http://127.0.0.1:8080/spring-web/boot/user/1/zhangsan
//    @RequestMapping("/boot/user/{id}/{name}")
//    public Object user(@PathVariable("id") Integer id, @PathVariable("name") String name){
//        User user = new User();
//        user.setId(id);
//        user.setName(name);
//        return user;
//    }

    @PostMapping("/boot/user/{id}/{name}")
    public Object user1(@PathVariable("id") Integer id, @PathVariable("name") String name){
        User user = new User();
        user.setId(id);
        user.setName(name);
        return user;
    }

    @DeleteMapping("/boot/user/{id}/{name}")
    public Object user2(@PathVariable("id") Integer id, @PathVariable("name") String name){
        User user = new User();
        user.setId(id);
        user.setName(name);
        return user;
    }

    @PutMapping("/boot/user/{id}/{name}")
    public Object user3(@PathVariable("id") Integer id, @PathVariable("name") String name){
        User user = new User();
        user.setId(id);
        user.setName(name);
        return user;
    }

    @GetMapping("/boot/user/{id}/{name}")
    public Object user4(@PathVariable("id") Integer id, @PathVariable("name") String name){
        User user = new User();
        user.setId(id);
        user.setName(name);
        return user;
    }
}
