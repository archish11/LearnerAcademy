package com.LA;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/removeRecord")
public class removeRecord extends HttpServlet {
	private static final long serialVersionUID = 1L;
					
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		System.out.println("Servlet removeRecord called");
		PrintWriter out = response.getWriter();
		HttpSession se = request.getSession(false);
				
		if (se != null) {
			String master = (String) se.getAttribute("master");
			out.println("<!DOCTYPE html><html><head><meta charset=\"UTF-8\"><title>Remove Record</title></head><body>");
			out.println("<div align=\"center\"><h3>Please enter Values for the master:</h3>");
			out.println("<form method=\"post\" action=\"removeRecordOfDB\"><table><tr><td>");
			switch (master) {
			case ("class"):{ out.println("Class Code:</td><td><input type=\"text\" name=\"code\"></td>"); break;}
			case ("student"):{ out.println("Roll Number:</td><td><input type=\"text\" name=\"code\"></td>"); break;}
			case ("teacher"):{ out.println("Teacher ID:</td><td><input type=\"text\" name=\"code\"></td>"); break;}
			case ("subject"):{ out.println("Subject Code:</td><td><input type=\"text\" name=\"code\"></td>"); break;}
			case ("su2cmap"):{ out.println("Subject Code:</td><td><input type=\"text\" name=\"code\"></td>"); break;}
			case ("t2cmap"):{ out.println("Teaacher_ID:</td><td><input type=\"text\" name=\"code\"></td>"); break;}
			}
			out.println("</tr><tr align=\"right\"><td></td><td><input type=\"submit\" value=\"Submit\"></td></tr>");
			out.println("</table></form></div></body></html>");
		}else {
			out.println("<html><body><center><span style='color:red'><h2>Invalid session!!!</h2><span><center>");
			out.println("<br><br><br><h4>click <a href = \"Login.html\">here</a> to login again.</body></html>");
		}
	}
}