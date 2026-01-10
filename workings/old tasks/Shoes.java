class Shoes{
Shoes(int number){
System.out.println("number of Shoes= "+ number);
}
Shoes(int number,String Name){
System.out.println("number of Shoes= "+ number + " , "+ "name of Shoes"+Name);
}
Shoes(int number, Boolean ShoesAreThere){
System.out.println("number of Shoes= "+ number +" , "+ "Tables are there="+ ShoesAreThere );
}
Shoes(int number, char type){
System.out.println("number of Shoes= "+ number + " , "+"type of Chairs="+type);
}
Shoes(int number, float rating){
System.out.println("number of Shoes= "+ number +" , "+ "ratings ="+ rating);
}
Shoes(String Name,int number){
System.out.println("name of Shoes= "+ number +" , "+ "number of Shoes="+ number);
}
Shoes(float rating,int number){
System.out.println("ratings ="+rating + " , "+"number of Shoes= "+ number);
}
Shoes(char type,int price){
System.out.println("type of Shoes="+ type+" , " +"price  of Shoes= "+ price);
}

}