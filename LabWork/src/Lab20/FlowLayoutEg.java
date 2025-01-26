package Lab20;

import javax.swing.*;
import java.awt.*;
public class FlowLayoutEg {
    public static void main(String[] args) {
        // Create a JFrame container
        JFrame frame = new JFrame("FlowLayout Example");

        // Set the layout manager for the JFrame
        frame.setLayout(new FlowLayout());

        // Create several JButtons
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");
        JButton button6 = new JButton("Button 6");

        // Add the buttons to the frame
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);

        // Set JFrame properties
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
