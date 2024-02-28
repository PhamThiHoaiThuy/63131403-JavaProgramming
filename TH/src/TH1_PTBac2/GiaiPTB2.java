package TH1_PTBac2;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GiaiPTB2 {

    private JFrame frmPhngTrnhBc;
    private JTextField txA;
    private JTextField txB;
    private JTextField txC;
    private JTextField txtKetQua;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GiaiPTB2 window = new GiaiPTB2();
                    window.frmPhngTrnhBc.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public GiaiPTB2() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmPhngTrnhBc = new JFrame();
        frmPhngTrnhBc.setTitle("PHƯƠNG TRÌNH BẬC 2");
        frmPhngTrnhBc.getContentPane().setForeground(new Color(255, 0, 0));
        frmPhngTrnhBc.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 20));
        frmPhngTrnhBc.setBounds(100, 100, 790, 468);
        frmPhngTrnhBc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmPhngTrnhBc.getContentPane().setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setForeground(new Color(0, 0, 0));
        panel.setBounds(20, 36, 756, 304);
        frmPhngTrnhBc.getContentPane().add(panel);
        panel.setBorder(null); 
        panel.setLayout(null);
        
        JLabel lblNewLabel_1 = new JLabel("Nhập a:");
        lblNewLabel_1.setBackground(new Color(0, 128, 0));
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel_1.setBounds(117, 28, 99, 25);
        panel.add(lblNewLabel_1);
        
        JLabel lblNewLabel_1_1 = new JLabel("Nhập b:");
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel_1_1.setBounds(117, 81, 99, 25);
        panel.add(lblNewLabel_1_1);
        
        JLabel lblNewLabel_1_2 = new JLabel("Nhập c:");
        lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel_1_2.setBounds(117, 128, 99, 25);
        panel.add(lblNewLabel_1_2);
        
        txA = new JTextField();
        txA.setBounds(351, 29, 337, 31);
        panel.add(txA);
        txA.setColumns(10);
        
        txB = new JTextField();
        txB.setColumns(10);
        txB.setBounds(351, 82, 337, 31);
        panel.add(txB);
        
        txC = new JTextField();
        txC.setColumns(10);
        txC.setBounds(351, 129, 337, 31);
        panel.add(txC);
        
        JLabel lblNewLabel_2 = new JLabel("Kết quả");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel_2.setBounds(189, 190, 99, 25);
        panel.add(lblNewLabel_2);
        
        txtKetQua = new JTextField();
        txtKetQua.setForeground(new Color(0, 0, 0));
        txtKetQua.setBounds(351, 191, 337, 30);
        txtKetQua.setBorder(new LineBorder(new Color(176, 224, 230)));
        panel.add(txtKetQua);
        txtKetQua.setColumns(10);
        
        JButton btnGii = new JButton("Giải ");
        btnGii.setBounds(300, 243, 116, 37);
        panel.add(btnGii);
        btnGii.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                XuLyGiaiPTB2();
            }
        });
        btnGii.setFont(new Font("Tahoma", Font.PLAIN, 18));
    }

    void XuLyGiaiPTB2() {
        double a = Double.parseDouble(txA.getText());
        double b = Double.parseDouble(txB.getText());
        double c = Double.parseDouble(txC.getText());
        double del = b * b - 4 * a * c;
        if (del > 0) {
            double x1 = (-b + Math.sqrt(del)) / (2 * a);
            double x2 = (-b - Math.sqrt(del)) / (2 * a);
            txtKetQua.setText("x1 = " + x1 + " và x2 = " + x2);
        } else if (del == 0) {
            double x = -b / (2 * a);
            txtKetQua.setText("x = " + x);
        } else {
            txtKetQua.setText("Phương trình không có nghiệm");
        }
    }
}