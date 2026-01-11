class WaterBottle{
public static int price;
public static String name;
public static char type;
public static boolean bottleIsAvailable;
public static float ratings;
public static double valume;
public static  long numberOfBottle;

public static void DisplayWaterBottle(){
	price = 20;
	System.out.println("bottle price is ="+price);
	
	name ="Bisleri";
	System.out.println("bottle name is ="+name);
	
	type = 'A';
	System.out.println("category="+type);
	
	bottleIsAvailable = true;
	System.out.println("bottle is available="+bottleIsAvailable);
	
	ratings = 9.1f;
	System.out.println("ratings are ="+ratings);
	
	valume = 4.500;
	System.out.println("in litre="+valume+"L");
	
	numberOfBottle = 1234566777l;
	System.out.println("number of the bottle="+numberOfBottle);

}



}