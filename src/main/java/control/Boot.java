package control;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bean.User;

@RestController
public class Boot {
 @Autowired
 private User user;
 //在浏览器中应为springboot使用的是内置tomcat所以不需要加项目名例如：http://localhost:8080/boot访问即可
 @RequestMapping("/boot")
 public String ss(){
  user.setName("张三");
  user.setSex("男");
   user.setAddre("北京");
   String data="{\"name\":\"张三\"}";//用于拼接json格式字符串
  
  return data; 
 }
}