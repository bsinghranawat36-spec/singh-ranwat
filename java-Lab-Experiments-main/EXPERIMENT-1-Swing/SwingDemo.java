import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Components Demo");
        frame.setSize(400, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JTextField textField = new JTextField(15);
        JButton button = new JButton("Click Me");
        JToggleButton toggle = new JToggleButton("Toggle");
        JCheckBox checkBox = new JCheckBox("I Agree");

        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        JLabel result = new JLabel("Enter your name");

        button.addActionListener(e ->
            result.setText("Hello, " + textField.getText())
        );

        frame.add(textField);
        frame.add(button);
        frame.add(toggle);
        frame.add(checkBox);
        frame.add(male);
        frame.add(female);
        frame.add(result);

        frame.setVisible(true);
    }
}