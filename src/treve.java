import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class treve {

	private JFrame PageTreve;

	/**
	 * Launch the application.
	 */
	public static void ouvrepagetreve() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					treve window = new treve();
					window.PageTreve.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public treve() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		PageTreve = new JFrame();
		PageTreve.setTitle("Tr\u00EAve en cours");
		PageTreve.setBounds(100, 100, 915, 485);
		PageTreve.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		PageTreve.getContentPane().setLayout(null);
		
		JButton btnContinuer = new JButton("Continuer");
		btnContinuer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PageTreve.setVisible(false);
			     melee0.ouvrepagemelee0();
			}
		});
		btnContinuer.setBounds(788, 404, 113, 44);
		PageTreve.getContentPane().add(btnContinuer);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 901, 448);
		lblNewLabel.setIcon(new ImageIcon(treve.class.getResource("/imgs/ecrantreve.png")));
		PageTreve.getContentPane().add(lblNewLabel);
	}
}
