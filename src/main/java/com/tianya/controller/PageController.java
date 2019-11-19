package com.tianya.controller;

import com.tianya.eneity.ShoppingCartParam;
import com.tianya.eneity.TBook;
import com.tianya.eneity.TOrderForm;
import com.tianya.eneity.TUser;
import com.tianya.service.TBookService;
import com.tianya.service.TOrderFormService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class PageController {

    @Autowired
    private TBookService bookService;
    @Autowired
    TOrderFormService orderFormService;

    @RequestMapping("/loginPage")
    public String loginPage(){
        System.out.println("这是主页");
        return "login";
    }

    @RequestMapping("/index")
    public String index(HttpServletRequest request){
        List<TBook> bookList = bookService.findAll();
        request.setAttribute("bookList", bookList);
        return "index";
    }

    @RequestMapping("/bookDisplay")
    public String bookDisplay(@RequestParam("id") Integer id, HttpServletRequest request){
        TUser user = (TUser) request.getSession().getAttribute("user");
        if(user == null){
            return "login";
        }
        System.out.println(id);
        TBook book = bookService.findBookById(id);
//        System.out.println("bookDisplay:" + book);
        request.getSession().setAttribute("book", book);
        return "book";
    }

    @RequestMapping("/shoppingCart")
    public String shoppingCart(HttpServletRequest request){
        ShoppingCartParam param = new ShoppingCartParam();
        TUser user = (TUser) request.getSession().getAttribute("user");
        if(user == null){
            return "login";
        }

        param.setUserId(user.getId());;
        param.setStatus(1);
        List<TOrderForm> form = orderFormService.findOrderFormByUserAndBookId(param);
//        for (TOrderForm order : form) {
//            System.out.println(form);
//        }
        request.getSession().setAttribute("form", form);
        return "shoppingCart";
    }

    @RequestMapping("/deleteOrder")
    public String deleteOrder(Integer id){
        orderFormService.deleteOrderFormByPrimaryKey(id);
        return "forward:/shoppingCart";
    }

    @RequestMapping("/orderPage")
    public String orderPage(HttpServletRequest request){
        TUser user = (TUser) request.getSession().getAttribute("user");
        if(user == null){
            return "login";
        }
        ShoppingCartParam param = new ShoppingCartParam();
        param.setUserId(user.getId());
        param.setStatus(0);
        List<TOrderForm> payList = orderFormService.findOrderFormByUserAndBookId(param);
        request.getSession().setAttribute("payList", payList);
        return "order";
    }
}
