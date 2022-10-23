package oit.is.z0769.kaizi.database.controller;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;


/**
 * /sample4へのリクエストを扱うクラス authenticateの設定をしていれば， /sample4へのアクセスはすべて認証が必要になる
 */
@Controller
@RequestMapping("/sample4")
public class Sample41Controller {

  @GetMapping("step1")
  public String sample41() {
    return "sample41.html";
  }
}
