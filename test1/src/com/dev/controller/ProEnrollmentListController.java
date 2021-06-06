package com.dev.controller;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class ProEnrollmentListController implements Controller{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String profId = (String)request.getSession().getAttribute("profId");
		
		request.setAttribute("profId", profId);
		HttpUtil.forward(request, response, "/result/proenrollList.jsp");
		
	}

}
