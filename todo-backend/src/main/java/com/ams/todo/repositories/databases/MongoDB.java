package com.ams.todo.repositories.databases;


import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public enum MongoDB {
	INSTANCE;
	
	private DB db;
	private Datastore datastore;

	private final String SERVER_URL = "localhost";
	private final int SERVER_PORT = 27017;
	//private final String USERNAME= "...";
	//private final String PASSWORD = "...";
	private final String DATABASE_NAME = "taches";

	private MongoDB() {

	    final MongoClient mongoClient = new MongoClient(SERVER_URL, SERVER_PORT);

		//this.db = mongoClient.getDB(DATABASE_NAME);
		//this.db.authenticate(USERNAME,PASSWORD.toCharArray());

		Morphia morphia = new Morphia();
		morphia.mapPackage("com.ams.todo.pojo");

		this.datastore = morphia.createDatastore(mongoClient, DATABASE_NAME);

	}

	public DB getDB() {
	    return this.db;
	}

	public Datastore getDatastore() {
	    return this.datastore;
	}
}
