package com.dev.controller;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import com.dev.service.*;
import com.dev.vo.*;

public class ProEnrollController implements Controller{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String profId = (String)request.getSession().getAttribute("profId");
		String subjectId = request.getParameter("subjectId");
		String subjectName = request.getParameter("subjectName");
		int subjectCount = Integer.parseInt(request.getParameter("subjectCount"));
		
		MemberVO subject = new MemberVO();
		subject.setProfId(profId);
		subject.setSubjectId(subjectId);
		subject.setSubjectName(subjectName);
		subject.setSubjectCount(subjectCount);
		
		Service service = Service.getInstance();
		service.subjectEnrollment(profId, subject);
		
		request.setAttribute("profId", profId);
		HttpUtil.forward(request, response, "promenu.jsp");;
		
	}

}
