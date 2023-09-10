class RationalClass {
    private int numerator;
    private int denominator;

    public RationalClass(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public RationalClass add(RationalClass other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new RationalClass(newNumerator, newDenominator);
    }
    public double toDouble() {
        return (double) numerator / denominator;
    }
}
