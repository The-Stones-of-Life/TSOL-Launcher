package org.ryoramastudios.tsollauncher;

import javax.swing.*;

public class PlayPage {
  
    public JPanel playPage;
    private JButton launchButton;
    private JButton changelogsButton;
    private JButton newsButton;
    private JButton playButton;
    private JButton profileButton;
    private JButton settingsButton;



    public static void initPlayPage() {
        SignInPage.frame.revalidate();
        SignInPage.frame.setResizable(true);
        SignInPage.frame.setSize(800, 500);
        SignInPage.frame.setLocationRelativeTo(null);
    }
}
