package me.yanrs.domain;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

public class Hibernate_Test {
	@Test
	public void func1() {
		//创建Configuration，使用空参构造。并且读取指定主配置文件【空参会默认使用src下的配置，如需修改则传入路径即可】
		Configuration configuration = new Configuration().configure();
		//创建SessionFactory
		SessionFactory buildSessionFactory = configuration.buildSessionFactory();
		//打开一个新的session对象
		Session openSession = buildSessionFactory.openSession();
		//开启事物
		Transaction beginTransaction = openSession.beginTransaction();
		//执行操作
		Customer customer = new Customer();
		customer.setCust_name("xxx");
		customer.setCust_id(1l);
		customer.setCust_mobile("11234566788");
		openSession.save(customer);
		//提交事务
		beginTransaction.commit();
		//关闭资源
		openSession.close();
		buildSessionFactory.close();
	}
}
