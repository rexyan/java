package me.yanrs.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import me.yanrs.domain.Customer;
import me.yanrs.utils.HibernateUtils;

public class CustomerDao {

	public void save(Customer c) {
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		try {
			session.save(c);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
		session.close();
	}

}
