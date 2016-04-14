package com.jarek.zyzak;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jarek.zyzak.model.Address;
import com.jarek.zyzak.model.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Session session = build().openSession();    
		Transaction transaction = session.beginTransaction();
		/*
		Person p1 = new Person();
		Person p2 = new Person();
		
		Address address1 = new Address("12 th aa", "12A");
		Address address2 = new Address("18th Ave", "18B");
		
		p1.getAddresses().add(address1);
		p2.getAddresses().add(address2);
		select *  from Address a where a.street = '12A'
		session.flush();
		session.save(p1);
		session.save(p2);
		*/
		Query q = session.createQuery("from Address a where a.street = :street");
		q.setParameter("street", "18B");
		List<Address> list = q.list();
		for(Address a: list){
			System.out.println(a.getNumber() + "--"+a.getStreet());
		}
    	transaction.commit();
    	session.close();
	}
    
    public static SessionFactory build(){
    	SessionFactory sessionFactory;
    	sessionFactory = new Configuration().configure().buildSessionFactory();
    	return sessionFactory;
    }
}
