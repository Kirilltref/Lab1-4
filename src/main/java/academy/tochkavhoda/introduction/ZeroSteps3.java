package academy.tochkavhoda.introduction;

public class ZeroSteps3 {
//1.Возвращает сумму чисел, заданных одномерным массивом array. Для пустого одномерного массива
//возвращает 0.
    public int sum(int[] array) {
        int result = 0;
        for (int num : array) {
            result += num;
        }
        return result;
    }
//2.Возвращает произведение чисел, заданных одномерным массивом array. Для пустого одномерного
//массива возвращает 0.
    public int mul(int[] array) {
        if (array.length == 0) return 0;
        int result = 1;
        for (int num : array) {
            result *= num;
        }
        return result;
    }
//3.Возвращает минимальное из чисел, заданных одномерным массивом array. Для пустого одномерного
//массива возвращает Integer.MAX_VALUE.
    public int min(int[] array) {
        if (array.length == 0) return Integer.MAX_VALUE;
        int min = array[0];
        for (int num : array) {
            if (num < min) min = num;
        }
        return min;
    }
//4.Возвращает максимальное из чисел, заданных одномерным массивом array. Для пустого одномерного
//массива возвращает Integer.MIN_VALUE.
    public int max(int[] array) {
        if (array.length == 0) return Integer.MIN_VALUE;
        int max = array[0];
        for (int num : array) {
            if (num > max) max = num;
        }
        return max;
    }
//5.Возвращает среднее значение для чисел, заданных одномерным массивом array. Для пустого
//одномерного массива возвращает 0.
    public double average(int[] array) {
        if (array.length == 0) return 0;
        return (double) sum(array) / array.length;
    }
//6.Возвращает true, если одномерный массив array строго упорядочен по убыванию, иначе false. Пустой
//одномерный массив считается упорядоченным.
    public boolean isSortedDescendant(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                return false;
            }
        }
        return true;
    }
//7.Возводит все элементы одномерного массива array в куб.
    public void cube(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= array[i] * array[i];
        }
    }
//8.Возвращает true, если в одномерном массиве array имеется элемент, равный value, иначе false.
    public boolean find(int[] array, int value) {
        for (int num : array) {
            if (num == value) return true;
        }
        return false;
    }
//9.Переворачивает одномерный массив array, то есть меняет местами 0-й и последний, 1-й и
//предпоследний и т.д. Элементы.
    public void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
//10.Возвращает true, если одномерный массив является палиндромом, иначе false. Пустой массив
//считается палиндромом.
    public boolean isPalindrome(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
//11.Заменяет элементы массива array на их квадраты, пока не встретится нулевой элемент
    public void replaceBySquare(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) break;
            array[i] *= array[i];
        }
    }
//12.Возвращает произведение ненулевых чисел, заданных одномерным массивом array. Для пустого
//одномерного массива возвращает 0.
    public int mulNonZero(int[] array) {
        if (array.length == 0) return 0;
        int result = 1;
        boolean hasNonZero = false;
        for (int num : array) {
            if (num != 0) {
                result *= num;
                hasNonZero = true;
            }
        }
        return hasNonZero ? result : 0;
    }
//13.Возвращает true, если все элементы массива положительные, иначе false. Для пустого одномерного
//массива возвращает false.
    public boolean allPositive(int[] array) {
        if (array.length == 0) return false;
        for (int num : array) {
            if (num <= 0) return false;
        }
        return true;
    }
//14.Возвращает true, если все элементы массива равны между собой, иначе false. Для пустого
//одномерного массива возвращает true
    public boolean allEqual(int[] array) {
        if (array.length == 0) return true;
        int first = array[0];
        for (int num : array) {
            if (num != first) return false;
        }
        return true;
    }
//15.Возвращает индекс первого элемента, который больше своих соседей. Нулевой и последний элементы
//не учитываются. Если такого элемента нет, возвращает -1
    public int greaterThanNeighbours(int[] array) {
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                return i;
            }
        }
        return -1;
    }
//16.Определяет, есть ли среди элементов массива array такой элемент, который равен полусумме своих
//соседей. Нулевой и последний элементы не учитываются.
    public boolean neighboursAverage(double[] array) {
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] == (array[i - 1] + array[i + 1]) / 2) {
                return true;
            }
        }
        return false;
    }
//17.В массиве array есть ровно 2 нулевых элемента. Возвращает сумму элементов массива, стоящих
//между ними.
    public int sumBetween2Zeros(int[] array) {
        int firstZero = -1;
        int secondZero = -1;

        // Находим позиции нулей
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                if (firstZero == -1) {
                    firstZero = i;
                } else {
                    secondZero = i;
                    break;
                }
            }
        }

        int sum = 0;
        for (int i = firstZero + 1; i < secondZero; i++) {
            sum += array[i];
        }
        return sum;
    }
//18.Возвращает количество элементов, для которых совпадают значения в одной и той же позиции в
//обоих массивах. Не гарантируется, что массивы имеют одинаковую длину.
    public int sameAtPosition(int[] array1, int[] array2) {
        int count = 0;
        int minLength = Math.min(array1.length, array2.length);

        for (int i = 0; i < minLength; i++) {
            if (array1[i] == array2[i]) {
                count++;
            }
        }
        return count;
    }
//19.Возвращает true, если есть хотя бы одна позиция в массивах, для которой элементы в обоих массивах
//нулевые. Не гарантируется, что массивы имеют одинаковую длину.
    public boolean bothZeroAtPosition(int[] array1, int[] array2) {
        int minLength = Math.min(array1.length, array2.length);

        for (int i = 0; i < minLength; i++) {
            if (array1[i] == 0 && array2[i] == 0) {
                return true;
            }
        }
        return false;
    }
//20.Заменяет все элементы массива array по следующему правилу : i-ый элемент массива должен стать
//равен сумме всех элементов массива с индексами от 0 до i (т.н. сумма с накоплением).
    public void accumulatedSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            array[i] = sum;
        }
    }
//21.Массивы array1 и array2 гарантированно упорядочены по возрастанию и имеют ненулевую длину.
//Возвращает массив, содержащий все элементы обоих массивов, который должен быть упорядочен по
//неубыванию.
    public int[] mergeArrays(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length + array2.length];
        int i = 0, j = 0, k = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] <= array2[j]) {
                mergedArray[k++] = array1[i++];
            } else {
                mergedArray[k++] = array2[j++];
            }
        }

        while (i < array1.length) {
            mergedArray[k++] = array1[i++];
        }

        while (j < array2.length) {
            mergedArray[k++] = array2[j++];
        }

        return mergedArray;
    }
//22.Возвращает количество точек, попадающих в круг радиуса radius с центром в точке (0,0). Координаты
//точек задаются двумя массивами x и y, имеющими одинаковую длину. Точки, попадающие на линию
//окружности, считаются попавшими в круг.
    public int insideCircle(int[] x, int[] y, int radius) {
        int count = 0;
        int radiusSquared = radius * radius;
        for (int i = 0; i < x.length; i++) {
            int distanceSquared = x[i] * x[i] + y[i] * y[i];
            if (distanceSquared <= radiusSquared) {
                count++;
            }
        }
        return count;
    }
//23.Найти сумму попарных произведений элементов двух массивов (т.н. Скалярное произведение), то
//есть array1[0] * array2[0] + array1[1] * array2[1]+ ... Массивы имеют одинаковую длину
    public double scalarProduct(double[] array1, double[] array2) {
        double sum = 0.0;
        for (int i = 0; i < array1.length; i++) {
            sum += array1[i] * array2[i];
        }
        return sum;

    }
}
