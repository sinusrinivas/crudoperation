package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;
import dto.Dto;

@WebServlet("/fetch")
public class controller_fetchByid  extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		String sid1 = req.getParameter("sid");
		int sid = Integer.parseInt(sid1);
		
		Dto dto = new Dto();
		dto.setSid(sid);
		
		Dao dao = new Dao();
		String msg = dao.fetch(sid);
		resp.getWriter().print(msg);
	}

}
