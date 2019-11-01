package com.nit.hibernate.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.nit.hibernate.util.HibernateUtil;

public class LeftJoinTest {

	public static void main(String[] args) {
		try {
			Session session=HibernateUtil.getSessionFactory().openSession();
			String hql="select c.customerName,i.itemName from com.nit.hibernate.model.Customer c left join c.itemObj as i";
			           
			Query query=session.createQuery(hql);
			List list=query.list();
			Iterator it=list.iterator();
			while(it.hasNext()){
				Object ob[]=(Object[])it.next();
				System.out.println(ob[0]+"  "+ob[1]);
			}
			
			
		}catch(Exception e) {
			    e.printStackTrace();
			
			}
	}
}
