package com.swiftbeard.didemo;

import com.swiftbeard.didemo.controllers.ConstructedInjectedController;
import com.swiftbeard.didemo.controllers.MyController;
import com.swiftbeard.didemo.controllers.PropertyInjectedController;
import com.swiftbeard.didemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");


        System.out.println(controller.hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructedInjectedController.class).sayHello());
    }

}
