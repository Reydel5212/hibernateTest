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

            //create new person by hibernate
            /*person person = new person("Mary", 21, "Murmansk", 870756897);
            session.save(person);*/

            //update by hibernate
            /*person person = session.get(person.class, 1);
            person.setAge(61);*/

            //delete by hibernate
            /*person person = session.get(person.class, 2);
            session.delete(person);*/
            session.getTransaction().commit();
        } finally {
            sessionFactory.close();
        }
    }
}
