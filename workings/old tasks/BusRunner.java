class BusRunner{
public static void main(String[] args){
	
int[] BusNumber={100,200,300,400,500};
int [] busNumber=Bus.noOfBuses(BusNumber);
for(int num=0;num<busNumber.length;num++){
System.out.println("NUmber Of Buses= "+busNumber[num]);
}
System.out.println(" ");
double[] BusesNumber={100.678,200.9887654,300.43567,400.4356,500.4};
double [] busesNumber=Bus.busNumber(BusesNumber);
for(int num=0;num<busesNumber.length;num++){
System.out.println("Bus Numbers= "+busesNumber[num]);


}
System.out.println(" ");
float[] cost={100.678f,200.9887654f,300.43567f,400.4356f,500.4f};
float[] busCost=Bus.busPrice(cost);
for(int num=0;num<busCost.length;num++){
System.out.println("Ticket Price = "+busCost[num]);

}
System.out.println(" ");
char[] ratin={'A','B','C','D','E'};
char[] busRating=Bus.rating(ratin);
for(int num=0;num<busRating.length;num++){
System.out.println("Ratings Given to buses= "+busRating[num]);
}
System.out.println(" ");

boolean[] status={true,false,true,false,false};
boolean[] busStatus=Bus.bus(status);
for(int num=0;num<busStatus.length;num++){
System.out.println("Bus Running status= "+busStatus[num]);
}
System.out.println(" ");

long[] dist={23456745678l,98765432765l,67895432l,7890123456l,98765412344565l};
long[] busTravelled=Bus.distance(dist);
for(int num=0;num<busTravelled.length;num++){
System.out.println("Bus Travelled distance= "+busTravelled[num]);
}
System.out.println(" ");
String[] names={"Gajanana","Gurushakthi","BMTC","KSRTC","Udayaranga"};
String[] busNames=Bus.name(names);
for(int num=0;num<busNames.length;num++){
System.out.println("Bus Names = "+busNames[num]);
}
}


}

//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
//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

//https://github.com/Thejas6767/venomous-code.git