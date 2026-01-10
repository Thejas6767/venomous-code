class HotelRunner {
    public static void main(String[] args) {
        
        int[] rooms = {101, 102, 201, 202, 301};
        int[] hotelRooms = Hotel.roomNumbers(rooms);
        for (int num = 0; num < hotelRooms.length; num++) {
            System.out.println("Room Number = " + hotelRooms[num]);
        }
        System.out.println(" ");

        double[] sizes = {250.5, 300.0, 150.75, 400.25, 275.8};
        double[] hotelSizes = Hotel.roomSizes(sizes);
        for (int num = 0; num < hotelSizes.length; num++) {
            System.out.println("Room Size = " + hotelSizes[num] + " sq.ft");
        }
        System.out.println(" ");

        float[] prices = {1500.5f, 2000.75f, 1200.0f, 5000.25f, 3000.99f};
        float[] hotelPrices = Hotel.roomPrices(prices);
        for (int num = 0; num < hotelPrices.length; num++) {
            System.out.println("Room Price = ₹" + hotelPrices[num]);
        }
        System.out.println(" ");

        char[] stars = {'A', 'B', 'C', 'D', 'E'};
        char[] hotelRatings = Hotel.ratings(stars);
        for (int num = 0; num < hotelRatings.length; num++) {
            System.out.println("Hotel Rating = " + hotelRatings[num]);
        }
        System.out.println(" ");

        boolean[] availability = {true, true, false, true, false};
        boolean[] hotelAvailability = Hotel.availability(availability);
        for (int num = 0; num < hotelAvailability.length; num++) {
            System.out.println("Room Available = " + hotelAvailability[num]);
        }
        System.out.println(" ");

        long[] bookingIds = {1001L, 1002L, 1003L, 1004L, 1005L};
        long[] hotelBookings = Hotel.bookings(bookingIds);
        for (int num = 0; num < hotelBookings.length; num++) {
            System.out.println("Booking ID = " + hotelBookings[num]);
        }
        System.out.println(" ");

        String[] names = {"Taj", "Oberoi", "ITC Gardenia", "The Leela", "Radisson"};
        String[] hotelNames = Hotel.hotelNames(names);
        for (int num = 0; num < hotelNames.length; num++) {
            System.out.println("Hotel Name = " + hotelNames[num]);
        }
    }
}
