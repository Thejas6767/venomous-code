class BankRunner {
    public static void main(String[] args) {
        int[] accounts = {1001, 1002, 1003, 1004, 1005};
        for (int acc : Bank.accountNumbers(accounts)) {
            System.out.println("Account Number = " + acc);
        }

        double[] balances = {50000.75, 120000.50, 75000.25, 99999.99, 30000.00};
        for (double bal : Bank.balances(balances)) {
            System.out.println("Balance = ₹" + bal);
        }

        float[] loans = {150000.5f, 250000.75f, 100000.0f, 50000.25f, 300000.0f};
        for (float loan : Bank.loanAmounts(loans)) {
            System.out.println("Loan Amount = ₹" + loan);
        }

        char[] types = {'S', 'C', 'S', 'C', 'S'}; // Savings / Current
        for (char type : Bank.accountTypes(types)) {
            System.out.println("Account Type = " + type);
        }

        boolean[] status = {true, false, true, true, false};
        for (boolean stat : Bank.activeStatus(status)) {
            System.out.println("Active = " + stat);
        }

        long[] phones = {9876543210L, 8765432109L, 7654321098L, 6543210987L, 9123456780L};
        for (long phone : Bank.phoneNumbers(phones)) {
            System.out.println("Phone = " + phone);
        }

        String[] names = {"Arjun", "Meera", "Rahul", "Sneha", "Vikram"};
        for (String name : Bank.customerNames(names)) {
            System.out.println("Customer = " + name);
        }
    }
}
