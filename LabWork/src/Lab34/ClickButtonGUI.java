package Lab34;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

public class ClickButtonGUI {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Button Click GUI");

        JLabel label = new JLabel("Click the button!");

        JButton button = new JButton("Click Me");

        // Add an ActionListener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button Clicked!");
            }
        });

        // Set the layout and add components
        frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.add(label);

        // Set frame properties
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
