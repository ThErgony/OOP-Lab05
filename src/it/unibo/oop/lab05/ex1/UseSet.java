package it.unibo.oop.lab05.ex1;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

/**
 * Example class using {@link Set}.
 * 
 */
public final class UseSet {

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         * 
         * 1) Builds a TreeSet containing Strings
         */ 
    	final Collection<String> treeSet = new TreeSet<>();
    	
         /* 2) Populates such Collection with all the Strings ranging from "1" to
         * "20"
         */
    	for (int i = 1; i < 21; i++) {
			treeSet.add(Integer.toString(i));
		}
    	
         /* 3) Prints its content
         */ 
    	System.out.println(treeSet);
    	
         /* 4) Removes all those strings whose represented number is divisible by
         * three
         */
    	var temporarySet = new TreeSet<>();
    	for (String string : treeSet) {
			if (Integer.parseInt(string) % 3 == 0) {
				temporarySet.add(string);
			}
		}
    	treeSet.removeAll(temporarySet);
    	System.out.println("temporary set\n" + temporarySet);
    	System.out.println("cyle without iterator\n" + treeSet);

    	
//    	final var iterator = treeSet.iterator();
//    	while (iterator.hasNext()) {
//    		if (Integer.parseInt(iterator.next()) % 3 == 0) {
//				iterator.remove();
//			}
//    	}
    	
         /* 5) Prints the content of the Set using a for-each costruct
         */
//    	System.out.println(treeSet);
    	
         /* 6) Verifies if all the numbers left in the set are even
         */
    	final var iterator2 = treeSet.iterator();
    	boolean allEven = true;
    	while (iterator2.hasNext()) {
			if (Integer.parseInt(iterator2.next()) % 2 == 1) {
				allEven = false;
			}	
		}
    	System.out.println("Remains items are all even? " + allEven);

    }
}
