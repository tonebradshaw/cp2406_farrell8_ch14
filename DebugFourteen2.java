import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by tony on 17/09/2016.
 */
public class DebugFourteen2 extends JFrame implements ItemListener{

    FlowLayout flow = new FlowLayout();
    JComboBox<String> payMethod = new JComboBox<>();
    JLabel payList = new JLabel("Pay List");
    JTextField totFees = new JTextField(25);
    String pctMsg = new String("per cent will be added to your bill");
    int[] fees = {5, 2, 0};
    int feePct = 0;
    String output;
    int fee = 0;

    public DebugFourteen2(){

        super("Pay List");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        payMethod.addItemListener(this);
        add(payList);
        add(payMethod);
        payMethod.addItem("Credit card");
        payMethod.addItem("Check");
        payMethod.addItem("Cash");
        add(totFees);
    }
    public static void main(String[] arguments){

        JFrame cframe = new DebugFourteen2();
        cframe.setSize(350,150);
        cframe.setVisible(true);
    }
    @Override
    public void itemStateChanged(ItemEvent i){

        Object source = i.getSource();

        if(source == payMethod){

            int fee = payMethod.getSelectedIndex();
            feePct = fees[fee];
            output = feePct + " " + pctMsg;
            totFees.setText(output);
        }
    }
}
