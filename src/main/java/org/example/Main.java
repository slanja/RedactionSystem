package org.example;

public class Main {
    public static void main(String[] args) {
        Users slanja = new Users(123, "Username", 17, "Password", null, 3);

        new Login(slanja);
    }
}