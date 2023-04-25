package sample.project.monocatalog.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import sample.project.bean.Brand;
import sample.project.bean.Motorcycle;

@Controller
public class MotosController {

   // @RequestMapping("/hello")
   // public String hello(@RequestParam String name, Model model){
   // model.addAttribute(attributeName:"name", name);
   // return "test";
   // }

   // moto_list.html を呼び出す
   @GetMapping("/motos")
   public String motos(Model model) {

      // ブランド
      List<Brand> brands = new ArrayList<>();
      brands.add(new Brand("01", "HONDA"));
      // brands.add(new Brand(brandId:"02", brandName:"KAWASAKI"));
      // brands.add(new Brand(brandId:"03", brandName:"YAMAHA"));
      // brands.add(new Brand(brandId:"04", brandName:"SUZUKI"));

      // バイク
      List<Motorcycle> motos = new ArrayList<>();
      motos.add(new Motorcycle(1, "GB350", 800, 1, "空冷", 5, "良い音", new Brand("01", "HONDA"), 1, null, null));
      // motos.add(new Motorcycle (motoNo:2, motoName:"NINJA",seatHeight:800,
      // cylinder:2,cooling:"水冷",price:10000000, comment:"良い良い音",new
      // Brand(brandId:"02",brandName:"KAWASAKI"),version:1,insDt:null,updDt:null));
      // motos.add(new Motorcycle (motoNo:3, motoName:"Z900RS CAFE",seatHeight:820,
      // cylinder:2,cooling:"水冷",price:13800000, comment:"良い音がする",new
      // Brand(brandId:"02",brandName:"KAWASAKI"),version:1,insDt:null,updDt:null));

      model.addAttribute("brands", brands);
      model.addAttribute("motos", motos);

      return "moto_list";
   }
}
