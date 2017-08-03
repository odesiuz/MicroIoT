package com.ono.databaseUtil;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.ono.entities.Consumerclient;

public class DatabaseConnectionUtil {

	private static SessionFactory sessionFactory = null;
	
	static {
		try {
			Configuration config = new Configuration();
			config.configure();
			StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder();
			builder.applySettings(config.getProperties());
			MetadataSources metadataSources = new MetadataSources();
			metadataSources.addAnnotatedClass(Consumerclient.class);
			Metadata metadata = metadataSources.buildMetadata(builder.build());
			sessionFactory = metadata.buildSessionFactory();
			
		}catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
