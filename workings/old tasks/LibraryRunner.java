class LibraryRunner {
    public static void main(String[] args) {
        
        int[] ids = {1, 2, 3, 4, 5};
        int[] books = Library.bookIds(ids);
        for (int id : books) {
            System.out.println("Book ID = " + id);
        }
        System.out.println(" ");

        double[] prices = {250.50, 780.75, 450.0, 1250.25, 999.99};
        double[] bookPrices = Library.bookPrices(prices);
        for (double price : bookPrices) {
            System.out.println("Book Price = ₹" + price);
        }
        System.out.println(" ");

        float[] fees = {15.5f, 20.0f, 7.25f, 30.0f, 12.99f};
        float[] lateFees = Library.lateFees(fees);
        for (float fee : lateFees) {
            System.out.println("Late Fee = ₹" + fee);
        }
        System.out.println(" ");

        char[] secs = {'A', 'B', 'C', 'D', 'E'};
        char[] sections = Library.sections(secs);
        for (char sect : sections) {
            System.out.println("Section = " + sect);
        }
        System.out.println(" ");

        boolean[] available = {true, false, true, true, false};
        boolean[] bookStatus = Library.availability(available);
        for (boolean status : bookStatus) {
            System.out.println("Available = " + status);
        }
        System.out.println(" ");

        long[] isbns = {9781234567890L, 9789876543210L, 9781111111111L, 9782222222222L, 9783333333333L};
        long[] isbnNumbers = Library.isbnNumbers(isbns);
        for (long isbn : isbnNumbers) {
            System.out.println("ISBN = " + isbn);
        }
        System.out.println(" ");

        String[] titles = {"Java Programming", "Data Structures", "Algorithms", "Database Systems", "Operating Systems"};
        String[] bookTitles = Library.bookTitles(titles);
        for (String titl : bookTitles) {
            System.out.println("Book Title = " + titl);
        }
    }
}