package org.example;

import javax.swing.*;

public class RedactionSystem extends JFrame {
    private JPanel frame;
    private JButton addArticleButton;
    private JButton addAdminButton;
    private JButton removeArticleButton;
    private JButton addUserButton;
    private JButton removeUserButton;

    private void initComponents() {
        setContentPane(frame);
        setTitle("Redaction System");
        setSize(900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public RedactionSystem() {
        initComponents();
    }
}