package com.company.Visualisation;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    public static void Frame() {
        JFrame frame = new JFrame("Window");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel label = new JLabel("");
        frame.getContentPane().add(label);

        frame.setPreferredSize(new Dimension(1280, 720));

        frame.pack();
        frame.setVisible(true);
    }

}
