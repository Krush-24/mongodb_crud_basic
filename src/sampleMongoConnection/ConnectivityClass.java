package sampleMongoConnection;

import java.util.Iterator;
import java.util.Scanner;

import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.DeleteResult;

public class ConnectivityClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			MongoClient mg = new MongoClient("localhost",27017);
			MongoDatabase db = mg.getDatabase("school");
			if(db!=null)
			{
				System.out.println("Connection Established");
				MongoCollection<Document> mc = db.getCollection("student");

//				to insert the data inside document
//				String name = sc.nextLine();
//				int age = sc.nextInt();
//				int sal = sc.nextInt();
//				
//				Document obj = new Document("name",name).append("age", age).append("sal", sal);
//				mc.insertOne(obj);
//				System.out.println("Document added successfully");

//				to view the document
//				FindIterable<Document> findvalue = mc.find();
//				
//				Iterator<Document> it = findvalue.iterator();
//				while(it.hasNext())
//				{
//					Document doc = it.next();
//					System.out.println(doc.getString("name")+" "+doc.getInteger("age")+" "+doc.getInteger("sal"));
//					
//				}
				
//				to get specific data from the document
//				Document doc = mc.find(new Document("name","Krushnaraj")).first();
//				System.out.println(doc.getString("name")+" "+doc.getInteger("age")+" "+doc.getInteger("sal"));

//				to update one specific document
//				mc.updateOne(Filters.eq("name","Krushnaraj"),Updates.set("sal", 75000));
//				System.out.println("Updated Successfully");
				
//				to delete one field
//				DeleteResult del = mc.deleteOne(Filters.eq("name","john doe"));
//				System.out.println("Deleted one value successfully");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
