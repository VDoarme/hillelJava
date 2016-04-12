package swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by User on 05.04.2016.
 */
public class Calculator extends JFrame{
    private JPanel panel;
    private JTextField textField1;
    private JButton a1Button;
    private JButton a4Button;
    private JButton a7Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton button10;
    private JButton a0Button;
    private JButton button12;


    public Calculator(){
        setContentPane(panel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
        setLocationRelativeTo(null);

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String command = e.getActionCommand();
                String text = input.getText();
                input.setText(text + command);
            }
        };



    }


}
