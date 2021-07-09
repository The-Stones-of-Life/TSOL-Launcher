package org.ryoramastudios.tsollauncher;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterPage {
    public JPanel registerPage;
    private JTextField emailField;
    private JButton signUpButton;
    private JPasswordField passwordField;
    private JTextField usernameField;
    private JLabel username;
    private JLabel password;
    private JLabel email;
    private JCheckBox rememberMeCheckBox;
    private JCheckBox showPasswordCheckBox;

    public RegisterPage() {
        showPasswordCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (showPasswordCheckBox.isSelected()) {
                    passwordField.setEchoChar((char) 0);
                } else {
                    passwordField.setEchoChar('*');
                }
            }
        });
    }

    public static void initRegisterPage() {
        SignInPage.frame.revalidate();
        SignInPage.frame.setResizable(true);
        SignInPage.frame.setSize(400, 150);
        SignInPage.frame.setLocationRelativeTo(null);
    }

}
