package com.snapupproject;

import com.snapupproject.dao.UserDOMapper;
import com.snapupproject.dataobject.UserDO;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = {"com.snapupproject"})
@RestController
@MapperScan("com.snapupproject.dao")
public class App {
    @Autowired
    private UserDOMapper userDOMapper;

    @RequestMapping("/")
    public String home() {
        UserDO userDO = userDOMapper.selectByPrimaryKey(1);
        if (userDO == null) {
            return "用户对象不存在！";
        }

        return "Hello " + userDO.getName() + "!";
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
