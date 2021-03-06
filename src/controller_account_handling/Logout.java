package controller_account_handling;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model_BO_service.BO_Account;
import model_beans.Account;
import model_utility.Const;

@WebServlet(urlPatterns = { "/logout" })
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();

		Account acc = (Account) session.getAttribute(Const.CUSTOMER_LOGINED);

		
		if (acc != null) {
			BO_Account.getBoAccount().changeToken(acc);
		}

		session.removeAttribute(Const.CUSTOMER_LOGINED);
		response.sendRedirect(request.getContextPath() + "/index");
	}

}
