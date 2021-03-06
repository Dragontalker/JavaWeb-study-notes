package com.dragontalker.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dragontalker.pojo.Book;
import com.dragontalker.pojo.Page;
import com.dragontalker.service.BookService;
import com.dragontalker.service.impl.BookServiceImpl;
import com.dragontalker.utils.WebUltis;

public class ClientBookServlet extends BaseServlet {

	private static final long serialVersionUID = -9125997132870675947L;
	
	private BookService bookService = new BookServiceImpl();
	
	protected void page(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 1. 获取请求的参数 pageNo 和 pageSize
		int pageNo = WebUltis.parseInt(req.getParameter("pageNo"), 1);
		int pageSize = WebUltis.parseInt(req.getParameter("pageSize"), Page.PAGE_SIZE);
		
		// 2. 调用BookService.page(pageNo, pageSize): Page对象
		Page<Book> page = bookService.page(pageNo, pageSize);
		
		page.setUrl("client/bookServlet?action=page");
		
		// 3. 保存Page对象到Request域中
		req.setAttribute("page", page);
		
		// 4. 请求转发到pages/manager/book_manager.jsp
		req.getRequestDispatcher("/pages/client/index.jsp").forward(req, resp);
	}
	
	protected void pageByPrice(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 1. 获取请求的参数 pageNo 和 pageSize
		int pageNo = WebUltis.parseInt(req.getParameter("pageNo"), 1);
		int pageSize = WebUltis.parseInt(req.getParameter("pageSize"), Page.PAGE_SIZE);
		int min = WebUltis.parseInt(req.getParameter("min"), 0);
		int max = WebUltis.parseInt(req.getParameter("max"), Integer.MAX_VALUE);
		
		// 2. 调用BookService.page(pageNo, pageSize): Page对象
		Page<Book> page = bookService.pageByPrice(pageNo, pageSize, min, max);
		
		StringBuilder stringBuilder = new StringBuilder("client/bookServlet?action=pageByPrice");
		
		if (req.getParameter("min") != null) {
			stringBuilder.append("&min=").append(req.getParameter("min"));
		}
		
		if (req.getParameter("max") != null) {
			stringBuilder.append("&max=").append(req.getParameter("max"));
		}
		
		page.setUrl(stringBuilder.toString());
		
		// 3. 保存Page对象到Request域中
		req.setAttribute("page", page);
		
		// 4. 请求转发到pages/manager/book_manager.jsp
		req.getRequestDispatcher("/pages/client/index.jsp").forward(req, resp);
	}
	
}
