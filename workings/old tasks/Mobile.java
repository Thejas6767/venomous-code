class Mobile{
public static void price(){
System.out.println(" price");
}

public static void display(){

System.out.println("display");
price();
}

public static void ram(){
System.out.println("ram capacity");
display();
}
public static void keyboard(){
System.out.println("keyboard type");
ram();

}

public static void battery(){
System.out.println("battery capacity");
keyboard();
}

}