class RestaurantRunner {
    public static void main(String[] args) {
        int[] tables = {1, 2, 3, 4, 5};
        for (int tab : Restaurant.tableNumbers(tables)) {
            System.out.println("Table = " + tab);
        }

        double[] bills = {250.75, 999.50, 450.25, 1200.99, 850.40};
        for (double bill : Restaurant.bills(bills)) {
            System.out.println("Bill = ₹" + bill);
        }

        float[] dishPrices = {150.5f, 200.0f, 99.99f, 300.25f, 500.75f};
        for (float price : Restaurant.dishPrices(dishPrices)) {
            System.out.println("Dish Price = ₹" +price);
        }

        char[] grades = {'A', 'B', 'A', 'C', 'B'};
        for (char grade : Restaurant.foodGrades(grades)) {
            System.out.println("Food Grade = " + grade);
        }

        boolean[] status = {true, true, false, true, false};
        for (boolean stat : Restaurant.availability(status)) {
            System.out.println("Dish Available = " + stat);
        }

        long[] orders = {1111L, 2222L, 3333L, 4444L, 5555L};
        for (long orde : Restaurant.orderIds(orders)) {
            System.out.println("Order ID = " + orde);
        }

        String[] items = {"Pizza", "Burger", "Pasta", "Biryani", "Salad"};
        for (String item : Restaurant.menuItems(items)) {
            System.out.println("Menu Item = " + item);
        }
    }
}
