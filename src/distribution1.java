import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class distribution1 {

	private JFrame PageDistribution1;

	/**
	 * Launch the application.
	 */
	public static void ouvrepagedistribution1() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					distribution1 window = new distribution1();
					window.PageDistribution1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public distribution1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		PageDistribution1 = new JFrame();
		PageDistribution1.setTitle("Distribution des combattants sur les zones");
		PageDistribution1.setBounds(100, 100, 915, 485);
		PageDistribution1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		PageDistribution1.getContentPane().setLayout(null);
		
		JButton btnAide = new JButton("<html>Cliquez pour masquer cette guide.<br><br>\r\nFaites glisser les ic\u00F4nes de chaque combattant non r\u00E9serviste pour les distribuer dans les zones d'influence. Quand vous mettez la souris sur l'ic\u00F4ne d'un combattant ses param\u00E8tres vont s'afficher.<br><br>\r\nDans cette d\u00E9mo vous ne pouvez pas faites glisser et il n'y a que 3 combattants qui ont un panneau de param\u00E8tres.\r\n</html>");
		btnAide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAide.setVisible(false);
			}
		});
		btnAide.setVisible(false);
		
		JLabel aide = new JLabel("<html><u>AIDE</u></html>");
		aide.setFont(new Font("Arial", Font.BOLD, 15));
		aide.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				PageDistribution1.setCursor(12);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				PageDistribution1.setCursor(null);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(btnAide.isVisible()) {
					btnAide.setVisible(false);
				}else {
					btnAide.setVisible(true);
				}
			}
		});
		aide.setBounds(848, 12, 42, 15);
		PageDistribution1.getContentPane().add(aide);
		
		btnAide.setBounds(645, 37, 245, 284);
		PageDistribution1.getContentPane().add(btnAide);
		
		JLabel label1 = new JLabel("");
		JButton button1 = new JButton("<html>IA:offensif<br>\r\nR\u00F4le:\u00E9lite<br>\r\nPoints de vie:35<br>\r\nForce:20<br>\r\nDext\u00E9rit\u00E9:10<br>\r\nR\u00E9sistance:18<br>\r\nConstitution:5<br>\r\nInitiative:6</html>");
		button1.setVisible(false);
	
		label1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				PageDistribution1.setCursor(null);
				button1.setVisible(false);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				PageDistribution1.setCursor(12);
				button1.setVisible(true);
			}
		});
		
		label1.setBounds(87, 360, 32, 42);
		PageDistribution1.getContentPane().add(label1);
		
		button1.setBackground(new Color(245, 255, 250));
		button1.setBounds(62, 211, 135, 148);
		PageDistribution1.getContentPane().add(button1);
		
		JLabel label5 = new JLabel("");
		JButton button5 = new JButton("<html>IA:offensif<br>\r\nR\u00F4le:\u00E9lite<br>\r\nPoints de vie:35<br>\r\nForce:20<br>\r\nDext\u00E9rit\u00E9:10<br>\r\nR\u00E9sistance:18<br>\r\nConstitution:5<br>\r\nInitiative:6</html>");
		button5.setVisible(false);
	
		label5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				PageDistribution1.setCursor(null);
				button5.setVisible(false);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				PageDistribution1.setCursor(12);
				button5.setVisible(true);
			}
		});
		
		label5.setBounds(207, 360, 32, 42);
		PageDistribution1.getContentPane().add(label5);
		
		button5.setBackground(new Color(245, 255, 250));
		button5.setBounds(182, 211, 135, 148);
		PageDistribution1.getContentPane().add(button5);
		
		JLabel label10 = new JLabel("");
		JButton button10 = new JButton("<html>IA:offensif<br>\r\nR\u00F4le:\u00E9lite<br>\r\nPoints de vie:35<br>\r\nForce:20<br>\r\nDext\u00E9rit\u00E9:10<br>\r\nR\u00E9sistance:18<br>\r\nConstitution:5<br>\r\nInitiative:6</html>");
		button10.setVisible(false);
	
		label10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				PageDistribution1.setCursor(null);
				button10.setVisible(false);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				PageDistribution1.setCursor(12);
				button10.setVisible(true);
			}
		});
		
		label10.setBounds(352, 360, 32, 42);
		PageDistribution1.getContentPane().add(label10);
		
		button10.setBackground(new Color(245, 255, 250));
		button10.setBounds(327, 211, 135, 148);
		PageDistribution1.getContentPane().add(button10);
		
		JButton btnNewButton = new JButton("Revenir");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PageDistribution1.setVisible(false);
			    reservistes.ouvrepagereservistes();
			}
		});
		
		JButton btnValider = new JButton("Continuer");
		btnValider.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PageDistribution1.setVisible(false);
			     distribution2.ouvrepagedistribution2();
			}
		});
		btnValider.setBounds(816, 390, 91, 58);
		PageDistribution1.getContentPane().add(btnValider);
		btnNewButton.setBounds(0, 390, 91, 58);
		PageDistribution1.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Continuer");
		lblNewLabel.setBounds(0, 0, 901, 448);
		lblNewLabel.setIcon(new ImageIcon(distribution1.class.getResource("/imgs/ecrandistribution1.png")));
		PageDistribution1.getContentPane().add(lblNewLabel);
	}
}
