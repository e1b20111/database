package oit.is.z0769.kaizi.database.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import oit.is.z0769.kaizi.database.model.Chamber;
import oit.is.z0769.kaizi.database.model.ChamberMapper;


/**
 * /sample4へのリクエストを扱うクラス authenticateの設定をしていれば， /sample4へのアクセスはすべて認証が必要になる
 */
@Controller
@RequestMapping("/sample4")
public class Sample41Controller {

  @Autowired
  ChamberMapper chamberMapper;


  @GetMapping("step1")
  public String sample41() {
    return "sample41.html";
  }

  /**
   * 指定したidをPATHパラメータで受け取り，そのidに対応するデータを取得して返す
   *
   * @param id
   * @param model
   * @return
   */
  @GetMapping("step2/{id}")
  public String sample42(@PathVariable Integer id, ModelMap model) {
    Chamber chamber2 = chamberMapper.selectById(id);
    model.addAttribute("chamber2", chamber2);

    return "sample41.html";
  }
}
