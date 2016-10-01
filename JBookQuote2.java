import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by tony on 19/09/2016.
 */
public class JBookQuote2 extends JFrame implements ActionListener {

    JLabel label = new JLabel("<html>To be or not to be... <br>That is the question.</html>");
    JButton button = new JButton("Book");
    JLabel bookName = new JLabel("Book Name:");

    public JBookQuote2(int size) {

        super("This is my quote");
        setSize(size * 2, size);
        setLayout(new FlowLayout());
        add(label);
        add(button);
        add(bookName);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button.addActionListener(this);
    }

    public static void main(String[] args) {

        JBookQuote2 quote = new JBookQuote2(120);
        quote.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent press){

        Object source = press.getSource();

        if(source == button){

            bookName.setText("Book Name: Hamlet");
        }
    }
}
