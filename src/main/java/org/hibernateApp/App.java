package org.hibernateApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernateApp.model.person;

public class App 
{
    public static void main( String[] args ) {
        Configuration configuration = new Configuration().addAnnotatedClass(person.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();
            person person = session.get(person.class, 1);
            System.out.println(person.getName() + " " + person.getAge() + " " + person.getAddress() + " " + person.getTel());
            session.getTransaction().commit();
        } finally {
            sessionFactory.close();
        }
    }
}
