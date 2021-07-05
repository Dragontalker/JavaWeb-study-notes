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
		
		System.out.println(cart);
		
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

}
