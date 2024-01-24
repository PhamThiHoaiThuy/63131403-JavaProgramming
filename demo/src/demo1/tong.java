/**
 * 
 */
package demo1;

import java.util.Scanner;

/**
 * 
 */
public class tong {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập giá trị a: ");
		a = scanner.nextInt();
		System.out.print("Nhập giá trị b: ");
		b = scanner.nextInt();
		c = a+b;
		System.out.printf("Tong a + b = %d", c);
	}

}
