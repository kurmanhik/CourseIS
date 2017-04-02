package mainPackage;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JLabel;

public class MainClass extends JApplet {
	
	public MainClass() {
	
		ModePanel MP = new ModePanel();	
		MP.setBounds(10, 11, 430, 278);
		getContentPane().add(MP);
		getContentPane().setLayout(null);
		MP.setVisible(true);
		
		ClientPanel CP = new ClientPanel();
		CP.setBounds(10, 11, 430, 278);
		getContentPane().add(CP);
		getContentPane().setLayout(null);
		CP.setVisible(false);
		
		ErrorClient ErrorCL = new ErrorClient();
		ErrorCL.setBounds(10, 11, 430, 278);
		getContentPane().add(ErrorCL);
		getContentPane().setLayout(null);
		ErrorCL.setVisible(false);
		
		NotSendForm NSF = new NotSendForm();
		NSF.setBounds(10, 11, 430, 278);
		getContentPane().add(NSF);
		getContentPane().setLayout(null);
		NSF.setVisible(false);
		
		Calculator Calculator = new Calculator();
		
		MP.btnTourist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MP.setVisible(false);
				CP.setVisible(true);
			}
		});
	
	}
	
}
