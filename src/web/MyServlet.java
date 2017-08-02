package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet(value = "/MyServlet", description = "Мой дескрипшн сервлета", displayName = "displayName")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter ("firstName");
		String lastname = request.getParameter ("lastname");
		HttpSession session = request.getSession();
		String patronymic = request.getParameter ("patronymic");
		String nickname = request.getParameter ("nickname");
		String comment = request.getParameter ("comment");
		String contactGroup = request.getParameter ("contactGroup");
		String mobileNumber = request.getParameter ("mobileNumber");
		String additionalMobileNumber = request.getParameter ("additionalMobileNumber");
		String eMail = request.getParameter ("eMail");
		String skype = request.getParameter ("skype");
		String index = request.getParameter ("index");
		String city = request.getParameter ("city");
		String street = request.getParameter ("street");
		String houseNumber = request.getParameter ("houseNumber");
		String apartmentsNumber = request.getParameter ("apartmentsNumber");
		
		
		
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		out.println("<h3>Профиль сотрудника: " + name + " " + lastname + " " + patronymic + "</h3> <br>");
		out.println("Ник: " + nickname + "<br>");
		out.println("Комментарий: " + comment + "<br>");
		out.println("Группа: " + contactGroup);
		
		out.close();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");

		
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
	}

}
