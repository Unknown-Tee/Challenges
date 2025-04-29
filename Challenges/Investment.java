package Challenges;
public class Investment {
    void calculateGrowth() {
        double principal;
        double rate; // annual growth rate in percentage

        principal = 25000.00;
        System.out.println("Initial amount: $" + principal);

        rate = 4.5;
        principal = principal * (1 + rate / 100);
        System.out.println("After 1 year: $" + principal);

        principal = principal * (1 + rate / 100);
        System.out.println("After 2 years: $" + principal);
    }

    public static void main(String[] args) {
        (new Investment()).calculateGrowth();
    }
}
