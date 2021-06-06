package com.dev.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dev.controller.HttpUtil;
import com.dev.vo.MemberVO;
import com.dev.service.Service;

public class SubjectSearchController implements Controller{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String subjectId = request.getParameter("subjectId");
		
		MemberVO a = new MemberVO();
		a.setSubjectId(subjectId);
		
		boolean result = Service.getInstance().search(subjectId);
		String msg = null;
		if(result == false)
		{
			msg = "No ID";
		}else {
			msg = "true";
			HttpSession session = request.getSession();
			session.setAttribute("subjectId", subjectId);
		}
		request.setAttribute("msg", msg);
		//request.setAttribute("subjectId", subjectId);
		HttpUtil.forward(request, response, "/stuenroll.jsp");
	}
}