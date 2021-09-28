package com.itheima.controller;

import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author: Eric
 * @since: 2020/11/17
 */
@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    //@RequestMapping(value = "/list",method = RequestMethod.GET)
    @GetMapping("/list")
    public String list(Model model){
        List<Items> list = itemsService.findAll();
        // ModelAndView
        //ModelAndView modelAndView = new ModelAndView();
        //modelAndView.setViewName("items");
        //modelAndView.addObject("list",list);
        //return modelAndView;


        // 塞给页面
        model.addAttribute("items",list);
        // 返回视图
        return "items";
    }
}
