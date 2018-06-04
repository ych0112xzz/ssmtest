package com.gtja.finance.controller;


import com.gtja.finance.dao.UserinfoMapper;
import com.gtja.finance.pojo.Userinfo;
import com.gtja.finance.service.UserService;
import com.gtja.finance.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.Writer;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController {
    //自动注入
    @Resource
    private UserService userService;
    @Autowired
    UserinfoMapper userinfoMapper;

    @RequestMapping("showuser")
    public String showUser(HttpServletRequest req) {
        //获取所有用户信息，这里偷懒，下一行只取一个
        List<Map<String, Object>> list = userService.listUsers();
        //获取第一个用户信息
        Map<String, Object> map = list.get(0);
        req.setAttribute("userName", map.get("userName"));
        req.setAttribute("userPassword", map.get("userPassword"));
        return "main";
    }

    @RequestMapping("/userId")
    public void getUser(HttpServletRequest req) {
        Userinfo userinfo = userinfoMapper.selectByPrimaryKey(2);

        System.out.println(userinfo.getBirthday()+"\t"+userinfo.getUsername());

    }
}
