//package dev.avani.movies;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.bson.types.ObjectId;
//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;
//
//@Document(collection = "reviews")
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class Review {
//    @Id
//    private ObjectId id;
//    private String body;
//
//    public Review(String body) {
//        this.body = body;
//    }
//}
package dev.avani.movies;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews") // MongoDB Collection Name
public class Review {

    @Id
    private ObjectId id;
    private String body;

    // No-Args Constructor
    public Review() {
    }

    // Parameterized Constructor (Full)
    public Review(ObjectId id, String body) {
        this.id = id;
        this.body = body;
    }

    // Parameterized Constructor (Only Body)
    public Review(String body) {
        this.body = body;
    }

    // Getters
    public ObjectId getId() {
        return id;
    }

    public String getBody() {
        return body;
    }

    // Setters
    public void setId(ObjectId id) {
        this.id = id;
    }

    public void setBody(String body) {
        this.body = body;
    }

    // toString Method
    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", body='" + body + '\'' +
                '}';
    }
}
