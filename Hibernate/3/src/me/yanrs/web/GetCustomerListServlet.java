package me.yanrs.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import me.yanrs.domain.Customer;
import me.yanrs.service.CustomerService;

public class GetCustomerListServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Customer> CustomerList = null;
		CustomerService customerService = new CustomerService();
		CustomerList = customerService.getCustomerList();
		request.setAttribute("CustomerList", CustomerList);
		request.getRequestDispatcher("/jsp/customer/list.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}