package com.mycompany.crud2;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
public class Crud2 {

    public static void main(String[] args) {
        MongoClientURI url = new MongoClientURI("mongodb+srv://fabio:4770@authdb.0mtus.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
        MongoClient conexion = null;
        conexion = new MongoClient(url);
        DB db = conexion.getDB("store");
        DBCollection colec = db.getCollection("ropa");
        DBCursor cursor = colec.find();

        while(cursor.hasNext()) {
            System.out.println("* "+ cursor.next().get("nombre") + " - " + cursor.curr().get("valor"));
        }
    }
}
