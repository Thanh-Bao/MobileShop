package controller_admin;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model_DAO.DAO_Product_main;
import model_beans.Product_main;

@WebServlet(urlPatterns = "/admin/warehouse/manager-product")
public class ManagerProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private  DAO_Product_main dao = new DAO_Product_main();
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int currentPage = 1;
		int rowPerPage = 10;
		HttpSession session = request.getSession();
		if (session.getAttribute("current_page") == null) {
			session.setAttribute("current_page", 1);
		} else {
			currentPage = (Integer) session.getAttribute("current_page");
		}
		request.setAttribute("total", dao.totalProduct());
		request.setAttribute("numProduct", dao.numProductSale());
		request.setAttribute("productSale", dao.productSaling());
		request.setAttribute("productStop", dao.productStop());
		request.setAttribute("numProductStop", dao.numProductStop());
		
		
		ArrayList<Product_main> listProduct = (ArrayList<Product_main>) DAO_Product_main.getDao_Product_main()
				.getAllProduct((currentPage - 1) * rowPerPage + 1, currentPage * rowPerPage);
		request.setAttribute("STT", (currentPage - 1) * rowPerPage + 1);
		request.setAttribute("totalPage", DAO_Product_main.getDao_Product_main().getNumberOfPage(rowPerPage));
		request.setAttribute("listProduct", listProduct);
		RequestDispatcher dispatcher //
				= this.getServletContext().getRequestDispatcher("/VIEW/jsp/jsp-page/admin/admin-product.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);

	}

}
