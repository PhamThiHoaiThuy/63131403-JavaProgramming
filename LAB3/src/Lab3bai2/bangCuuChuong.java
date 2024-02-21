package Lab3bai2;

import java.util.Scanner;

public class bangCuuChuong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int x;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập bảng cửu chương cần tính");
		x = scanner.nextInt();
		for(int i= 1; i<=10; i++) {
			System.out.printf("%d * %d = %d", x,i,x*i);
			System.out.println();
		}*/
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=10; j++) {
				System.out.printf("%d * %d = %d", i, j, i*j);
				System.out.println();
			}
		}
	}

}
