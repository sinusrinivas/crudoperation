package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;

@WebServlet("/remove")
public class Controller_Remove extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doGet(req, resp);

		String sid1 = req.getParameter("sid");
		int sid = Integer.parseInt(sid1);

		Dao dao = new Dao();
		String mst = dao.remove(sid);
		resp.getWriter().print(mst);
	}
}
