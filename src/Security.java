import javax.swing.*;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Security extends JFrame {

    File f = new File("Privacy.txt");

    Security() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Privacy & Policy");
        this.setBounds(200, 150, 500, 600);
        this.setResizable(false);

        Container r69;
        r69 = this.getContentPane();
        r69.setLayout(null);
        ImageIcon icon69 = new ImageIcon(getClass().getResource("icon.png"));
        this.setIconImage(icon69.getImage());
        ArrayList<String> text = new ArrayList<String>();
        try  {
            Scanner re = new Scanner(f);
            String s;
            while (re.hasNextLine()) {

                 s = re.nextLine();

                text.add("*"+s+"\n");


            }
            re.close();

        } catch (IOException k) {
            System.out.println(k.getMessage());
        }
        JTextArea jl = new JTextArea(text.toString());
        jl.setBounds(10, 10, 500, 500);
        r69.add(jl);
        ImageIcon icon234 = new ImageIcon(getClass().getResource("us.jpg"));
        JLabel label322 = new JLabel(icon234, JLabel.CENTER);
        label322.setBounds(0, 0, 700, 500);
        add(label322);

    }
}