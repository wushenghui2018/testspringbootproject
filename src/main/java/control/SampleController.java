package control;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
//@SpringBootApplication注解默认是扫描本包及子包中的注解，要想自定义可以使用@ComponentScan()来指定扫描路径
//继承SpringBootServletInitializer就可以像普通web项目一样加在自己tomcat中运行就可以了
public class SampleController  extends SpringBootServletInitializer{

       public static void main(String[] args) {
       SpringApplication.run(SampleController.class, args);
   }
}