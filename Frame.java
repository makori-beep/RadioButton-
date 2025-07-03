import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame {

    public static void main(String[] args) {
        // Create radio buttons
        JRadioButton r1 = new JRadioButton("Bird");
        JRadioButton r2 = new JRadioButton("Cat");
        JRadioButton r3 = new JRadioButton("Dog");
        JRadioButton r4 = new JRadioButton("Rabbit");
        JRadioButton r5 = new JRadioButton("Pig");

        // Group the buttons
        ButtonGroup bt = new ButtonGroup();
        bt.add(r1);
        bt.add(r2);
        bt.add(r3);
        bt.add(r4);
        bt.add(r5);

        // Panel for radio buttons
        JPanel rPanel = new JPanel();
        rPanel.setLayout(new GridLayout(5, 1, 10, 10));
        rPanel.add(r1);
        rPanel.add(r2);
        rPanel.add(r3);
        rPanel.add(r4);
        rPanel.add(r5);

        // Panel for image
        JPanel pPanel = new JPanel();
        JLabel label2 = new JLabel();

        // Load and scale image -
        ImageIcon originalIcon = new ImageIcon("C:\\\\Users\\\\HP\\\\Desktop\\\\pig.jpg");


        Image scaledImage = originalIcon.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        label2.setIcon(scaledIcon);

        pPanel.add(label2);

        // Frame dimensions
        JFrame frame = new JFrame("RADIOBUTTON EXAMPLE");
        frame.setLayout(new BorderLayout(10, 10));
        frame.setSize(700, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(rPanel, BorderLayout.WEST);
        frame.add(pPanel, BorderLayout.CENTER);
        frame.setVisible(true);

        // Show message when radio button is selected
        ActionListener showMessage = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JRadioButton selected = (JRadioButton) e.getSource();
                JOptionPane.showMessageDialog(frame, "You selected: " + selected.getText());
            }
        };

        // Add action listeners
        r1.addActionListener(showMessage);
        r2.addActionListener(showMessage);
        r3.addActionListener(showMessage);
        r4.addActionListener(showMessage);
        r5.addActionListener(showMessage);
    }
}