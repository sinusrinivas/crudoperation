package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;
import dto.Dto;
@WebServlet("/update")
public class update extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		 String sid1 = req.getParameter("sid");
		 int sid = Integer.parseInt(sid1);
		 String sname = req.getParameter("sname");
		String phno1 =  req.getParameter("phno");
		long phno = Long.parseLong(phno1);
		String gender = req.getParameter("gender");
		
		Dao dao = new Dao();
		dao.update(sid,sname,phno,gender);
		 List<Dto> l1 = dao.fetchall();
		 
		 req.setAttribute("list", l1);
		 resp.setContentType("text/html"); //when we are not using html tag inside resp,getdispatcher
		 
		 resp.getWriter().print(" data updated succesfully ");
		 RequestDispatcher dispatcher = req.getRequestDispatcher("download.jsp");
		 //dispatcher.forward(req, resp);
		 dispatcher.include(req, resp);
	}

}
