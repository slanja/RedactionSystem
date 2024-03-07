package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame{
    static Users slanja;
    private JPanel frame;
    private JPasswordField passwordField;
    private JTextField usernameLabel;
    private JButton loginButton;

    private void initComponents() {
        setContentPane(frame);
        setTitle("Login");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public Login(Users slanja) {
        initComponents();

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (usernameLabel.getText().equals(slanja.getUsername()) && passwordField.getText().equals(slanja.getPassword())) {
                    dispose();
                    new RedactionSystem();
                }
            }
        });
    }

    public static void main(String[] args) {
        new Login(slanja);
    }
}
