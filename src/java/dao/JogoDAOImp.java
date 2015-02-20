/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import modelo.Jogo;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;

/**
 *
 * @author Victor
 */
//classe para fazer as implementações da classe JogoDAO
public class JogoDAOImp implements JogoDAO {

    
    public void save(Jogo jogo) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(jogo);
        t.commit();
    }
    
    public Jogo getJogo (int id) {
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (Jogo) session.load(Jogo.class, id);
        
        
    }
    
    public List<Jogo> list() {
       Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        List lista =  session.createQuery("from Jogo").list();
        t.commit();
        return lista;
        
    } public void remove (Jogo jogo) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(jogo);
        t.commit();
    
    } public void update (Jogo jogo) {
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(jogo);
        t.commit();
    }
  
}
    

