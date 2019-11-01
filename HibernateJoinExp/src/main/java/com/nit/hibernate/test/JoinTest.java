package com.nit.hibernate.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.nit.hibernate.util.HibernateUtil;

public class JoinTest {

	public static void main(String[] args) {
		try {
			Session session=HibernateUtil.getSessionFactory().openSession();
			String hql="select c.customerCity,i.itemName from com.nit.hibernate.model.Customer c inner join c.itemObj as i";

			Query q=session.createQuery(hql);
			List list=q.list();
			Iterator it=list.listIterator();
			while(it.hasNext()){
				Object ob[]=(Object[])it.next();
				System.out.println(ob[0]+"  "+ob[1]);
			}
			            
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}

	}

}
