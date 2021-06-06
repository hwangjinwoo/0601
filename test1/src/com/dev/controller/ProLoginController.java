package com.dev.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dev.controller.HttpUtil;
import com.dev.dao.MemberDAO;
import com.dev.service.Service;


public class ProLoginController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String profId = request.getParameter("profId");
	    String ProfPwd = request.getParameter("profPwd");
	      
	    Service s = Service.getInstance();
	    MemberDAO dao = new MemberDAO();
	    String name = dao.prologin(profId, ProfPwd);
	    String path = null;
	    if(name != null)
	    {
	       HttpSession session = request.getSession();
	       session.setAttribute("profId", profId);
	       path = "/promenu.jsp";
	    }
	    else
	    {
	       path = "/index.jsp";
	    }
	    HttpUtil.forward(request, response, path);
	 }
	}