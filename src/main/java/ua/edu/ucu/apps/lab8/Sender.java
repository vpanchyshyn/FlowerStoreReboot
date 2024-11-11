package ua.edu.ucu.apps.lab8;

public class Sender implements User {
    @Override
    public void update(String status) {
        System.out.println("upd:", status);
    }
}