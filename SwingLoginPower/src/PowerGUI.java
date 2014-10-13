

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PowerGUI extends JFrame {
	private JTextField number;
	private JTextField exponent;
	private JButton powerButton;
	private JLabel numberLabel;
	private JLabel exponentLabel;
    private JLabel resultLabel;
    private JTextField result;
	public PowerGUI() {
		setVisible(true);
		setLayout(new FlowLayout());
		numberLabel = new JLabel("Number");
		add(numberLabel);
		number = new JTextField(10);
		add(number);
		exponentLabel = new JLabel("Exponent");
		add(exponentLabel);
		exponent = new JTextField(10);
		add(exponent);
		powerButton =new JButton("Power");
		add(powerButton);
		resultLabel=new JLabel("Result is:");
		add(resultLabel);
		result = new JTextField(10);
		add(result);
		powerButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				double num;
				int exponent2;
				try{
					num=Double.parseDouble(number.getText());
					exponent2=Integer.parseInt(exponent.getText());
					double answer=1.0;
					for (int i=0;i<exponent2;i++){
						answer *=num;
						result.setText(Double.toString(answer));
					}
				}catch(Exception e){
					JOptionPane.showMessageDialog(null,"Please enter numbers");
				}
			}
			
		});

	}

	

	}


