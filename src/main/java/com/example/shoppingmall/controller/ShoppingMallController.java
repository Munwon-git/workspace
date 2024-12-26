package com.example.shoppingmall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShoppingMallController {

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("title", "쇼핑몰 홈");
        return "index";  // templates/index.html로 이동
    }

    @GetMapping("/product")
    public String productPage(Model model) {
        model.addAttribute("title", "상품 페이지");
        return "product";
    }
}
