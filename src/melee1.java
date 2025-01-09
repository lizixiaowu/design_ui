import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class melee1 {

	private JFrame PageMelee1;

	/**
	 * Launch the application.
	 */
	public static void ouvrepagemelee1() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					melee1 window = new melee1();
					window.PageMelee1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public melee1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		PageMelee1 = new JFrame();
		PageMelee1.setTitle("Vue de la zone Halles Sportives");
		PageMelee1.setBounds(200, 200, 915, 485);
		PageMelee1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		PageMelee1.getContentPane().setLayout(null);
		
		JButton btniaoffensifRlelitePoints = new JButton("<html>Points de vie:35<br>\r\nIA:offensif<br>\r\nR\u00F4le:\u00E9lite<br>\r\nForce:20<br>\r\nDext\u00E9rit\u00E9:10<br>\r\nR\u00E9sistance:18<br>\r\nConstitution:5<br>\r\nInitiative:6</html>");
		btniaoffensifRlelitePoints.setVisible(false);
		btniaoffensifRlelitePoints.setFont(new Font("Arial", Font.PLAIN, 12));
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				PageMelee1.setCursor(12);
				btniaoffensifRlelitePoints.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				PageMelee1.setCursor(null);
				btniaoffensifRlelitePoints.setVisible(false);
			}
		});
		
		JButton btnNewButton = new JButton("Soigner");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				soin0.ouvrepagesoin0();
			}
		});
		btnNewButton.setBounds(158, 57, 106, 40);
		PageMelee1.getContentPane().add(btnNewButton);
		lblNewLabel_2.setBackground(new Color(240, 255, 240));
		lblNewLabel_2.setBounds(224, 183, 113, 93);
		PageMelee1.getContentPane().add(lblNewLabel_2);
		
		
		btniaoffensifRlelitePoints.setBackground(new Color(240, 255, 240));
		btniaoffensifRlelitePoints.setBounds(340, 67, 117, 135);
		PageMelee1.getContentPane().add(btniaoffensifRlelitePoints);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 901, 448);
		lblNewLabel.setIcon(new ImageIcon(melee1.class.getResource("/imgs/ecranmelee1.png")));
		PageMelee1.getContentPane().add(lblNewLabel);
	}

}
