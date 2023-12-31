import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class About_Us extends JFrame {
    About_Us(){
        Cursor cursor1;
        cursor1 = new Cursor(Cursor.HAND_CURSOR);
        this.setTitle("Contact-Us");
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setBounds(300, 150, 550,465);
        Font fo2 = new Font("Arial",Font.BOLD,20);
        Font fo3 = new Font("Arial", Font.BOLD,17);
        Container r11;
        r11 = this.getContentPane();
        r11.setLayout(null);
        ImageIcon icon23,icon24;
        icon23 = new ImageIcon(getClass().getResource("icon.png"));
        this.setIconImage(icon23.getImage());
        JLabel label19,label20,label21,label22,label23,label24,label25,
                label26,label27,label28,label29,label30,label31,label32;
        label19 = new JLabel("Founder");
        label19.setFont(fo2);
        label19.setForeground(Color.RED);
        label19.setBounds(50,1,200,50);
        r11.add(label19);
        label20 = new JLabel("Name : Shakh Maruf");
        label20.setFont(fo3);
        label20.setForeground(Color.BLACK);
        label20.setBounds(70,30,200,50);
        r11.add(label20);
        label21 = new JLabel("Number : 01920610559");
        label21.setFont(fo3);
        label21.setForeground(Color.BLACK);
        label21.setBounds(70,48,200,50);
        r11.add(label21);
        label22 = new JLabel("Mail Address : marufsk069@gmail.com");
        label22.setFont(fo3);
        label22.setForeground(Color.BLACK);
        label22.setBounds(70,66,350,50);
        r11.add(label22);
        label23 = new JLabel("Co-Founders");
        label23.setFont(fo2);
        label23.setForeground(Color.RED);
        label23.setBounds(50,100,200,50);
        r11.add(label23);
        label24 = new JLabel("Name : Bashirul Islam");
        label24.setFont(fo3);
        label24.setForeground(Color.BLACK);
        label24.setBounds(70,125,200,50);
        r11.add(label24);
        label25 = new JLabel("Number : 01787834559");
        label25.setFont(fo3);
        label25.setForeground(Color.BLACK);
        label25.setBounds(70,143,200,50);
        r11.add(label25);
        label26 = new JLabel("Mail Address : bashirul07@gmail.com");
        label26.setFont(fo3);
        label26.setForeground(Color.BLACK);
        label26.setBounds(70,161,350,50);
        r11.add(label26);
        label27 = new JLabel("Name : Md Tanvir Hossain");
        label27.setFont(fo3);
        label27.setForeground(Color.BLACK);
        label27.setBounds(70,190,250,50);
        r11.add(label27);
        label28 = new JLabel("Number : 01836582952");
        label28.setFont(fo3);
        label28.setForeground(Color.BLACK);
        label28.setBounds(70,208,200,50);
        r11.add(label28);
        label29 = new JLabel("Mail Address : hossain69@gmail.com");
        label29.setFont(fo3);
        label29.setForeground(Color.BLACK);
        label29.setBounds(70,226,350,50);
        r11.add(label29);
        label30 = new JLabel("Office Address : Rampura,Dhaka-1260");
        label30.setFont(fo2);
        label30.setForeground(Color.RED);
        label30.setBounds(50,265,500,50);
        r11.add(label30);
        label31 = new JLabel("Office Number : 01587654321");
        label31.setFont(fo2);
        label31.setForeground(Color.RED);
        label31.setBounds(50,295,500,50);
        r11.add(label31);
        JButton button000005;
        button000005 = new JButton();
        button000005.setText("Back");
        button000005.setBounds(210, 350, 80, 40);
        button000005.setFont(fo3);
        button000005.setToolTipText("Previous Page");
        button000005.setForeground(Color.BLACK);
        r11.add(button000005);
        button000005.addActionListener((ActionEvent e) -> {
            dispose();
            HomePage frame0005 = new HomePage();
            frame0005.setVisible(true);
        });
        icon24 = new ImageIcon(getClass().getResource("us.jpg"));
        label32 = new JLabel(icon24,JLabel.CENTER);
        label32.setBounds(0,0,700,500);
        r11.add(label32);
    }
}