class HometownRunner {
    public static void main(String[] args) {
        int pop = Hometown.population(500000);
        boolean tourist = Hometown.isTouristSpot(true);
        String name = Hometown.townName("Mysuru");
        long visitors = Hometown.annualVisitors(1500000);
        double area = Hometown.areaSize(286.5);
        char code = Hometown.cityCode('M');
        float temp = Hometown.temperature(29.5f);

        System.out.println(pop);
        System.out.println(tourist);
        System.out.println(name);
        System.out.println(visitors);
        System.out.println(area);
        System.out.println(code);
        System.out.println(temp);
    }
}