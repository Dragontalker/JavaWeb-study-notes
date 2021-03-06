package com.dragontalker.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dragontalker.pojo.Book;
import com.dragontalker.pojo.Page;
import com.dragontalker.service.BookService;
import com.dragontalker.service.impl.BookServiceImpl;
import com.dragontalker.utils.WebUltis;

public class BookServlet extends BaseServlet {
	
	private static final long serialVersionUID = 2479212881642826003L;
	
	private BookService bookService = new BookServiceImpl();
	
	protected void page(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 1. 获取请求的参数 pageNo 和 pageSize
		int pageNo = WebUltis.parseInt(req.getParameter("pageNo"), 1);
		int pageSize = WebUltis.parseInt(req.getParameter("pageSize"), Page.PAGE_SIZE);
		
		// 2. 调用BookService.page(pageNo, pageSize): Page对象
		Page<Book> page = bookService.page(pageNo, pageSize);
		
		page.setUrl("manager/bookServlet?action=page");
		
		// 3. 保存Page对象到Request域中
		req.setAttribute("page", page);
		
		// 4. 请求转发到pages/manager/book_manager.jsp
		req.getRequestDispatcher("/pages/manager/book_manager.jsp").forward(req, resp);
	}

	protected void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Book book = WebUltis.copyParamToBean(req.getParameterMap(), new Book());
		bookService.addBook(book);
		resp.sendRedirect(req.getContextPath() + "/manager/bookServlet?action=page&pageNo=" + bookService.getPageTotal(Page.PAGE_SIZE));
	}
	
	protected void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = WebUltis.parseInt(req.getParameter("id"), 0);
		bookService.deleteBookById(id);
		resp.sendRedirect(req.getContextPath() + "/manager/bookServlet?action=page&pageNo=" + req.getParameter("pageNo"));
	}
	
	protected void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Book book = WebUltis.copyParamToBean(req.getParameterMap(), new Book());
		bookService.updateBook(book);
		resp.sendRedirect(req.getContextPath() + "/manager/bookServlet?action=page&pageNo=" + req.getParameter("pageNo"));
	}
	
	protected void list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1 通过BookService查询全部图书
        List<Book> books = bookService.queryBooks();
        //2 把全部图书保存到Request域中
        req.setAttribute("books", books);
        //3、请求转发到/pages/manager/book_manager.jsp页面
        req.getRequestDispatcher("/pages/manager/book_manager.jsp").forward(req,resp);
    }
	
	protected void getBook(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = WebUltis.parseInt(req.getParameter("id"), 0);
		Book book = bookService.queryBookById(id);
		req.setAttribute("book", book);
		req.getRequestDispatcher("/pages/manager/book_edit.jsp").forward(req, resp);
	}

}
