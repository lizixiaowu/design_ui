import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class victoirezone {

	private JFrame PageVictoirezone;

	/**
	 * Launch the application.
	 */
	public static void ouvrepagevictoirezone() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					victoirezone window = new victoirezone();
					window.PageVictoirezone.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public victoirezone() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		PageVictoirezone = new JFrame();
		PageVictoirezone.setTitle("VICTOIRE BDE");
		PageVictoirezone.setBounds(100, 100, 611, 321);
		PageVictoirezone.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		PageVictoirezone.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("OK !");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PageVictoirezone.dispose();
				treve.ouvrepagetreve();
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 30));
		btnNewButton.setBounds(225, 217, 146, 44);
		PageVictoirezone.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 597, 284);
		lblNewLabel.setIcon(new ImageIcon(victoirezone.class.getResource("/imgs/ecranvictoirezone.png")));
		PageVictoirezone.getContentPane().add(lblNewLabel);
	}
}
