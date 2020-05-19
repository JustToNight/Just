package com.lk.controller;

import com.lk.bean.User;
import com.lk.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("getAll")
    public String getAll(Model model) {
        model.addAttribute("users", userService.getAll());
        return "main";
    }

    @RequestMapping("getUserByName")
    public String getUserByName(String name, Model model) {
        System.out.println("参数:" + name);
        model.addAttribute("users", userService.getUserByName(name));
        return "main";
    }

    @RequestMapping("addUser")
    public String addUser(User user, Model model) {
        boolean ok = userService.addUser(user);
        if (ok) {
            System.out.println("新增成功");
        }
        return getAll(model);
    }

    @RequestMapping("deleteUser")
    public String deleteUser(int uid, Model model) {
        boolean i = userService.deleteUser(uid);
        if (i) {
            System.out.println("删除成功");
        }
        return getAll(model);
    }

    @RequestMapping("toUpdate")
    public ModelAndView toUpdate(String uid) {
        ModelAndView mv = new ModelAndView("updateoradd");
        if (uid!=null){
            System.out.println("跳转修改 根据id查询用户");
            mv.addObject("user",userService.getById(Integer.valueOf(uid)));
        }
        return mv;
    }

    @RequestMapping("updateUser")
    public ModelAndView updateUser(@Param("id") String id,User user) {
        ModelAndView mv = new ModelAndView("redirect:getAll");
        if (id.equals("")){
            System.out.println("新增中");
            boolean b = userService.addUser(user);
            System.out.println(b);
            if (!b){
                System.out.println("修改失败");
                return new ModelAndView("redirect:toUpdate");
            }
        }else {
            System.out.println("更新中");
            user.setUid(Integer.valueOf(id));
            boolean b = userService.updateUser(user);
            if (!b){
                System.out.println("更新失败");
                return new ModelAndView("redirect:toUpdate?uid="+id);
            }
        }
return mv;
    }

}
