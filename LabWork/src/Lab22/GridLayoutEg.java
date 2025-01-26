package Lab22;

import javax.swing.*;
import java.awt.*;  // Import for GridLayout

public class GridLayoutEg {
    public static void main(String[] args) {
        JFrame frame = new JFrame("3x3 Grid of Buttons");

        frame.setLayout(new GridLayout(3, 3));

        // Add 9 buttons to the grid
        for (int i = 1; i <= 9; i++) {
            JButton button = new JButton(String.valueOf(i));
            frame.add(button);
        }

        // Set frame properties
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
