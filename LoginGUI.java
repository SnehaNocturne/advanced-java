import javax.swing.*;
import java.awt.event.*;

public class LoginGUI {
    public static void main(String[] args) {

        JFrame f = new JFrame("Login System");

        JLabel l1 = new JLabel("Username:");
        l1.setBounds(50, 50, 100, 30);

        JTextField t1 = new JTextField();
        t1.setBounds(150, 50, 150, 30);

        JLabel l2 = new JLabel("Password:");
        l2.setBounds(50, 100, 100, 30);

        JPasswordField p1 = new JPasswordField();
        p1.setBounds(150, 100, 150, 30);

        JButton b = new JButton("Login");
        b.setBounds(120, 150, 100, 30);

        JLabel result = new JLabel("");
        result.setBounds(50, 200, 300, 30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String user = t1.getText();
                String pass = new String(p1.getPassword());

                if (user.equals("admin") && pass.equals("1234")) {
                    result.setText("Login Successful!");
                } else {
                    result.setText("Invalid Credentials!");
                }
            }
        });

        f.add(l1); f.add(t1);
        f.add(l2); f.add(p1);
        f.add(b); f.add(result);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
