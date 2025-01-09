import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class parametrage {

	private JFrame PageParametrage;

	/**
	 * Launch the application.
	 */
	
	
	//==============================Initialisation des variables==============================
	
	int reste=400;
	String typeselected="";//Cette variable indique le rôle du combattant, ce qui va être utilisé pendant l'initialisation local dans la zone de paramétrage
	int selected=0;//numéro du combattant choisi
	
	int force1=0;
	int initiative1=0;
	int dexterite1=0;
	int resistance1=0;
	int constitution1=0;
	int points1=30;
	
	int force8=1;
	int initiative8=1;
	int dexterite8=1;
	int resistance8=1;
	int constitution8=5;
	int points8=35;
	
	int force12=2;
	int initiative12=2;
	int dexterite12=2;
	int resistance12=2;
	int constitution12=10;
	int points12=40;
	
	//==============================fin Initialisation des variables==============================
	
	private JTextField textFieldForce;
	private JTextField textFieldInitiative;
	private JTextField textFieldDexterite;
	private JTextField textFieldResistance;
	private JTextField textFieldConstitution;
	private JTextField textFieldPoints;
	
	public static void ouvrepageparametrage() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					parametrage window = new parametrage();
					window.PageParametrage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public parametrage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		PageParametrage = new JFrame();
		PageParametrage.setTitle("Param\u00E9trage des troupes");
		PageParametrage.setBounds(100, 100, 915, 485);
		PageParametrage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		PageParametrage.getContentPane().setLayout(null);
		
		JLabel label1black = new JLabel("");
		
		JLabel label8black = new JLabel("");
		
		JLabel label12black = new JLabel("");
		
		JButton initialiserlocal = new JButton("Initialiser");
		
		JButton validerlocal = new JButton("Valider");
		
		JButton initialiserglobal = new JButton("INITIALISER");
		
		//==============================Affichage d'aide==============================
		
		JButton btnAide = new JButton("<html>Cliquez pour masquer cette guide.<br><br>\r\nCliquez sur un combattant pour le paramétrer.<br>\r\nN'oubliez pas de valider la saisie pour chaque combattant.<br>\r\nLa constitution peut prendre une valeur entre 0 et 30 ;\r\ntoutes les restes peuvent prendre des valeurs entre 0 et 10.<br><br>\r\nDans cette démo il n'y a que les 3 combattants n° 1, n° 8 et n° 12 que vous pouvez paramétrer\r\n</html>");
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
				PageParametrage.setCursor(12);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				PageParametrage.setCursor(null);
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
		PageParametrage.getContentPane().add(aide);
		
		btnAide.setBounds(645, 37, 245, 287);
		PageParametrage.getContentPane().add(btnAide);
		
		//==============================fin Affichage d'aide==============================
		
		JComboBox comboBoxIA=new JComboBox();
		comboBoxIA.setEnabled(false);
		comboBoxIA.addItem("Aléatoire");
		comboBoxIA.addItem("Offensif");
		comboBoxIA.addItem("Défensif");
		comboBoxIA.setBounds(574, 378, 73, 21);
		PageParametrage.getContentPane().add(comboBoxIA);
		
		//==============================Paramétrage combattant 1==============================
		
		label1black.setBounds(24, 2, 120, 75);
		PageParametrage.getContentPane().add(label1black);
		
		JLabel label1gray = new JLabel("");
		label1gray.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				typeselected="soldat";
				selected=1;
				label1black.setBorder(BorderFactory.createLineBorder(Color.black,3));
				label8black.setBorder(null);
				label12black.setBorder(null);
				//Activer les zones de saisie
				textFieldForce.enable();
				textFieldInitiative.enable();
				textFieldDexterite.enable();
				textFieldResistance.enable();
				textFieldConstitution.enable();
				comboBoxIA.enable();
				//Récupérer les valeurs pour les afficher dans les textfields
				String force1char=String.valueOf(force1);
				textFieldForce.setText(force1char);
				String initiative1char=String.valueOf(initiative1);
				textFieldInitiative.setText(initiative1char);
				String dexterite1char=String.valueOf(dexterite1);
				textFieldDexterite.setText(dexterite1char);
				String resistance1char=String.valueOf(resistance1);
				textFieldResistance.setText(resistance1char);
				String constitution1char=String.valueOf(constitution1);
				textFieldConstitution.setText(constitution1char);
				String points1char=String.valueOf(points1);
				textFieldPoints.setText(points1char);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				PageParametrage.setCursor(12);
				label1gray.setBorder(BorderFactory.createLineBorder(Color.gray,3));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				PageParametrage.setCursor(null);
				label1gray.setBorder(null);
			}
		});
		label1gray.setBounds(24, 2, 120, 75);
		PageParametrage.getContentPane().add(label1gray);
		
		//==============================fin Paramétrage combattant 1==============================
		
		//==============================Paramétrage combattant 8==============================
		
		label8black.setBounds(166, 98, 120, 75);
		PageParametrage.getContentPane().add(label8black);
		
		JLabel label8gray = new JLabel("");
		label8gray.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				typeselected="elite";
				selected=8;
				label8black.setBorder(BorderFactory.createLineBorder(Color.black,3));
				label1black.setBorder(null);
				label12black.setBorder(null);
				textFieldForce.enable();
				textFieldInitiative.enable();
				textFieldDexterite.enable();
				textFieldResistance.enable();
				textFieldConstitution.enable();
				comboBoxIA.enable();
				String force8char=String.valueOf(force8);
				textFieldForce.setText(force8char);
				String initiative8char=String.valueOf(initiative8);
				textFieldInitiative.setText(initiative8char);
				String dexterite8char=String.valueOf(dexterite8);
				textFieldDexterite.setText(dexterite8char);
				String resistance8char=String.valueOf(resistance8);
				textFieldResistance.setText(resistance8char);
				String constitution8char=String.valueOf(constitution8);
				textFieldConstitution.setText(constitution8char);
				String points8char=String.valueOf(points8);
				textFieldPoints.setText(points8char);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				PageParametrage.setCursor(12);
				label8gray.setBorder(BorderFactory.createLineBorder(Color.gray,3));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				PageParametrage.setCursor(null);
				label8gray.setBorder(null);
			}
		});
		label8gray.setBounds(166, 98, 120, 75);
		PageParametrage.getContentPane().add(label8gray);
		
		//==============================fin Paramétrage combattant 8==============================
		
		//==============================Paramétrage combattant 12==============================
		
		label12black.setBounds(735, 98, 120, 75);
		PageParametrage.getContentPane().add(label12black);
		
		JLabel label12gray = new JLabel("");
		label12gray.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				typeselected="maitre";
				selected=12;
				label12black.setBorder(BorderFactory.createLineBorder(Color.black,3));
				label1black.setBorder(null);
				label8black.setBorder(null);
				textFieldForce.enable();
				textFieldInitiative.enable();
				textFieldDexterite.enable();
				textFieldResistance.enable();
				textFieldConstitution.enable();
				comboBoxIA.enable();
				String force12char=String.valueOf(force12);
				textFieldForce.setText(force12char);
				String initiative12char=String.valueOf(initiative12);
				textFieldInitiative.setText(initiative12char);
				String dexterite12char=String.valueOf(dexterite12);
				textFieldDexterite.setText(dexterite12char);
				String resistance12char=String.valueOf(resistance12);
				textFieldResistance.setText(resistance12char);
				String constitution12char=String.valueOf(constitution12);
				textFieldConstitution.setText(constitution12char);
				String points12char=String.valueOf(points12);
				textFieldPoints.setText(points12char);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				PageParametrage.setCursor(12);
				label12gray.setBorder(BorderFactory.createLineBorder(Color.gray,3));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				PageParametrage.setCursor(null);
				label12gray.setBorder(null);
			}
		});
		label12gray.setBounds(735, 98, 120, 75);
		PageParametrage.getContentPane().add(label12gray);
		
		//==============================fin Paramétrage combattant 1==============================
		
		initialiserlocal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(typeselected=="soldat") {
					textFieldForce.setText("0");
					textFieldInitiative.setText("0");
					textFieldDexterite.setText("0");
					textFieldResistance.setText("0");
					textFieldConstitution.setText("0");
					textFieldPoints.setText("30");
				}
				if(typeselected=="elite") {
					textFieldForce.setText("1");
					textFieldInitiative.setText("1");
					textFieldDexterite.setText("1");
					textFieldResistance.setText("1");
					textFieldConstitution.setText("5");
					textFieldPoints.setText("35");
				}
				if(typeselected=="maitre") {
					textFieldForce.setText("2");
					textFieldInitiative.setText("2");
					textFieldDexterite.setText("2");
					textFieldResistance.setText("2");
					textFieldConstitution.setText("10");
					textFieldPoints.setText("40");
				}
			}
		});
		
		//==============================Bouton VALIDER global==============================
		
		JButton validerglobal = new JButton("VALIDER");
		validerglobal.setFont(new Font("Arial", Font.PLAIN, 20));
		validerglobal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int opt=JOptionPane.showConfirmDialog(null,
						"Êtes-vous sûr de vouloir continuer ? Vous ne pouvez pas revenir en arrière après validation. ","Confirmation",
						JOptionPane.YES_NO_OPTION);
				if(opt==JOptionPane.YES_OPTION) {
					PageParametrage.setVisible(false);
					reservistes.ouvrepagereservistes();
				}
			}
		});
		
		validerglobal.setBounds(718, 399, 145, 35);
		PageParametrage.getContentPane().add(validerglobal);
		
		//==============================fin Bouton VALIDER global==============================
		
		textFieldPoints = new JTextField();
		textFieldPoints.setEditable(false);
		textFieldPoints.setColumns(10);
		textFieldPoints.setBounds(366, 411, 54, 21);
		PageParametrage.getContentPane().add(textFieldPoints);
		
		JLabel lblNewLabelReste = new JLabel("400");
		lblNewLabelReste.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabelReste.setBounds(507, 282, 30, 21);
		PageParametrage.getContentPane().add(lblNewLabelReste);
		
		//==============================Actions du bouton Valider pour un combattant==============================
		
		validerlocal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String textforce=textFieldForce.getText();
				String textinitiative=textFieldInitiative.getText();
				String textdexterite=textFieldDexterite.getText();
				String textresistance=textFieldResistance.getText();
				String textconstitution=textFieldConstitution.getText();
				
				String testint=textforce+textinitiative+textdexterite+textresistance+textconstitution;
				testint=testint.replaceAll("[0-9]","");
				//Si tous les textes saisis sont des intègres, la longueur de testint sera 0. 
				
				//Test de type
				if(testint.length()==0&&textforce.length()!=0&&textinitiative.length()!=0&&textdexterite.length()!=0&&textresistance.length()!=0&&textconstitution.length()!=0) {
					//Test de valeur
					if(Integer.valueOf(textforce).intValue()>10||Integer.valueOf(textinitiative).intValue()>10
							||Integer.valueOf(textdexterite).intValue()>10||Integer.valueOf(textresistance).intValue()>10
							||Integer.valueOf(textconstitution).intValue()>30) {
						JOptionPane.showMessageDialog(null, "Il existe des valeurs saisies qui dépassent sa limite",
								"Erreurs", JOptionPane.ERROR_MESSAGE);
					}else {
						if(selected==1) {
							//Récupération des valeur saisies
							force1=Integer.valueOf(textforce).intValue();
							initiative1=Integer.valueOf(textinitiative).intValue();
							dexterite1=Integer.valueOf(textdexterite).intValue();
							resistance1=Integer.valueOf(textresistance).intValue();
							constitution1=Integer.valueOf(textconstitution).intValue();
							points1=constitution1+30;
							//Affichage des points de vie qui est résultat de la constitution
							String points1char=String.valueOf(points1);
							textFieldPoints.setText(points1char);
							//Calcul des points restants
							reste=400-force1-initiative1-dexterite1-resistance1-constitution1
									-force8-initiative8-dexterite8-resistance8-constitution8+9
									-force12-initiative12-dexterite12-resistance12-constitution12+18;
							String restechar=String.valueOf(reste);
							lblNewLabelReste.setText(restechar);
						}
						if(selected==8) {
							force8=Integer.valueOf(textforce).intValue();
							initiative8=Integer.valueOf(textinitiative).intValue();
							dexterite8=Integer.valueOf(textdexterite).intValue();
							resistance8=Integer.valueOf(textresistance).intValue();
							constitution8=Integer.valueOf(textconstitution).intValue();
							points8=constitution8+30;
							String points8char=String.valueOf(points8);
							textFieldPoints.setText(points8char);
							reste=400-force1-initiative1-dexterite1-resistance1-constitution1
									-force8-initiative8-dexterite8-resistance8-constitution8+9
									-force12-initiative12-dexterite12-resistance12-constitution12+18;
							String restechar=String.valueOf(reste);
							lblNewLabelReste.setText(restechar);
						}
						if(selected==12) {
							force12=Integer.valueOf(textforce).intValue();
							initiative12=Integer.valueOf(textinitiative).intValue();
							dexterite12=Integer.valueOf(textdexterite).intValue();
							resistance12=Integer.valueOf(textresistance).intValue();
							constitution12=Integer.valueOf(textconstitution).intValue();
							points12=constitution12+30;
							String points12char=String.valueOf(points12);
							textFieldPoints.setText(points12char);
							reste=400-force1-initiative1-dexterite1-resistance1-constitution1
									-force8-initiative8-dexterite8-resistance8-constitution8+9
									-force12-initiative12-dexterite12-resistance12-constitution12+18;
							String restechar=String.valueOf(reste);
							lblNewLabelReste.setText(restechar);
						}
					}
				}
				
				else {
					JOptionPane.showMessageDialog(null, "Il existe des erreurs de format dans votre saisie",
							"Erreurs", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		//==============================fin Actions du bouton Valider pour un combattant==============================
		
		validerlocal.setBounds(574, 410, 93, 23);
		PageParametrage.getContentPane().add(validerlocal);
		
		initialiserlocal.setBounds(460, 410, 99, 23);
		PageParametrage.getContentPane().add(initialiserlocal);
		
		initialiserglobal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textFieldForce.isEnabled()==true) {
					int opt=JOptionPane.showConfirmDialog(null,
							"Êtes-vous sûr de vouloir tout initialiser ?","Confirmation",
							JOptionPane.YES_NO_OPTION);
							if(opt==JOptionPane.YES_OPTION) {
								int reste=400;
								String typeselected="";
								int selected=0;
								
								int force1=0;
								int initiative1=0;
								int dexterite1=0;
								int resistance1=0;
								int constitution1=0;
								int points1=30;
								
								int force8=1;
								int initiative8=1;
								int dexterite8=1;
								int resistance8=1;
								int constitution8=5;
								int points8=35;
								
								int force12=2;
								int initiative12=2;
								int dexterite12=2;
								int resistance12=2;
								int constitution12=10;
								int points12=40;
								
								label1black.setBorder(null);
								label8black.setBorder(null);
								label12black.setBorder(null);
								
								textFieldForce.setText("");
								textFieldInitiative.setText("");
								textFieldDexterite.setText("");
								textFieldResistance.setText("");
								textFieldConstitution.setText("");
								textFieldPoints.setText("");
								
								textFieldForce.enable(false);
								textFieldInitiative.enable(false);
								textFieldDexterite.enable(false);
								textFieldResistance.enable(false);
								textFieldConstitution.enable(false);
								comboBoxIA.enable(false);
								
								initialiserlocal.enable(false);
								validerlocal.enable(false);
							}
				}
			}
		});
		initialiserglobal.setFont(new Font("Arial", Font.PLAIN, 20));
		initialiserglobal.setBounds(37, 399, 145, 35);
		PageParametrage.getContentPane().add(initialiserglobal);
		
		textFieldConstitution = new JTextField();
		textFieldConstitution.setEnabled(false);
		textFieldConstitution.setColumns(10);
		textFieldConstitution.setBounds(366, 378, 54, 21);
		PageParametrage.getContentPane().add(textFieldConstitution);
		
		textFieldResistance = new JTextField();
		textFieldResistance.setEnabled(false);
		textFieldResistance.setColumns(10);
		textFieldResistance.setBounds(574, 347, 54, 21);
		PageParametrage.getContentPane().add(textFieldResistance);
		
		textFieldDexterite = new JTextField();
		textFieldDexterite.setEnabled(false);
		textFieldDexterite.setColumns(10);
		textFieldDexterite.setBounds(366, 347, 54, 21);
		PageParametrage.getContentPane().add(textFieldDexterite);
		
		textFieldInitiative = new JTextField();
		textFieldInitiative.setEnabled(false);
		textFieldInitiative.setColumns(10);
		textFieldInitiative.setBounds(574, 317, 54, 21);
		PageParametrage.getContentPane().add(textFieldInitiative);
		
		textFieldForce = new JTextField();
		textFieldForce.setEnabled(false);
		textFieldForce.setBounds(366, 317, 54, 21);
		PageParametrage.getContentPane().add(textFieldForce);
		textFieldForce.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 900, 450);
		lblNewLabel.setIcon(new ImageIcon(parametrage.class.getResource("/imgs/ecranparametrage.PNG")));
		PageParametrage.getContentPane().add(lblNewLabel);
	}
}
