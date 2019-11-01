package com.nit.hibernate.test;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import com.nit.hibernate.model.Item;
import com.nit.hibernate.util.HibernateUtil;

public class CallStoreProcedureTest {

	public static void main(String[] args) {
		try {
			Session session=HibernateUtil.getSessionFactory().openSession();
			Query query=session.createNativeQuery("CALL getItem(:iid)")
			.addEntity(Item.class)
			.setParameter("iid", 2001);
			List result=query.getResultList();
			for(int i=0;i<result.size();i++) {
				Item item=(Item)result.get(i);
				System.out.println(item.getItemId());
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	
}
