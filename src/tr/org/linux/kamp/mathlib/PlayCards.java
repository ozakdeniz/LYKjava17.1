package tr.org.linux.kamp.mathlib;

import java.util.Random;

public class PlayCards {


	    private static Random rgen = new Random();//rastgele birşey atıyabilmemizi sağlar

	    public static void main(String[] args) {
	        System.out.println(chooseRandomCard());
	    }

	    /* Returns the name of a randomly chosen card */
	    private static String chooseRandomCard() {
	        return chooseRandomSuit() + " " + chooseRandomRank();
	    }

	    /* Returns the name of a randomly chosen rank (Ace to King) */
	 /* As,2,3,4,5,6,7,8,9,Vale,Kız,Papaz */
	    private static String chooseRandomRank() {
	        // Your code starts here
	        int randomNumber = rgen.nextInt(13) + 1; //sayıları random seçebilmemizi sağladı
	        if (randomNumber > 1 && randomNumber <= 10) { //sayıları caselerle uzatmadan if le tanımladık
	            return "" + randomNumber;
	        } else {  // sayıları seçmediği durumu tanımlamak için else ile caselere bağlıyoruz
	            switch (randomNumber) {
	                case 1:
	                    return "As"; // sayıları string olarak girdirebildik
	                case 11:
	                    return "Vale";
	                case 12:
	                    return "Kız";
	                case 13:
	                    return "Papaz";
	                default:
	                    return "Hata";
	            }
	        }
	        // Your code ends here
	    }

	    /* Returns the name of a randomly chosen suit (Clubs to Spades) */
	 /* Karo, Maça, Sinek, Kupa */
	    private static String chooseRandomSuit() {
	        // Your code starts here
	        int randomNumber = rgen.nextInt(4);//dört durumdan birini rastgele seçmemizi sağladı
	        switch (randomNumber) {
	            case 0:
	                return "Maça";
	            case 1:
	                return "Kupa";
	            case 2:
	                return "Karo";
	            case 3:
	                return "Sinek";
	            default:
	                return "Hata";
	        }

	        // Your code ends here
	    }
	}
