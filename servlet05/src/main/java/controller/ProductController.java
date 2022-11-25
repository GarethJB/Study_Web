package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.CommandProduct;
import command.CommandProductInfo;

@WebServlet("*.pu")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/*		String uri = request.getRequestURI();
		String path = request.getContextPath();
		uri = uri.substring(path.length());*/
		
		String uri = request.getServletPath();
		String view = "";
		boolean redirect = false;
		
		if(uri.equals("/product.pu")) {
			CommandProduct command = new CommandProduct();
			command.execute(request, response);
			
			view = "product.jsp";
			
		} else if(uri.equals("/info.pu")) {
			CommandProductInfo command = new CommandProductInfo();
			command.execute(request, response);
			
			view = "product_info.jsp";
			
		}
		
		if (redirect) {
			response.sendRedirect(view);
		} else {
			request.getRequestDispatcher(view).forward(request, response);
		}
	}

}
