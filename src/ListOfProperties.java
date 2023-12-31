import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ListOfProperties extends JFrame {

    ListOfProperties() {
        ImageIcon icon3;
        Font f01 = new Font("Arial", Font.ROMAN_BASELINE + Font.BOLD, 25);
        Font fo2 = new Font("Arial", Font.TRUETYPE_FONT + Font.BOLD, 16);
        Cursor cursor2;
        cursor2 = new Cursor(Cursor.HAND_CURSOR);
        this.setTitle("Property Management System");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setBounds(250, 150, 600, 400);
        this.setFont(f01);
        icon3 = new ImageIcon(getClass().getResource("icon.png"));
        this.setIconImage(icon3.getImage());
        Container r3;
        r3 = this.getContentPane();
        r3.setLayout(null);
        JLabel lebel9;
        JButton button9, button10, button11, button00005;
        lebel9 = new JLabel();
        r3.add(lebel9);
        lebel9.setText("List of Properties");
        lebel9.setFont(f01);
        lebel9.setBounds(200, 20, 500, 70);
        button9 = new JButton();
        button9.setText("Dhaka");
        button9.setBounds(150, 100, 300, 40);
        button9.setFont(fo2);
        button9.setCursor(cursor2);
        button9.setToolTipText("Apartments");
        r3.add(button9);
        button9.addActionListener((ActionEvent e) -> {
            Propertiecs  frame006 = new Propertiecs ();
            frame006.setVisible(true);
        });

        button10 = new JButton();
        button10.setText("Sylhet");
        button10.setBounds(150, 150, 300, 40);
        button10.setFont(fo2);
        button10.setCursor(cursor2);
        button10.setToolTipText("Apartments");
        r3.add(button10);
        button10.addActionListener((ActionEvent e) -> {
            dispose();
            Propertiecs2 frame001 = new Propertiecs2();
            frame001.setVisible(true);
        });

        button11 = new JButton();
        button11.setText("Chittagong");
        button11.setBounds(150, 200, 300, 40);
        button11.setFont(fo2);
        button11.setCursor(cursor2);
        button11.setToolTipText("Apartments");
        r3.add(button11);
        button11.addActionListener((ActionEvent e) -> {
            dispose();
            Propertiecs3 frame0001 = new Propertiecs3();
            frame0001.setVisible(true);
        });
        button00005 = new JButton();
        button00005.setText("BACK");
        button00005.setToolTipText("Previous Page");
        button00005.setBounds(250, 250, 100, 40);
        button00005.setCursor(cursor2);
        button00005.setFont(fo2);
        r3.add(button00005);
        button00005.addActionListener((ActionEvent e) -> {
            dispose();
            HomePage frame0005 = new HomePage();
            frame0005.setVisible(true);
        });
        JLabel lebelImg12;
        ImageIcon Icon2912;
        Icon2912 = new ImageIcon(getClass().getResource("login.jpg"));
        lebelImg12 = new JLabel("", Icon2912, JLabel.CENTER);
        lebelImg12.setBounds(0, 0, 600, 400);
        r3.add(lebelImg12);
    }
}