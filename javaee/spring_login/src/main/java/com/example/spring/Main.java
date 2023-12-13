package com.example.spring;

import com.example.spring.service.User;
import com.example.spring.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //创建一个Spring的IoC容器实例，然后加载配置文件，让Spring容器为我们创建并装配好配置文件中指定的所有Bean
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        UserService userService = context.getBean(UserService.class);
//        UserService userService = new UserService();
        User user = userService.login("bob@example.com", "password");
        System.out.println(user.getName());
    }
}
