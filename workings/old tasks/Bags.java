class Bags{
Bags(int number){
System.out.println("number of Bags= "+ number);
}
Bags(int number,String Name){
System.out.println("number of Bags= "+ number +" , "+ "name of Bags="+Name);
}
Bags(int number, Boolean BagsAreThere){
System.out.println("number of Bags= "+ number +" "+ "Tables are there="+ BagsAreThere );
}
Bags(int number, char type){
System.out.println("number of Bags= "+ number +" , "+"type of Chairs="+type);
}
Bags(int number, float rating){
System.out.println("number of Bags= "+ number +" "+ "ratings ="+ rating);
}
Bags(String Name,int number){
System.out.println("name of Bags= "+ number +" "+ "number of Bags="+ number);
}
Bags(float rating,int number){
System.out.println("ratings ="+rating +" , "+"number of Bags= "+ number);
}
Bags(char type,int price){
System.out.println("type of Bags="+ type+" " +"price  of Bags= "+ price);
}

}