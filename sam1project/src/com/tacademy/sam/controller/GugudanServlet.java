package com.tacademy.sam.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class dududan
 */
@WebServlet("/dududan")
public class GugudanServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;
       

   /**
    * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // TODO Auto-generated method stub
      response.setContentType("text/html;charset=utf-8");
      
      PrintWriter out = response.getWriter();
      out.println("<!DOCTYPE html>");
      out.println("<html>");
      out.println("<head>");
      out.println("<title> 구구단 예제 </title>");
      out.println("<style>");
      out.println("div { background-color: white; display: inline-block}");
      out.println("</style>");
      out.println("</head>");
      out.println("<body>");
      out.println("<h1> 몇단?? </h1>");
      String sDan = request.getParameter("dan");
      int dan = Integer.parseInt(sDan == null ? "2" : sDan);
      for(int i = 0; i < 9; i++) {
         out.println("<div>");
         out.println(dan);
         out.println("</div>");
         
         out.println("<div>");
         out.println(" * ");
         out.println("</div>");
         
         out.println("<div>");
         out.println(i + 1);
         out.println("</div>");
         
         out.println("<div>");
         out.println(" = ");
         out.println("</div>");
         
         out.println("<div>");
         out.println(dan * (i + 1));
         out.println("</div>");
         
         out.println("<br>");
      }
      out.println("</body>");
      out.println("</html>");
      
   }

}