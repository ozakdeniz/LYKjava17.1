package tr.org.linux.kamp.circlesvolume;

import java.util.Scanner;

public class CirclesVolume {
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Dairenin alanını hesaplıyabilmemiz için"
				+ " bir yarıçap değeri giriniz :");
		double R = input.nextDouble();
		
		System.out.println("Alan :"+ countingVolume(R));
		
	}
	
	public static double countingVolume(double R) {
		return (4.0/3.0*Math.PI*R);
	}

}
