package com.xworkz.hotel.external;

import com.xworkz.hotel.internal.Breakfast;
import com.xworkz.hotel.internal.Dinner;
import com.xworkz.hotel.internal.Hotel;
import com.xworkz.hotel.internal.Lunch;

class HotelRunner{
    public static void main(String [] args){

        Breakfast breakfast=new Breakfast("Idli Sambar");
        Lunch lunch = new Lunch("Anna Sambar");
        Dinner dinner = new Dinner("Chapathi",30);
        Hotel hotel = new Hotel("Manu's Hotel",breakfast,lunch,dinner);

        hotel.hotelDetails();
    }

}
