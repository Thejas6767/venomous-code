class FlightRunner {
    public static void main(String[] args) {
        
        int[] flightNums = {101, 202, 303, 404, 505};
        int[] flightNumber = Flight.flightNumbers(flightNums);
        for (int num = 0; num < flightNumber.length; num++) {
            System.out.println("Flight Number = " + flightNumber[num]);
        }
        System.out.println(" ");

        double[] speeds = {850.678, 920.9887654, 780.43567, 890.4356, 950.4};
        double[] flightSpeeds = Flight.flightSpeeds(speeds);
        for (int num = 0; num < flightSpeeds.length; num++) {
            System.out.println("Flight Speed = " + flightSpeeds[num] + " km/h");
        }
        System.out.println(" ");

        float[] ticketCosts = {5000.678f, 7200.988f, 3999.435f, 8000.43f, 6500.4f};
        float[] flightCosts = Flight.ticketPrices(ticketCosts);
        for (int num = 0; num < flightCosts.length; num++) {
            System.out.println("Ticket Price = ₹" + flightCosts[num]);
        }
        System.out.println(" ");

        char[] ratings = {'A', 'B', 'C', 'D', 'E'};
        char[] flightRatings = Flight.ratings(ratings);
        for (int num = 0; num < flightRatings.length; num++) {
            System.out.println("Ratings Given to Flights = " + flightRatings[num]);
        }
        System.out.println(" ");

        boolean[] availability = {true, false, true, true, false};
        boolean[] flightAvailability = Flight.availability(availability);
        for (int num = 0; num < flightAvailability.length; num++) {
            System.out.println("Flight Availability = " + flightAvailability[num]);
        }
        System.out.println(" ");

        long[] distances = {1200l, 2500l, 8900l, 15000l, 3200l};
        long[] travelledDistances = Flight.distances(distances);
        for (int num = 0; num < travelledDistances.length; num++) {
            System.out.println("Flight Travelled Distance = " + travelledDistances[num] + " km");
        }
        System.out.println(" ");

        String[] airlines = {"Air India", "IndiGo", "SpiceJet", "Vistara", "GoAir"};
        String[] flightNames = Flight.airlines(airlines);
        for (int num = 0; num < flightNames.length; num++) {
            System.out.println("Airline Name = " + flightNames[num]);
        }
    }
}
