package swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by User on 05.04.2016.
 */
public class MainForm extends JFrame{
    private JPanel panel;
    private JButton closeBtn;
    private JButton anotherCloseBtn;

    public MainForm() {
        setContentPane(panel);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("My First Form");
        pack();
        CloseOperation closeOperation = new CloseOperation();
        closeBtn.addActionListener(closeOperation);
        anotherCloseBtn.addActionListener(closeOperation);

    }

    public static void main(String[] args) {
        new MainForm();
    }

}
