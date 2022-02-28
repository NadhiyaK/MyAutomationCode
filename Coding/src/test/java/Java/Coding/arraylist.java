package Java.Coding;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		
//		ArrayList<String> a = new ArrayList<String>();
//		String[] value = {"Ayush","Arush","Aju","Nadhi"};
//		for(String c:value)
//		{
//			if(c.contains("Aju"))
//			a.add(c);
//		
//		}
//		System.out.println(a);
//		
//		ArrayList<Integer> num = new ArrayList<Integer>();
//		num.add(5);
//		num.add(6);
//		num.add(7);
//		num.add(8);
//		
//		ArrayList<Character> c = new ArrayList<Character>();
//		c.add('a');
//		c.add('b');
//		c.add('a');
//		c.add('c');
//		c.add('e');
//		c.add('f');
//		c.add('f');
//		c.add('a');
//		c.add('e');
//				
//		ArrayList<Character> fin = new ArrayList<Character>();
//		
//			for(char s: c)
//			{
//				if(!fin.contains(s))
//				{
//					fin.add(s);
//				}
//					
//			}
//			System.out.println(fin);
//			
//			
//			ArrayList<String> names = new ArrayList<String>();
//			names.add("Ayush");
//			names.add("Arush");
//			names.add("Nadhi");
//			names.add("Ayush");
//			names.add("Arush");
//			names.add("Aju");
//			names.add("Aju");
//			names.add("Nadhi");
//			
//			ArrayList<String> abc = new ArrayList<String>();
//			
//			for(String ch:names)
//			{
//				if(!abc.contains(ch))
//				{
//					abc.add(ch);
//				}
//			}
//			System.out.println(abc);
			
			ArrayList<Integer> numbers = new ArrayList<Integer>();
			numbers.add(6);
			numbers.add(6);
			numbers.add(7);
			numbers.add(6);
			numbers.add(3);
			numbers.add(6);
			numbers.add(6);
			numbers.add(6);
			ArrayList<Integer> nnn = new ArrayList<Integer>();
			for(int iii:numbers)
			{
				if(!nnn.contains(iii))
						{
				
					nnn.add(iii);
						}
			}
			System.out.println(nnn);
			
			
		}
		
	

	

}
