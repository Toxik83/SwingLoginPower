import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
// I can  add  Look and feel if appropiated
//Username -admin
//Password-adminpassword
public class LoginFrame extends JFrame {

	JButton login, cancel;
	JTextField username;
	JPasswordField password;
	JLabel usernameLabel, passwordLabel;

	public LoginFrame() {
		setTitle("Login");
		setLayout(new GridLayout(3, 2));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		usernameLabel = new JLabel("Username");
		passwordLabel = new JLabel("Password");

		username = new JTextField(20);
		password = new JPasswordField(20);

		login = new JButton("Login");
		cancel = new JButton("Cancel");

		add(usernameLabel);
		add(username);

		add(passwordLabel);
		add(password);

		add(login);
		add(cancel);

		username.requestFocus();
		password.requestFocus();

		cancel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent cancelEvent) {
				// TODO Auto-generated method stub
				System.exit(0);
			}

		});

		login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent loginEvent) {
				// TODO Auto-generated method stub
				String user = username.getText();
				String pass = new String(password.getPassword());

				if ((user).equalsIgnoreCase("admin")
						&& (pass).equalsIgnoreCase("adminpassword")) {
					dispose();
					new PowerGUI();
				}
			}

		});
		KeyAdapter keyAdapter = new KeyAdapter() {
			public void keyPressed(KeyEvent keyEvent) {
				if (keyEvent.getKeyCode() == KeyEvent.VK_ENTER)
					login.doClick();
			}
		};

		password.addKeyListener(keyAdapter);
		username.addKeyListener(keyAdapter);

		pack();
		setLocationRelativeTo(null);

	}

	public static void main(String args[]) {
		new LoginFrame();
	}
}
