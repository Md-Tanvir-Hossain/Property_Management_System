import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Rules extends JFrame {

    Rules() {
        Font fo0 = new Font("Arial", Font.TRUETYPE_FONT + Font.BOLD, 16);
        Font fon = new Font("Arial", Font.TRUETYPE_FONT + Font.BOLD, 19);
        Cursor cursor12;
        cursor12 = new Cursor(Cursor.HAND_CURSOR);
        ImageIcon icon13;
        this.setTitle("Property Management System");
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setBounds(300, 170, 450, 300);
        Container r66;
        r66 = this.getContentPane();
        r66.setLayout(null);
        JLabel lebel91 = new JLabel("Rules and Regulations");
        r66.add(lebel91);
        lebel91.setFont(fon);
        lebel91.setForeground(Color.BLACK);
        lebel91.setBounds(117, 20, 500, 70);
        icon13 = new ImageIcon(getClass().getResource("icon.png"));
        this.setIconImage(icon13.getImage());
        JButton button34 = new JButton("Security");
        button34.setFont(fo0);
        button34.setToolTipText("INFORMATION");
        button34.setCursor(cursor12);
        button34.setForeground(Color.BLACK);
        button34.setBounds(120, 100, 200, 30);
        r66.add(button34);
        button34.addActionListener((ActionEvent e) -> {
            dispose();
            Security fram22 = new Security();
            fram22.setVisible(true);
        });
        JButton button43 = new JButton("Commission");
        button43.setFont(fo0);
        button43.setForeground(Color.BLACK);
        button43.setCursor(cursor12);
        button43.setToolTipText("INFORMATION");
        button43.setBounds(120, 140, 200, 30);
        r66.add(button43);
        button43.addActionListener((ActionEvent e) -> {
            dispose();
            Commission frame3312 = new Commission();
            //frame3312.setVisible(true);
        });
        JButton button44 = new JButton("Back");
        button44.setFont(fo0);
        button44.setForeground(Color.BLACK);
        button44.setBounds(170, 200, 100, 30);
        button44.setToolTipText("Previous Page");
        button44.setCursor(cursor12);
        r66.add(button44);
        button44.addActionListener((ActionEvent e) -> {
            dispose();
            HomePage hp = new HomePage();
            hp.setVisible(true);
        });
        JLabel lebelImg1;
        ImageIcon Icon291;
        Icon291 = new ImageIcon(getClass().getResource("us.jpg"));
        lebelImg1 = new JLabel("", Icon291, JLabel.CENTER);
        lebelImg1.setBounds(0, 0, 600, 400);
        r66.add(lebelImg1);

    }
}