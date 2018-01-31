package com.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

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

    /**
     * 文件上传处理方法
     **/
    @RequestMapping(value = "/fileUpload")
    public ModelAndView fileUpload(
            String birthday,
            String username,
            MultipartFile photo,
            HttpServletRequest request) throws IOException {

        System.out.println(birthday + "  " + username);
        System.out.println(photo);

        /*定义要转发的页面以及携带的数据*/
        ModelAndView mv = new ModelAndView();

        /*处理文件*/
        if (photo != null) {
            String root = request.getRealPath(
                    "/imges/");
            File parent = new File(root);
            //先检查要存储的目标文件夹是否存在
            if (!parent.exists()
                    || !parent.isDirectory()) {
                parent.mkdirs();
            }

            //获得上传的文件名称
            String fileName = photo.getOriginalFilename();

            //创建一个空的文件对象  用于保存文件
            File saveFile = new File(parent, fileName);

            //将上传的临时文件保存到目标文件中
            photo.transferTo(saveFile);

            System.out.println("文件保存目录：" +
                    saveFile.getAbsolutePath());

            //将保存的文件路径存储到model中
            mv.addObject("filePath",
                    saveFile.getAbsoluteFile());
        }

        mv.addObject("username", username);
        mv.addObject("birthday", birthday);

        /*设置要转发的页面名称*/
        mv.setViewName("success");


        return mv;
    }
}
