import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Propertiecs2 extends JFrame {

    Propertiecs2() {
        ImageIcon icon5;
        Font f05 = new Font("Arial", Font.ROMAN_BASELINE + Font.BOLD, 14);
        Font fo6 = new Font("Arial", Font.ROMAN_BASELINE + Font.BOLD, 16);
        Cursor cursor4;
        cursor4 = new Cursor(Cursor.HAND_CURSOR);
        this.setTitle("Property Management System");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setBounds(350, 230, 400, 300);
        this.setFont(f05);
        icon5 = new ImageIcon(getClass().getResource("icon.png"));
        this.setIconImage(icon5.getImage());
        Container r5;
        r5 = this.getContentPane();
        r5.setLayout(null);
        JLabel lebel15;
        JButton button15, button005, button011111;
        lebel15 = new JLabel();
        r5.add(lebel15);
        lebel15.setText("Sylhet");
        lebel15.setFont(fo6);
        lebel15.setBounds(153, 30, 100, 70);
        button15 = new JButton();
        button15.setText("Coming Soon");
        button15.setToolTipText("Invalid");
        button15.setFont(fo6);
        button15.setCursor(cursor4);
        button15.setBounds(80, 100, 220, 40);
        r5.add(button15);
        button15.addActionListener((ActionEvent e) -> {
            dispose();
            JOptionPane.showMessageDialog(null, "WE ARE WORKING ON THIS !!");
            ListOfProperties list1 = new ListOfProperties();
            list1.setVisible(true);
        });
        button011111 = new JButton();
        button011111.setText("Home");
        button011111.setCursor(cursor4);
        button011111.setToolTipText("Back TO Home");
        button011111.setBounds(95, 160, 90, 40);
        r5.add(button011111);
        button011111.addActionListener((ActionEvent e) -> {
            dispose();
            HomePage frame11111 = new HomePage();
            frame11111.setVisible(true);
        });

        button005 = new JButton();
        button005.setText("Back");
        button005.setBounds(195, 160, 90, 40);
        button005.setToolTipText("Previous Page");
        button005.setCursor(cursor4);
        r5.add(button005);
        button005.addActionListener((ActionEvent e) -> {
            dispose();
            ListOfProperties frame005 = new ListOfProperties();
            frame005.setVisible(true);
        });
        JLabel lebelImg1234;
        ImageIcon Icon2912;
        Icon2912 = new ImageIcon(getClass().getResource("login.jpg"));
        lebelImg1234 = new JLabel("", Icon2912, JLabel.CENTER);
        lebelImg1234.setBounds( 0, 0, 400, 300);
        r5.add(lebelImg1234);
    }
}