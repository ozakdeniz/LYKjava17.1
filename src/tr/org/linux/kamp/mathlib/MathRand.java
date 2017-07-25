package tr.org.linux.kamp.mathlib;

import java.util.Random;

public class MathRand {
	
	public static void main(String[] args) {
		
		System.out.println("Math Random :"+Math.random());
		Random rgen = new Random();
		//parantezin içini bir sayıyla doldurursak random bozulur aynı sayıyı vermeye başlar
		
		System.out.println("Rgen random next int :"+ rgen.nextInt());
		
		Random rgen2 = new Random();
		//ikisininde parantezi aynı sayıyla doluysa aynı sayıyı dönerler 
		//birininki farklıysa yine farklı sayıları devamlı dönerler
		System.out.println("Rgen2 random next int :"+ rgen2.nextInt());
		
		
		System.out.println("Rgen random next double :"+ rgen.nextDouble());
		System.out.println("Rgen random next boolean :"+ rgen.nextBoolean());
		System.out.println("Rgen random next float :"+ rgen.nextFloat());
		System.out.println("Rgen random next long :"+ rgen.nextLong());
		
		int result = rgen.nextInt(3)+8;
		System.out.println("Rgen random next int beetween 8-10 :"+ result);
		
		
	}
	
	

}


//her komut için kütüphane random bir sayı atıyacak..