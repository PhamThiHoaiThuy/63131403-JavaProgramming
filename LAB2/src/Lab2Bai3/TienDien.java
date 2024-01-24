/**
 * 
 */
package Lab2Bai3;

import java.util.Scanner;

/**
 * 
 */
public class TienDien {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double soDien;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so dien can tinh: ");
		soDien = scanner.nextDouble();
		 if(0 <= soDien && soDien<=50)
			 System.out.printf("So tien can thanh toan la: %.2f", soDien*1000);
		 if(soDien > 50)
			 System.out.printf("So tien can thanh toan la: %.2f", soDien*1200);
		 
		
	}

}
