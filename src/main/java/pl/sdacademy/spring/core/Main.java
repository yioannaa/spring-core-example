package pl.sdacademy.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.sdacademy.spring.config.HibernateConfig;
import pl.sdacademy.spring.model.UserModel;
import pl.sdacademy.spring.service.MenuService;
import pl.sdacademy.spring.service.UserService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        ApplicationContext context = new AnnotationConfigApplicationContext(
//                HibernateConfig.class);
//
//        UserService service =  context
//                .getBean(UserService.class);
//        UserModel user1 = new UserModel();
//        user1.setName("Paul");
//        user1.setEmail("paul@example.com");
//
//        service.save(user1);
//
//        System.out.println(service.list());

        MenuService.start();











    }

}
