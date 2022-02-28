package Java.Coding;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create HashMap and pass it to set collection and print it in the output
		
		//HashMap created
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Ayush");
		hm.put(4, "sdf");
		hm.put(6, "Aydsfsfush");
		hm.put(3, "Aysdfsdfush");
		hm.put(5, "Arush");
		hm.put(6, "Aju");
		hm.put(2, "Nadhi");
		hm.put(4, "Ayush");
		hm.put(0, "Ayush");
		//passed the hashtable to set collection
		Set hm1 = hm.entrySet();
		//printed in the output using key value 
		Iterator it = hm1.iterator();
		while(it.hasNext())
		{
			Map.Entry em = (Map.Entry)it.next();
			System.out.println(em.getKey());
			System.out.println(em.getValue());
		}
		
	}

}
