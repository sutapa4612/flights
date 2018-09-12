package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logic.Num_tickets;
@WebServlet("/flights")
public class Tickets extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String src=req.getParameter("src");
		String des=req.getParameter("des");
		
		System.out.println(src);
		int not1=Integer.parseInt(req.getParameter("not"));
		System.out.println(des);
		System.out.println(not1);
		//PrintWriter pw = resp.getWriter();
		/*if(src.equals("--select--") || des.equals("--select--"))
		{
		RequestDispatcher dis=req.getRequestDispatcher("index.html");
		dis.forward(req, resp);
		}*/
		Num_tickets nt=new Num_tickets();
		 int flightfare=nt.planetickets(src, des,not1);
		 //pw.println(flightfare);
		req.setAttribute("num", not1);
		 req.setAttribute("flight_name", flightfare);
		
		   RequestDispatcher dispatcher=req.getRequestDispatcher("/result.jsp");
	        dispatcher.forward(req, resp);
	}

}
