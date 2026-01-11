class VegetablesRunner {
    public static void main(String[] args) {
        int types = Vegetables.totalTypes(20);
        boolean organic = Vegetables.isOrganic(true);
        String name = Vegetables.vegetableName("Carrot");
        long sales = Vegetables.totalSales(5000);
        double weight = Vegetables.totalWeight(350.75);
        char grade = Vegetables.grade('A');
        float price = Vegetables.pricePerKg(40.5f);

        System.out.println(types);
        System.out.println(organic);
        System.out.println(name);
        System.out.println(sales);
        System.out.println(weight);
        System.out.println(grade);
        System.out.println(price);
    }
}