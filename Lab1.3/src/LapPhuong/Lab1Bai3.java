/**
 * 
 */
package LapPhuong;

import java.util.Scanner;

/**
 * 
 */
public class Lab1Bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double canh, theTich;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap chieu dai canh cua hinh lap phuong: ");
		canh = scanner.nextDouble();
		theTich =Math.pow(canh,3);
		System.out.printf("The tich cua hinh: %.2f", theTich);
		
	}

}
