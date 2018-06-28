package simple.codes.br;
import java.util.ArrayList;
import java.util.Random;

/**
 * 
 * @author edson
 *
 */
public class ArrayWithoutRepetition {
	
	private static ArrayList<Integer> items = new ArrayList<Integer>();

    private static Random rand = new Random();

    public static void getRandArrayElement(){
    	
    	while(items.size() < 6) {
    		
    		Integer number = rand.nextInt(60);
    		
    		if(!items.contains(number)) {
    		
    		items.add(number);
    		
    		}
    		
    		
		}

    	
    }
    
    public static void main(String[] args) {
    	
    	getRandArrayElement();
    	
    	for (int i = 0; i < items.size(); i++) {
    		System.out.println(items.get(i));
		}
    }
    
    public static ArrayList<Integer> getItems() {
  		return items;
  	}

  	public static void setItems(ArrayList<Integer> items) {
  		ArrayWithoutRepetition.items = items;
  	}

}