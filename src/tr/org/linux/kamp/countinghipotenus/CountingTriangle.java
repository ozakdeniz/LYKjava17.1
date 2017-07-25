package tr.org.linux.kamp.countinghipotenus;

import java.util.Scanner;

public class CountingTriangle {
	
	public static double countingHipo(double a, double b) {	
		return Math.hypot(a,b);
	
	}
	
	public static double countingPerimeter(double a, double b) {
		return (a+b+countingHipo(a,b));
	}
	
	public static double countingArea(double a, double b) {
		return (a*b)/2 ;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Dik üçgenin hipotenüs alan ve çevre hesaplarını"
				+ " yapabilmek için iki kenar uzunluğu giriniz :");
		double a = input.nextDouble();
		double b = input.nextDouble();
		
		
		System.out.println("Üçgenin hipotenüsü :"+ countingHipo(a, b));
		System.out.println("Üçgenin çevresi :" + countingPerimeter(a, b));
		System.out.println("Üçgenin alanı :" + countingArea(a, b));
	}
	


}
