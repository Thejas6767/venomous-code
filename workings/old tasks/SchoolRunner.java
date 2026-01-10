class SchoolRunner {
    public static void main(String[] args) {
        
        int[] ids = {1, 2, 3, 4, 5};
        int[] schoolIds = School.studentIds(ids);
        for (int id : schoolIds) {
            System.out.println("Student ID = " + id);
        }
        System.out.println(" ");

        double[] marks = {85.5, 90.0, 78.25, 66.75, 92.0};
        double[] schoolMarks = School.marks(marks);
        for (double mark : schoolMarks) {
            System.out.println("Marks = " + mark);
        }
        System.out.println(" ");

        float[] fees = {15000.5f, 20000.0f, 17500.75f, 22000.25f, 18000.99f};
        float[] schoolFees = School.fees(fees);
        for (float fee : schoolFees) {
            System.out.println("Fee Paid = ₹" + fee);
        }
        System.out.println(" ");

        char[] grades = {'A', 'B', 'C', 'D', 'A'};
        char[] schoolGrades = School.grades(grades);
        for (char grad : schoolGrades) {
            System.out.println("Grade = " + grad);
        }
        System.out.println(" ");

        boolean[] pass = {true, true, false, true, true};
        boolean[] passStatus = School.passStatus(pass);
        for (boolean pas : passStatus) {
            System.out.println("Pass Status = " + pas);
        }
        System.out.println(" ");

        long[] rolls = {101L, 102L, 103L, 104L, 105L};
        long[] rollNos = School.rollNumbers(rolls);
        for (long roll : rollNos) {
            System.out.println("Roll Number = " + roll);
        }
        System.out.println(" ");

        String[] names = {"Sanjay", "PT", "Manu", "Shashi", "Psych"};
        String[] studentNames = School.studentNames(names);
        for (String nam : studentNames) {
            System.out.println("Student Name = " + nam);
        }
    }
}
