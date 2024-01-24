/**
 * 
 */
package demo2;

import java.util.Scanner;

/**
 * 
 */
public class tbcong {

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
		System.out.print("Nhập giá trị c: ");
		c = scanner.nextInt();
		
		System.out.printf("Trung bình cộng của a,b,c là: %.2f", (a*2+b+c)/3);
	}

}
