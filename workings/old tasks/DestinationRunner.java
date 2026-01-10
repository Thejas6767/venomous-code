class DestinationRunner {
    public static void main(String[] args) {
        int spots = Destination.totalSpots(10);
        boolean intl = Destination.isInternational(true);
        String name = Destination.destinationName("Paris");
        long tourists = Destination.touristCount(5000000);
        double dist = Destination.distanceKm(8765.4);
        char code = Destination.destinationCode('P');
        float stay = Destination.avgStayDays(7.5f);

        System.out.println(spots);
        System.out.println(intl);
        System.out.println(name);
        System.out.println(tourists);
        System.out.println(dist);
        System.out.println(code);
        System.out.println(stay);
    }
}