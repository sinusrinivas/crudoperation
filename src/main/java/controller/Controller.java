package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;
import dto.Dto;

@WebServlet("/insert")
public class Controller extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);

		String sid1 = req.getParameter("sid");
		int sid = Integer.parseInt(sid1);
		String sname = req.getParameter("sname");
		String gender = req.getParameter("gender");
		String phno1 = req.getParameter("phno");
		Long phno = Long.parseLong(phno1);
		
		Dto dto = new Dto();
		dto.setSid(sid);
		dto.setSname(sname);
		dto.setGender(gender);
		dto.setPhno(phno);
		
		Dao dao = new Dao();
		dao.insert(dto);
	}
	

}
