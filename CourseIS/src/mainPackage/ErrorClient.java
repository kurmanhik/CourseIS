package mainPackage;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class ErrorClient extends JPanel {

	/**
	 * Create the panel.
	 */
	
	public JButton btnok;
	
	public ErrorClient() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(null);
		
		JLabel lblError = new JLabel("Ошибка!");
		lblError.setHorizontalAlignment(SwingConstants.CENTER);
		lblError.setFont(new Font("Segoe UI Light", Font.PLAIN, 29));
		lblError.setBounds(10, 11, 430, 40);
		panel.add(lblError);
		
		JLabel lblReqForm = new JLabel("Требования к анкете:");
		lblReqForm.setFont(new Font("Segoe UI Light", Font.PLAIN, 21));
		lblReqForm.setBounds(10, 62, 206, 29);
		panel.add(lblReqForm);
		
		JLabel lblFields = new JLabel("- Вы должны заполнить поля: ");
		lblFields.setFont(new Font("Segoe UI Light", Font.PLAIN, 16));
		lblFields.setBounds(10, 102, 212, 22);
		panel.add(lblFields);
		
		JLabel lblCN = new JLabel("а) Количество ночей");
		lblCN.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		lblCN.setBounds(224, 107, 157, 14);
		panel.add(lblCN);
		
		JLabel lblCP = new JLabel("б) Количество туристов");
		lblCP.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		lblCP.setBounds(224, 132, 143, 17);
		panel.add(lblCP);
		
		JLabel lblmintypetransp = new JLabel("- Выбрать как минимум один из вариантов перевозки");
		lblmintypetransp.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		lblmintypetransp.setBounds(10, 182, 430, 22);
		panel.add(lblmintypetransp);
		
		JLabel lblonetypefood = new JLabel("- Выбрать один тип организации питания");
		lblonetypefood.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		lblonetypefood.setBounds(10, 209, 357, 22);
		panel.add(lblonetypefood);
		
		btnok = new JButton("Понятно!");
		btnok.setFont(new Font("Segoe UI Light", Font.PLAIN, 26));
		btnok.setBounds(10, 242, 418, 34);
		panel.add(btnok);
		
		JLabel lblonlynumbers = new JLabel("в) Вводить только цифры");
		lblonlynumbers.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		lblonlynumbers.setBounds(224, 157, 157, 14);
		panel.add(lblonlynumbers);

	}
}