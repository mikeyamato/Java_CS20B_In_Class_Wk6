package TrickOrTreat4Students.src.myProps;
import java.util.ArrayList;
import java.util.List;
import TrickOrTreat4Students.src.houses.House;

/**
 * This represents my Basket in which I can add candy as I visit the houses
 * @author irma
 *
 * @param <TrickOrTreat>
 */
public class Basket {
	List<CandyType> basket;
	
	public Basket() {
		this.basket = new ArrayList<CandyType>();
	}
	
	public void addCandy(CandyType c) {
		
	}
	
	
	public String toString() {
		String res = "";
		for(CandyType c : basket) {
			res += c + "(㇏(•̀ᵥᵥ•́)ノ)";
		}
		return res;
	}

}
