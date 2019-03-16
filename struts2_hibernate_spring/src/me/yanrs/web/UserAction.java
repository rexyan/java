package me.yanrs.web;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import me.yanrs.model.User;
import me.yanrs.service.IUserService;

public class UserAction extends ActionSupport implements ModelDriven<User> {

    private User user = new User();

    private IUserService userService;
    // 这里需要设置 set 方法，且属性名称 userService 必须要和 bean 中配置的一样，这样 Spring 才能注入。
    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    public String register(){
        // 获取请求参数
        System.out.println(user);

        // 调用 service
        userService.register(user);

        // 返回结果
        return "success";
    }

    @Override
    public User getModel() {
        return user;
    }
}
