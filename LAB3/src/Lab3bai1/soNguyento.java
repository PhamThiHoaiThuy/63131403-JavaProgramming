package Lab3bai1;

import java.util.Scanner;

public class soNguyento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;
		boolean ok=true;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập giá trị của N: ");
		N = scanner.nextInt();
		for(int i=2; i < N-1; i++){ // N là số nhập từ bàn phím
			if(N % i == 0){
			ok = false;
			break;
			}
			i++;
		}
		if(ok == true) {
			System.out.printf("%d là số nguyên tố",N );
		
		}
		else if(ok == false){
			System.out.printf("%d không là số nguyên tố",N );

		}
	}

}
