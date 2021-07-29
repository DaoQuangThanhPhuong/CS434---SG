package login;

import java.util.Scanner;

public class Login {
	private static void Login(String username, String password) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhap tai khoan  : ");
		String tk = ip.nextLine();
		System.out.print("Nhap mat khau : ");
		String mk = ip.nextLine();
		
		if(username.equals(tk)	 && password.equals(mk)){
			System.out.println("Dang nhap thanh cong !!!");
		}else {
			System.out.println("Dang nhap that bai !!!");
		}
	}
	
	public static void main(String[] args) {
		Login("viethoang", "hoang123");
	}
}
