package me.yanrs.action;

import me.yanrs.model.User;
import me.yanrs.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller("myController")
public class UserAction {
    @Autowired // Spring 会自动按照类型注入 userService 赋值，我们也可以指定 id 注入
    @Qualifier("myUserService") // 根据 id 去注入
    private IUserService userService;

    public void save(User user){
        System.out.println("action 调用 service 保存用户");
        userService.add(user);
    }
}
