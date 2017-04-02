package mainPackage;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NotSendForm extends JPanel {

	/**
	 * Create the panel.
	 */
	public JButton btnSendFormOK;
	public NotSendForm() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(null);
		
		JLabel lblFormEmpty = new JLabel("Заявка пуста!");
		lblFormEmpty.setFont(new Font("Segoe UI Light", Font.PLAIN, 28));
		lblFormEmpty.setHorizontalAlignment(SwingConstants.CENTER);
		lblFormEmpty.setBounds(10, 31, 430, 60);
		panel.add(lblFormEmpty);
		
		JLabel lblNewLabel = new JLabel("Количество ночей и людей не может быть равна нулю!");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 17));
		lblNewLabel.setBounds(10, 102, 430, 73);
		panel.add(lblNewLabel);
		
		btnSendFormOK = new JButton("Понятно!");
		btnSendFormOK.setFont(new Font("Segoe UI Light", Font.PLAIN, 25));
		btnSendFormOK.setBounds(10, 223, 418, 49);
		panel.add(btnSendFormOK);

	}

}
