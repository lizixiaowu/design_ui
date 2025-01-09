import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class pertezone {

	private JFrame PagePertezone;

	/**
	 * Launch the application.
	 */
	public static void ouvrepagepertezone() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pertezone window = new pertezone();
					window.PagePertezone.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public pertezone() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		PagePertezone = new JFrame();
		PagePertezone.setTitle("PERTE ADMIN.");
		PagePertezone.setBounds(100, 100, 619, 354);
		PagePertezone.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		PagePertezone.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("OK !");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PagePertezone.dispose();
				treve.ouvrepagetreve();
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 30));
		btnNewButton.setBounds(223, 249, 146, 44);
		PagePertezone.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 605, 317);
		lblNewLabel.setIcon(new ImageIcon(pertezone.class.getResource("/imgs/ecranpertezone.png")));
		PagePertezone.getContentPane().add(lblNewLabel);
	}

}
