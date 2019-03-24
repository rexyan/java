package me.yanrs.springweb.controller;

import me.yanrs.springweb.config.ConfigInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConfigInfoController {

    // 读取配置文件中的默认配置, 方式1(使用 @Value 注解)
    @Value("${boot.name}")
    private String name;

    @Value("${boot.value}")
    private String value;

    // 读取配置文件中的默认配置, 方式2（使用 ConfigurationProperties 将其配置成一个对象）
    @Autowired
    private ConfigInfo configInfo;

    @RequestMapping("/boot/config")
    public @ResponseBody String configInfo(){
        return name + "----" + value + "----" + configInfo.getName() + "----" + configInfo.getValue();
    }
}
