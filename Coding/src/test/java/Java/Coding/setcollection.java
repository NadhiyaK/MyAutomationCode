package Java.Coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;




public class setcollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//remove duplicates using hashset
		//since it dont accept duplicates
		char[] Ch = {'g','a','d','e','t','g','a','g'};
		ArrayList<Character> abc = new ArrayList<Character>();
		for(char c: Ch)
		{
			abc.add(c);
		}
		HashSet<Character> hc = new HashSet<Character>(abc);
	//	System.out.println(hc);
		
		String[] names = {"Ayush","Arush","Aju","Nadhi","Ayush","Arush","Aju","Nadhi","Ayush","Arush","Aju","Nadhi"};
		HashSet<String> nam = new HashSet<String>(Arrays.asList(names));
		System.out.println(nam);
		
		ArrayList<String> al = new ArrayList<String>(nam);
		System.out.println(al);
		String[] na = new String[al.size()];
		
		for(int i =0; i<al.size(); i++)
		{
			na[i] = al.get(i);
			System.out.println(na[i]);
		}
		
		System.out.println("-----------");
		
		//if any output is object then we can use
		//object o ="sdf";
		//System.out.println((String)o));
		
		System.out.println("-----------");
		
		
		HashMap<Integer, String> hm = new HashMap<Integer,String>();
		for(int i =0; i<al.size(); i++)
		{
			hm.put(i, al.get(i));
		}
		System.out.println(hm);
		
		HashSet<Character> hc1 = new HashSet<Character>(abc);
		ArrayList<Character> h = new ArrayList<Character>();
		Iterator<Character>it =hc1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}
}
