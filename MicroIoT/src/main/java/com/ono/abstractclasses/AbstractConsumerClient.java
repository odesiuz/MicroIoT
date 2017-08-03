package com.ono.abstractclasses;

import java.util.List;

import org.hibernate.Session;

import com.ono.databaseUtil.DatabaseConnectionUtil;

public class AbstractConsumerClient<T> {

	private Class<T> consumerClientEntity;
	
	public AbstractConsumerClient (Class<T> consumerClientEntity) {
		if (consumerClientEntity == null) {
			throw new IllegalArgumentException("Device entity cannot be empty");
		}
		this.consumerClientEntity = consumerClientEntity;
	}
	
	public AbstractConsumerClient() {
		super();
	}
	
	public List<T> findAll() {
		List<T> entities = null;
		Session session = null;
		try {
			session = DatabaseConnectionUtil.getSessionFactory().openSession();
			session.beginTransaction();
			entities = session.createCriteria(consumerClientEntity.getName()).list();
			session.getTransaction().commit();
			
		}catch (Exception e) {
			if (session != null) {
				session.getTransaction().rollback();
			}
		}finally {
			if (session != null) {
				session.close();
			}
		}
		return entities;
	}
	
	public boolean saveConsumersState(T instance) {
		Session session = null;
		boolean hasError = false;
		try {
			session = DatabaseConnectionUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.saveOrUpdate(instance);
			session.getTransaction().commit();
		}catch (Exception e) {
			if (session != null) {
				session.getTransaction().rollback();
			}
			hasError = true;
		}finally {
			if (session != null) {
				session.close();
			}
		}
		return hasError;
	}
	
	public T getClientByID(String id) {
		T instance = null;
		Session session = null;
		try {
			
		}catch (Exception e) {
			if (session != null) {
				session.getTransaction().rollback();
			}
		}finally {
			if (session != null) {
				session.close();
			}
		}
		return instance;
	}
}
