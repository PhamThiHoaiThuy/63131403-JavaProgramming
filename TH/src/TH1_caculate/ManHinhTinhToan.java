package TH1_caculate;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txta;
	private JTextField txtb;
	private JTextField txtKetQua;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public ManHinhTinhToan() {
		setTitle("CHƯƠNG TRÌNH TÍNH TOÁN ĐƠN GIẢN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 544, 367);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập a");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(64, 70, 93, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpB = new JLabel("Nhập b");
		lblNhpB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpB.setBounds(64, 130, 93, 20);
		contentPane.add(lblNhpB);
		
		txta = new JTextField();
		txta.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txta.setBounds(179, 73, 161, 26);
		contentPane.add(txta);
		txta.setColumns(10);
		
		txtb = new JTextField();
		txtb.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtb.setColumns(10);
		txtb.setBounds(179, 130, 161, 26);
		contentPane.add(txtb);
		
		JButton btnCong = new JButton("Cộng");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code xu li cong
				HamXuLiCong();
				
			}
		});
		btnCong.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCong.setBounds(50, 196, 85, 29);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("Trừ");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLiTru();
			}
		});
		btnTru.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTru.setBounds(166, 196, 85, 29);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("Nhân");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLiNhan();
			}
		});
		btnNhan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNhan.setBounds(275, 196, 85, 29);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("Chia");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLiChia();
			}
		});
		btnChia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnChia.setBounds(392, 196, 85, 29);
		contentPane.add(btnChia);
		
		txtKetQua = new JTextField();
		txtKetQua.setEnabled(false);
		txtKetQua.setEditable(false);
		txtKetQua.setBounds(254, 266, 211, 25);
		contentPane.add(txtKetQua);
		txtKetQua.setColumns(10);
		
		JLabel lblKtQuTrnh = new JLabel("Kết quả trính toán");
		lblKtQuTrnh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKtQuTrnh.setBounds(66, 266, 161, 22);
		contentPane.add(lblKtQuTrnh);
	}
	void HamXuLiCong() {
		String stra = txta.getText();
		String strb = txtb.getText();
		double soA = Double.parseDouble(stra);
		double soB = Double.parseDouble(strb);
		
		double tong = soA+soB;
		
		//hiển thị kq
		txtKetQua.setText(String.valueOf(tong));
	}
	void HamXuLiTru() {
		String stra = txta.getText();
		String strb = txtb.getText();
		double soA = Double.parseDouble(stra);
		double soB = Double.parseDouble(strb);
		
		double tong = soA-soB;
		
		//hiển thị kq
		txtKetQua.setText(String.valueOf(tong));
	}
	void HamXuLiNhan() {
		String stra = txta.getText();
		String strb = txtb.getText();
		double soA = Double.parseDouble(stra);
		double soB = Double.parseDouble(strb);
		
		double tong = soA*soB;
		
		//hiển thị kq
		txtKetQua.setText(String.valueOf(tong));
	}
	void HamXuLiChia() {
		String stra = txta.getText();
		String strb = txtb.getText();
		double soA = Double.parseDouble(stra);
		double soB = Double.parseDouble(strb);
		
		double tong = soA/soB;
		
		//hiển thị kq
		txtKetQua.setText(String.valueOf(tong));
	}

}
