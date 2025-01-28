package Lab37;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.BorderLayout;

public class DisplayKeystroke {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Display Keystroke");

        JTextArea textArea = new JTextArea(10, 30);
        textArea.setEditable(false);  // Make the text area non-editable by the user

        textArea.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                textArea.append("Key Typed: " + e.getKeyChar() + "\n");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                textArea.append("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()) + "\n");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                textArea.append("Key Released: " + KeyEvent.getKeyText(e.getKeyCode()) + "\n");
            }
        });

        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.setLayout(new BorderLayout());
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);  // Make the frame visible

        // Set focus to the text area to capture keystrokes
        textArea.requestFocusInWindow();
    }
}
