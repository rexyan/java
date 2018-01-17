package me.yanrs.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sun.org.apache.regexp.internal.recompile;

import me.yanrs.dao.CustomerDao;
import me.yanrs.domain.Customer;
import me.yanrs.utils.HibernateUtils;

public class CustomerService {

	public static void save(Customer c) {
		CustomerDao dao = new CustomerDao();
		dao.save(c);
	}

	public List<Customer> getCustomerList() {
		List<Customer> CustomerList = null;
		CustomerDao dao = new CustomerDao();
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		try {
			CustomerList = dao.getCustomerList();
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
		return CustomerList;
	}

}
