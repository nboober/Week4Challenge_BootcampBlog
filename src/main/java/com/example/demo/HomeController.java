package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @RequestMapping("/description")
    public String description(){
        return "description";
    }

    @RequestMapping("/author")
    public String author(){
        return "author";
    }

    @RequestMapping("/blog-css-bootstrap")
    public String blogcssbootstrap(){
        return "blogcssbootstrap";
    }

    @RequestMapping("/blog-html")
    public String bloghtml(){
        return "bloghtml";
    }

    @RequestMapping("/core-java-1")
    public String corejava1(){
        return "corejava1";
    }

    @RequestMapping("/core-java-2")
    public String corejava2(){
        return "corejava2";
    }

    @RequestMapping("/github-1")
    public String github1(){
        return "github1";
    }

    @RequestMapping("/github-2")
    public String github2(){
        return "github2";
    }

    @RequestMapping("/oop-1")
    public String oop1(){
        return "oop1";
    }

    @RequestMapping("/oop-2")
    public String oop2(){
        return "oop2";
    }

    @RequestMapping("/p-design")
    public String pdesign(){
        return "pdesign";
    }

    @RequestMapping("/algorithm")
    public String algorithm(){
        return "algorithm";
    }

}




