import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Projectmarks extends JFrame implements ActionListener {

    JFrame j;
    JButton j1 = new JButton("STUDENT PERSONAL INFO");
    JButton j2 = new JButton("STUDENT MARKS");
    JButton j3 = new JButton("DATABASE");

    Projectmarks() {
        j1.setBounds(150, 150, 200, 50);
        j2.setBounds(150, 250, 200, 50);
        j3.setBounds(150, 350, 270, 50);
        add(j1);
        add(j2);
        add(j3);
        j1.addActionListener(this);
        j2.addActionListener(this);
        j3.addActionListener(this);
        setLayout(null);
        setVisible(true);
        setSize(600, 600);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == j1) {
            ProEmp1 t1 = new ProEmp1();
        }
        if (e.getSource() == j2) {
            
            Result t = new Result();
        }
        if (e.getSource() == j3) {
            Datafinal tt = new Datafinal();
        }
    }

    public static void main(String agrs[]) {
        new Projectmarks();
    }

}
