import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Propertiecs3 extends JFrame {

    Propertiecs3() {
        ImageIcon icon6;
        Font fo6 = new Font("Arial", Font.ROMAN_BASELINE + Font.BOLD, 16);
        this.setTitle("Property Management System");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setBounds(350, 230, 400, 300);
        icon6 = new ImageIcon(getClass().getResource("icon.png"));
        this.setIconImage(icon6.getImage());
        Container r6;
        r6 = this.getContentPane();
        r6.setLayout(null);
        JLabel lebel16;
        JButton button18, button01111, button0005;
        lebel16 = new JLabel();
        r6.add(lebel16);
        lebel16.setText("Chittagong");
        lebel16.setFont(fo6);
        lebel16.setBounds(153, 30, 100, 70);
        button18 = new JButton();
        button18.setText("Coming soon");
        button18.setFont(fo6);
        button18.setBounds(80, 100, 220, 40);
        r6.add(button18);
        button18.addActionListener((ActionEvent e) -> {
            dispose();
            JOptionPane.showMessageDialog(null, "WE ARE WORKING ON THIS !!");
            ListOfProperties list12 = new ListOfProperties();
            list12.setVisible(true);
        });

        button01111 = new JButton();
        button01111.setText("Home");
        button01111.setBounds(95, 160, 90, 40);
        r6.add(button01111);
        button01111.addActionListener((ActionEvent e) -> {
            dispose();
            HomePage frame11111 = new HomePage();
            frame11111.setVisible(true);
        });
        button0005 = new JButton();
        button0005.setText("Back");
        button0005.setBounds(195, 160, 90, 40);
        r6.add(button0005);
        button0005.addActionListener((ActionEvent e) -> {
            dispose();
            ListOfProperties frame0005 = new ListOfProperties();
            frame0005.setVisible(true);
        });
        JLabel lebelImg1234;
        ImageIcon Icon2912;
        Icon2912 = new ImageIcon(getClass().getResource("login.jpg"));
        lebelImg1234= new JLabel("", Icon2912, JLabel.CENTER);
        lebelImg1234.setBounds(0, 0, 400, 300);
        r6.add(lebelImg1234);
    }
}