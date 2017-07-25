package tr.org.linux.kamp.montecarlomethod;

import java.util.Random;

public class MonteCarlo {
	private static Random rgen = new Random();
	
	public static void main(String[] args) {
		
		int dartCount = 1000;
		int insideCount = 0;
		for(int i = 0 ; i< dartCount; i++) {
			if(isInCircle(getPoint(), getPoint())){		//tanımlanan fonksiyonları kullandı
				insideCount++;
			}
		}
		
		double pi = 4* (insideCount*1.0/dartCount);
		System.out.println(pi);
	}
	public static double getPoint() {		//getPointi tanımladı(1)
		return (2*rgen.nextDouble())-1;/*nextdouble 0 ile 1 aralığında tanımlıdır iki ile çarpıp o ile
		2 aralığına çıkardı ve 1 çıkardığında da -1 ile 1 aralığında tanımlı olmuş oldu peki neden böyle
		yaptı? */
	}
	
	public static boolean isInCircle(double x, double y) {		//isInCircle ı tanımladı(2)
		return Math.pow(x, 2)+ Math.pow(y, 2) < 1;
	}
	
}

/*monte carlo bir dörtgenin içine yerleştirilmiş dairenden bahseder ve dörtgene ne kadar çok
 dart atarsak daireyi tarama şansıda o kadar artar bu durumda daireye atılan dart sayısıyla 
 toplam dart sayısının oranı pi sayısını verir yani dörtgenle dairenin alanları oranı
 da pi sayısını verir mantığı buymuş*/
