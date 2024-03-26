package com.DesenvolvimentoNuvem.atividade1.controller;

import com.DesenvolvimentoNuvem.atividade1.entity.Product;
import com.DesenvolvimentoNuvem.atividade1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CrudController {

    private ProductService productService;

    @Autowired
    public CrudController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public String getIndex(){
        return "index";
    }

    @GetMapping("/list")
    public String getList(Model model){
        List<Product> products = productService.findAll();

        model.addAttribute("products", products);

        return "products/list";
    }

    @GetMapping("/showAddForm")
    public String showAddForm(Model model){
        Product product = new Product();

        model.addAttribute("product", product);

        return "products/product-form";
    }

    @PostMapping("/save")
    public String saveProduct(@ModelAttribute("product") Product product){

        productService.save(product);

        return "redirect:list";
    }

    @GetMapping("/showUpdateForm")
    public String showUpdateForm(@RequestParam("productId") int id, Model model){
        Product product = productService.findById(id);

        model.addAttribute("product", product);

        return "products/product-form";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("productId")int id){

        productService.deleteById(id);

        return "redirect:list";
    }
}
