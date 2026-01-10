class Cities{
public static int distance(String name,int dist){
String cityName="0";
if(name=="one"){
cityName="koppal";
System.out.println("cityName"+cityName);
}else if(dist==1){
	 int distanceCity=6766;
	 System.out.println("distance from the city"+distanceCity);
}else{
	System.out.println("there is no city");
}

return dist;
}
public static long ticketPrice(String name,long price){
String cityName="0";
if(name=="two"){
cityName="hubli";
System.out.println("cityName"+cityName);
}else if(price==1){
	 long amount=676l;
	 System.out.println("Ticket price from the city"+amount);
}else{
	System.out.println("there is no buses");
}

return price;
}
public static char cityCode(String name,char code){
	if(name=="ggg"){
		String cityName="bng";
		System.out.println(cityName);
	}else if(code=='1'){
		char cityCodes='A';
		System.out.println(cityCodes);
	}else{
		System.out.println("city code is invalid");
	}
	return code;
	
	
}



}