package tr.org.linux.kamp.dicegame;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {

	    private static Random rgen = new Random();
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);//kullanıcıdan girdi alıcağımız için kullanıyoruz
	        
	        System.out.println("Oyuncu 1 isminizi giriniz:");//kullanıcıya girmesi gereken girdiyi belirtiyoruz
	        String user1 = sc.next();//girdinin türünü belirliyoruz
	        
	        System.out.println("Oyuncu 2 isminizi giriniz:");//kullanıcıya girmesi gereken girdiyi belirtiyoruz
	        String user2 = sc.next();//girdinin türünü belirliyoruz
	        
	        int dice1 = roll();//fonksiyonu kullsnıyoruz
	        int dice2 = roll();
	        
	        System.out.println(user1+ "'in attığı zar: " + dice1);
	        System.out.println(user2+ "'in attığı zar:" + dice2);
	        String winner = "";
	        /*if(dice1 > dice2){
	            winner = user1;
	        }
	        else if(dice1==dice2){
	            winner = "Berabere";
	        }
	        else{
	            winner = user2;
	        }*/
	        
	        winner = (dice1 > dice2) ? user1 : (dice1 == dice2) ? "Berabere" : user2; 
	        /*if,else if, else yerine kullanılabilen bir kısayoldur ? koşula uyup
	        uymadığını kontrol ettirir*/
	        
	        System.out.println("Kazanan:" + winner);
	        
	    }
	    
	    public static int roll(){//fonksiyonu tanımlıyoruz
	        return rgen.nextInt(6)+1;       
	    }
	}
