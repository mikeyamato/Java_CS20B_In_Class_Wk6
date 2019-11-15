package TrickOrTreat4Students.src.apps;

import java.util.Collections;

import TrickOrTreat4Students.src.houses.ArrayCollection;
import TrickOrTreat4Students.src.houses.CollectionInterface;
import TrickOrTreat4Students.src.houses.House;
import TrickOrTreat4Students.src.myProps.Basket;
import TrickOrTreat4Students.src.myProps.CandyType;
import TrickOrTreat4Students.src.myProps.MyTricks;
import TrickOrTreat4Students.src.myProps.TrickType;

public class HalloweenNight {
	
	public static void main(String[] args) {
		CollectionInterface<House> myNeighbourhood = new ArrayCollection<House>();
		myNeighbourhood.add(new House(CandyType.SNICKERS, 100));
		myNeighbourhood.add(new House(CandyType.TWIZZLERS, 20));
		myNeighbourhood.add(new House(CandyType.TWIX, 0));
		myNeighbourhood.add(new House(CandyType.SWEDISH_FISH, 130));
		myNeighbourhood.add(new House(CandyType.REESES_PIECES, 50));
		
		Basket myBasket = new Basket();
		TrickType myTrickType = TrickType.THROWEGGS;
		
		//We want to sort our neighbourhood houses based on our estimate of candy the houses have
		//Maybe we can order in ascending order - houses having more candy can be visited towards the end
		//because it's unlikely they will run out of candy later in the evening
		
		//For that reason you need to make sure to specify how Houses are ordered by my estimate of candies they give
		myNeighbourhood.sort(); //I provided sort for you //However it will not work if your Houses don't know how to compare
		//themselves
		// Collections.sort(myNeighbourhood);  // this will not work because sort expects a List. alt make a list out of my collection.
		System.out.println(myNeighbourhood); //toString() provided for you
		
		//Let's start trick or treat by using the for-each loop from Iterable
//		for(House h: myNeighbourhood) { //You need to make this work!
//			CandyType c  = h.trickOrTreat(); //provided for you
//			if(c == null) {
//				h.trick(myTrickType); //provided for you
//				System.out.println("You just got tricked by my famous " + myTrickType + " trick. ");
//				System.out.println(MyTricks.getMyTrick()); //provided for you
//
//			}
//			else {
//				myBasket.addCandy(c); //You need to implement
//			}
//		}
//		System.out.println(myBasket); //You need to implement toString()
//		System.out.println(MyTricks.getMyProp()); //provided for you
	}

}
