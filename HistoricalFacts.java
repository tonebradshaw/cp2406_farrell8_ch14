import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by tony on 20/09/2016.
 */
public class HistoricalFacts extends JFrame implements ActionListener{

    JButton button = new JButton("Press to change facts");
    JLabel label1 = new JLabel("Banging your head against a wall burns 150 calories an hour.");
    JLabel label2 = new JLabel("In the UK, it is illegal to eat mince pies on Christmas Day");
    JLabel label3 = new JLabel("Pteronophobia is the fear of being tickled by feathers!");
    JLabel label4 = new JLabel("When hippos are upset, their sweat turns red.");
    JLabel label5 = new JLabel("A flock of crows is known as a murder.");
    int count = 0;

    public HistoricalFacts(){

        super("Press button to change facts");
        setSize(500, 300);
        setLayout(new FlowLayout());
        add(button);
        add(label1);
        add(label2);
        add(label3);
        add(label4);
        add(label5);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent press){

        Object source = press.getSource();

        if(source == button){

            if(count == 0){
                label1.setText("\"Facebook Addiction Disorder\" is a mental disorder identified by Psychologists.");
            }else if(count == 1){
                label2.setText("The average woman uses her height in lipstick every 5 years.");
            }else if(count == 2){
                label3.setText("29th May is officially \"Put a Pillow on Your Fridge Day\".");
            }else if(count == 3){
                label4.setText("Billy goats urinate on their own heads to smell more attractive to females.");
            }else if(count == 4){
                label5.setText("Human saliva has a boiling point three times that of regular water.");
            }
            ++count;
        }
    }

    public static void main(String[] args) {

        HistoricalFacts frame = new HistoricalFacts();
        frame.setVisible(true);
    }
}
