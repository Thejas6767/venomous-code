class StoryRunner {
    public static void main(String[] args) {
        int chapters = Story.totalChapters(20);
        boolean fiction = Story.isFiction(true);
        String title = Story.storyTitle("The Jungle Book");
        long words = Story.totalWords(50000);
        double time = Story.avgReadingTime(6.5);
        char code = Story.storyCode('S');
        float level = Story.complexityLevel(3.5f);

        System.out.println(chapters);
        System.out.println(fiction);
        System.out.println(title);
        System.out.println(words);
        System.out.println(time);
        System.out.println(code);
        System.out.println(level);
    }
}