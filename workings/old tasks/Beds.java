class Beds{
Beds(int number){
System.out.println("number of Beds= "+ number);
}
Beds(int number,String Name){
System.out.println("number of Beds= "+ number + " "+ "name of Beds"+Name);
}
Beds(int number, Boolean BedsAreThere){
System.out.println("number of Beds= "+ number +" "+ "Tables are there="+ BedsAreThere );
}
Beds(int number, char type){
System.out.println("number of Beds= "+ number + " "+"type of Chairs="+type);
}
Beds(int number, float rating){
System.out.println("number of Beds= "+ number +" "+ "ratings ="+ rating);
}
Beds(String Name,int number){
System.out.println("name of Beds= "+ number +" "+ "number of Beds="+ number);
}
Beds(float rating,int number){
System.out.println("ratings ="+rating + " "+"number of Beds= "+ number);
}
Beds(char type,int price){
System.out.println("type of Beds="+ type+" " +"price  of Beds= "+ price);
}

}