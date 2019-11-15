package ch06.mike;

import java.util.Iterator;
import java.util.ArrayList;

public class MikeIterator {


    public static void main (String[] args){
        ArrayList<String> strings = new ArrayList<String>();

        // alpha, gamma, beta, delta
        strings.add("alpha");
        strings.add("gamma");
        strings.add("beta");
        strings.add("delta");

        Iterator<String> iter = strings.iterator();
        String hold;
        while (iter.hasNext()){
            hold = iter.next();
        if(hold.equals("gamma"))
            iter.remove();
        else
            System.out.println(hold);
        }

        // for loop
    }


}
