package com.cd.controller;

import com.cd.domain.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author cdviviany
 * @version 1.00
 */

//以下属于spring-mvc的前端控制器管理的controller
@Controller
public class UserController {

    //上传文件
//    导入fileupload和io坐标
//②配置文件上传解析器
//③编写文件上传代码
    @RequestMapping("/quick12")
    @ResponseBody
    public void quickMethod12(String username, MultipartFile upload,MultipartFile[] uploads) throws IOException {
        String originalFilename = upload.getOriginalFilename();
        //自带方法转存
        upload.transferTo(new File("G:\\"+originalFilename));

        //多个文件增强for循环
        for (MultipartFile multipartFile : uploads) {
            String originalFilename1 = multipartFile.getOriginalFilename();
            multipartFile.transferTo(new File("G:\\"+originalFilename));
        }
    }


    //获取cookie的值
    @RequestMapping("/quick11")
    @ResponseBody
    public void quickMethod11(@CookieValue(value = "JSESSIONID") String cookie){
        System.out.println(cookie);
    }

    //获取请求头参数
    @RequestMapping("/quick10")
    @ResponseBody
    public void quickMethod10(@RequestHeader(value = "User-Agent") String user_agent){
        System.out.println(user_agent);
    }

    //自定义格式转换器
    @RequestMapping("/quick9")
    @ResponseBody
    public void quickMethod9(Date date){
        System.out.println(date);
    }

    //restful风格请求参数
    @RequestMapping("/quick8/{name}")
    @ResponseBody
    public void quickMethod8(@PathVariable(value = "name",required = true) String username){
        System.out.println(username);
    }

    //使用ajax直接返回集合
    @RequestMapping("/quick7")
    @ResponseBody
    public void quickMethod7(@RequestBody List<User> userList){
        System.out.println(userList);
    }


    @RequestMapping("/quick6")
    @ResponseBody
    public void quickMethod6(@RequestParam(value = "name",required = false,defaultValue = "小天鹅") String username) throws IOException {
        System.out.println(username);
    }

    @RequestMapping("/quick5")
    @ResponseBody
    public User save5() throws JsonProcessingException {
        User user = new User();
        user.setName("小明");
        user.setAge(18);
        user.setAddr("北京");
        //处理器映射器把对象转换为json格式
        return user;
    }

    @RequestMapping("/quick4")
    @ResponseBody
    public String save4() throws JsonProcessingException {
        User user = new User();
        user.setName("小明");
        user.setAge(18);
        user.setAddr("北京");
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(user);
        return json;
    }

//直接返回字符串
    @RequestMapping("/quick3")
    @ResponseBody//把文字加在响应体内
    public String save3(){
        return "你就是我的master吗？";
    }

    //跳转页面model and view
    @RequestMapping("/quick2")
    public ModelAndView save2(ModelAndView modelAndView){
        modelAndView.addObject("name","上帝大人");
        modelAndView.setViewName("success.jsp");
        return modelAndView;
    }

//这里不用再去web.xml注册了
    @RequestMapping("/quick")
    public String save(){
        System.out.println("save running");
        //输入的是跳转的页面
        return "success.jsp";
    }
}
