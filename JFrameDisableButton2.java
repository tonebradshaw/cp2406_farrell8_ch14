import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by tony on 20/09/2016.
 */
public class JFrameDisableButton2 extends JFrame implements ActionListener {


    JButton button = new JButton("Press");
    JLabel label = new JLabel("Press 8 times");
    int count = 0;

    public JFrameDisableButton2(){

        super("Disable button after press");
        setSize(200, 300);
        setLayout(new FlowLayout());
        add(button);
        add(label);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent press){

        Object source = press.getSource();
        ++count;

        if(source == button && count == 8){

            button.setEnabled(false);
            label.setText("That's Enough!");
        }
    }
    public static void main(String[] args) {

        JFrameDisableButton2 frame = new JFrameDisableButton2();
        frame.setVisible(true);
    }
}
