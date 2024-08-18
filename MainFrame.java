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
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.SpringLayout;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textFieldSenha;
	private JTextField textFieldUsuario;
	private JLabel lblLogin;
	private JLabel lblSenha;
	private JLabel lblUsuarioNovo;
	private JLabel lblImg;
	private JPanel contentLogin;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setBounds(100, 100, 691, 915);
		setExtendedState(MAXIMIZED_BOTH);
		contentLogin = new JPanel();
		contentLogin.setPreferredSize(new Dimension(1920, 1080));
		contentLogin.setSize(WIDTH, HEIGHT);
		contentLogin.setFont(new Font("SansSerif", Font.BOLD, 32));
		contentLogin.setBackground(new Color(219, 234, 212));
		contentLogin.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		contentLogin.setBorder(new EmptyBorder(0, 0, 0, 0));

		setContentPane(contentLogin);
		contentLogin.setLayout(null);
		
		lblLogin = new JLabel("Login");
		lblLogin.setBounds(908, 323, 106, 52);
		lblLogin.setForeground(new Color(46, 63, 32));
		lblLogin.setFont(new Font("SansSerif", Font.BOLD, 40));
		contentLogin.add(lblLogin);
		
		lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(712, 565, 106, 42);
		lblSenha.setForeground(new Color(46, 63, 32));
		lblSenha.setFont(new Font("SansSerif", Font.BOLD, 32));
		contentLogin.add(lblSenha);
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setFont(new Font("SansSerif", Font.PLAIN, 24));
		textFieldUsuario.setBounds(712, 485, 495, 52);
		contentLogin.add(textFieldUsuario);
		textFieldUsuario.setColumns(10);
		
		textFieldSenha = new JTextField();
		textFieldSenha.setBounds(712, 621, 495, 60);
		textFieldSenha.setFont(new Font("SansSerif", Font.PLAIN, 24));
		contentLogin.add(textFieldSenha);
		textFieldSenha.setColumns(10);
		
		Button buttonEntrar = new Button("Entrar");
		buttonEntrar.setBounds(712, 744, 495, 60);
		buttonEntrar.setForeground(new Color(125, 188, 139));
		buttonEntrar.setBackground(new Color(8, 71, 22));
		buttonEntrar.setFont(new Font("SansSerif", Font.BOLD, 32));
		buttonEntrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentLogin.add(buttonEntrar);
		
		lblUsuarioNovo = new JLabel("Usuário novo?");
		lblUsuarioNovo.setBounds(712, 851, 222, 42);
		lblUsuarioNovo.setForeground(new Color(46, 63, 32));
		lblUsuarioNovo.setFont(new Font("SansSerif", Font.BOLD, 32));
		contentLogin.add(lblUsuarioNovo);
		
		JLabel lblUsuario_1 = new JLabel("Usuário:");
		lblUsuario_1.setBounds(712, 431, 129, 42);
		lblUsuario_1.setForeground(new Color(46, 63, 32));
		lblUsuario_1.setFont(new Font("SansSerif", Font.BOLD, 32));
		contentLogin.add(lblUsuario_1);
		
		Button buttonCadastrese = new Button("Cadastre-se");
		buttonCadastrese.setBounds(940, 851, 222, 42);
		buttonCadastrese.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MainFrame2().setVisible(true);
			}
		});
		buttonCadastrese.setForeground(new Color(125, 188, 139));
		buttonCadastrese.setFont(new Font("SansSerif", Font.BOLD, 32));
		buttonCadastrese.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		buttonCadastrese.setBackground(new Color(8, 71, 22));
		contentLogin.add(buttonCadastrese);
		
		lblImg = new JLabel("New label");
		lblImg.setBounds(908, 183, 100, 100);
		lblImg.setIcon(new ImageIcon("C:\\Users\\GIH\\Pictures\\Imagens Java\\snake 1.png"));
		contentLogin.add(lblImg);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblLogin, contentLogin, lblUsuario_1, buttonCadastrese, lblImg}));
	}

	public Color getLblUsuarioForeground() {
		return lblSenha.getForeground();
	}
	public void setLblUsuarioForeground(Color foreground) {
		lblSenha.setForeground(foreground);
	}
}
