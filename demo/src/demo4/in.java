/**
 * 
 */
package demo4;

import java.util.Scanner;

/**
 * 
 */
public class in {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hoTen;
		int tuoi;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập họ tên của bạn: ");
		hoTen = scanner.nextLine();
		System.out.print("Nhập tuổi của bạn: ");
		tuoi = scanner.nextInt();
		System.out.printf("%s năm nay %d tuổi",hoTen,tuoi);
	}

}
