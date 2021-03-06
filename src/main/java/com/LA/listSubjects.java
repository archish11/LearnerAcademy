package com.LA;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/listSubjects")
public class listSubjects extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Servlet listSubjects called");
		PrintWriter out = response.getWriter();
		HttpSession se = request.getSession(false);
		
		if(se != null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver"); 
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select * from subject");
				out.println("<!DOCTYPE html><html><head><meta charset=\"UTF-8\"><title>Update Record</title>"
						+ "<style>table, th, td {border: 1px solid black;border-collapse: collapse;}</style></head><body>");
				out.println("<div align=\"center\"><h3>The Subject Master Table is as follows:</h3>");
				out.println("<table>"
						+ "<tr><b><th>SUB_CODE</th><th>SUBJECT</th><th>SUBJECT_DES</th></b></tr>");
				while(rs.next()) {
					out.println("<tr><td>"+rs.getString(1)+"</td><td>" + rs.getString(2) + "</td><td>"+ rs.getString(3) +"</td></tr>");
				}
				out.println("</table><p align=\"center\"><a href=\"update\">Go to Update Master List menu</p>");
				out.println("</form></div></body></html>");
				con.close();
			} catch (ClassNotFoundException|SQLException e) {e.printStackTrace();}
			}else {
			out.println("<html><body><center><span style='color:red'><h2>Invalid session!!!</h2><span><center>");
			out.println("<br><br><br><h4>click <a href = \"Login.html\">here</a> to login again.</body></html>");
		}
	}

}
