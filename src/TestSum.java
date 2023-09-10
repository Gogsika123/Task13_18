public class TestSum {
    public static void main(String[] args) {
        RationalClass sum = new RationalClass(0, 1); 

        for (int i = 1; i <= 99; i++) {
            RationalClass term = new RationalClass(i, i + 1);
            sum = sum.add(term);
        }
        System.out.println("The sum of the series is approximately: " + sum.toDouble());
    }
}
