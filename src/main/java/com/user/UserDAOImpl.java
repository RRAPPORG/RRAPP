package com.user;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class UserDAOImpl implements UserDAO {
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
	
	public UserDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void save(User user) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(user);
		tx.commit();
		session.close();
	}
	
	@Override
	public void save(String nickName, String firstName, String lastName, String middleName) {
		User user = new User( nickName,  firstName,  lastName, middleName);
		this.save(user);
	}
	
	@Override
	public List<User> list() {
		Session session = this.sessionFactory.openSession();
		List<User> userList = session.createSelectionQuery("from User", User.class).getResultList();
		session.close();
		return userList;
	}
	
	@Override
	public JSONObject getUserJson (User user) {
		JSONObject userJson = new JSONObject();
		userJson.put("nickName", user.getNickName());
		userJson.put("firstName", user.getFirstName());
		userJson.put("lastName", user.getLastName());
		userJson.put("middleName", user.getMiddleName());
		return userJson;
	}
}
