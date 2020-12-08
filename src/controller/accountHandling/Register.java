package controller.accountHandling;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BO_Service.BO_Account;
import model.BO_Service.OTP;
import model.DAO.DAO_Account;
import model.beans.Account;
import model.utility.Const;
import model.utility.SendMail;

@WebServlet(urlPatterns = "/register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect(request.getContextPath() + "/VIEW/jsp/jsp-page/account/register.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String phoneNumber = request.getParameter("phoneNumber");
		String address = request.getParameter("address");
		
		

		Account tmpAcc = new Account(email, password, name, phoneNumber, address);
		if ((new BO_Account()).isExsit(email)) {
			request.setAttribute("message", "Email này đã được đăng kí");
			RequestDispatcher dispatcher //
					= this.getServletContext().getRequestDispatcher("/VIEW/jsp/jsp-page/account/register.jsp");
			dispatcher.forward(request, response);
		} else {
			request.setAttribute("newUser", tmpAcc);
			request.setAttribute(Const.TOKEN_REGISTER_OTP, true);

			RequestDispatcher dispatcher //
					= this.getServletContext().getRequestDispatcher("/otp");
			dispatcher.forward(request, response);

		}
	}

}
