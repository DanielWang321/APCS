package apcs.unit04;

public class RationalNumber implements Comparable<RationalNumber> {
    private int p;
    private int q;

    public RationalNumber(int p, int q) {
        if (q == 0) {
            throw new IllegalArgumentException("Cant divide by 0");
        }
        if (q < 0) {
            q = q * -1;
            p = p * -1;
        }
        if (q < 0 && p < 0) {
            q = q * -1;
            p = p * -1;
        }

        this.p = p;
        this.q = q;
        reduce();
    }

    public int getP() {
        return p;
    }

    public int getQ() {
        return q;
    }

    private void reduce() {
        int gcf = getGCF(Math.abs(p), q);
        p /= gcf;
        q /= gcf;
    }

    public static int getGCF(int num1, int num2) {
        if (num1 == 0)
            return num2;
        while (num1 != num2) {
            if (num1 > num2)
                num1 -= num2;
            else // num2 > num1
                num2 -= num1;
        }
        return num1;
    }

    public RationalNumber getReciprocal() {
        return new RationalNumber(q, p);
    }

    public RationalNumber sum(RationalNumber other) {
        int sumNumerator = this.p * other.q + this.q * other.p;
        int sumDenomitor = this.q * other.q;
        RationalNumber sum = new RationalNumber(sumNumerator, sumDenomitor);
        return sum;
    }

    public RationalNumber multiply(RationalNumber other) {
        int productNumerator = this.p * other.p;
        int productDenomitor = this.q * other.q;
        RationalNumber product = new RationalNumber(productNumerator, productDenomitor);
        return product;
    }

    public double toDecimal() {
        return ((double) p / q);
    }

    public boolean equals(RationalNumber other) {
        return this.p == other.p && this.q == other.q;
    }

    public String toString() {
        if (q != 1) {
            return p + "\n-\n" + q;
        } else {
            return p + "";
        }
    }

    public int compareTo(RationalNumber other) {
        double thisDecimal = this.toDecimal();
        double otherDecimal = other.toDecimal();
        if (thisDecimal < otherDecimal) {
            return -1;
        } else if (thisDecimal > otherDecimal) {
            return 1;
        } else {
            return 0;
        }

    }
}
