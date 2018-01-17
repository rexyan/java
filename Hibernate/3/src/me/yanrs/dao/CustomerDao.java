package me.yanrs.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
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

	public List<Customer>  getCustomerList() {
		//使用线程安全的session实现，并且将事务放在service层
		Session session = HibernateUtils.getCurrentSession();
		//方式1.HQL实现
		//String hql = "from Customer";
		//Query query = session.createQuery(hql);
		//return query.list();
		
		//方式2.Criteria
		Criteria criteria = session.createCriteria(Customer.class);
		return criteria.list();
		
	}

}
