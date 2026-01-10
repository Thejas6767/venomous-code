class FestivalRunner{
public static void main(String[]args){

int days = Festival.noOfDays(123);
boolean isCompleted = Festival.isCompletedFestival(true);
String guest= Festival.guestName("sanjay");
long guestNo= Festival.guestNo(9535263819l);
double people= Festival.noOfPeople(2.50000);
char name= Festival.festivalName('g');
float cost= Festival.costOfFestival(1.4f);

System.out.println(name);
System.out.println(days);
System.out.println(isCompleted);
System.out.println(guest);
System.out.println(guestNo);
System.out.println(people);
System.out.println(cost);

}



}