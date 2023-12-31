import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Sign_Out extends JFrame {

    Sign_Out() {
        Font f01 = new Font("Arial", Font.ROMAN_BASELINE + Font.BOLD, 16);
        Cursor cursor4;
        cursor4 = new Cursor(Cursor.HAND_CURSOR);
        this.setTitle("Sign Out");
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setBounds(350, 255, 400, 250);
        this.setFont(f01);
        ImageIcon icon4 = new ImageIcon(getClass().getResource("icon.png"));
        this.setIconImage(icon4.getImage());
        Container r77;
        r77 = this.getContentPane();
        r77.setLayout(null);
        JLabel lebel0009;
        lebel0009 = new JLabel();
        lebel0009.setText("Are you want To Sign Out?");
        lebel0009.setForeground(Color.BLACK);
        lebel0009.setFont(f01);
        lebel0009.setBounds(96, 20, 300, 40);
        r77.add(lebel0009);
        JButton button1111, button11111;
        button1111 = new JButton();
        button1111.setText("YES");
        button1111.setToolTipText("LogOut");
        button1111.setFont(f01);
        button1111.setCursor(cursor4);
        button1111.setBounds(105, 90, 80, 50);
        r77.add(button1111);
        button1111.addActionListener((ActionEvent e) -> {
            dispose();
            LogInId l = new LogInId();
            l.setVisible(true);
        });
        button11111 = new JButton();
        button11111.setText("NO");
        button11111.setToolTipText("Go Home");
        button11111.setFont(f01);
        button11111.setCursor(cursor4);
        button11111.setBounds(205, 90, 80, 50);
        r77.add(button11111);
        button11111.addActionListener((ActionEvent e) ->{
                    dispose();
                    HomePage frame321 = new HomePage();
                    frame321.setVisible(true);
                }
        );
        ImageIcon Icon290;
        Icon290 = new ImageIcon(getClass().getResource("login.jpg"));
        JLabel lebelImg = new JLabel("", Icon290, JLabel.CENTER);
        lebelImg.setBounds(0, 0, 600, 400);
        r77.add(lebelImg);

    }
}