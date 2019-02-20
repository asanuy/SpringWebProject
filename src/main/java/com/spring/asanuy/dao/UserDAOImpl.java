package com.spring.asanuy.dao;

import com.spring.asanuy.model.User;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    HibernateTemplate hibernateTemplate;

    public void createUser(User user) {
        hibernateTemplate.persist(user);
    }

    public boolean exists(User user) {
        Query query = getSession().createQuery("FROM User WHERE user_name = :userName");
        query.setParameter("userName", user.getUserName());
        List result = query.getResultList();
        return !result.isEmpty();
    }

    private Session getSession() {
         return hibernateTemplate.getSessionFactory().getCurrentSession();
    }
}
