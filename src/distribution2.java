import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class distribution2 {

	private JFrame PageDistribution2;

	/**
	 * Launch the application.
	 */
	public static void ouvrepagedistribution2() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					distribution2 window = new distribution2();
					window.PageDistribution2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public distribution2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		PageDistribution2 = new JFrame();
		PageDistribution2.setTitle("Aper\u00E7ue de votre distribution");
		PageDistribution2.setBounds(100, 100, 915, 485);
		PageDistribution2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		PageDistribution2.getContentPane().setLayout(null);
		
		JLabel label5 = new JLabel("");
		JButton button5 = new JButton("<html>IA:offensif<br>\r\nR\u00F4le:\u00E9lite<br>\r\nPoints de vie:35<br>\r\nForce:20<br>\r\nDext\u00E9rit\u00E9:10<br>\r\nR\u00E9sistance:18<br>\r\nConstitution:5<br>\r\nInitiative:6</html>");
		button5.setVisible(false);
	
		label5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				PageDistribution2.setCursor(null);
				button5.setVisible(false);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				PageDistribution2.setCursor(12);
				button5.setVisible(true);
			}
		});
		
		label5.setBounds(226, 161, 36, 47);
		PageDistribution2.getContentPane().add(label5);
		
		button5.setBackground(new Color(245, 255, 250));
		button5.setBounds(265, 49, 135, 148);
		PageDistribution2.getContentPane().add(button5);
		
		JLabel label6 = new JLabel("");
		JButton button6 = new JButton("<html>IA:offensif<br>\r\nR\u00F4le:\u00E9lite<br>\r\nPoints de vie:35<br>\r\nForce:20<br>\r\nDext\u00E9rit\u00E9:10<br>\r\nR\u00E9sistance:18<br>\r\nConstitution:5<br>\r\nInitiative:6</html>");
		button6.setVisible(false);
	
		label6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				PageDistribution2.setCursor(null);
				button6.setVisible(false);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				PageDistribution2.setCursor(12);
				button6.setVisible(true);
			}
		});
		
		label6.setBounds(348, 207, 36, 47);
		PageDistribution2.getContentPane().add(label6);
		
		button6.setBackground(new Color(245, 255, 250));
		button6.setBounds(370, 60, 135, 148);
		PageDistribution2.getContentPane().add(button6);
		
		JLabel label7 = new JLabel("");
		JButton button7 = new JButton("<html>IA:offensif<br>\r\nR\u00F4le:\u00E9lite<br>\r\nPoints de vie:35<br>\r\nForce:20<br>\r\nDext\u00E9rit\u00E9:10<br>\r\nR\u00E9sistance:18<br>\r\nConstitution:5<br>\r\nInitiative:6</html>");
		button7.setVisible(false);
	
		label7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				PageDistribution2.setCursor(null);
				button7.setVisible(false);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				PageDistribution2.setCursor(12);
				button7.setVisible(true);
			}
		});
		
		label7.setBounds(260, 274, 36, 47);
		PageDistribution2.getContentPane().add(label7);
		
		button7.setBackground(new Color(245, 255, 250));
		button7.setBounds(127, 275, 135, 148);
		PageDistribution2.getContentPane().add(button7);
		
		JLabel label12 = new JLabel("");
		JButton button12 = new JButton("<html>IA:offensif<br>\r\nR\u00F4le:\u00E9lite<br>\r\nPoints de vie:35<br>\r\nForce:20<br>\r\nDext\u00E9rit\u00E9:10<br>\r\nR\u00E9sistance:18<br>\r\nConstitution:5<br>\r\nInitiative:6</html>");
		button12.setVisible(false);
	
		label12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				PageDistribution2.setCursor(null);
				button12.setVisible(false);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				PageDistribution2.setCursor(12);
				button12.setVisible(true);
			}
		});
		
		label12.setBounds(552, 336, 36, 47);
		PageDistribution2.getContentPane().add(label12);
		
		button12.setBackground(new Color(245, 255, 250));
		button12.setBounds(466, 190, 135, 148);
		PageDistribution2.getContentPane().add(button12);
		
		JButton btnRevenir = new JButton("Revenir");
		btnRevenir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PageDistribution2.setVisible(false);
			    distribution1.ouvrepagedistribution1();
			}
		});
		btnRevenir.setBounds(0, 390, 113, 58);
		PageDistribution2.getContentPane().add(btnRevenir);
		
		JButton btnContinuer = new JButton("Continuer");
		btnContinuer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PageDistribution2.setVisible(false);
			     melee0.ouvrepagemelee0();
			}
		});
		btnContinuer.setBounds(788, 390, 113, 58);
		PageDistribution2.getContentPane().add(btnContinuer);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 901, 448);
		lblNewLabel.setIcon(new ImageIcon(distribution2.class.getResource("/imgs/ecrandistribution2.png")));
		PageDistribution2.getContentPane().add(lblNewLabel);
	}
}
