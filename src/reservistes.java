import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class reservistes {

	private JFrame PageReservistes;

	/**
	 * Launch the application.
	 */
	
	int selected1=0;
	int selected2=0;
	int selected3=0;
	int selected4=0;
	int selected5=0;
	int selected6=0;
	int number=0;
	
	public static void ouvrepagereservistes() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					reservistes window = new reservistes();
					window.PageReservistes.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public reservistes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		PageReservistes = new JFrame();
		PageReservistes.setTitle("Désignation des réservistes");
		PageReservistes.setBounds(100, 100, 915, 485);
		PageReservistes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		PageReservistes.getContentPane().setLayout(null);
		
		JButton btnAide = new JButton("<html>Cliquez pour masquer cette guide.<br><br>\r\n\r\nDans cette démo il n'y a que les 6 combattants sur l'écran. En théorie vous pouvez cliquer sur les deux icônes triangulaires pour changer de page, ce qui vous permet d'accéder à tous les 20 combattant. \r\n</html>");
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
				PageReservistes.setCursor(12);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				PageReservistes.setCursor(null);
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
		PageReservistes.getContentPane().add(aide);
		
		btnAide.setBounds(645, 37, 245, 196);
		PageReservistes.getContentPane().add(btnAide);
		
		JLabel label1gray = new JLabel("");
		
		JLabel label2gray = new JLabel("");
		
		JLabel label3gray = new JLabel("");
		
		JLabel label4gray = new JLabel("");
		
		JLabel label5gray = new JLabel("");
		
		JLabel label6gray = new JLabel("");
		
		JLabel label1black = new JLabel("");
		label1black.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			    if(selected1==0) {
			    	label1black.setBorder(BorderFactory.createLineBorder(Color.black,4));
			    	selected1=1;
			    	number=number+1;
			    } else {
			    	label1black.setBorder(null);
			    	selected1=0;
			    	number=number-1;
			    }
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				PageReservistes.setCursor(12);
				label1gray.setBorder(BorderFactory.createLineBorder(Color.gray,4));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				 PageReservistes.setCursor(null);
				 label1gray.setBorder(null);
			}
		});
		
		JLabel label2black = new JLabel("");
		label2black.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(selected2==0) {
			    	label2black.setBorder(BorderFactory.createLineBorder(Color.black,4));
			    	selected2=1;
			    	number=number+1;
			    } else {
			    	label2black.setBorder(null);
			    	selected2=0;
			    	number=number-1;
			    }
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				PageReservistes.setCursor(12);
				label2gray.setBorder(BorderFactory.createLineBorder(Color.gray,4));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				PageReservistes.setCursor(null);
				 label2gray.setBorder(null);
			}
		});
		
		JLabel label3black = new JLabel("");
		label3black.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(selected3==0) {
			    	label3black.setBorder(BorderFactory.createLineBorder(Color.black,4));
			    	selected3=1;
			    	number=number+1;
			    } else {
			    	label3black.setBorder(null);
			    	selected3=0;
			    	number=number-1;
			    }
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				PageReservistes.setCursor(12);
				label3gray.setBorder(BorderFactory.createLineBorder(Color.gray,4));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				PageReservistes.setCursor(null);
				 label3gray.setBorder(null);
			}
		});
		
		JLabel label4black = new JLabel("");
		label4black.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(selected4==0) {
			    	label4black.setBorder(BorderFactory.createLineBorder(Color.black,4));
			    	selected4=1;
			    	number=number+1;
			    } else {
			    	label4black.setBorder(null);
			    	selected4=0;
			    	number=number-1;
			    }
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				PageReservistes.setCursor(12);
				label4gray.setBorder(BorderFactory.createLineBorder(Color.gray,4));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				PageReservistes.setCursor(null);
				 label4gray.setBorder(null);
			}
		});
		
		JLabel label5black = new JLabel("");
		label5black.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(selected5==0) {
			    	label5black.setBorder(BorderFactory.createLineBorder(Color.black,4));
			    	selected5=1;
			    	number=number+1;
			    } else {
			    	label5black.setBorder(null);
			    	selected5=0;
			    	number=number-1;
			    }
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				PageReservistes.setCursor(12);
				label5gray.setBorder(BorderFactory.createLineBorder(Color.gray,4));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				PageReservistes.setCursor(null);
				 label5gray.setBorder(null);
			}
		});
		
		JLabel label6black = new JLabel("");
		label6black.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(selected6==0) {
			    	label6black.setBorder(BorderFactory.createLineBorder(Color.black,4));
			    	selected6=1;
			    	number=number+1;
			    } else {
			    	label6black.setBorder(null);
			    	selected6=0;
			    	number=number-1;
			    }
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				PageReservistes.setCursor(12);
				label6gray.setBorder(BorderFactory.createLineBorder(Color.gray,4));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				PageReservistes.setCursor(null);
				 label6gray.setBorder(null);
			}
		});
		
		JButton valider = new JButton("VALIDER");
		valider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(number==5) {
					PageReservistes.setVisible(false);
					distribution1.ouvrepagedistribution1();
				}else {
				JOptionPane.showMessageDialog(null, "Veuillez désignez 5 réservistes",
						"Erreurs", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		valider.setFont(new Font("Arial", Font.PLAIN, 20));
		valider.setBounds(720, 397, 145, 35);
		PageReservistes.getContentPane().add(valider);
		
		JButton initialiser = new JButton("INITIALISER");
		initialiser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label1black.setBorder(null);
		    	selected1=0;
		    	label2black.setBorder(null);
		    	selected2=0;
		    	label3black.setBorder(null);
		    	selected3=0;
		    	label4black.setBorder(null);
		    	selected4=0;
		    	label5black.setBorder(null);
		    	selected5=0;
		    	label6black.setBorder(null);
		    	selected6=0;
		    	number=0;
			}
		});
		initialiser.setFont(new Font("Arial", Font.PLAIN, 20));
		initialiser.setBounds(39, 397, 145, 35);
		PageReservistes.getContentPane().add(initialiser);
		
		label6black.setBounds(580, 170, 210, 108);
		PageReservistes.getContentPane().add(label6black);
		
		label5black.setBounds(350, 170, 210, 108);
		PageReservistes.getContentPane().add(label5black);
		
		label4black.setBounds(105, 170, 210, 108);
		PageReservistes.getContentPane().add(label4black);
		
		label3black.setBounds(580, 46, 210, 108);
		PageReservistes.getContentPane().add(label3black);
		
		label2black.setBounds(344, 46, 210, 108);
		PageReservistes.getContentPane().add(label2black);
		
		label1black.setBounds(105, 46, 210, 108);
		PageReservistes.getContentPane().add(label1black);
		
		//=====================================================
		
		label3gray.setBounds(580, 46, 210, 108);
		PageReservistes.getContentPane().add(label3gray);
		
		label4gray.setBounds(105, 170, 210, 108);
		PageReservistes.getContentPane().add(label4gray);
		
		label5gray.setBounds(350, 170, 210, 108);
		PageReservistes.getContentPane().add(label5gray);
		
		label6gray.setBounds(580, 170, 210, 108);
		PageReservistes.getContentPane().add(label6gray);
		
		label2gray.setBounds(344, 46, 210, 108);
		PageReservistes.getContentPane().add(label2gray);
		
		label1gray.setBounds(105, 46, 210, 108);
		PageReservistes.getContentPane().add(label1gray);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 901, 448);
		lblNewLabel.setIcon(new ImageIcon(reservistes.class.getResource("/imgs/ecranreservistes.png")));
		PageReservistes.getContentPane().add(lblNewLabel);
	}

	protected static void setCursor(int i) {
		// TODO Auto-generated method stub
		
	}
}
