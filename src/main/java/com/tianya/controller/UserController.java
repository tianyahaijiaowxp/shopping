package com.tianya.controller;

import com.tianya.eneity.ShoppingCartParam;
import com.tianya.eneity.TBook;
import com.tianya.eneity.TOrderForm;
import com.tianya.eneity.TUser;
import com.tianya.service.TBookService;
import com.tianya.service.TOrderFormService;
import com.tianya.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private TUserService userService;
    @Autowired
    private TBookService bookService;
    @Autowired
    private TOrderFormService orderFormService;

    @RequestMapping("/login")
    public String login(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String contextPath = request.getContextPath();
        request.getSession().setAttribute("contextPath", contextPath);
        System.out.println(username + ":" + password);

        TUser user = userService.findUserByUserName(username);

        if(user != null && password.equals(user.getPassword())){
            user.setPassword("");
            request.getSession().setAttribute("user", user);
            List<TBook> bookList = bookService.findAll();
            request.getSession().setAttribute("bookList", bookList);
            return "index";
        }
        return "login";
    }

    @RequestMapping("/addToShoppingCart")
    public String addToShoppingCart(HttpServletRequest request){
        TOrderForm orderForm = new TOrderForm();
        HttpSession session = request.getSession();
        TBook book = (TBook)session.getAttribute("book");
        TUser user = (TUser) session.getAttribute("user");
        orderForm.setOrderNumber(String.valueOf(System.currentTimeMillis()));
        orderForm.setCount(1);
        orderForm.setStatus(1);
        orderForm.setCreateTime(new Timestamp(System.currentTimeMillis()));
        orderForm.setBook(book);
        orderForm.setUser(user);
        orderFormService.insertOrderForm(orderForm);
        return "index";
    }

    @RequestMapping("/payAllOrder/{id}")
    public String payAllOrder(HttpServletRequest request,@PathVariable Integer id){
        TUser user = (TUser) request.getSession().getAttribute("user");
        System.out.println("payAllOrder" + id);
        orderFormService.payAllOrder(id);
        ShoppingCartParam param = new ShoppingCartParam();
        param.setUserId(user.getId());
        param.setStatus(0);
        List<TOrderForm> payList = orderFormService.findOrderFormByUserAndBookId(param);
        request.getSession().setAttribute("payList", payList);
        return "order";
    }
}
