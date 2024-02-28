package TH1_formlogin;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Login extends JFrame {

    private JPanel contentPane;
    private JTextField textFieldUsername;
    private JPasswordField passwordField;

    /**
     * Create the frame.
     */
    public Login() {
        setTitle("ĐĂNG NHẬP HỆ THỐNG QUẢN LÝ BÁN HÀNG");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 488, 271);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        textFieldUsername = new JTextField();
        textFieldUsername.setBounds(150, 33, 150, 20);
        contentPane.add(textFieldUsername);
        textFieldUsername.setColumns(10);

        passwordField = new JPasswordField();
        passwordField.setBounds(150, 73, 150, 20);
        contentPane.add(passwordField);

        JLabel lblUsername = new JLabel("Tên đăng nhập:");
        lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblUsername.setBounds(20, 30, 138, 20);
        contentPane.add(lblUsername);

        JLabel lblPassword = new JLabel("Mật khẩu:");
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblPassword.setBounds(20, 73, 106, 20);
        contentPane.add(lblPassword);

        JButton btnLogin = new JButton("Đăng nhập");
        btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnLogin.setBounds(110, 110, 150, 30);
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	Xulydangnhap();
            }
        });
        contentPane.add(btnLogin);
    }
    public void Xulydangnhap() {		
		String ten = textFieldUsername.getText().toString();	
		String mk = passwordField.getText().toString();
		if(ten.equals("63CNTT")&& mk.equals("123")) {
			HomeFram f = new HomeFram();
			f.setVisible(true);
			this.setVisible(false);
		
		}
		else {
			JOptionPane hopThoai = new JOptionPane();
			hopThoai.showMessageDialog(this, "Đăng nhập không thành công.");
				textFieldUsername.setText("");
	            passwordField.setText("");
		}
	}
}