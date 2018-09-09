package org.feidian.hzau.bbs.web.controller;

import lombok.Getter;
import lombok.Setter;
import org.feidian.hzau.bbs.data.entity.User;
import org.feidian.hzau.bbs.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author stormphoenix
 * @date 2018-09-06
 * @time 上午12:43
 */
@Controller
public class LoginController extends BaseController {

    @Getter
    @Setter
    private List<User> users;

    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public String index(Model model) {
        users = userService.getAll();
        model.addAttribute("users", users);
        return "index";
    }
}
