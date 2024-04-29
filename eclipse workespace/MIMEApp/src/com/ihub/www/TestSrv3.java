package com.ihub.www;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class TestSrv3 extends GenericServlet

{
	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("application/ms-word");
		pw.println("<table border='2'>");
		pw.print("<tr><th>No</th><th>Name</th></tr>");
		pw.print("<tr><th>201</th><th>kishore</th></tr>");
		pw.print("<tr><th>202</th><th>sraya</th></tr>");
		pw.print("<tr><th>203</th><th>udaya</th></tr>");
		pw.print("<tr><th>204</th><th>siddu</th></tr>");
		pw.println("</table>");
		pw.close();
	}
}