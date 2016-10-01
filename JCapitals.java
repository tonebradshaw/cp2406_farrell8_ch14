import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by tony on 20/09/2016.
 */
public class JCapitals extends JFrame implements ActionListener {

    JComboBox countryBox = new JComboBox();
    JLabel label = new JLabel();

    public JCapitals(){

        super("ComboBox");
        setSize(500, 300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(countryBox);
        countryBox.addItem("Germany");
        countryBox.addItem("Australia");
        countryBox.addItem("England");
        countryBox.addItem("France");
        countryBox.addItem("China");
        countryBox.addItem("Nigeria");
        countryBox.addItem("Canada");
        countryBox.addActionListener(this);
        add(label);
    }
    @Override
    public void actionPerformed(ActionEvent ae){

        String text = "";
        int number = countryBox.getSelectedIndex();

        if(number == 0){
            text = "Berlin";
        }else if(number == 1){
            text = "Canberra";
        }else if(number == 2){
            text = "London";
        }else if(number == 3){
            text = "Paris";
        }else if(number == 4){
            text = "Beijing";
        }else if(number == 5){
            text = "Abuja";
        }else if(number == 6) {
            text = "Toronto";
        }
        label.setText(text);
    }

    public static void main(String[] args) {

        JCapitals capital = new JCapitals();
        capital.setVisible(true);
    }
}
