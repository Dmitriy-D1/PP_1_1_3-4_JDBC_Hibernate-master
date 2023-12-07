package jm.task.core.jdbc.util;

import jm.task.core.jdbc.model.User;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory ourSessionFactory;

    static {
        try {
            Configuration configuration = new Configuration().addAnnotatedClass(User.class);
            ourSessionFactory = configuration.buildSessionFactory();
        } catch (Throwable e){
            throw new ExceptionInInitializerError(e);
        }
    }
    public static SessionFactory getSession() throws HibernateException{
        return ourSessionFactory;
    }
}
