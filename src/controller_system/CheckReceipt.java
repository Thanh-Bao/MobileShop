package controller_system;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model_DAO.DAO_Order;

@WebServlet(urlPatterns = "/check-receipt")
public class CheckReceipt extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DAO_Order dao = DAO_Order.getDAO_Order();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String orderID = request.getParameter("orderID");

		if (orderID != null) {
			request.setAttribute("ORDER", dao.getOrder(orderID.trim()));
		}

		RequestDispatcher dispatcher //
				= this.getServletContext().getRequestDispatcher("/VIEW/jsp/jsp-page/system/check-reciept.jsp");

		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
