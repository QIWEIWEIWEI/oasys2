package comjkk.controller;

import comjkk.entity.Brand;
import comjkk.service.BrandService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;
@Controller
public class BrandController {
    @Resource
    private BrandService brandService;
    @RequestMapping("/")
    public String list(){
        return "redirect:/list";
    }
    @RequestMapping("/list")
    public  String list(Model model){
        List<Brand> brands = brandService.BrandList();
        model.addAttribute("brands",brands);
        return "brand/brandlist";
    }
     @RequestMapping("/edit")
       public String edit(Brand brand){
         brandService.update(brand);
           return "redirect:/list";
       }

       @RequestMapping("/toedit")
       public  String toedit(Model model,int id){
           Brand brand = brandService.findById(id);
           model.addAttribute("brand",brand);
           return "brand/brandedit";
       }
    @RequestMapping("/toadd")
    public String toadd(){
        return "brand/brandadd";
    }

    @RequestMapping("/add")
    public String add(Brand brand){
        brandService.save(brand);
        return "redirect:/list";
    }

    @RequestMapping("/delete")
    public String delete(Brand brand) {
        brandService.delete(brand);
        return "redirect:/list";
    }


}
