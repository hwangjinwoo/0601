package com.dev.controller;

import java.io.*;
import java.security.Provider.*;

import javax.servlet.*;
import javax.servlet.http.*;

import com.dev.service.Service;
import com.dev.vo.*;

public class StuEnrollController implements Controller{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String subjectId = (String)request.getSession().getAttribute("subjectId");
		String id = (String)request.getSession().getAttribute("id");
		
		MemberVO subject = new MemberVO();
		subject.setId(id);
		subject.setSubjectId(subjectId);
		
		Service service = Service.getInstance();
		service.studentSubjectEnrollment(id, subjectId, subject);
		
		request.setAttribute("id", id);
		request.setAttribute("subjectId", subjectId);
		HttpUtil.forward(request, response, "stumenu.jsp");
	}
}

