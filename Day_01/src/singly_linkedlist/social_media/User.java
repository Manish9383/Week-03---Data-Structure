package singly_linkedlist.social_media;

import java.util.ArrayList;

public class User {
    int userID;
    String name;
    int age;
    ArrayList<Integer> friendIDs;
    User next;

    public User(int userID, String name, int age) {
        this.userID = userID;
        this.name = name;
        this.age = age;
        this.friendIDs = new ArrayList<>();
        this.next = null;
    }

    public void displayUser() {
        System.out.println("User ID: " + userID + ", Name: " + name + ", Age: " + age + ", Friends: " + friendIDs);
    }
}
