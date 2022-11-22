package org.ilhamakbar.fundal.gui;

import javax.swing.*;

public class RunFormToken {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Formulir Token");
        jFrame.setContentPane(new FormToken().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(600,400);
        jFrame.setVisible(true);
    }
}
