package com.echain.dao;

import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.echain.model.LoginBean;

@Repository
public class LoginDaoImp implements LoginDao {

   @Autowired
   private SessionFactory sessionFactory;

   public String save(LoginBean login) {
      sessionFactory.getCurrentSession().save(login);
      return login.getUsername();
   }

   public LoginBean get(String id) {
      return sessionFactory.getCurrentSession().get(LoginBean.class, id);
   }

   public List<LoginBean> list() {
      Session session = sessionFactory.getCurrentSession();
      CriteriaBuilder cb = session.getCriteriaBuilder();
      CriteriaQuery<LoginBean> cq = cb.createQuery(LoginBean.class);
      Root<LoginBean> root = cq.from(LoginBean.class);
      cq.select(root);
      Query<LoginBean> query = session.createQuery(cq);
      return query.getResultList();
   }

   public void update(String id, LoginBean login) {
      Session session = sessionFactory.getCurrentSession();
      LoginBean login2 = session.byId(LoginBean.class).load(id);
      login2.setUsername(login.getUsername());
      login2.setPassword(login.getPassword());
      session.flush();
   }

   public void delete(String id) {
      Session session = sessionFactory.getCurrentSession();
      LoginBean login = session.byId(LoginBean.class).load(id);
      session.delete(login);
   }

}
