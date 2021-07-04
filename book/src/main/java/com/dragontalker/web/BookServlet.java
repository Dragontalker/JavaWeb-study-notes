package com.dragontalker.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dragontalker.pojo.Book;
import com.dragontalker.service.BookService;
import com.dragontalker.service.impl.BookServiceImpl;
import com.dragontalker.utils.WebUltis;

public class BookServlet extends BaseServlet {
	
	private BookService bookService = new BookServiceImpl();

	protected void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Book book = WebUltis.copyParamToBean(req.getParameterMap(), new Book());
		bookService.addBook(book);
		resp.sendRedirect(req.getContextPath() + "/manager/bookServlet?action=list");
	}
	
	protected void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = WebUltis.parseInt(req.getParameter("id"), 0);
		bookService.deleteBookById(id);
		resp.sendRedirect(req.getContextPath() + "/manager/bookServlet?action=list");
	}
	
	protected void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
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
