package Payload;

public class Payload {

	
	public static String payload(String name, String job)
	{
		
		String create =  "{\n"
				+ "    \"name\": \""+name+"\",\n"
				+ "    \"job\": \""+job+"\n"
				+ "}";
		return create;
	}
}
