package com.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
@Controller
public class MainController {

    /**
     * 起始页映射
     **/
    @RequestMapping(value = {"", "/"})
    public String index() {
        return "index";
    }
}
