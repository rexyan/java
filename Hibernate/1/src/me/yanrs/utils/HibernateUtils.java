package me.yanrs.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class  HibernateUtils {
	private static SessionFactory buildSessionFactory;
	//将公共部分提取
	/*SessionFactory用户操作数据库核心对象session对象的工厂
	 * SessionFactory负责保存和使用所有配置信息，消耗内存非常大
	 * SessionFactory是线程安全的对象设计
	 * 总结：在web项目中，只有一个SessionFactory
	 */
	static{
		Configuration configuration = new Configuration().configure();
		buildSessionFactory = configuration.buildSessionFactory();
	}
	public static Session openSession(){
		Session openSession = buildSessionFactory.openSession();
		return openSession;
	}
	
	public static Session getCurrentSession() {
		Session openSession = buildSessionFactory.getCurrentSession();
		return openSession;
	}
	
	public static void main(String[] args) {
		System.out.println(HibernateUtils.openSession());
	}
}
