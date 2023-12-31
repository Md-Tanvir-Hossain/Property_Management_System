import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import  java.io.*;

public class Buyer_Info extends JFrame {
    File file1 = new File("Buyer_Info.txt");
    Buyer_Info(){
        ImageIcon icon7;
        Cursor cursor5;
        cursor5 = new Cursor(Cursor.HAND_CURSOR);
        Font f = new Font("Arial", Font.ROMAN_BASELINE + Font.BOLD, 25);
        Font f001 = new Font("Arial", Font.TRUETYPE_FONT + Font.BOLD, 20);
        this.setTitle("Property Management System");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setBounds(250,150,600,500);
        this.setFont(f);
        icon7 = new ImageIcon(getClass().getResource("icon.png"));
        this.setIconImage(icon7.getImage());
        Container r9;
        r9 = this.getContentPane();
        r9.setLayout(null);
        JLabel lebelImg2, label90,label55,label66,label77,label88,label99;
        label90 = new JLabel();
        r9.add(label90);
        label90.setText("Buyer Information");
        label90.setBounds(195, 10, 300, 70);
        label90.setFont(f);
        label90.setForeground(Color.BLACK);
        JTextField Name,Profession,Address,Number,VoterId;
        label55 = new JLabel();
        label55.setText("Name : ");
        label55.setBounds(125, 80, 200, 50);
        label55.setFont(f001);
        label55.setForeground(Color.BLACK);
        r9.add(label55);
        Name = new JTextField();
        Name.setBounds(200, 80, 200, 50);
        r9.add(Name);
        label66 = new JLabel();
        label66.setText("Profession : ");
        label66.setFont(f001);
        label66.setForeground(Color.BLACK);
        label66.setBounds(75, 140, 200, 50);
        r9.add(label66);
        Profession = new JTextField();
        Profession.setBounds(200, 140, 200, 50);
        r9.add(Profession);
        label77 = new JLabel();
        label77.setText("Address :");
        label77.setFont(f001);
        label77.setForeground(Color.BLACK);
        label77.setBounds(100, 195, 200, 50);
        r9.add(label77);
        Address= new JTextField();
        Address.setBounds(200, 200, 200, 50);
        r9.add(Address);
        label88 = new JLabel();
        label88.setText(" Number :");
        label88.setFont(f001);
        label88.setForeground(Color.BLACK);
        label88.setBounds(95, 260, 200, 50);
        r9.add(label88);
        Number= new JTextField();
        Number.setBounds(200, 260, 200, 50);
        r9.add(Number);
        label99 = new JLabel();
        label99.setText(" VoterId : ");
        label99.setFont(f001);
        label99.setForeground(Color.BLACK);
        label99.setBounds(100, 320, 200, 50);
        r9.add(label99);
        VoterId= new JTextField();
        VoterId.setFont(f001);
        VoterId.setForeground(Color.BLACK);
        VoterId.setBounds(200, 320, 200, 50);
        r9.add(VoterId);
        JButton button41 = new JButton();
        button41.setText("ADD");
        button41.setToolTipText("Are You Sure?");
        button41.setCursor(cursor5);
        button41.setForeground(Color.BLACK);
        button41.setBounds(200, 380, 200, 50);
        r9.add(button41);
        button41.addActionListener((ActionEvent e) -> {
            String name = Name.getText();
            String profession = Profession.getText();
            String address = Address.getText();
            String number = Number.getText();
            String voterId = VoterId.getText();


            try{

                PrintWriter input = new PrintWriter(new FileOutputStream(file1,true));
                input.append(name+" "+profession+" "+address+""+number+" "+voterId+"\n");

                input.close();
            }catch (IOException exep){
                exep.printStackTrace();
            }
            dispose();
            JOptionPane.showMessageDialog(null,"Successfully Entered");
            HomePage frame698 = new HomePage();
            frame698.setVisible(true);

        });
        JButton B2 = new JButton();
        B2.setText("Back");
        B2.setBounds(200, 420, 100, 20);
        B2.setToolTipText("Previous Page");
        B2.setCursor(cursor5);
        r9.add(B2);
        B2.addActionListener((ActionEvent e) -> {
            dispose();
            HomePage fr = new HomePage();
            fr.setVisible(true);
        });
        ImageIcon Icon29;
        Icon29 = new ImageIcon(getClass().getResource("us.jpg"));
        lebelImg2 = new JLabel("", Icon29, JLabel.CENTER);
        lebelImg2.setBounds(0, 0, 600, 500);
        r9.add(lebelImg2);
    }

}