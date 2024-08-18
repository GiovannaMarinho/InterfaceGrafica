import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.TextField;
import java.awt.Panel;
import java.awt.Button;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Rectangle;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentLogin;
	private JTextField textFieldSenha;
	private JTextField textFieldUsuario;
	private JLabel lblLogin;
	private JLabel lblSenha;
	private JLabel lblUsuarioCadastrado;
	private JLabel lblImg;
	private JTextField textFieldConfirmeSenha;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame2 frame = new MainFrame2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public MainFrame2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 691, 945);
		setExtendedState(MAXIMIZED_BOTH);
		contentLogin = new JPanel();
		contentLogin.setPreferredSize(new Dimension(1920, 1080));
		contentLogin.setAlignmentY(Component.TOP_ALIGNMENT);
		contentLogin.setFont(new Font("SansSerif", Font.BOLD, 32));
		contentLogin.setBackground(new Color(219, 234, 212));
		contentLogin.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

		setContentPane(contentLogin);
		contentLogin.setLayout(null);
		
		lblLogin = new JLabel("Cadastra-se");
		lblLogin.setBounds(837, 252, 232, 52);
		lblLogin.setForeground(new Color(46, 63, 32));
		lblLogin.setFont(new Font("SansSerif", Font.BOLD, 40));
		contentLogin.add(lblLogin);
		
		lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(712, 499, 106, 42);
		lblSenha.setForeground(new Color(46, 63, 32));
		lblSenha.setFont(new Font("SansSerif", Font.BOLD, 32));
		contentLogin.add(lblSenha);
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setFont(new Font("SansSerif", Font.PLAIN, 24));
		textFieldUsuario.setLocation(712, 419);
		textFieldUsuario.setSize(495, 52);
		contentLogin.add(textFieldUsuario);
		textFieldUsuario.setColumns(10);
		
		textFieldSenha = new JTextField();
		textFieldSenha.setBounds(712, 558, 495, 60);
		textFieldSenha.setFont(new Font("SansSerif", Font.PLAIN, 24));
		contentLogin.add(textFieldSenha);
		textFieldSenha.setColumns(10);
		
		Button buttonEntrar = new Button("Entrar");
		buttonEntrar.setBounds(712, 817, 495, 60);
		buttonEntrar.setForeground(new Color(125, 188, 139));
		buttonEntrar.setBackground(new Color(8, 71, 22));
		buttonEntrar.setFont(new Font("SansSerif", Font.BOLD, 32));
		buttonEntrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentLogin.add(buttonEntrar);
		
		lblUsuarioCadastrado = new JLabel("Já está cadastrado?");
		lblUsuarioCadastrado.setBounds(712, 927, 316, 42);
		lblUsuarioCadastrado.setForeground(new Color(46, 63, 32));
		lblUsuarioCadastrado.setFont(new Font("SansSerif", Font.BOLD, 32));
		contentLogin.add(lblUsuarioCadastrado);
		
		JLabel lblUsuario = new JLabel("Usuário:");
		lblUsuario.setForeground(new Color(46, 63, 32));
		lblUsuario.setFont(new Font("SansSerif", Font.BOLD, 32));
		lblUsuario.setBounds(712, 360, 129, 42);
		contentLogin.add(lblUsuario);
		
		Button buttonLogin = new Button("Login");
		buttonLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MainFrame().setVisible(true);
			}
		});
		buttonLogin.setForeground(new Color(125, 188, 139));
		buttonLogin.setFont(new Font("SansSerif", Font.BOLD, 32));
		buttonLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		buttonLogin.setBackground(new Color(8, 71, 22));
		buttonLogin.setBounds(1034, 927, 173, 42);
		contentLogin.add(buttonLogin);
		
		lblImg = new JLabel("New label");
		lblImg.setIcon(new ImageIcon("C:\\Users\\GIH\\Pictures\\Imagens Java\\snake 1.png"));
		lblImg.setBounds(908, 112, 100, 100);
		contentLogin.add(lblImg);
		
		textFieldConfirmeSenha = new JTextField();
		textFieldConfirmeSenha.setFont(new Font("SansSerif", Font.PLAIN, 24));
		textFieldConfirmeSenha.setColumns(10);
		textFieldConfirmeSenha.setBounds(712, 697, 495, 60);
		contentLogin.add(textFieldConfirmeSenha);
		
		JLabel lblConfirmeSenha = new JLabel("Confirme a senha:");
		lblConfirmeSenha.setForeground(new Color(46, 63, 32));
		lblConfirmeSenha.setFont(new Font("SansSerif", Font.BOLD, 32));
		lblConfirmeSenha.setBounds(712, 638, 285, 42);
		contentLogin.add(lblConfirmeSenha);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblLogin, contentLogin, lblUsuario, buttonLogin, lblImg, textFieldConfirmeSenha, lblConfirmeSenha}));
	}

	public Color getLblUsuarioForeground() {
		return lblSenha.getForeground();
	}
	public void setLblUsuarioForeground(Color foreground) {
		lblSenha.setForeground(foreground);
	}
}
