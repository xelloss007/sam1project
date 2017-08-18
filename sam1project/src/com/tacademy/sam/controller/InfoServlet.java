package com.tacademy.sam.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InfoServlet
 */
@WebServlet("/InfoServlet")
public class InfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		out.println("info test <br>");
		String name = request.getParameter("name");
		out.println("param name : " + name + "<br>");
		String method = request.getMethod();
		out.println("method : " + method + "<br>");
		String brower = request.getHeader("User-Agent");
		out.println("brower : " + brower + "<br>");
	
		String id = request.getHeader("id");
		out.println("id : " + id + "<br>");
		
		String ip = request.getRemoteAddr();
		out.println("ip : " + ip + "<br>");
		
		String uri = request.getRequestURI();
		out.println("uri : " + uri + "<br>");
		
		//둘중에 하나 쓰면 됨 
//		StringBuffer url = request.getRequestURL();
		String url = request.getRequestURL().toString();
		out.println("url : " + url + "<br>");
		
		String query = request.getQueryString();
		out.println("query : " + query + "<br>");
	}

}
