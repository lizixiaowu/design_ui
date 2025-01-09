import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class gagne {

	private JFrame PageGagne;

	/**
	 * Launch the application.
	 */
	public static void ouvrepagegagne() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gagne window = new gagne();
					window.PageGagne.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public gagne() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		PageGagne = new JFrame();
		PageGagne.setTitle("VOUS AVEZ GAGN\u00C9");
		PageGagne.setBounds(100, 100, 617, 354);
		PageGagne.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		PageGagne.getContentPane().setLayout(null);
		
		JButton terminer = new JButton("Recommencer");
		terminer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PageGagne.dispose();
				parametrage.ouvrepageparametrage();
			}
		});
		terminer.setFont(new Font("Arial", Font.PLAIN, 30));
		terminer.setBounds(179, 224, 229, 44);
		PageGagne.getContentPane().add(terminer);
		
		JButton recommencer = new JButton("Terminer");
		recommencer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		recommencer.setFont(new Font("Arial", Font.PLAIN, 30));
		recommencer.setBounds(179, 173, 229, 44);
		PageGagne.getContentPane().add(recommencer);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 603, 317);
		lblNewLabel.setIcon(new ImageIcon(gagne.class.getResource("/imgs/ecrangagne.png")));
		PageGagne.getContentPane().add(lblNewLabel);
	}

}
