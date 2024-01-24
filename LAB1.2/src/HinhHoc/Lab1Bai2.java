/**
 * 
 */
package HinhHoc;

import java.util.Scanner;

/**
 * 
 */
public class Lab1Bai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dai, rong;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap chieu dai: ");
		dai = scanner.nextDouble();
		System.out.print("Nhap chieu rong: ");
		rong = scanner.nextDouble();
		
		double chuVi, dienTich;
		chuVi = (dai+rong)*2;
		dienTich = dai*rong;
		System.out.printf("Chu vi cua HCN: %.2f", chuVi);
		System.out.printf("Dien tich cua HCN: %.2f", dienTich);
		System.out.printf("Canh nho nhat cua HCN: %.2f", Math.min(dai, rong));


	}

}
