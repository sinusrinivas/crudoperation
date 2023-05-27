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

@WebServlet("/fetchall1")
public class fetchAll_url extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doGet(req, resp);
		Dao dao = new Dao();
		List<Dto> l1 = dao.fetchall();
		resp.getWriter().print(l1);

		req.setAttribute("list", l1);
		RequestDispatcher dispatcher = req.getRequestDispatcher("download.jsp");
		dispatcher.forward(req, resp);
	}
}
