package uppgift2;

import javax.swing.*;
import java.awt.event.*;


public class Main {

    private Application application;
    private JButton b1, b2, b3;

    class ActionHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == b1) {
                application.action1();
            } else if (e.getSource() == b2) {
                application.action2();
            } else {
                application.action3();
            }
        }
    }
}

