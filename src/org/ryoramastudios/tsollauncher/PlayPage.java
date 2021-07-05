package org.ryoramastudios.tsollauncher;

import javax.swing.*;

public class PlayPage {
  
    public JPanel playPage;
    private JButton launchButton;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;



    public static void initPlayPage() {
        SignInPage.frame.revalidate();
        SignInPage.frame.setResizable(true);
        SignInPage.frame.setSize(800, 500);
        SignInPage.frame.setLocationRelativeTo(null);
    }
}
