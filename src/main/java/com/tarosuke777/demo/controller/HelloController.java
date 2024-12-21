package com.tarosuke777.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

  @GetMapping(value = {"/", "/hello"})
  public String getHello(Model model) {
    return "hello";
  }
}
