public class Number {
    private double num;

    public Number(double num) {
        this.num = num;
    }

    boolean isZero() {
        return this.num == 0.0 ? true : false;
    }

    boolean isPositive() {
        return this.num >= 0.0 ? true : false;
    }

    boolean isNegative() {
        return this.num < 0.0 ? true : false;
    }

    boolean isEven() {
        return this.num % 2 == 0 ? true : false;
        // judging by the methods that need to be provided in class
        // it can be infered that here we would be storing integers in double data type

    }

    boolean isOdd() {
        return this.num % 2 == 0 ? true : false;
    }

    boolean isPrime() {
        int a = (int) this.num;
        if (a == 1 || a == 0) {
            return false;
        } else if (a == 2) {
            return true;
        }
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    boolean isAmstrong() {

        int originalNumber, remainder, result = 0;

        originalNumber = (int) this.num;

        while (originalNumber != 0) {
            remainder = originalNumber % 10; // find last digit
            result += Math.pow(remainder, 3);// calculate cube of last digit and sum it
            originalNumber /= 10;
        }

        if (result == (int) this.num)
            return true;
        else
            return false;
    }

    double getFactorial() {
        int a = (int) this.num;
        double result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }

        return result;
    }

    double getSqr() {

        return (this.num * this.num);
    }

    double SumDigits() {
        int originalNumber, remainder;
        double result = 0;

        originalNumber = (int) this.num;

        while (originalNumber != 0) {
            remainder = originalNumber % 10; // find last digit
            result += remainder;
            originalNumber /= 10;
        }

        return result;
    }

    double getReverse() {
        int originalNumber, remainder;
        double result = 0;

        originalNumber = (int) this.num;

        while (originalNumber != 0) {
            remainder = originalNumber % 10; // find last digit
            result = result * 10 + remainder;// calculate cube of last digit and sum it
            originalNumber /= 10;
        }

        return result;
    }

    void listFactor() {
        int a = (int) this.num;
        System.out.println("Factors are :");
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                System.out.println(i);
            }
        }

    }

    void dispBinary() {
        System.out.println(Integer.toBinaryString((int) this.num));
    }

}