class ZooRunner {
    public static void main(String[] args) {
        int[] counts = {5, 2, 8, 3, 10};
        for (int numbers : Zoo.animalCounts(counts)) {
            System.out.println("Animal Count = " +numbers);
        }

        double[] prices = {150.50, 200.00, 250.75, 100.25, 300.0};
        for (double cost : Zoo.ticketPrices(prices)) {
            System.out.println("Ticket Price = ₹" +cost);
        }

        float[] sizes = {50.5f, 75.0f, 100.25f, 60.0f, 90.75f};
        for (float siz : Zoo.cageSizes(sizes)) {
            System.out.println("Cage Size = " + siz + " sq.m");
        }

        char[] ratings = {'A', 'B', 'A', 'C', 'B'};
        for (char letters : Zoo.animalRatings(ratings)) {
            System.out.println("Animal Rating = " +letters);
        }

        boolean[] status = {true, false, true, true, false};
        for (boolean st : Zoo.endangeredStatus(status)) {
            System.out.println("Endangered = " + st);
        }

        long[] ids = {9001L, 9002L, 9003L, 9004L, 9005L};
        for (long id : Zoo.zooIds(ids)) {
            System.out.println("Zoo ID = " + id);
        }

        String[] names = {"Lion", "Elephant", "Tiger", "Zebra", "Giraffe"};
        for (String name : Zoo.animalNames(names)) {
            System.out.println("Animal = " + name);
        }
    }
}
