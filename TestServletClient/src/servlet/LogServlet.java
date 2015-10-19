package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/log")
public class LogServlet extends HttpServlet {

	MyWebService l;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		writer.write("<html><head></head><body>");
		String logString = request.getParameter("log");
		String smth = l.saySomething();
		writer.write("<h1>" + smth);
		writer.write("</h1>");
		writer.write("</body></html>");
	}
}
