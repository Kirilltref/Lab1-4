package academy.tochkavhoda.introduction;

public class ZeroSteps1 {
    //1.Возвращает сумму чисел x и y.
public int sum (int x, int y ){
    return x + y;
}

//2.Возвращает произведение чисел x и y
public int mul (int x, int y){
    return x * y;
}

//3.Возвращает частное от деления чисел x и y. Гарантируется, что y != 0.
public int div (int x, int y){
    return x / y;
}

//4.Возвращает остаток от деления чисел x и y. Гарантируется, что y != 0.
    public int mod(int x, int y) {
        return x % y;
    }

//5.Возвращает true, если x равен y, иначе false.
    public boolean isEqual(int x, int y) {
        return x == y;
    }

//6.Возвращает true, если x больше y, иначе false.
    public boolean isGreater(int x, int y) {
        return x > y;
    }

//7.Прямоугольный треугольник задан двумя катетами. Найти его площадь
    public double calculateTriangleSquare(int side1, int side2) {
        return (side1 * side2) / 2.0;
    }

//8.Прямоугольный треугольник задан двумя катетами. Найти его периметр.
    public double calculateTrianglePerimeter(int side1, int side2) {
        double hypotenuse = Math.sqrt(side1 * side1 + side2 * side2);
        return side1 + side2 + hypotenuse;
    }

//9.Дано целое трехзначное число. Получить число, которое получится из него путем выписывания его
//цифр в обратном порядке.
    public int reverseNumber(int number) {
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int units = number % 10;
        return units * 100 + tens * 10 + hundreds;
    }

//10.Дано целое число. Возвести его в степень 15, используя не более 5 умножений.
    public long calculate15Degree(int number) {
        long square = number * number;         // n^2
        long fourth = square * square;         // n^4
        long eighth = fourth * fourth;         // n^8
        return eighth * fourth * square * number; // n^8 * n^4 * n^2 * n = n^15
    }

//11.Прямоугольник с горизонтальными и вертикальными сторонами, задан двумя точками - левой верхней
//(xLeft, yTop) и правой нижней (xRight, yBottom). На плоскости OXY ось X направлена вправо, ось Y -
//вниз. Дана еще одна точка с координатами (x, y). Гарантируется, что xLeft < xRight и yTop < yBottom.
//Метод должен возвращать true, если точка лежит внутри прямоугольника , иначе false. Если точка лежит
//на границе прямоугольника, то считается, что она лежит внутри него.
    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y) {
        return x >= xLeft && x <= xRight && y >= yTop && y <= yBottom;
    }

//12.Находит квадратный корень абсолютной величины числа
    public double sqrtAbs(int number) {
        return Math.sqrt(Math.abs(number));
    }

//13.Возвращает true, если существует ли треугольник с такими тремя сторонами, иначе false
    public boolean isTriangleExist(int side1, int side2, int side3) {
        return (side1 + side2 > side3) &&
                (side1 + side3 > side2) &&
                (side2 + side3 > side1);
    }

//14.Возвращает произведение цифр четырехзначного целого числа.
    public int getDigitsProduction(int number) {
        int thousands = number / 1000;
        int hundreds = (number / 100) % 10;
        int tens = (number / 10) % 10;
        int units = number % 10;
        return thousands * hundreds * tens * units;
    }

//15.Возвращает true, если круг радиуса radius может поместиться внутри квадрата со стороной side, не
//касаясь окружности, иначе false
    public boolean isCircleInsideSquare(int radius, int side) {
        return side > 2 * radius;
    }
//16.Возвращает символ с кодом code
    public char getCharByCode(short code) {
        return (char) code;
    }
//17.Возвращает код символа character
    public short getCodeByChar(char character) {
        return (short) character;
    }
//18.Возвращает код символа, который имеет код на offset больше, чем символ ch.
    public char getCharByCodeAndOffset(char ch, short offset) {
        return (char) (ch + offset);
    }
//19.Возвращает true, если код ch1 больше или равен коду ch2, иначе false
    public boolean isGreaterOrEqual(char ch1, char ch2) {
        return ch1 >= ch2;
    }
//20.Возвращает символ с кодом, равном полусумме кодов ch1 и ch2
    public char getAverageChar(char ch1, char ch2) {
        return (char) ((ch1 + ch2) / 2);
    }
}
