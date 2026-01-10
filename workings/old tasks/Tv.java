class Tv{
public static int price;
public static String name;
public static char type;
public static boolean TvAreAvailable;
public static float ratings;
public static double weight;
public static  long numberOfTv;

public static void DisplayTv(){
	price = 20000;
	System.out.println("Tv price is ="+price);
	
	name ="Bajaj";
	System.out.println("Tv name is ="+name);
	
	type = 'A';
	System.out.println("category="+type);
	
	TvIsAvailable = true;
	System.out.println("Tv is available="+TvIsAvailable);
	
	ratings = 9.1f;
	System.out.println("ratings are ="+ratings);
	
	weight = 3.45555;
	System.out.println("in kg="+weight+"kg");
	
	numberOfTv = 1234566777l;
	System.out.println("number of the Tv="+numberOfTv);

}



}