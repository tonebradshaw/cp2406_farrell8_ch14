import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by tony on 20/09/2016.
 */
public class JFrameDisableButton extends JFrame implements ActionListener {


    JButton button = new JButton("Press");

    public JFrameDisableButton(){

        super("Disable button after press");
        setSize(200, 300);
        setLayout(new FlowLayout());
        add(button);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent press){

        Object source = press.getSource();

        if(source == button){

            button.setEnabled(false);

        }
    }

    public static void main(String[] args) {

        JFrameDisableButton frame = new JFrameDisableButton();
        frame.setVisible(true);
    }
}
