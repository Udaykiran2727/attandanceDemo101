package com.uday;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.uday.dao.LoginTDao;


@WebServlet("/LoginTe")
public class LoginTe extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("Tname");
		String pass= request.getParameter("Tpass");
		LoginTDao dao =new LoginTDao(); 
			if(dao.check(uname, pass)){
				HttpSession session=request.getSession();
				session.setAttribute("username", uname);
				response.sendRedirect("welcomeT.jsp");
			}
			else {
				response.sendRedirect("LoginT.jsp");
			}
	}

}
