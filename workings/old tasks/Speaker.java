class Speaker{
public static int price;
public static String name;
public static char type;
public static boolean SpeakerIsAvailable;
public static float ratings;
public static double length;
public static  long numberOfSpeaker;

public static void DisplaySpeaker(){
	price = 600;
	System.out.println("Speaker price is ="+price);
	
	name ="Dell";
	System.out.println("Speaker name is ="+name);
	
	type = 'A';
	System.out.println("category="+type);
	
	SpeakerIsAvailable = true;
	System.out.println("Speaker is available="+SpeakerIsAvailable);
	
	ratings = 9.1f;
	System.out.println("ratings are ="+ratings);
	
	length = 25.45555;
	System.out.println("in cm="+length+"CM");
	
	numberOfSpeaker = 1234566777l;
	System.out.println("number of the Speaker="+numberOfSpeaker);

}



}