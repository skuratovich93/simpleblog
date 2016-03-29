package com.simpleblog.controller;

import com.simpleblog.domain.Blog;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author y.skuratovich
 * @version 29.03.2016
 */
@RestController
public class BlogController {

    @RequestMapping("/blog")
    public Blog getBlog(){
        return new Blog();
    }

}
