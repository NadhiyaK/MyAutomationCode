package Java.Coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Listinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> family2 = new ArrayList<String>();
		family2.add("Kanchana");
		family2.add("Karunakaran");
		family2.add("Adithi");
		family2.add("Rithu");
		family2.add("Nithi");
		family2.add("Vichu");
		String name = "Ayush";
		String name1 = "Arush";
		
		ArrayList<String> family = new ArrayList<String>();
		family.add("Aju");
		family.add(0, "Nadhi");
		family.addAll(0, family2);
		
		if(!family.contains(name))
		{
			family.add(name);
		}
		if(!family.contains(name1))
		{
			family.add(name1);
		}
		//String[] arrfamily = {};
		family.forEach((n) -> System.out.println(n));
		
		
	//	System.out.println(family);
		
		LinkedList<String> family3 = new LinkedList<String>();
		family3.add("Viji");
		family3.add("Senthil");
		family3.add("Chinnu");
		family3.add("Saranya");
		family3.addFirst(name);
		family3.addFirst(name1);
		family3.addLast(family.get(4));
		System.out.println(family3);
		family3.forEach((n) -> System.out.println(n));
		
		ArrayList<Object> ob = new ArrayList<Object>(Arrays.asList("test1","test2","test3"));
		System.out.println(ob);
		System.out.println("------");
		family3.stream().forEach((ele) -> System.out.println(ele));
		System.out.println("------");
		family3.forEach((n) -> System.out.println(n));
		
		ArrayList<String> fam = new ArrayList<String>();
		fam.add("test1");
		fam.add("test2");
		fam.add("test3");
		fam.add("test4");
		fam.add("test5");
		fam.add("test6");
		for(int i = 0; i<=5; i++)
		{
			family.add(i, fam.get(i));
		}
		
		System.out.println("------");
		System.out.println(family);
		
		
		
	}

}
