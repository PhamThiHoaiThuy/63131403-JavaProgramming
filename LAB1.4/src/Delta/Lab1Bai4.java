/**
 * 
 */
package Delta;

import java.util.Scanner;

/**
 * 
 */
public class Lab1Bai4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c;
		double delta;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap he so a: ");
		a = scanner.nextDouble();
		System.out.print("Nhap he so b: ");
		b = scanner.nextDouble();
		System.out.print("Nhap he so c: ");
		c = scanner.nextDouble();
		
		delta = Math.pow(b,2) -(4*a*c);
		System.out.printf("Can delta la: %.2f", Math.sqrt(delta));
	}

}
