package tinhtona;

import java.util.Scanner;

public class CongTruNhanChia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.print("Nhap so a: ");
		a = sc.nextInt();
		System.out.print("Nhap so b: ");
		b = sc.nextInt();
		System.out.print(a + " + " + b + " = " + Cong(a,b)+"\n");
		System.out.print(a + " - " + b + " = " + Tru(a,b)+"\n");
	}
	public static int Cong(int a,int b) {
		int s = a + b;
		return s;
	}
	public static int Tru(int a,int b) {
		int s = a - b;
		return s;
	}
}
