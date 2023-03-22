package org.hibernateApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernateApp.model.person;

import java.util.List;

public class App 
{
    public static void main( String[] args ) {
        Configuration configuration = new Configuration().addAnnotatedClass(person.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();


            //select by HQL
            /*List<person> personList = session.createQuery("FROM person WHERE name LIKE 'S%'").getResultList();
            for (person people : personList){
                System.out.println(people.getName() + " " + people.getAge());
            }*/

            //update example
            /*session.createQuery("update person set name='Anna' where age < 30").executeUpdate();*/



            session.getTransaction().commit();
        } finally {
            sessionFactory.close();
        }
    }
}
