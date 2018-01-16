package me.yanrs.service;

import me.yanrs.dao.CustomerDao;
import me.yanrs.domain.Customer;

public class CustomerService {

	public static void save(Customer c) {
		CustomerDao dao = new CustomerDao();
		dao.save(c);
	}

}
