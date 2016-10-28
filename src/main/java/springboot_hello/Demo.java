package springboot_hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * helloworld
 */
//其中@SpringBootApplication申明让spring boot自动给程序进行必要的配置，等价于以默认属性使用@Configuration，@EnableAutoConfiguration和@ComponentScan
@RestController
@SpringBootApplication
public class Demo {
    @RequestMapping("/")
    public String hello(){
        return "helloboot";
    }

    public static void main(String[] args) {
        SpringApplication.run(Demo.class,args);
    }
}
