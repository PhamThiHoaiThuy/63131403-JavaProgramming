/**
 * 
 */
package Lab2Bai2;

import java.util.Scanner;

/**
 * 
 */
public class PTbac2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c,delta,x;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap he so a");
		a = scanner.nextDouble();
		System.out.print("Nhap he so b");
		b = scanner.nextDouble();
		System.out.print("Nhap he so c");
		c = scanner.nextDouble();
		
		if(a == 0) {
			if(b == 0) {
				if(c == 0) {
					System.out.print("Phuong trinh vo so nghiem");
				}
				else {
					System.out.print("Phuong trinh vo nghiem");
				}
			}
			else {
				System.out.printf("Nghiem cua phuong trinh la: %f", -c/b);
			}
		}else {
			delta = Math.pow(b,2)-4*a*c;
			if(delta < 0) {
				System.out.print("Phuong trinh vo nghiem");
			}
			if(delta == 0) {
				System.out.printf("Phuong trinh co nghiem kep: %.2f", -b/(2*a));
			}
			if(delta > 0) {
				System.out.printf("Nghiem cua phuong trinh x1: %.2f, x2: %.2f",(-b+Math.sqrt(delta))/(2*a),(-b-Math.sqrt(delta))/(2*a));
			}
		}
				
	}
	

}
