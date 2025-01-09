import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class demarrage {

	private JFrame Page0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					demarrage window = new demarrage();
					window.Page0.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public demarrage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Page0 = new JFrame();
		Page0.setTitle("D\u00E9marrage du jeu");
		Page0.setBounds(100, 100, 810, 485);
		Page0.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Page0.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("DEMARRER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				parametrage.ouvrepageparametrage();
				Page0.dispose();
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 20));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(317, 343, 167, 45);
		Page0.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 796, 448);
		lblNewLabel.setIcon(new ImageIcon(demarrage.class.getResource("/imgs/ecrandemarrage.png")));
		Page0.getContentPane().add(lblNewLabel);
	}
}
