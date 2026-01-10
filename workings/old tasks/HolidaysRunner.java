class HolidaysRunner{
public static void main(String[]args){

int days = Holidays.totalHolidays(150);
boolean approved = Holidays.holidayapproved(true);
String manager= Holidays.managerName("sanjay");
long money= Holidays.totalLoss(9535263819l);
double hours= Holidays.govtHoliday(2.50000);
char name= Holidays.festivalName('g');
float time= Holidays.personalLeave(1.4f);

System.out.println(name);
System.out.println(days);
System.out.println(approved);
System.out.println(manager);
System.out.println(money);
System.out.println(hours);
System.out.println(time);

}



}