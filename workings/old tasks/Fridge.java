class Fridge{
public static int price;
public static String name;
public static char type;
public static boolean FridgeIsAvailable;
public static float ratings;
public static double weight;
public static  long numberOfFridge;

public static void DisplayFridge(){
	price = 60500;
	System.out.println("Fridge price is ="+price);
	
	name ="LG";
	System.out.println("Fridge name is ="+name);
	
	type = 'A';
	System.out.println("category="+type);
	
	FridgeIsAvailable = true;
	System.out.println("Fridge is available="+FridgeIsAvailable);
	
	ratings = 9.1f;
	System.out.println("ratings are ="+ratings);
	
	weight = 3.45555;
	System.out.println("in kg="+weight+"kg");
	
	numberOfFridge = 1234566777l;
	System.out.println("number of the Fridge="+numberOfFridge);

}



}