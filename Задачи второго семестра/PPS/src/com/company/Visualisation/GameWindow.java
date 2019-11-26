package com.company.Visualisation;

import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.*;

public class GameWindow extends JFrame {
    private static GameWindow game_window;
    private static long last_frame_time;
    private static Image drop;
    private static Image background;
    private static Image gameover;
    private static float drop_left = (int)(Math.random() * 800.0D);

    public GameWindow() {}

    public static void main(String[] args) throws java.io.IOException {
        background = ImageIO.read(GameWindow.class.getResourceAsStream("Background.png"));
        game_window = new GameWindow();
        game_window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        game_window.setLocation(200, 100);
        game_window.setSize(1280, 720);
        game_window.setResizable(true);
        last_frame_time = System.nanoTime();
        GameField gameField = new GameField();
        game_window.setVisible(true);
    }

    private static void onRepaint(Graphics g) {
        long current_time = System.nanoTime();
        float delta_time = (float)(current_time - last_frame_time) * 1.0E-9F;
        last_frame_time = current_time;
        g.drawImage(background, 0, 0, null);
    }

    private static class GameField extends JPanel {
        private GameField() {}

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            GameWindow.onRepaint(g);
            repaint();
        }
    }
}

