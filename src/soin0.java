import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class soin0 {

	private JFrame PageSoin0;

	/**
	 * Launch the application.
	 */
	public static void ouvrepagesoin0() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					soin0 window = new soin0();
					window.PageSoin0.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public soin0() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		PageSoin0 = new JFrame();
		PageSoin0.setTitle("Vos combattants dans la zone halles sportives");
		PageSoin0.setBounds(100, 100, 777, 429);
		PageSoin0.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//windowbuilder nous donne EXIT par d¨¦faut au lieu de HIDE
		PageSoin0.getContentPane().setLayout(null);
		
		JLabel label1 = new JLabel("");
		
		label1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				PageSoin0.setCursor(12);
				label1.setBorder(BorderFactory.createLineBorder(Color.gray,3));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				PageSoin0.setCursor(null);
				label1.setBorder(null);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				label1.setBorder(BorderFactory.createLineBorder(Color.black,3));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				label1.setBorder(BorderFactory.createLineBorder(Color.gray,3));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				soin1.ouvrepagesoin1();
			}
		});
		label1.setBounds(87, 294, 75, 60);
		PageSoin0.getContentPane().add(label1);
		
		JLabel label2 = new JLabel("");
		
		label2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				PageSoin0.setCursor(12);
				label2.setBorder(BorderFactory.createLineBorder(Color.gray,3));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				PageSoin0.setCursor(null);
				label2.setBorder(null);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				label2.setBorder(BorderFactory.createLineBorder(Color.black,3));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				label2.setBorder(BorderFactory.createLineBorder(Color.gray,3));
			}
		});
		label2.setBounds(336, 294, 75, 60);
		PageSoin0.getContentPane().add(label2);
		
		JLabel label3 = new JLabel("");
		
		label3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				PageSoin0.setCursor(12);
				label3.setBorder(BorderFactory.createLineBorder(Color.gray,3));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				PageSoin0.setCursor(null);
				label3.setBorder(null);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				label3.setBorder(BorderFactory.createLineBorder(Color.black,3));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				label3.setBorder(BorderFactory.createLineBorder(Color.gray,3));
			}
		});
		label3.setBounds(587, 294, 75, 60);
		PageSoin0.getContentPane().add(label3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 763, 392);
		lblNewLabel.setIcon(new ImageIcon(soin0.class.getResource("/imgs/ecransoin0.png")));
		PageSoin0.getContentPane().add(lblNewLabel);
	}

}
