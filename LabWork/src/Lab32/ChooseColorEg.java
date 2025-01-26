package Lab32;

import javax.swing.*;
import java.awt.*;
public class ChooseColorEg {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Chooser");
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(400, 300));
        panel.setBackground(Color.WHITE);  // Set initial background color to white

        JButton colorButton = new JButton("Choose Color");

        colorButton.addActionListener(e -> openColorChooserDialog(panel));

        frame.setLayout(new BorderLayout());
        frame.add(colorButton, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);

        frame.setSize(500, 400);  // Set window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Close on exit
        frame.setVisible(true);  // Make the frame visible
    }

    // Method to open the color chooser dialog and change panel background color
    private static void openColorChooserDialog(JPanel panel) {
        // Open the color chooser dialog and store the selected color
        Color selectedColor = JColorChooser.showDialog(null, "Choose a Color", panel.getBackground());

        if (selectedColor != null) {
            panel.setBackground(selectedColor);
        }
    }
}
