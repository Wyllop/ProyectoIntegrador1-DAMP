package vista;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controlador.Controlador;
import modelo.Modelo;
import javax.swing.DefaultComboBoxModel;

public class _05_UnirseLiga extends JFrame implements Vista {

	// Atributos
	private Controlador miControlador;
	private Modelo miModelo;

	private JPanel contentPane;
	private JLabel lblFondo;
	private JLabel lblLogo;
	private JPanel background;
	private JButton btnMiCuenta;
	private JButton btnVerLigas;
	private JButton btnCrearLiga;
	private JButton btnUnirseALiga;
	private JButton btnUnirseALiga_1;
	private JButton btnCrearEquipo;
	private JButton btnUnirseAEquipo;
	private JButton btnMisApuestas;
	private JButton btnSignOut;
	private JTextField txtCodLiga;
	private JLabel lblBarraMoverVentana;
	private int xMouse, yMouse;
	private JTextPane txtpnUnirseAUna;
	private JLabel lblunirse;
	private JButton btnUnion;
	private JButton btnUnirEqui;
	private JButton btnCrearEquip;
	private JComboBox<String> listaEquipos;

	// Constructor
	public _05_UnirseLiga() {
		setTitle("Unirse a liga");
		setResizable(false);
		setUndecorated(true);
		setLocationRelativeTo(null);
		setLocationByPlatform(rootPaneCheckingEnabled);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationByPlatform(true);
		;
		setSize(1010, 539);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		background = new JPanel();
		background.setBorder(null);
		background.setBackground(new Color(0, 128, 192));
		background.setBounds(0, 0, 1010, 539);
		contentPane.add(background);
		background.setLayout(null);

		lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(Plantilla.class.getResource("/img/logo.png")));
		lblLogo.setBounds(290, 11, 150, 64);
		background.add(lblLogo);

		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(160, 160, 160));
		separator.setBackground(new Color(0, 0, 0));
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(282, 0, 13, 537);
		background.add(separator);

		JLabel lblBtnCerrar = new JLabel("");
		lblBtnCerrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				lblBtnCerrar.setBackground(Color.RED);
				lblBtnCerrar.setOpaque(true);
				setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblBtnCerrar.setBackground(null);
				lblBtnCerrar.setOpaque(false);
				setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			}
		});
		lblBtnCerrar.setIcon(new ImageIcon(_00_PaginaPrincipal2.class.getResource("/img/close.png")));
		lblBtnCerrar.setBounds(970, 0, 40, 40);
		background.add(lblBtnCerrar);

		JLabel lblBtnMinimizar = new JLabel("");
		lblBtnMinimizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setState(JFrame.ICONIFIED);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				lblBtnMinimizar.setBackground(Color.BLUE);
				lblBtnMinimizar.setOpaque(true);
				setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblBtnMinimizar.setBackground(null);
				lblBtnMinimizar.setOpaque(false);
				setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			}
		});
		lblBtnMinimizar.setIcon(new ImageIcon(_00_PaginaPrincipal2.class.getResource("/img/minimize.png")));
		lblBtnMinimizar.setBounds(928, 0, 40, 40);
		background.add(lblBtnMinimizar);

		btnMiCuenta = new JButton("MI CUENTA");
		btnMiCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.cambiarVentana(5, 4);
			}
		});
		btnMiCuenta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnMiCuenta.setBackground(Color.yellow);
				btnMiCuenta.setOpaque(true);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnMiCuenta.setBackground(null);
				btnMiCuenta.setOpaque(false);
			}
		});

		btnMiCuenta.setHorizontalAlignment(SwingConstants.LEFT);
		btnMiCuenta.setFont(new Font("Britannic Bold", Font.BOLD, 25));
		btnMiCuenta.setBounds(10, 43, 260, 49);
		btnMiCuenta.setBorderPainted(false);
		btnMiCuenta.setContentAreaFilled(false);
		btnMiCuenta.setOpaque(false);
		btnMiCuenta.setFocusPainted(false);
		btnMiCuenta.setCursor(new Cursor(Cursor.HAND_CURSOR));
		background.add(btnMiCuenta);
		background.setComponentZOrder(btnMiCuenta, 0);

		btnVerLigas = new JButton("VER LIGAS");
		btnVerLigas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.cambiarVentana(5, 0);
			}
		});
		btnVerLigas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnVerLigas.setBackground(Color.yellow);
				btnVerLigas.setOpaque(true);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnVerLigas.setBackground(null);
				btnVerLigas.setOpaque(false);
			}
		});
		btnVerLigas.setHorizontalAlignment(SwingConstants.LEFT);
		btnVerLigas.setOpaque(false);
		btnVerLigas.setFont(new Font("Britannic Bold", Font.BOLD, 25));
		btnVerLigas.setFocusPainted(false);
		btnVerLigas.setContentAreaFilled(false);
		btnVerLigas.setBorderPainted(false);
		btnVerLigas.setBounds(10, 94, 260, 49);
		btnVerLigas.setCursor(new Cursor(Cursor.HAND_CURSOR));
		background.add(btnVerLigas);
		background.setComponentZOrder(btnVerLigas, 0);

		btnCrearLiga = new JButton("CREAR LIGA");
		btnCrearLiga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.cambiarVentana(5, 7);
			}
		});
		btnCrearLiga.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnCrearLiga.setBackground(Color.yellow);
				btnCrearLiga.setOpaque(true);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnCrearLiga.setBackground(null);
				btnCrearLiga.setOpaque(false);
			}
		});
		btnCrearLiga.setHorizontalAlignment(SwingConstants.LEFT);
		btnCrearLiga.setOpaque(false);
		btnCrearLiga.setFont(new Font("Britannic Bold", Font.BOLD, 25));
		btnCrearLiga.setFocusPainted(false);
		btnCrearLiga.setContentAreaFilled(false);
		btnCrearLiga.setBorderPainted(false);
		btnCrearLiga.setBounds(10, 154, 260, 49);
		btnCrearLiga.setCursor(new Cursor(Cursor.HAND_CURSOR));
		background.add(btnCrearLiga);
		background.setComponentZOrder(btnCrearLiga, 0);

		btnUnirseALiga = new JButton("UNIRSE A LIGA");
		btnUnirseALiga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.cambiarVentana(5, 5);
			}
		});
		btnUnirseALiga.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnUnirseALiga.setBackground(Color.yellow);
				btnUnirseALiga.setOpaque(true);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnUnirseALiga.setBackground(null);
				btnUnirseALiga.setOpaque(false);
			}
		});
		
		JLabel lblUnionIncorrecta = new JLabel("El c\u00F3digo es incorrecto o la liga ha empezado");
		lblUnionIncorrecta.setForeground(new Color(255, 128, 128));
		lblUnionIncorrecta.setBounds(504, 393, 270, 19);
		lblUnionIncorrecta.setVisible(false);
		background.add(lblUnionIncorrecta);
		
		btnUnirseALiga_1 = new JButton("  UNIRSE A LIGA");
		btnUnirseALiga_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnUnirseALiga_1.setFont(new Font("Britannic Bold", Font.BOLD, 25));
		btnUnirseALiga_1.setFocusPainted(false);
		btnUnirseALiga_1.setContentAreaFilled(false);
		btnUnirseALiga_1.setBorderPainted(false);
		btnUnirseALiga_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnUnirseALiga_1.setEnabled(false);
		btnUnirseALiga_1.setBackground(new Color(220, 220, 220));
		btnUnirseALiga_1.setForeground(new Color(128, 128, 128));
		btnUnirseALiga_1.setBorder(BorderFactory.createLineBorder(new Color(128, 128, 128)));
		btnUnirseALiga_1.setBounds(10, 217, 260, 49);
		background.add(btnUnirseALiga_1);
		background.setComponentZOrder(btnUnirseALiga_1, 0);

		btnCrearEquipo = new JButton("CREAR EQUIPO");
		btnCrearEquipo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.cambiarVentana(5, 8);
			}
		});
		btnCrearEquipo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnCrearEquipo.setBackground(Color.yellow);
				btnCrearEquipo.setOpaque(true);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnCrearEquipo.setBackground(null);
				btnCrearEquipo.setOpaque(false);
			}
		});
		btnCrearEquipo.setHorizontalAlignment(SwingConstants.LEFT);
		btnCrearEquipo.setOpaque(false);
		btnCrearEquipo.setFont(new Font("Britannic Bold", Font.BOLD, 25));
		btnCrearEquipo.setFocusPainted(false);
		btnCrearEquipo.setContentAreaFilled(false);
		btnCrearEquipo.setBorderPainted(false);
		btnCrearEquipo.setBounds(10, 277, 260, 49);
		btnCrearEquipo.setCursor(new Cursor(Cursor.HAND_CURSOR));
		background.add(btnCrearEquipo);
		background.setComponentZOrder(btnCrearEquipo, 0);

		btnUnirseAEquipo = new JButton("UNIRSE A EQUIPO");
		btnUnirseAEquipo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.cambiarVentana(5, 6);
			}
		});
		btnUnirseAEquipo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnUnirseAEquipo.setBackground(Color.yellow);
				btnUnirseAEquipo.setOpaque(true);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnUnirseAEquipo.setBackground(null);
				btnUnirseAEquipo.setOpaque(false);
			}
		});
		btnUnirseAEquipo.setHorizontalAlignment(SwingConstants.LEFT);
		btnUnirseAEquipo.setOpaque(false);
		btnUnirseAEquipo.setFont(new Font("Britannic Bold", Font.BOLD, 25));
		btnUnirseAEquipo.setFocusPainted(false);
		btnUnirseAEquipo.setContentAreaFilled(false);
		btnUnirseAEquipo.setBorderPainted(false);
		btnUnirseAEquipo.setBounds(10, 337, 260, 49);
		btnUnirseAEquipo.setCursor(new Cursor(Cursor.HAND_CURSOR));
		background.add(btnUnirseAEquipo);
		background.setComponentZOrder(btnUnirseAEquipo, 0);

		btnMisApuestas = new JButton("MIS APUESTAS");
		btnMisApuestas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.cambiarVentana(5, 12);
			}
		});
		btnMisApuestas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnMisApuestas.setBackground(Color.yellow);
				btnMisApuestas.setOpaque(true);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnMisApuestas.setBackground(null);
				btnMisApuestas.setOpaque(false);
			}
		});
		btnMisApuestas.setHorizontalAlignment(SwingConstants.LEFT);
		btnMisApuestas.setOpaque(false);
		btnMisApuestas.setFont(new Font("Britannic Bold", Font.BOLD, 25));
		btnMisApuestas.setFocusPainted(false);
		btnMisApuestas.setContentAreaFilled(false);
		btnMisApuestas.setBorderPainted(false);
		btnMisApuestas.setBounds(10, 397, 260, 49);
		btnMisApuestas.setCursor(new Cursor(Cursor.HAND_CURSOR));
		background.add(btnMisApuestas);
		background.setComponentZOrder(btnMisApuestas, 0);

		btnSignOut = new JButton("Sign Out");
		btnSignOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.cambiarVentana(5, 1);
			}
		});
		btnSignOut.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnSignOut.setBackground(Color.yellow);
				btnSignOut.setOpaque(true);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnSignOut.setBackground(null);
				btnSignOut.setOpaque(false);
			}
		});
		btnSignOut.setHorizontalAlignment(SwingConstants.LEFT);
		btnSignOut.setOpaque(false);
		btnSignOut.setFont(new Font("Britannic Bold", Font.BOLD, 15));
		btnSignOut.setFocusPainted(false);
		btnSignOut.setContentAreaFilled(false);
		btnSignOut.setBorderPainted(false);
		btnSignOut.setBounds(10, 457, 260, 40);
		btnSignOut.setCursor(new Cursor(Cursor.HAND_CURSOR));
		background.add(btnSignOut);
		background.setComponentZOrder(btnSignOut, 0);

		lblunirse = new JLabel("Elige tu equipo:");
		lblunirse.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
		lblunirse.setBounds(375, 247, 316, 39);
		background.add(lblunirse);

		txtCodLiga = new JTextField();
		txtCodLiga.setColumns(10);
		txtCodLiga.setBackground(new Color(255, 255, 255));
		txtCodLiga.setBounds(653, 347, 219, 19);
		background.add(txtCodLiga);

		btnUnion = new JButton("Unirse");
		btnUnion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.unirseLiga(txtCodLiga.getText(), (String) listaEquipos.getSelectedItem());
				if (miModelo.isUnionLigaCorrecta()) {
					miControlador.cambiarVentana(5, 9);
					lblUnionIncorrecta.setVisible(false);
				}else {
					lblUnionIncorrecta.setVisible(true);
				}
				

			}
		});
		btnUnion.setBackground(new Color(255, 128, 0));
		btnUnion.setBounds(787, 390, 85, 21);
		background.add(btnUnion);

		btnUnirEqui = new JButton("Unirse equipo");
		btnUnirEqui.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.cambiarVentana(5, 6);
			}
		});
		btnUnirEqui.setBackground(new Color(255, 128, 0));
		btnUnirEqui.setBounds(751, 504, 115, 21);
		background.add(btnUnirEqui);

		JLabel lblNoEquipo = new JLabel("\u00BFNo tienes equipo?, crea o unete a uno :D ");
		lblNoEquipo.setFont(new Font("Britannic Bold", Font.PLAIN, 14));
		lblNoEquipo.setBounds(440, 496, 322, 32);
		background.add(lblNoEquipo);

		btnCrearEquip = new JButton("Crear Equipo");
		btnCrearEquip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.cambiarVentana(5, 8);
			}
		});
		btnCrearEquip.setBackground(new Color(255, 128, 0));
		btnCrearEquip.setBounds(878, 504, 109, 21);
		background.add(btnCrearEquip);

		lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon(Plantilla.class.getResource("/img/fondoLogin2  - copia.jpg")));
		lblFondo.setBounds(0, 0, 283, 539);
		background.add(lblFondo);
		lblBarraMoverVentana = new JLabel("");
		lblBarraMoverVentana.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int xPantalla = e.getXOnScreen();
				int yPantalla = e.getYOnScreen();
				setLocation(xPantalla - xMouse, yPantalla - yMouse);
			}
		});

		lblBarraMoverVentana.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xMouse = e.getX();
				yMouse = e.getY();
			}
		});
		lblBarraMoverVentana.setBounds(0, 0, 918, 23);
		background.add(lblBarraMoverVentana);

		txtpnUnirseAUna = new JTextPane();
		txtpnUnirseAUna.setFont(new Font("Britannic Bold", Font.PLAIN, 19));
		txtpnUnirseAUna.setText("UNIRSE A UNA LIGA ATRAVES \r\nDE CODIGO DE INVITACION");
		txtpnUnirseAUna.setBackground(new Color(0, 128, 192));
		txtpnUnirseAUna.setEditable(false);
		txtpnUnirseAUna.setBounds(504, 111, 290, 125);
		background.add(txtpnUnirseAUna);

		JLabel lblunirse_1 = new JLabel("Introduzca  c\u00F3digo de uni\u00F3n:");
		lblunirse_1.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
		lblunirse_1.setBounds(375, 335, 316, 39);
		background.add(lblunirse_1);

		listaEquipos = new JComboBox<>();
		listaEquipos.setBounds(653, 259, 219, 19);
		background.add(listaEquipos);

		setLocationRelativeTo(null);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				listaEquipos.setModel(miControlador.getEquiposUsuario());
				lblUnionIncorrecta.setVisible(false);
			}
		});
	}

	@Override
	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;

	}

	@Override
	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}
}
