package com.LA;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/readrecord")
public class readrecord extends HttpServlet {
	private static final long serialVersionUID = 1L;
					
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		System.out.println("Servlet readrecord called");
		PrintWriter out = response.getWriter();
		HttpSession se = request.getSession(false);
		
		
		
		if (se != null) {
			String master = (String) se.getAttribute("master");

			out.println("<!DOCTYPE html><html><head><meta charset=\"UTF-8\"><title>Read Record</title></head><body>");
			out.println("<div class=\"center\"><h3>Please enter Values for the master:</h3>");
			out.println("<form method=\"post\" action=\"addrecord2db\"><table><tr><td>");
			switch (master) {
				case("class"):{
					out.println("<div class=\"center\"><h3>Please enter Values for the Class master:</h3>");
					out.println("<form method=\"post\" action=\"addrecord2db\"><table><tr><td>");
					out.println("Class Code:</td><td><input type=\"text\" name=\"code\"></td>");
					out.println("</tr><tr><td>Room No.:</td><td><input type=\"text\" name=\"name\"></td>");
					out.println("</tr><tr><td>Capacity:</td><td><input type=\"text\" name=\"desc\"></td>");
					break;}
				case("student"):{
					out.println("<div class=\"center\"><h3>Please enter Values for the Student master:</h3>");
					out.println("<form method=\"post\" action=\"addrecord2db\"><table><tr><td>");
					out.println("Roll Number:</td><td><input type=\"text\" name=\"code\"></td>");
					out.println("</tr><tr><td>Class:</td><td><input type=\"text\" name=\"name\"></td>");
					out.println("</tr><tr><td>Name:</td><td><input type=\"text\" name=\"desc\"></td>");
					break;}
				case ("teacher"):{
					out.println("<div class=\"center\"><h3>Please enter Values for the Teacher master:</h3>");
					out.println("<form method=\"post\" action=\"addrecord2db\"><table><tr><td>");
					out.println("Teacher ID:</td><td><input type=\"text\" name=\"code\"></td>");
					out.println("</tr><tr><td>First Name:</td><td><input type=\"text\" name=\"name\"></td>");
					out.println("</tr><tr><td>Last Name:</td><td><input type=\"text\" name=\"desc\"></td>");
					break;}
				case ("subject"):{
					out.println("<div class=\"center\"><h3>Please enter Values for the Subject master:</h3>");
					out.println("<form method=\"post\" action=\"addrecord2db\"><table><tr><td>");
					out.println("Subject Code:</td><td><input type=\"text\" name=\"code\"></td>");
					out.println("</tr><tr><td>Subject Name:</td><td><input type=\"text\" name=\"name\"></td>");
					out.println("</tr><tr><td>Subject Description:</td><td><input type=\"text\" name=\"desc\"></td>");
					break;}
				case("su2cmap"):{
					out.println("<div class=\"center\"><h3>Please enter Values for the Class master:</h3>");
					out.println("<form method=\"post\" action=\"addrecord2db\"><table><tr><td>");
					out.println("Subject Code:</td><td><input type=\"text\" name=\"code\"></td>");
					out.println("</tr><tr><td>SubjectName:</td><td><input type=\"text\" name=\"name\"></td>");
					out.println("</tr><tr><td>Assigned Class Code:</td><td><input type=\"text\" name=\"desc\"></td>");
					break;}
				case("t2cmap"):{
					out.println("<div class=\"center\"><h3>Please enter Values for the Class master:</h3>");
					out.println("<form method=\"post\" action=\"addrecord2db\"><table><tr><td>");
					out.println("Teacher_ID:</td><td><input type=\"text\" name=\"code\"></td>");
					out.println("</tr><tr><td>Teacher Name:</td><td><input type=\"text\" name=\"name\"></td>");
					out.println("</tr><tr><td>Assigned Class Code:</td><td><input type=\"text\" name=\"desc\"></td>");
					break;}
			}
			out.println("</tr><tr align=\"right\"><td></td><td><input type=\"submit\" value=\"Submit\"></td></tr>");
			out.println("</table></form></div></body></html>");
		}
		else {
			out.println("<html><body><center><span style='color:red'><h2>Invalid session!!!</h2><span><center>");
			out.println("<br><br><br><h4>click <a href = \"Login.html\">here</a> to login again.</body></html>");
		}
	}
}