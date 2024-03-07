package org.example;

import javax.swing.*;

public class RedactionSystem extends JFrame {
    private JPanel frame;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;

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