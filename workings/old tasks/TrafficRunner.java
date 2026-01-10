class TrafficRunner {
    public static void main(String[] args) {
        int vehicles = Traffic.totalVehicles(2000);
        boolean jam = Traffic.isJam(true);
        String loc = Traffic.location("MG Road");
        long fines = Traffic.totalFines(50000);
        double speed = Traffic.avgSpeed(45.7);
        char code = Traffic.trafficCode('T');
        float congestion = Traffic.congestionLevel(8.5f);

        System.out.println(vehicles);
        System.out.println(jam);
        System.out.println(loc);
        System.out.println(fines);
        System.out.println(speed);
        System.out.println(code);
        System.out.println(congestion);
    }
}