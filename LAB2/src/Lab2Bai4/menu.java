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
				PTBac1(scanner);
				break;
			case 2:
				PTBac2(scanner);
				break;
			case 3:
				TienDien(scanner);
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

}
