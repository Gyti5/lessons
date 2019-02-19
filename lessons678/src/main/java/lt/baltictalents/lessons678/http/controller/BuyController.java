package lt.baltictalents.lessons678.http.controller;

import lt.baltictalents.lessons678.model.Image;
import lt.baltictalents.lessons678.model.Item;
import lt.baltictalents.lessons678.model.Product;
import lt.baltictalents.lessons678.service.auth.ImageService;
import lt.baltictalents.lessons678.service.auth.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BuyController {
    @Autowired
    ProductService productService;
    @Autowired
    ImageService imageService;

    @GetMapping("/buy")
    public String getBuy(Model model) {
        model.addAttribute("product", new Product());
        model.addAttribute("item", new Item());

        return "buy";
    }


    @RequestMapping(value = "/saveProduct")
    public String saveItem(Product product){
            productService.save(product);
        return "redirect:/buyImg";
    }

//----------------------------------------------
    @GetMapping("/buyImg")
    public String getBuyImg(Model model) {
        model.addAttribute("image", new Image());
        return "buyImg";
    }


    @RequestMapping(value = "/saveProductImg")
    public String saveItem(Image image){
        imageService.save(image);

        return "done";
    }





}