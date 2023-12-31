import java.awt.*;
import javax.swing.*;
import java.io.*;
import  java.util.Scanner;

public class Propertiecs extends JFrame {
    File f = new File("Properties.txt");
    Propertiecs() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Available properties in Dhaka");
        this.setBounds(200, 150, 0, 0);
        this.setResizable(false);
        Container r69;

        r69 = this.createRootPane();
        r69.setLayout(null);
        ImageIcon icon69 = new ImageIcon(getClass().getResource("icon.png"));
        this.setIconImage(icon69.getImage());
        String data[][] = new String[10000][5];
        try{

        int i=0;

            //BufferedReader rd = new BufferedReader(new FileReader(f));
            Scanner re = new Scanner(f);
            while(re.hasNextLine()){

                String s = re.nextLine();
                data[i]=s.split(",");
                i++;

            }re.close();
        }catch(IOException k){
            k.printStackTrace();
        }

        String column[] = {"Area Name", "Building Name", " Building No.", "Property area", "Price per Square Feet"};
        JTable table = new JTable(data, column);
        JScrollPane sp = new JScrollPane(table);
        add(sp);
        setSize(800, 300);
        setVisible(true);

    }
}

