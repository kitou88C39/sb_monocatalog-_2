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
      brands.add(new Brand("02", "KAWASAKI"));
      brands.add(new Brand("03", "YAMAHA"));
      brands.add(new Brand("04", "SUZUKI"));

      // バイク
      List<Motorcycle> motos = new ArrayList<>();
      motos.add(new Motorcycle(1, "GB350", 800, 1, "空冷", 50, "良い音", new Brand("01", "HONDA"), 1, null, null));
      motos.add(new Motorcycle(2, "Ninja", 800, 2, "水冷", 100, "良い音", new Brand("02", "KAWASAKI"), 1, null, null));
      motos.add(new Motorcycle(3, "Z900RS", 820, 4, "水冷", 138, "良い音", new Brand("03", "KAWASAKI"), 1, null, null));
      motos.add(new Motorcycle(4, "GB350", 800, 1, "空冷", 5, "良い音", new Brand("01", "HONDA"), 1, null, null));
      motos.add(new Motorcycle(5, "GB350", 800, 1, "空冷", 5, "良い音", new Brand("01", "HONDA"), 1, null, null));
      motos.add(new Motorcycle(6, "GB350", 800, 1, "空冷", 5, "良い音", new Brand("01", "HONDA"), 1, null, null));

      model.addAttribute("brands", brands);
      model.addAttribute("motos", motos);

      return "moto_list";
   }
}
