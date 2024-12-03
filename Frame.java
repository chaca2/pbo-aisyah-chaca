package test;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Frame extends JFrame {

    // Constructor for the Frame class
    public Frame() {
        // Set the title of the frame
        setTitle("Simple Frame Example");
        
        // Set the default close operation to exit the application when the window is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Set the size of the frame
        setSize(400, 300);
        
        // Center the frame on the screen
        setLocationRelativeTo(null);
        
        // Add a simple label to the frame
        JLabel label = new JLabel("Hello, welcome to your first frame!", JLabel.CENTER);
        add(label);
    }

    // Main method to launch the application
    public static void main(String[] args) {
        // Schedule a job for the event-dispatching thread to create and display the frame
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Create and display the frame
                Frame frame = new Frame();
                frame.setVisible(true);
            }
        });
    }
}