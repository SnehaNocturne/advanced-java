import javax.swing.*;
import java.awt.event.*;

public class CalculatorGUI {
    static JTextField t;

    public static void main(String[] args) {

        JFrame f = new JFrame("Calculator");

        t = new JTextField();
        t.setBounds(30, 40, 220, 30);

        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton add = new JButton("+");

        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton sub = new JButton("-");

        JButton equal = new JButton("=");
        JButton clear = new JButton("C");

        // Positions
        b1.setBounds(30, 100, 50, 40);
        b2.setBounds(90, 100, 50, 40);
        b3.setBounds(150, 100, 50, 40);
        add.setBounds(210, 100, 50, 40);

        b4.setBounds(30, 150, 50, 40);
        b5.setBounds(90, 150, 50, 40);
        b6.setBounds(150, 150, 50, 40);
        sub.setBounds(210, 150, 50, 40);

        equal.setBounds(90, 200, 70, 40);
        clear.setBounds(170, 200, 70, 40);

        // Button actions
        b1.addActionListener(e -> t.setText(t.getText() + "1"));
        b2.addActionListener(e -> t.setText(t.getText() + "2"));
        b3.addActionListener(e -> t.setText(t.getText() + "3"));
        b4.addActionListener(e -> t.setText(t.getText() + "4"));
        b5.addActionListener(e -> t.setText(t.getText() + "5"));
        b6.addActionListener(e -> t.setText(t.getText() + "6"));

        add.addActionListener(e -> t.setText(t.getText() + "+"));
        sub.addActionListener(e -> t.setText(t.getText() + "-"));

        clear.addActionListener(e -> t.setText(""));

        equal.addActionListener(e -> {
            String exp = t.getText();
            try {
                if (exp.contains("+")) {
                    String[] p = exp.split("\\+");
                    int a = Integer.parseInt(p[0]);
                    int b = Integer.parseInt(p[1]);
                    t.setText(String.valueOf(a + b));
                } else if (exp.contains("-")) {
                    String[] p = exp.split("-");
                    int a = Integer.parseInt(p[0]);
                    int b = Integer.parseInt(p[1]);
                    t.setText(String.valueOf(a - b));
                }
            } catch (Exception ex) {
                t.setText("Error");
            }
        });

        // Add to frame
        f.add(t);
        f.add(b1); f.add(b2); f.add(b3); f.add(add);
        f.add(b4); f.add(b5); f.add(b6); f.add(sub);
        f.add(equal); f.add(clear);

        f.setSize(320, 320);
        f.setLayout(null);
        f.setVisible(true);
    }
}
