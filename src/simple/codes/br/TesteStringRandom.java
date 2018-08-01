package simple.codes.br;

import java.util.Random;

/**
 * 
 * @author edson
 *
 */
public class TesteStringRandom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 2;  
		int b = 3; 
		
		for (int i = 0; i < 5; i++) {   
			
			double c = Math.pow(a, b);               
			System.out.println("Resultado: " + c);
			a = c;
			
		}
		
		Random ramdom = new Random();
		String key = "";
		String vString[] = {"a","b","c","d","e","f","g","h","i","j","k"
				,"l","m","n","o","p","q","r","s","t","u","v","x","w","y","z"};
		System.out.println(vString.length);
		
		for (int i = 0; i < 6; i++) {
			key += vString[ramdom.nextInt(26)];		
		}
		
		System.out.println("KEY : " +key);
		
	}

}
