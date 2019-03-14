package com.expr.brule.newtests;

import java.util.ArrayList;
import java.util.List;

public class TestPattern {

	public TestPattern() {
	}

	public static void main(String[] args) {

		String start = "<";
		String stop = ">";
		String escape = "\\";
		
		String pattern="<LEFTPAREN> <LEFTPAREN> <LEFTPAREN> <VARIABLE> <GT> 200000.00<RIGHTPAREN> AND <LEFTPAREN> IND1 = Y<RIGHTPAREN> <RIGHTPAREN> or <LEFTPAREN> ind1 = Y <RIGHTPAREN> <RIGHTPAREN>";
		
		int p = 0;
		int n = pattern.length();
		//List<Chunk> chunks = new ArrayList<Chunk>();
		StringBuilder buf = new StringBuilder();
		// find all start and stop indexes first, then collect
		List<Integer> starts = new ArrayList<Integer>();
		List<Integer> stops = new ArrayList<Integer>();
		while ( p<n ) {
			if ( p == pattern.indexOf(escape+start,p) ) {
				p += escape.length() + start.length();
			}
			else if ( p == pattern.indexOf(escape+stop,p) ) {
				p += escape.length() + stop.length();
			}
			else if ( p == pattern.indexOf(start,p) ) {
				starts.add(p);
				p += start.length();
			}
			else if ( p == pattern.indexOf(stop,p) ) {
				stops.add(p);
				p += stop.length();
			}
			else {
				p++;
			}
		}

//		System.out.println("");
		System.out.println(starts);
		System.out.println(stops);
		if ( starts.size() > stops.size() ) {
			throw new IllegalArgumentException("unterminated tag in pattern: "+pattern);
		}

		if ( starts.size() < stops.size() ) {
			throw new IllegalArgumentException("missing start tag in pattern: "+pattern);
		}
	}

}
