class Fans{
public static int price;
public static String name;
public static char type;
public static boolean FansAreAvailable;
public static float ratings;
public static double weight;
public static  long numberOffan;

public static void DisplayFans(){
	price = 20000;
	System.out.println("fan price is ="+price);
	
	name ="Bajaj";
	System.out.println("fan name is ="+name);
	
	type = 'A';
	System.out.println("category="+type);
	
	FansAreAvailable = true;
	System.out.println("fans are available="+FansAreAvailable);
	
	ratings = 9.1f;
	System.out.println("ratings are ="+ratings);
	
	weight = 3.45555;
	System.out.println("in kg="+weight+"kg");
	
	numberOffan = 1234566777l;
	System.out.println("number of the fan="+numberOffan);

}



}