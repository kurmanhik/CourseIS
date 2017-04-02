package mainPackage;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClientPanel extends JPanel {
	public JTextField textFieldNight;
	public JTextField textFieldPeople;
	public JTextField textFieldTourCost;
	public JButton btnExitModeFromCP;
	public JButton btnSendForm;
	public JCheckBox chckbxAir;
	public JCheckBox chckbxWater;
	public JRadioButton rdbtnFullFood;
	public JRadioButton rdbtnHalfFood;
	public JRadioButton rdbtnBreakFastFood;
	public JButton btnGetTourCost;
	/**
	 * Create the panel.
	 */
	public ClientPanel() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(null);
		
		JLabel countnight = new JLabel("Количество ночей -");
		countnight.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		countnight.setBounds(10, 11, 118, 18);
		panel.add(countnight);
		
		textFieldNight = new JTextField();
		textFieldNight.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		textFieldNight.setBounds(138, 10, 86, 20);
		panel.add(textFieldNight);
		textFieldNight.setColumns(10);
		
		JLabel countpeople = new JLabel("Количество людей -");
		countpeople.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		countpeople.setBounds(10, 40, 118, 14);
		panel.add(countpeople);
		
		textFieldPeople = new JTextField();
		textFieldPeople.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		textFieldPeople.setBounds(138, 38, 86, 20);
		panel.add(textFieldPeople);
		textFieldPeople.setColumns(10);
		
		JLabel typetransport = new JLabel("Выберите тип перевозки:");
		typetransport.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		typetransport.setBounds(10, 65, 146, 20);
		panel.add(typetransport);
		
		chckbxAir = new JCheckBox("Авиаперелёт");
		chckbxAir.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		chckbxAir.setBounds(162, 65, 99, 20);
		panel.add(chckbxAir);
		
		chckbxWater = new JCheckBox("Круиз");
		chckbxWater.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		chckbxWater.setBounds(162, 92, 97, 23);
		panel.add(chckbxWater);
		
		JLabel typefood = new JLabel("Выберите тип организации питания:");
		typefood.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		typefood.setBounds(10, 122, 206, 18);
		panel.add(typefood);
		
		rdbtnFullFood = new JRadioButton("Завтрак, обед, ужин");
		rdbtnFullFood.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		rdbtnFullFood.setBounds(222, 121, 139, 23);
		panel.add(rdbtnFullFood);
		
		rdbtnHalfFood = new JRadioButton("Завтрак и обед или обед и ужин");
		rdbtnHalfFood.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		rdbtnHalfFood.setBounds(222, 147, 213, 23);
		panel.add(rdbtnHalfFood);
		
		rdbtnBreakFastFood = new JRadioButton("Только завтрак");
		rdbtnBreakFastFood.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		rdbtnBreakFastFood.setBounds(222, 173, 118, 23);
		panel.add(rdbtnBreakFastFood);
		
		btnSendForm = new JButton("Отправить заявку");
		btnSendForm.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		btnSendForm.setBounds(10, 203, 202, 29);
		panel.add(btnSendForm);
		
		btnExitModeFromCP = new JButton("Выйти из режима");
		btnExitModeFromCP.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		btnExitModeFromCP.setBounds(222, 203, 207, 29);
		panel.add(btnExitModeFromCP);
		
		JLabel tourcost = new JLabel("Стоимость тура - ");
		tourcost.setFont(new Font("Segoe UI Light", Font.PLAIN, 15));
		tourcost.setBounds(232, 254, 118, 18);
		panel.add(tourcost);
		
		textFieldTourCost = new JTextField();
		textFieldTourCost.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		textFieldTourCost.setBounds(349, 255, 80, 20);
		panel.add(textFieldTourCost);
		textFieldTourCost.setColumns(10);
		
		btnGetTourCost = new JButton("Получить стоимость тура");
		btnGetTourCost.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		btnGetTourCost.setBounds(10, 247, 202, 29);
		panel.add(btnGetTourCost);

	}
}