/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import modelo.Jogo;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author Victor
 */
public class HibernateUtil {

    //criando o sessionfactory, vai pegar a configuração do hibernate.cfg.xml (banco de dados, senha, usuário, etc)
    private static SessionFactory sessionFactory;
    
    
    private HibernateUtil() {
    
}
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
// Create the SessionFactory from standard (hibernate.cfg.xml)
// config file.
                AnnotationConfiguration ac = new AnnotationConfiguration();
                ac.addAnnotatedClass(Jogo.class);
                sessionFactory = ac.configure().buildSessionFactory();
            } catch (Throwable ex) {
// Log the exception.
                System.err.println("Initial SessionFactory creation failed." + ex);
                throw new ExceptionInInitializerError(ex);
            }
            return sessionFactory;
        } else {
            return sessionFactory;
        }
    }

}
