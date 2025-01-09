import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class melee0 {

	private JFrame PageMelee0;

	/**
	 * Launch the application.
	 */
	public static void ouvrepagemelee0() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					melee0 window = new melee0();
					window.PageMelee0.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public melee0() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		PageMelee0 = new JFrame();
		PageMelee0.setTitle("M\u00EAl\u00E9e en cours");
		PageMelee0.setBounds(100, 100, 915, 485);
		PageMelee0.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		PageMelee0.getContentPane().setLayout(null);
		
		JButton btnAide = new JButton("<html>Cliquez pour masquer cette guide.<br><br>\r\nCliquez sur une zone d'influence pour acc\u00E9der \u00E0 la vue de cette zone. Vous pouvez \u00E9galement effectuer des soins dans la zone \u00E0 partir de sa vue locale.<br><br>\r\nDans cette d\u00E9mo il n'y a que la zone Halle sportive qui a une vue locale.<br>\r\nEn th\u00E9orie, il y aurait des animations permettant de montrer en temps r\u00E9el l'\u00E9volution de la bataille et, de distinguer les deux parties en conflit. \r\n</html>");
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
				PageMelee0.setCursor(12);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				PageMelee0.setCursor(null);
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
		PageMelee0.getContentPane().add(aide);
		
		btnAide.setBounds(645, 37, 245, 318);
		PageMelee0.getContentPane().add(btnAide);
		
		JLabel label = new JLabel("");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			     melee1.ouvrepagemelee1();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				PageMelee0.setCursor(12);
				label.setBorder(BorderFactory.createLineBorder(Color.gray,3));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				PageMelee0.setCursor(null);
				label.setBorder(null);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				label.setBorder(BorderFactory.createLineBorder(Color.black,3));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				label.setBorder(BorderFactory.createLineBorder(Color.gray,3));
			}
		});
		
		JButton trevevictoire = new JButton("Supposons que vous avez gagn\u00E9 dans la zone BDE");
		trevevictoire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PageMelee0.dispose();
				victoirezone.ouvrepagevictoirezone();
			}
		});
		
		JButton fin = new JButton("Supposons que l'un des deux parties a gagn\u00E9 d\u00E9finitivement la bataille");
		fin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PageMelee0.dispose();
				gagne.ouvrepagegagne();
			}
		});
		
		JButton treveperte = new JButton("Supposons que vous avez perdu dans la zone admin.");
		treveperte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PageMelee0.dispose();
				pertezone.ouvrepagepertezone();
			}
		});
		treveperte.setFont(new Font("Arial", Font.PLAIN, 12));
		treveperte.setBounds(538, 110, 336, 44);
		PageMelee0.getContentPane().add(treveperte);
		fin.setFont(new Font("Arial", Font.PLAIN, 12));
		fin.setBounds(28, 394, 424, 44);
		PageMelee0.getContentPane().add(fin);
		trevevictoire.setFont(new Font("Arial", Font.PLAIN, 12));
		trevevictoire.setBounds(538, 56, 336, 44);
		PageMelee0.getContentPane().add(trevevictoire);
		label.setBounds(94, 0, 232, 132);
		PageMelee0.getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 901, 448);
		lblNewLabel.setIcon(new ImageIcon(melee0.class.getResource("/imgs/ecranmelee0.png")));
		PageMelee0.getContentPane().add(lblNewLabel);
	}
}
