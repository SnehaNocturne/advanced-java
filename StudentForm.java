import javax.swing.*;
import java.awt.event.*;

public class StudentForm {
    public static void main(String[] args) {

        JFrame f = new JFrame("Student Form");

        JLabel l1 = new JLabel("Name:");
        l1.setBounds(50, 50, 100, 30);

        JTextField t1 = new JTextField();
        t1.setBounds(150, 50, 150, 30);

        JLabel l2 = new JLabel("Marks:");
        l2.setBounds(50, 100, 100, 30);

        JTextField t2 = new JTextField();
        t2.setBounds(150, 100, 150, 30);

        JButton b = new JButton("Submit");
        b.setBounds(120, 150, 100, 30);

        JLabel result = new JLabel("");
        result.setBounds(50, 200, 300, 30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = t1.getText();
                String marks = t2.getText();

                result.setText("Saved: " + name + " - " + marks);
            }
        });

        f.add(l1); f.add(t1);
        f.add(l2); f.add(t2);
        f.add(b); f.add(result);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
