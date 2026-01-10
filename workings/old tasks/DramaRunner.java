class DramaRunner {
    public static void main(String[] args) {
        int episodes = Drama.totalEpisodes(100);
        boolean popular = Drama.isPopular(true);
        String name = Drama.dramaName("Mahabharata");
        long viewers = Drama.totalViewers(10000000);
        double rating = Drama.avgRating(9.8);
        char code = Drama.dramaCode('D');
        float duration = Drama.durationPerEpisode(45.5f);

        System.out.println(episodes);
        System.out.println(popular);
        System.out.println(name);
        System.out.println(viewers);
        System.out.println(rating);
        System.out.println(code);
        System.out.println(duration);
    }
}