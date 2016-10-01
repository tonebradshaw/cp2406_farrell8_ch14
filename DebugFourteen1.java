import javax.swing.*;

/**
 * Created by tony on 17/09/2016.
 */
public class DebugFourteen1 extends JFrame {

    public DebugFourteen1(int size){

        super("This is my frame");
        setSize(size * 3, size * 2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args){

        DebugFourteen1 frame = new DebugFourteen1(200);
    }
}
