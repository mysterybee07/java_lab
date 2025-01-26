package Lab24;

import javax.swing.*;
public class GroupLayoutEg {
    public static void main(String[] args) {
        // Create a JFrame container
        JFrame frame = new JFrame("GroupLayout");

        // Set the layout manager for the JFrame to GroupLayout
        GroupLayout layout = new GroupLayout(frame.getContentPane());
        frame.setLayout(layout);

        // Create JLabel and JTextField
        JLabel label = new JLabel("Enter your name:");
        JTextField textField = new JTextField(15);

        // Define the horizontal group (horizontal alignment of components)
        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                        .addComponent(label)
                        .addComponent(textField)
        );

        // Define the vertical group (vertical alignment of components)
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label)
                        .addComponent(textField)
        );

        // Set JFrame properties
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}

