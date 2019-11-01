package com.nit.hibernate.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nit.hibernate.model.Customer;
import com.nit.hibernate.model.Item;
import com.nit.hibernate.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		try {
			Session session=HibernateUtil.getSessionFactory().openSession();
			Transaction tx=session.beginTransaction();
			Item i1=new Item();
			i1.setItemId(2001);
			i1.setItemName("DEL");
			i1.setItemPrice(1200.1);
			Item i2=new Item();
			i2.setItemId(3001);
			i2.setItemName("SAM");
			i2.setItemPrice(1300.1);
			Item i3=new Item();
			i3.setItemId(4001);
			i3.setItemName("ONIDA");
			i3.setItemPrice(6768.9);
			Item i4=new Item();
			i4.setItemId(5001);
			i4.setItemName("TITAN");
			i4.setItemPrice(5657.6);
			Item i5=new Item();
			i5.setItemId(3331);
			i5.setItemName("SONATA");
			i5.setItemPrice(6453.4);
			
			
			
			Customer c1=new Customer();
			c1.setCustomerId(101);
			c1.setCustomerName("charles");
			c1.setCustomerCity("Hyd");
			c1.getItemObj().add(i1);
			c1.getItemObj().add(i2);
			
			Customer c2=new Customer();
			c2.setCustomerId(201);
			c2.setCustomerName("Sandeep");
			c2.setCustomerCity("Pune");
			c2.getItemObj().add(i3);
			
			Customer c3=new Customer();
			c3.setCustomerId(301);
			c3.setCustomerName("Ashok");
			c3.setCustomerCity("DELHI");

			session.save(i1);
			session.save(i2);
			session.save(i3);
			session.save(i4);
			session.save(i5);
			session.save(c1);
			session.save(c2);
			session.save(c3);
			tx.commit();
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
