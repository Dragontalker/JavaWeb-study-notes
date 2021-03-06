package com.dragontalker.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dragontalker.pojo.Book;
import com.dragontalker.pojo.Cart;
import com.dragontalker.pojo.CartItem;
import com.dragontalker.service.BookService;
import com.dragontalker.service.impl.BookServiceImpl;
import com.dragontalker.utils.WebUltis;

public class CartServlet extends BaseServlet {
	
	private static final long serialVersionUID = -6470408799619109744L;
	
	private BookService bookService = new BookServiceImpl();

	protected void addItem(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = WebUltis.parseInt(req.getParameter("id"), 0);
		
		Book book = bookService.queryBookById(id);
		
		CartItem cartItem = new CartItem(book.getId(), book.getName(), 1, book.getPrice(), book.getPrice());
		
		Cart cart = (Cart) req.getSession().getAttribute("cart"); 
		
		if (cart == null) {
			cart = new Cart();
			req.getSession().setAttribute("cart", cart);
		}
		
		cart.addItem(cartItem);
		
		req.getSession().setAttribute("lastName", cartItem.getName());
		
		resp.sendRedirect(req.getHeader("Referer"));
	}
	
	protected void deleteItem(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = WebUltis.parseInt(req.getParameter("id"), 0);
		
		Cart cart = (Cart) req.getSession().getAttribute("cart");
		
		if (cart != null) {
			cart.deleteItem(id);
			resp.sendRedirect(req.getHeader("Referer"));
		}
	}
	
	protected void clear(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cart cart = (Cart) req.getSession().getAttribute("cart");
		
		if (cart != null) {
			cart.clear();
			resp.sendRedirect(req.getHeader("Referer"));
		}
	}
	
	protected void updateCount(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        // 获取请求的参数 商品编号 、商品数量
        int id = WebUltis.parseInt(req.getParameter("id"),0);
        int count = WebUltis.parseInt(req.getParameter("count"), 1);
        // 获取Cart购物车对象
        Cart cart = (Cart) req.getSession().getAttribute("cart");

        if (cart != null) {
            // 修改商品数量
            cart.updateCount(id,count);
            // 重定向回原来购物车展示页面
            resp.sendRedirect(req.getHeader("Referer"));
        }
    }

}
