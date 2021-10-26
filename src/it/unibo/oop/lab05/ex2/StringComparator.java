package it.unibo.oop.lab05.ex2;

import java.util.Comparator;

public class StringComparator implements Comparator<String>{

	
	public int compare(final String o1, final String o2) {
		return Double.compare(Double.parseDouble(o2), Double.parseDouble(o1));
	}

}
