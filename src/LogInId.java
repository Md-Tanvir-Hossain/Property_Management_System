import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;

public class LogInId extends JFrame {
    File file = new File("LogIn.txt");
    boolean check ;
    LogInId() {

        check = false;
        JLabel lebel1, Lebel2, lebelImg;
        JButton button1, button2;
        Cursor cursor;
        ImageIcon icon1;
        Font f = new Font("Arial", Font.ROMAN_BASELINE + Font.BOLD, 14);
        Font f2 = new Font("Arial", Font.BOLD, 20);
        this.setTitle("List Of Properties");
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);

        this.setResizable(false);
        this.setBounds(300, 200, 530, 350);
        Container r;
        r = this.getContentPane();
        r.setLayout(null);
        icon1 = new ImageIcon(getClass().getResource("icon.png"));
        this.setIconImage(icon1.getImage());
        cursor = new Cursor(Cursor.HAND_CURSOR);
        JLabel label = new JLabel("Admin Log-In");
        label.setForeground(Color.BLACK);
        label.setBounds(200, 20, 150, 40);
        label.setFont(f2);
        r.add(label);
        lebel1 = new JLabel("User Name : ");
        lebel1.setFont(f2);
        lebel1.setForeground(Color.BLACK);
        r.add(lebel1);
        lebel1.setBounds(50, 70, 150, 50);
        JTextField Text1 = new JTextField();
        Text1.setToolTipText("Input User Name");
        Text1.setBounds(170, 70, 200, 50);
        r.add(Text1);
        Lebel2 = new JLabel("Password : ");
        Lebel2.setForeground(Color.BLACK);
        Lebel2.setFont(f2);
        Lebel2.setBounds(60, 135, 150, 50);
        r.add(Lebel2);
        JPasswordField Pass1 = new JPasswordField();
        Pass1.setToolTipText("Input Password");
        Pass1.setBounds(170, 140, 200, 50);
        r.add(Pass1);
        button1 = new JButton();
        button1.setText("LogIn");
        button1.setFont(f);
        button1.setForeground(Color.BLACK);
        button1.setCursor(cursor);
        button1.setBounds(183, 210, 85, 40);
        button1.setToolTipText("Login");
        r.add(button1);
        button2 = new JButton();
        button2.setText("Clear");
        button2.setFont(f);
        button2.setForeground(Color.BLACK);
        button2.setBounds(272, 210, 85, 40);
        button2.setToolTipText("Clear Info");
        button2.setCursor(cursor);
        r.add(button2);
        button2.addActionListener((ActionEvent e) -> {
            Text1.setText("");
            Pass1.setText("");
        });
        button1.addActionListener((ActionEvent e) -> {
            String userName = Text1.getText();
            String Password = Pass1.getText();
            try{
                Scanner input = new Scanner(file);
                while (input.hasNextLine()){
                    String name = input.next();
                    String pass = input.next();
                    if (name!=userName) {
                        check = true;
                        dispose();
                        JOptionPane.showMessageDialog(null, "PRESENTING THE APP", "WELCOME", JOptionPane.OK_OPTION, icon1);
                        HomePage frame = new HomePage();
                        frame.setVisible(true);
                        break;

                    }

                }input.close();
            }catch (IOException a){
                a.printStackTrace();
            }

            if(check == false)
            {
                JOptionPane.showMessageDialog(null, "INVALID", "Incorrect Password", JOptionPane.OK_OPTION, icon1);
            }
        });
        ImageIcon Icon29;
        Icon29 = new ImageIcon(getClass().getResource("login.jpg"));
        lebelImg = new JLabel("", Icon29, JLabel.CENTER);
        lebelImg.setBounds(0, 0, 600, 400);
        r.add(lebelImg);
    }
    public static void main(String[] args) {
        LogInId JP = new LogInId();
        JP.setVisible(true);
    }
}
