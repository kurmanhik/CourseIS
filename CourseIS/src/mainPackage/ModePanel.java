package mainPackage;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ModePanel extends JPanel {

	/**
	 * Create the panel.
	 */
	
	public JButton btnTourist;
	public JButton btnTourAgent;
	
	public ModePanel() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(null);
		
		JLabel lblChooseMode = new JLabel("Выберите режим");
		lblChooseMode.setHorizontalAlignment(SwingConstants.CENTER);
		lblChooseMode.setFont(new Font("Segoe UI Light", Font.PLAIN, 24));
		lblChooseMode.setBounds(10, 28, 430, 29);
		panel.add(lblChooseMode);
		
		btnTourAgent = new JButton("Турагент");
		btnTourAgent.setFont(new Font("Segoe UI Light", Font.PLAIN, 24));
		btnTourAgent.setBounds(75, 102, 298, 54);
		panel.add(btnTourAgent);
		
		btnTourist = new JButton("Турист");
		btnTourist.setFont(new Font("Segoe UI Light", Font.PLAIN, 24));
		btnTourist.setBounds(75, 193, 298, 54);
		panel.add(btnTourist);

	}

}