package com.nit.hibernate.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.nit.hibernate.util.HibernateUtil;

public class RightJoin {

	public static void main(String[] args) {
		try {
			Session session=HibernateUtil.getSessionFactory().openSession();
		String	hql="select c.customerId,i.itemName from com.nit.hibernate.model.Customer c "+
			  " right join c.itemObj i";
		Query query=session.createQuery(hql);
		List<Object[]> data=query.list();
		for(Object[] d:data) {
			System.out.println(d[0]+"," +d[1]);
			
		}
		
			
			
		}catch(Exception e) {
			
		}

	}

}
