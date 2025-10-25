package academy.tochkavhoda.introduction;

public class ZeroSteps2 {

    //1. Возвращает сумму квадратов целых чисел от 1 до count
    public int sumSquares(int count) {
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += i * i;
        }
        return sum;
    }

    //2. Возвращает сумму нечетных целых чисел от 1 до count
    public int sumOdds(int count) {
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    //3. Возвращает сумму обратных величин целых чисел от 1 до count
    public double sumInverses(int count) {
        double sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    //4. Возвращает произведение целых чисел от 1 до count (факториал от count)
    public long factorial(int count) {
        long product = 1;
        for (int i = 1; i <= count; i++) {
            product *= i;
        }
        return product;
    }
//5. Возвращает произведение цифр целого числа value
    public int prodDigits(int value) {
        int product = 1;
        String s = String.valueOf(value);
        for (int i = 0; i < s.length(); i++) {
            product *= Character.getNumericValue(s.charAt(i));
        }
        return product;
    }
//6. Возвращает число Фибоначчи номер number.
    public int fibonacci(int number) {
        if (number <= 1) {
            return number;
        }

        int a = 0;
        int b = 1;
        int fib = 0;

        for (int i = 2; i <= number; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }
        return fib;
    }
//7.Возвращает сумму всех степеней 2 от 2^0 до 2^max
    public long sum2Powers(int max) {
        long sum = 0;
        for (int i = 0; i <= max; i++) {
            sum += Math.pow(2, i);
        }
        return sum;
    }
//8.Возвращает сумму квадратов целых чисел от 1 до count.
    public int sumSquaresWithBarrier(int count, int barrier) {
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += i * i;
            if (sum > barrier) {
                break;
            }
        }
        return sum;
    }
//9.Возвращает сумму всех произведений i*j (1 <=i <= count1 и 1 <=j <= count2)
    public int sumPairProd(int count1, int count2) {
        int sum = 0;
        for (int i = 1; i <= count1; i++) {
            for (int j = 1; j <= count2; j++) {
                sum += i * j;
            }
        }
        return sum;
    }
//10.Возвращает сумму тех произведений i*j, (1 <=i <= count1 и 1 <=j <= count2), которые меньше barrier
    public int sumPairProdWithBarrier(int count1, int count2, int barrier) {
        int sum = 0;
        for (int i = 1; i <= count1; i++) {
            for (int j = 1; j <= count2; j++) {
                int product = i * j;
                if (product < barrier) {
                    sum += product;
                }
            }
        }
        return sum;
    }
//11.Возвращает сумму всех величин 1/(i*j) (1 <=i <= count1 и 1 <=j <= count2)
    public double sumInversePairProd(int count1, int count2) {
        double sum = 0;
        for (int i = 1; i <= count1; i++) {
            for (int j = 1; j <= count2; j++) {
                sum += 1.0 / (i * j);
            }
        }
        return sum;
    }
//12.Возвращает сумму всех произведений i*j *k (1 <=i <= count1, 1 <=j <= count2, 1 <=k <= count3)
    public int sumTripleProd(int count1, int count2, int count3) {
        int sum = 0;
        for (int i = 1; i <= count1; i++) {
            for (int j = 1; j <= count2; j++) {
                for (int k = 1; k <= count3; k++) {
                    sum += i * j * k;
                }
            }
        }
        return sum;
    }
//13.Возвращает значение числа e, вычисляемое по следующей формуле
//1 + 1/(1) + 1 / (1 * 2) + 1 / (1* 2 * 3) + 1 / (1* 2 * 3 * 4) + 1 / (1* 2 * 3 * 4 * 5) + …
//Суммирование вести до тех пор, пока очередной элемент не станет меньше 1E-6
    public double calculateE() {
        double sum = 1.0;
        double term = 1.0;
        long factorial = 1;
        int i = 1;

        while (term >= 1E-6) {
            factorial *= i;
            term = 1.0 / factorial;
            sum += term;
            i++;
        }

        return sum;
    }
//14. Возвращает значение числа π
    public double calculatePi() {
        double pi = 0.0;
        double term = 1.0;
        int denominator = 1;
        int sign = 1;


        while (Math.abs(term) >= 1E-8) {
            term = (double) sign / denominator;
            pi += term;
            denominator += 2;
            sign *= -1;
        }

        return 4 * pi;
    }
//15.
    public double calculateCircleSquare(double length, int count) {
        double centerX = length / 2;
        double centerY = length / 2;
        double radius = length / 2;
        int k = 0;
        for (int i = 0; i < count; i++) {
            double x = Math.random() * length;
            double y = Math.random() * length;

            if (Math.pow(x - centerX, 2) + Math.pow(y - centerY, 2) <= Math.pow(radius, 2)) {
                k++;
            }
        }
        return length * length * k / count;
    }
}
