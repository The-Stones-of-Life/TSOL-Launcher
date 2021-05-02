package org.ryoramastudios.tsollauncher;

import javax.swing.*;
import java.awt.*;

public class PlayPage extends Container {

    public static PlayPage Instance = new PlayPage();

    public JPanel playPage;
    private JButton playButton;
    private JButton settingsButton;
    private JButton playButton1;
    private JButton changelogsButton;
    private JButton profileButton1;
    private JButton versionsButton1;

    public static JFrame frame = new JFrame("TSOL Launcher");

    public static void initPlayPage() {
        frame.setResizable(true);
    }
}
