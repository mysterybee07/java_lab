package Lab17;

import javax.swing.*;
import java.awt.event.*;
public class SwingEg {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Example");

    // Create a label
    JLabel label = new JLabel("Enter your name: ");
    label.setBounds(50, 50, 100, 30);

    // Create a text field
    JTextField textField = new JTextField();
    textField.setBounds(150, 50, 200, 30);

    // Create a button
    JButton button = new JButton("Submit");
    button.setBounds(150, 100, 100, 30);

    // Create a result label
    JLabel resultLabel = new JLabel();
    resultLabel.setBounds(150, 150, 200, 30);

    // Button click event
    button.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            resultLabel.setText("You are " + textField.getText());
        }
    });

    // Add components to the frame
    frame.add(label);
    frame.add(textField);
    frame.add(button);
    frame.add(resultLabel);

    // Set layout to null (absolute positioning)
    frame.setLayout(null);

    // Set the size and visibility of the frame
    frame.setSize(400, 250);
    frame.setVisible(true);

    // Close the frame when the user closes it
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
