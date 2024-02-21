/**
 * 
 */
package Lab2Bai4;

import java.util.Scanner;

/**
 * 
 */
public class menu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int choice;
		do {
			Menu();
			System.out.print("Chọn chức năng: ");
			choice = scanner.nextInt();
			switch(choice) {
			case 1:
				PTBac1();
				break;
			case 2:
				PTBac2();
				break;
			case 3:
				TienDien();
				break;
			case 4:
				System.out.println("Kết thúc chương trình");
			default:
				System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại");
			}
		}while (choice != 4);
	}
	public static void Menu() {
        System.out.println("---------------------------------");
        System.out.println("1. Giải phương trình bậc 1");
        System.out.println("2. Giải phương trình bậc 2");
        System.out.println("3. Tính tiền điện");
        System.out.println("4. Kết thúc");
        System.out.println("---------------------------------");
    
	}
	public static void PTBac1() {
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
			System.out.printf("Nghiem cua phuong trinh la: %.2f",(float)-b/a);
		}
		
	}
	public static void PTBac2() {
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
	public static void TienDien() {
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
