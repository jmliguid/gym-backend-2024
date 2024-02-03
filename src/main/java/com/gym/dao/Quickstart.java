package com.gym.dao;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Quickstart {
	
	public static void main(String[] args) {
		String uri = "mongodb+srv://joshualiguid:<password>@cluster0.n5bfclb.mongodb.net/?retryWrites=true&w=majority";
		
		try (MongoClient mongoClient = MongoClients.create(uri)) {
			MongoDatabase database = mongoClient.getDatabase("sample_mflgix");
			MongoCollection<Document> collection = database.getCollection("movies");
			
//			Document doc = collection.find("title", "Back to the Future").first();
//			if (doc != null ) {
//				System.out.println(doc.toJson());
//			} else {
//				System.out.println("No matching documents found.");
//			}
			
		}
	}

}
