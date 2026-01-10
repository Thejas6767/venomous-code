class CelebritiesRunner {
    public static void main(String[] args) {
        int celebs = Celebrities.totalCelebs(50);
        boolean award = Celebrities.isAwardWinner(true);
        String name = Celebrities.celebName("Shahrukh Khan");
        long fans = Celebrities.fanCount(10000000);
        double worth = Celebrities.netWorth(750000000.00);
        char initial = Celebrities.celebInitial('S');
        float height = Celebrities.heightInFeet(5.9f);

        System.out.println(celebs);
        System.out.println(award);
        System.out.println(name);
        System.out.println(fans);
        System.out.println(worth);
        System.out.println(initial);
        System.out.println(height);
    }
}