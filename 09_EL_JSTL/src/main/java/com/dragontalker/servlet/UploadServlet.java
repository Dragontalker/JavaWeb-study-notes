package com.dragontalker.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class UploadServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 1. 先判断上传的数据是否多段数据(只有是多段的数据, 才是文件上传的)
		if (ServletFileUpload.isMultipartContent(req)) {
			
			FileItemFactory fileItemFactory = new DiskFileItemFactory();
			
			ServletFileUpload srFileUpload = new ServletFileUpload(fileItemFactory);
		}
	}

}
