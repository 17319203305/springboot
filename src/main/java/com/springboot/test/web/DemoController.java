package com.springboot.test.web;

import com.springboot.test.bean.Demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**测试
 * Created by nanusl on 2016/10/27/027.
 */
@RestController
@SpringBootApplication
@RequestMapping("/demo")
public class DemoController {
    @RequestMapping("/getDemo")
    public Demo getDemo(){
        Demo demo = new Demo();
        demo.setId(1);
        demo.setName("Angle");
        return demo;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoController.class,args);
    }
}
