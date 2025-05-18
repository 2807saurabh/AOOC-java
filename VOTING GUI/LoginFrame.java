import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame {
    JTextField usernameField;
    JPasswordField passwordField;

    public LoginFrame() {
        setTitle("Online Voting System - Login");
        setSize(350, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel title = new JLabel("Welcome to Voting System");
        title.setBounds(70, 10, 250, 25);
        title.setFont(new Font("Arial", Font.BOLD, 14));
        add(title);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 50, 80, 25);
        add(userLabel);

        usernameField = new JTextField();
        usernameField.setBounds(130, 50, 150, 25);
        add(usernameField);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 90, 80, 25);
        add(passLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(130, 90, 150, 25);
        add(passwordField);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(110, 140, 100, 30);
        add(loginButton);

        loginButton.addActionListener(e -> {
            String user = usernameField.getText();
            String pass = new String(passwordField.getPassword());

            if (user.equals("admin") && pass.equals("admin123")) {
                new ResultFrame();
                dispose();
            } else if (user.equals("voter") && pass.equals("voter123")) {
                new VotingFrame();
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid credentials");
            }
        });

        setVisible(true);
    }
}
