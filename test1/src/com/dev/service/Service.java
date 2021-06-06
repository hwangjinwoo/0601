package com.dev.service;

import java.util.ArrayList;

import com.dev.dao.MemberDAO;
import com.dev.vo.MemberVO;

public class Service {
	private static Service service = new Service();
	public MemberDAO dao = MemberDAO.getInstance();
	private Service() {}
	
	public static Service getInstance()
	{
		return service;
	}

	public void subjectEnrollment(String profId, MemberVO subject) {
		dao.subjectEnrollment(profId ,subject);
	}

	public boolean search(String subjectId) {
		return dao.search(subjectId);
	}

	public void studentSubjectEnrollment(String id, String subjectId, MemberVO subject) {
		dao.studentSubjectEnrollment(id, subjectId, subject);
	}
}