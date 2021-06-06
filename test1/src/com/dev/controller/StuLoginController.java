package com.dev.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dev.controller.HttpUtil;
import com.dev.dao.MemberDAO;
import com.dev.service.Service;


public class StuLoginController implements Controller{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
	    String pwd = request.getParameter("pwd");
	      
	    Service s = Service.getInstance();
	    MemberDAO dao = new MemberDAO();
	    String name = dao.stulogin(id, pwd);
	    String path = null;
	    if(name != null)
	    {
	       HttpSession session = request.getSession();
	       session.setAttribute("id", id);
	       path = "/stumenu.jsp";
	    }
	    else
	    {
	       path = "/index.jsp";
	    }
	    HttpUtil.forward(request, response, path);
	 }
}