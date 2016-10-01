import javax.swing.*;
import java.awt.*;

/**
 * Created by tony on 19/09/2016.
 */
public class JBookQuote extends JFrame {

    public JBookQuote(int size) {

        super("This is my quote");
        FlowLayout flow = new FlowLayout();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("<html>To be or not to be... <br>That is the question.</html>");
        setSize(size * 2, size);
        add(label);
        setVisible(true);
    }


    public static void main(String[] args) {

        JBookQuote quote = new JBookQuote(200);
    }
}