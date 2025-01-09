import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class soin1 {

	private JFrame PageSoin1;

	/**
	 * Launch the application.
	 */
	
	int pointsgaucheint=26;
	int pointsdroiteint=4;
	
	public static void ouvrepagesoin1() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					soin1 window = new soin1();
					window.PageSoin1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public soin1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		PageSoin1 = new JFrame();
		PageSoin1.setTitle("Soin du combattant1");
		PageSoin1.setBounds(800, 100, 685, 280);
		PageSoin1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		PageSoin1.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Choisir un combattant qui transf\u00E9rera ses points de vie au combattant1");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel.setBounds(20, 20, 632, 36);
		PageSoin1.getContentPane().add(lblNewLabel);
		
		JComboBox comboBoxTransferer=new JComboBox();
		comboBoxTransferer.setFont(new Font("Arial", Font.PLAIN, 20));
		comboBoxTransferer.addItem("Combattant2");
		comboBoxTransferer.addItem("Combattant3");
		comboBoxTransferer.addItem("Combattant4");
		comboBoxTransferer.addItem("Combattant5");
		comboBoxTransferer.addItem("Combattant6");
		comboBoxTransferer.setBounds(111, 92, 140, 30);
		PageSoin1.getContentPane().add(comboBoxTransferer);
		
		JLabel pointsgauche = new JLabel("26");
		pointsgauche.setFont(new Font("Arial", Font.PLAIN, 20));
		pointsgauche.setBounds(261, 92, 39, 30);
		PageSoin1.getContentPane().add(pointsgauche);
		
		JLabel pointsdroite = new JLabel("4");
		
		JButton btnNewButton = new JButton("==>");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pointsgaucheint=pointsgaucheint-1;
				pointsdroiteint=pointsdroiteint+1;
				String pointsgauchechar=String.valueOf(pointsgaucheint);
				pointsgauche.setText(pointsgauchechar);
				String pointsdroitechar=String.valueOf(pointsdroiteint);
				pointsdroite.setText(pointsdroitechar);
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 30));
		btnNewButton.setBounds(298, 81, 93, 54);
		PageSoin1.getContentPane().add(btnNewButton);
		
		JLabel combattant1 = new JLabel("Combattant1");
		combattant1.setFont(new Font("Arial", Font.PLAIN, 20));
		combattant1.setBounds(401, 92, 121, 28);
		PageSoin1.getContentPane().add(combattant1);
		
		pointsdroite.setFont(new Font("Arial", Font.PLAIN, 20));
		pointsdroite.setBounds(521, 92, 39, 30);
		PageSoin1.getContentPane().add(pointsdroite);
		
		JLabel border = new JLabel("");
		border.setBounds(91, 74, 477, 68);
		PageSoin1.getContentPane().add(border);
		border.setBorder(BorderFactory.createLineBorder(Color.black,2));
		
		JButton terminer = new JButton("Terminer");
		terminer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PageSoin1.setVisible(false);
			}
		});
		terminer.setFont(new Font("Arial", Font.PLAIN, 20));
		terminer.setBounds(268, 164, 130, 49);
		PageSoin1.getContentPane().add(terminer);
	}
}
