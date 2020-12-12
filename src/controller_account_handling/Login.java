package controller_account_handling;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import controller_user.Cart;
import model_BO_service.BO_Account;
import model_DAO.DAO_Account;
import model_beans.Account;
import model_utility.Const;
import model_utility.EncryptPassword;

@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher dispatcher //
				= this.getServletContext().getRequestDispatcher("/VIEW/jsp/jsp-page/account/login.jsp");
		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		
		String messageErr = null;


		switch ((new BO_Account()).checkLogin(email, password, Const.CUSTOMER_ROLE)) {
		
		case 2: {
			
			messageErr = "Tài khoản hoặc mật khẩu không đúng";
			request.setAttribute("message", messageErr);
			RequestDispatcher dispatcher //
					= this.getServletContext().getRequestDispatcher("/VIEW/jsp/jsp-page/account/login.jsp");
			dispatcher.forward(request, response);
			break;
		}
		case 3: {
			messageErr = "Tài khoản của bạn đã bị khóa";
			request.setAttribute("message", messageErr);
			RequestDispatcher dispatcher //
					= this.getServletContext().getRequestDispatcher("/VIEW/jsp/jsp-page/account/login.jsp");
			dispatcher.forward(request, response);
			break;
		}
		default: {
			// mở khóa link
			//
			// Thêm user này vào session
			HttpSession session = request.getSession();
			Account acc = (new BO_Account()).get(email);
			session.setAttribute(Const.ACCOUNT_LOGINED, acc);
			String path = (String) session.getAttribute(Const.CURRENT_LINK);

			// Tại đây có 2 trường hợp để redirect

			// TH1 : trang khác bị khóa và redirect sang trang login để mở khóa
			// TH2 : người dùng tự truy cập vào link

			if (path != null) {
				response.sendRedirect(request.getContextPath() + path);
			} else {
				response.sendRedirect(request.getContextPath() + "/index");
			}
		}
		}

	}

}
