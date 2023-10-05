/*
 * @Guillermo Callizaya F
 */
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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDateChooser;

import controlador.Controlador;
import modelo.Modelo;

public class _04_MiCuenta extends JFrame implements Vista {

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
	private JButton btnCrearEquipo;
	private JButton btnUnirseAEquipo;
	private JButton btnMisApuestas;
	private JButton btnSignOut;
	private JLabel lblMiCuenta;
	private JLabel lblUsuario;
	private JLabel lblNombre;
	private JLabel lblApellido2;
	private JLabel lblCorreo;
	private JLabel lblPassword;
	private JLabel lblEdad;
	private JTextField txtNombre;
	private JTextField txtApellido1;
	private JTextField txtApellido2;
	private JTextField txtPassword;
	private JTextField txtCorreo;
	private JLabel lblUser;
	private JButton btnCambiarDatos;
	private int xMouse, yMouse;
	private JLabel lblUpdate;
	private JTextField txtEdad;

	// Constructor
	public _04_MiCuenta() {
		setTitle("Plantilla");
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
		lblLogo.setIcon(new ImageIcon(_04_MiCuenta.class.getResource("/img/logo.png")));
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

		btnMiCuenta = new JButton("  MI CUENTA");
		btnMiCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		JLabel lblBarraMoverVentana = new JLabel("");
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
		btnMiCuenta.setHorizontalAlignment(SwingConstants.LEFT);
		btnMiCuenta.setFont(new Font("Britannic Bold", Font.BOLD, 25));
		btnMiCuenta.setBounds(10, 43, 260, 49);
		btnMiCuenta.setBorderPainted(false);
		btnMiCuenta.setContentAreaFilled(false);
		btnMiCuenta.setOpaque(false);
		btnMiCuenta.setFocusPainted(false);
		btnMiCuenta.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnMiCuenta.setEnabled(false);
		btnMiCuenta.setBackground(new Color(220, 220, 220));
		btnMiCuenta.setForeground(new Color(128, 128, 128));
		btnMiCuenta.setBorder(BorderFactory.createLineBorder(new Color(128, 128, 128)));
		background.add(btnMiCuenta);
		background.setComponentZOrder(btnMiCuenta, 0);

		btnVerLigas = new JButton("VER LIGAS");
		btnVerLigas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.cambiarVentana(4, 0);
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
				miControlador.cambiarVentana(4, 7);
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
				miControlador.cambiarVentana(4, 5);
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
		btnUnirseALiga.setHorizontalAlignment(SwingConstants.LEFT);
		btnUnirseALiga.setOpaque(false);
		btnUnirseALiga.setFont(new Font("Britannic Bold", Font.BOLD, 25));
		btnUnirseALiga.setFocusPainted(false);
		btnUnirseALiga.setContentAreaFilled(false);
		btnUnirseALiga.setBorderPainted(false);
		btnUnirseALiga.setBounds(10, 217, 260, 49);
		btnUnirseALiga.setCursor(new Cursor(Cursor.HAND_CURSOR));
		background.add(btnUnirseALiga);
		background.setComponentZOrder(btnUnirseALiga, 0);

		btnCrearEquipo = new JButton("CREAR EQUIPO");
		btnCrearEquipo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.cambiarVentana(4, 8);
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
				miControlador.cambiarVentana(4, 6);
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
				miControlador.cambiarVentana(4, 12);
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

		lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon(_04_MiCuenta.class.getResource("/img/fondoLogin2  - copia.jpg")));
		lblFondo.setBounds(0, 0, 283, 539);
		background.add(lblFondo);

		lblMiCuenta = new JLabel("Mi Cuenta");
		lblMiCuenta.setFont(new Font("Britannic Bold", Font.BOLD, 30));
		lblMiCuenta.setBounds(600, 40, 159, 33);
		background.add(lblMiCuenta);

		lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
		lblUsuario.setBounds(358, 140, 85, 20);
		background.add(lblUsuario);

		lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
		lblNombre.setBounds(358, 190, 85, 20);
		background.add(lblNombre);

		JLabel lblApellido1 = new JLabel("1\u00BA Apellido:");
		lblApellido1.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
		lblApellido1.setBounds(331, 240, 118, 25);
		background.add(lblApellido1);

		lblApellido2 = new JLabel("2\u00BA Apellido:");
		lblApellido2.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
		lblApellido2.setBounds(331, 290, 118, 25);
		background.add(lblApellido2);

		lblCorreo = new JLabel("Correo:");
		lblCorreo.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
		lblCorreo.setBounds(740, 190, 85, 20);
		background.add(lblCorreo);

		lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
		lblPassword.setBounds(717, 140, 101, 20);
		background.add(lblPassword);

		lblEdad = new JLabel("Edad:");
		lblEdad.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEdad.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
		lblEdad.setBounds(706, 242, 101, 20);
		background.add(lblEdad);

		txtNombre = new JTextField();
		txtNombre.setBackground(new Color(0, 128, 192));
		txtNombre.setText("Guillermo");
		txtNombre.setBounds(440, 188, 130, 30);
		background.add(txtNombre);
		txtNombre.setColumns(10);

		txtApellido1 = new JTextField();
		txtApellido1.setBackground(new Color(0, 128, 192));
		txtApellido1.setText("Callizaya");
		txtApellido1.setColumns(10);
		txtApellido1.setBounds(440, 238, 130, 30);
		background.add(txtApellido1);

		txtApellido2 = new JTextField();
		txtApellido2.setBackground(new Color(0, 128, 192));
		txtApellido2.setText("Fernandez");
		txtApellido2.setColumns(10);
		txtApellido2.setBounds(440, 288, 130, 30);
		background.add(txtApellido2);

		txtPassword = new JTextField();
		txtPassword.setBackground(new Color(0, 128, 192));
		txtPassword.setText("RosaMelano");
		txtPassword.setColumns(10);
		txtPassword.setBounds(819, 138, 155, 30);
		background.add(txtPassword);

		txtCorreo = new JTextField();
		txtCorreo.setBackground(new Color(0, 128, 192));
		txtCorreo.setText("rosamelano@utad.com");
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(819, 188, 155, 30);
		background.add(txtCorreo);

		lblUser = new JLabel("Wyllop");
		lblUser.setForeground(new Color(255, 128, 0));
		lblUser.setBackground(Color.LIGHT_GRAY);
		lblUser.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblUser.setBounds(445, 135, 196, 29);
		background.add(lblUser);

		btnCambiarDatos = new JButton("Cambiar datos");
		btnCambiarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] datos = new String[6];
				datos[0] = txtNombre.getText();
				datos[1] = txtApellido1.getText();
				datos[2] = txtApellido2.getText();
				datos[3] = txtPassword.getText();
				datos[4] = txtCorreo.getText();
				datos[5] = txtEdad.getText();
				miControlador.actualizarCuenta(datos);
			}
		});
		btnCambiarDatos.setBackground(new Color(255, 128, 0));
		btnCambiarDatos.setForeground(Color.BLACK);
		btnCambiarDatos.setFont(new Font("Britannic Bold", Font.PLAIN, 18));
		btnCambiarDatos.setBounds(811, 332, 159, 44);
		background.add(btnCambiarDatos);
		
		lblUpdate = new JLabel("");
		lblUpdate.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUpdate.setForeground(new Color(55, 255, 55));
		lblUpdate.setFont(new Font("Britannic Bold", Font.PLAIN, 13));
		lblUpdate.setBounds(685, 391, 283, 20);
		background.add(lblUpdate);
		
		txtEdad = new JTextField();
		txtEdad.setText("25");
		txtEdad.setColumns(10);
		txtEdad.setBackground(new Color(0, 128, 192));
		txtEdad.setBounds(819, 239, 155, 30);
		background.add(txtEdad);

		setLocationRelativeTo(null);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				miControlador.cargarMiCuenta();
				lblUpdate.setText("");
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

	public void actualizarDatos(String[] datos) {
		lblUser.setText(datos[0]);
		txtNombre.setText(datos[1]);
		txtApellido1.setText(datos[2]);
		txtApellido2.setText(datos[3]);
		txtPassword.setText(datos[4]);
		txtCorreo.setText(datos[5]);
		txtEdad.setText(datos[6]);
	}
	

	public void mostrarUpdateCorrecto() {
		lblUpdate.setText("Datos actualizados correctamente");
		
	}
}
