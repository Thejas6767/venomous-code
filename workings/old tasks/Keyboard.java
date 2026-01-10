class Keyboard{
public static int price;
public static String name;
public static char type;
public static boolean KeyboardIsAvailable;
public static float ratings;
public static double length;
public static  long numberOfKeyboard;

public static void DisplayKeyboard(){
	price = 600;
	System.out.println("Keyboard price is ="+price);
	
	name ="Dell";
	System.out.println("Keyboard name is ="+name);
	
	type = 'A';
	System.out.println("category="+type);
	
	KeyboardIsAvailable = true;
	System.out.println("Keyboard is available="+KeyboardIsAvailable);
	
	ratings = 9.1f;
	System.out.println("ratings are ="+ratings);
	
	length = 25.45555;
	System.out.println("in cm="+length+"CM");
	
	numberOfKeyboard = 1234566777l;
	System.out.println("number of the Keyboard="+numberOfKeyboard);

}



}