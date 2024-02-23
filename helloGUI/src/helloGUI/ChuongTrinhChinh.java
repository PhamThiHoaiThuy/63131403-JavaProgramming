package helloGUI;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class ChuongTrinhChinh {

	public static void main(String[] args) {
		JFrame f = new JFrame();//tạo một thể hiện(đối tượng) của lớp
		f.setTitle("V i du JFram");//tiêu đề cửa sổ 
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.setSize(300,200);//kích thước cửa sổ
		//quy định loại bố cục
		 f.setLayout(new FlowLayout());
		//tạo một nút bấm
		JButton btnOK = new JButton("Nhấn tôi");
		JButton btnko = new JButton("Nhấn ");

		//gắn lên form
		f.add(btnOK);
		f.add(btnko);

		f.show();//hiển thị cửa sổ
	}

}
