package com.niit.tech.mvc.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.niit.tech.mvc.dao.UserDao;
import com.niit.tech.mvc.model.User;

@Component
public class UserDaoImpl implements UserDao {
	
	@PersistenceContext 
	EntityManager em;
	
    @Transactional
    public void save(User user) {
        em.persist(user);
    }
 
    public List <User> getAllUsers() {
        TypedQuery<User> query = em.createQuery(
            "FROM User", User.class);
        return query.getResultList();
    }


}
