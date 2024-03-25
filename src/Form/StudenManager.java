/*
 * Created by JFormDesigner on Mon Mar 25 15:04:39 CST 2024
 */

package Form;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 * @author Administrator
 */
public class StudenManager extends JFrame {
    public StudenManager() {
        initComponents();
    }

    /**
     * 刷新数据
     * @param e
     */
    private void flushed(ActionEvent e) {
        /*
        *  获取数据
        *  获取表格数据模型
        * */
        TableModel model = table1.getModel();
        // 给第一行第二列设置值
        model.setValueAt("张三", 0,1);
        model.setValueAt("12323213",0,0);
        model.setValueAt("男",0,2);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        panel1 = new JPanel();
        flushed = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== panel1 ========
        {
            panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

            //---- flushed ----
            flushed.setText("\u5237\u65b0");
            flushed.addActionListener(e -> flushed(e));
            panel1.add(flushed);

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

        //======== scrollPane1 ========
        {

            //---- table1 ----
            table1.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null, null},
                    {null, null, null},
                },
                new String[] {
                    "\u5b66\u53f7", "\u59d3\u540d", "\u6027\u522b"
                }
            ) {
                Class<?>[] columnTypes = new Class<?>[] {
                    String.class, String.class, String.class
                };
                @Override
                public Class<?> getColumnClass(int columnIndex) {
                    return columnTypes[columnIndex];
                }
            });
            {
                TableColumnModel cm = table1.getColumnModel();
                cm.getColumn(2).setCellEditor(new DefaultCellEditor(
                    new JComboBox(new DefaultComboBoxModel(new String[] {
                        "\u7537",
                        "\u5973"
                    }))));
            }
            scrollPane1.setViewportView(table1);
        }
        contentPane.add(scrollPane1, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JPanel panel1;
    private JButton flushed;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JScrollPane scrollPane1;
    private JTable table1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
