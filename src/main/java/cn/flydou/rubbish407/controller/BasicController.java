package cn.flydou.rubbish407.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Eraser on 2017/6/2.
 */
@Controller
public class BasicController {
    @RequestMapping("/")
    public String index(){
        return "../../index";
    }
}
