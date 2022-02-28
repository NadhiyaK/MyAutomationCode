package Java.Coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class removemultiplicationof2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<Integer> num = new ArrayList<Integer>();
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(3,3,5,3,5,2,5,3,5,3));
		System.out.println(numbers);
		//numbers.removeIf(num -> num % 2 ==1);
		
		//if(!num.contains(numbers))
		System.out.println(numbers);
		
		HashSet<Integer> has = new HashSet<Integer>(numbers);
		System.out.println(has);
		
		String[] namearr = {"Ayush","Arush","Aju","Ayush","Arush","Nadhi"};
		ArrayList<String> names = new ArrayList<String>(Arrays.asList(namearr));
		HashSet<String> hasnames = new HashSet<String>(names);
		System.out.println(hasnames);
		
		char[] Ch = {'g','a','d','e','t','g','a','g'};
		
		
		
		ArrayList<Character> abc = new ArrayList<Character>();
		for(char c: Ch)
		{
			abc.add(c);
		}
	
		HashSet<Character> hc = new HashSet<Character>(abc);
		System.out.println(hc);
		
		
		
		
		
		
	}

}
