/*
 * Created by JFormDesigner on Mon Mar 25 15:04:39 CST 2024
 */

package Form;

import java.awt.*;
import javax.swing.*;

/**
 * @author Administrator
 */
public class StudenManager extends JFrame {
    public StudenManager() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        panel1 = new JPanel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== panel1 ========
        {
            panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

            //---- button1 ----
            button1.setText("\u5237\u65b0");
            panel1.add(button1);

            //---- button2 ----
            button2.setText("\u65b0\u589e");
            panel1.add(button2);

            //---- button3 ----
            button3.setText("\u4fee\u6539");
            panel1.add(button3);

            //---- button4 ----
            button4.setText("\u5220\u9664");
            panel1.add(button4);
        }
        contentPane.add(panel1, BorderLayout.SOUTH);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JPanel panel1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
