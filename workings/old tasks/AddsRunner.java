class AddsRunner{
public static void main(String[]args){

int number = Adds.noOfAdds(150);
boolean complete = Adds.addCompleted(true);
String Name= Adds.addName("Lux");
long seconds= Adds.totalAddInSeconds(9535263819l);
double minutes= Adds.totalMinutes(2.50000);
char rating= Adds.ratingOfAdd('A');
float budget= Adds.budgetOfAdd(1.4f);

System.out.println(rating);
System.out.println(number);
System.out.println(complete);
System.out.println(Name);
System.out.println(seconds);
System.out.println(minutes);
System.out.println(budget);

}



}