package org.ryoramastudios.tsollauncher;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SignInPage {
    private JPanel loginPage;
    private JPasswordField password;
    private JTextField email;
    private JCheckBox iAgreeToTheCheckBox;
    private JButton signInButton;
    public static JFrame frame = new JFrame("TSOL Launcher");
    public static boolean signIn = false;

    public SignInPage() {
        signInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userText;
                String pwdText;
                userText = email.getText();
                pwdText = password.getText();
                if (iAgreeToTheCheckBox.isSelected()) {
                    if (userText.equalsIgnoreCase("realz@gmail.com") && pwdText.equalsIgnoreCase("pogs1")) {
                        JOptionPane.showMessageDialog(null, "Login Successful");
                    } else if (!userText.equalsIgnoreCase("realz@gmail.com") && !pwdText.equalsIgnoreCase("pogs1")) {
                        JOptionPane.showMessageDialog(null, "Login Unsuccessful, Invalid Username or Password");
                    }
                } else if (!iAgreeToTheCheckBox.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Agree to the TOS!");
                }
            }
        });
    }

    public static void main(String[] args) {
        frame.setContentPane(new SignInPage().loginPage);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int confirm = JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit?",
                        "Exit?", JOptionPane.YES_NO_OPTION);

                if (confirm == JOptionPane.YES_OPTION) {
                    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                } else {
                    frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                }
            }
        });
    }
}
