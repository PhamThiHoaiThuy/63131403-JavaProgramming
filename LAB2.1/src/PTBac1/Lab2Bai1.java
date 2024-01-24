/**
 * 
 */
package PTBac1;

import java.util.Scanner;

/**
 * 
 */
public class Lab2Bai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap he so a: ");
		a = scanner.nextInt();
		System.out.print("Nhap he so b: ");
		b = scanner.nextInt();
		
		if(a == 0) {
			if(b == 0) {
				System.out.print("Phuong trinh vo so nghiem");
			}
			else {
				System.out.print("Phuong trinh vo nghiem");
			}
		}
		else {
			System.out.printf("Nghiem cua phuong trinh la: %.2f",-b/a);
		}
	}

}
