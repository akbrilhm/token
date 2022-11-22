package org.ilhamakbar.fundal.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormToken {
    private JTextField textNohp;
    private JTextField textFNotoken;
    private JButton button1;
    private JPanel rootPanel;
    private JLabel labelHasil;

    public FormToken() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String NoHp = textNohp.getText();
                String NoToken = textFNotoken.getText();
                Udean udin = new Udean ();
                udin.setNoHp(NoHp);
                udin.setNoToken(NoToken);
                labelHasil.setText(udin.toString());
            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}
