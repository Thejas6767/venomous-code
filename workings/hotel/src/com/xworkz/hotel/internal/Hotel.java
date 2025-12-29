package com.xworkz.hotel.internal;

public class Hotel{
    public String hotelName;
    public Breakfast breakfast;
    public Lunch lunch;
    public Dinner dinner;

    public Hotel(String hotelName,Breakfast breakfast,Lunch lunch,Dinner dinner){
        this.hotelName=hotelName;
        this.breakfast=breakfast;
        this.lunch=lunch;
        this.dinner=dinner;
    }

    public void hotelDetails(){
        System.out.println("Name of the Hotel is "+hotelName);
        System.out.println("Main food for breakfast is "+breakfast.breakfastName);
        System.out.println("In Lunch we ate "+lunch.lunchName);
        System.out.println("Dinner "+dinner.dinnerName+" price is "+dinner.price);
    }
}
