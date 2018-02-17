package br.com.infraestrura.hibernate;


import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;




public class DaoImp<T> implements Dao<T>{
	
	private Class<T> entidade;

	public Session getSession(){
		return HibernateUtil.getSessionFactory().openSession();
	}
	
	public DaoImp(Class<T> classeEntidade) {
	    this.entidade = classeEntidade;
	}
	
	public void salvar(T entidade) {
		Session session = null;
        Transaction transaction = null;
        try {
            session = getSession();
            transaction = session.beginTransaction();
            session.save(entidade);
            transaction.commit();
        } catch (Exception e) {
            HibernateUtil.rollbackTransaction(transaction);
            HibernateUtil.closeSession(session);
        } finally {
            HibernateUtil.closeSession(session);
        }
		
	}
	
	   public T buscar(Long id) {
		 Session session = null;
	        Object objeto = null;
	        try {
	            session = getSession();
	            objeto = session.get(this.entidade, (Serializable) id);
	            HibernateUtil.closeSession(session);
	        } catch (Exception e) {
	        } finally {
	            HibernateUtil.closeSession(session);
	        }
	        return (T) objeto;
	}

	public List<T> listar() {
		// TODO Auto-generated method stub
		Session session = null;
        List<T> lista = null;
        try {
            session = getSession();
            lista =session.createCriteria(entidade).addOrder(Order.desc("idade")).list();
            HibernateUtil.closeSession(session);
        } catch (Exception e) {
        } finally {
            HibernateUtil.closeSession(session);
        }
        return lista;
	}

}
