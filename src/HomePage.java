import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
public class HomePage extends JFrame {
    public HomePage() {
        Font f = new Font("Arial", Font.ROMAN_BASELINE + Font.BOLD, 25);
        Font fo = new Font("Arial", Font.TRUETYPE_FONT + Font.BOLD, 16);
        ImageIcon icon2;
        this.setTitle("Property Management System");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setBounds(250, 150, 600, 450);
        this.setFont(f);
        icon2 = new ImageIcon(getClass().getResource("icon.png"));
        this.setIconImage(icon2.getImage());
        Container r2;
        r2 = this.getContentPane();
        r2.setLayout(null);
        JLabel label1 = new JLabel();
        r2.add(label1);
        label1.setText("Home");
        label1.setFont(f);
        label1.setForeground(Color.BLACK);
        label1.setBounds(260, 20, 100, 70);

        JButton button3, button4, button5, button6, button7;

        button3 = new JButton();
        button3.setText("List Of PROPERTIES");
        button3.setFont(fo);
        button3.setToolTipText("APARTMENTS");
        button3.setForeground(Color.BLACK);
        button3.setBounds(150, 100, 300, 30);
        r2.add(button3);
        button3.addActionListener((ActionEvent e) -> {
            dispose();
            ListOfProperties frame2 = new ListOfProperties();
            frame2.setVisible(true);
        });
        button4 = new JButton();
        button4.setText("Buyer information");
        button4.setFont(fo);
        button4.setToolTipText("Customer Information");
        button4.setForeground(Color.BLACK);
        button4.setBounds(150, 140, 300, 30);
        r2.add(button4);
        button4.addActionListener((ActionEvent e) -> {
            dispose();
            Buyer_Info frame6969 = new Buyer_Info();
            frame6969.setVisible(true);
        });
        button5 = new JButton();
        button5.setText("Contact-Us");
        button5.setFont(fo);
        button5.setToolTipText("Information About us");
        button5.setForeground(Color.BLACK);
        button5.setBounds(150, 180, 300, 30);
        r2.add(button5);
        button5.addActionListener((ActionEvent a) -> {
            dispose();
            About_Us us = new About_Us();
            us.setVisible(true);
        });
        button6 = new JButton();
        button6.setText("Rules & Regulations");
        button6.setFont(fo);
        button6.setToolTipText("Rules");
        button6.setForeground(Color.BLACK);
        button6.setBounds(150, 220, 300, 30);
        r2.add(button6);
        button6.addActionListener((ActionEvent e) -> {
            dispose();
                    Rules rule = new Rules();
                    rule.setVisible(true);

        }
        );
        button7 = new JButton();
        button7.setText("Sign out");
        button7.setFont(fo);
        button7.setToolTipText("Log Out");
        button7.setForeground(Color.BLACK);
        button7.setBounds(250, 280, 100, 30);
        r2.add(button7);
        button7.addActionListener((ActionEvent e) -> {
            dispose();
            Sign_Out frame06 = new Sign_Out();
            frame06.setVisible(true);
        });
        JLabel lebelImg1;
        ImageIcon Icon291;
        Icon291 = new ImageIcon(getClass().getResource("login.jpg"));
        lebelImg1 = new JLabel("", Icon291, JLabel.CENTER);
        lebelImg1.setBounds(0, 0, 600, 400);
        r2.add(lebelImg1);

    }
}
