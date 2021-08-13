package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{

	protected void doGet(HttpServletRequest rq, HttpServletResponse rs) throws IOException, ServletException{
		try(PrintWriter pw = rs.getWriter()){
			pw.write("Hello World from Jenkinsx2!");
		}
	}
	
}
