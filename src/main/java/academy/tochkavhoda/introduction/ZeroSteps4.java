package academy.tochkavhoda.introduction;

public class ZeroSteps4 {
    //1.Возвращает минимальное из чисел, заданных двумерным массивом matrix.
    public int min(int[][] matrix) {
        if (matrix.length == 0) return Integer.MAX_VALUE;

        int min = Integer.MAX_VALUE;
        for (int[] row : matrix) {
            for (int num : row) {
                if (num < min) min = num;
            }
        }
        return min;
    }
//2.Возвращает максимальное из чисел, заданных двумерным массивом matrix.
    public int max(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return Integer.MIN_VALUE;
        }
        int maxValue = Integer.MIN_VALUE;
        for (int[] row : matrix) {
            if (row != null) {
                for (int num : row) {
                    if (num > maxValue) {
                        maxValue = num;
                    }
                }
            }
        }
        return maxValue;

    }
//3.Возвращает true, если в двумерном массиве matrix имеется элемент, равный value, иначе false.
    public boolean find(int[][] matrix, int value) {
        for (int[] row : matrix) {
            for (int num : row) {
                if (num == value) return true;
            }
        }
        return false;
    }
//4.Возвращает true, если все строки двумерного массива matrix строго упорядочены по убыванию, иначе
//false.
    public boolean isSortedDescendant(int[][] matrix) {
        for (int[] row : matrix) {
            for (int i = 0; i < row.length - 1; i++) {
                if (row[i] <= row[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }
//5.Возвращает количество строк двумерного массива matrix, не содержащих нулевого элемента.
    public int hasNoZeroRows(int[][] matrix) {
        int count = 0;
        for (int[] row : matrix) {
            boolean hasZero = false;
            for (int num : row) {
                if (num == 0) {
                    hasZero = true;
                    break;
                }
            }
            if (!hasZero) count++;
        }
        return count;
    }
//6.Возвращает true, если в двумерном массиве matrix есть хотя бы одна строка, состоящая только из
//нулевых элементов, иначе false.
    public boolean hasFullZeroRow(int[][] matrix) {
        for (int[] row : matrix) {
            if (row.length == 0) {
                continue;
            }
            boolean allZero = true;
            for (int num : row) {
                if (num != 0) {
                    allZero = false;
                    break;
                }
            }
            if (allZero) {
                return true;
            }
        }
        return false;
    }
//7.Возвращает true, если в квадратном двумерном массиве matrix все элементы симметричны
//относительно главной диагонали
    public boolean isSymmetric(int[][] matrix) {
        if (matrix.length == 0) return true;

        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
//8.Возвращает максимальное из чисел, находящихся на главной диагонали квадратного двумерного
//массива matrix. Для пустого двумерного массива возвращает Integer.MIN_VALUE
    public int mainDiagonalMax(int[][] matrix) {
        if (matrix.length == 0) return Integer.MIN_VALUE;

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length > i) {
                max = Math.max(max, matrix[i][i]);
            }
        }
        return max;
    }
//9.Возвращает сумму положительных элементов главной диагонали квадратного двумерного массива
//matrix.
    public int mainDiagonalPositivesSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length > i && matrix[i][i] > 0) {
                sum += matrix[i][i];
            }
        }
        return sum;
    }
    //10.Возвращает максимальное из чисел, находящихся на побочной диагонали квадратного двумерного
    //массива matrix. Для пустого двумерного массива возвращает Integer.MIN_VALUE
    public int secondaryDiagonalMax(int[][] matrix) {
        if (matrix.length == 0) return Integer.MIN_VALUE;

        int max = Integer.MIN_VALUE;
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            if (matrix[i].length > (n - 1 - i)) {
                max = Math.max(max, matrix[i][n - 1 - i]);
            }
        }
        return max;
    }
    //11.Возвращает сумму положительных элементов побочной диагонали квадратного двумерного массива
    //matrix.
    public int secondaryDiagonalPositivesSum(int[][] matrix) {
        int sum = 0;
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            if (matrix[i].length > (n - 1 - i) && matrix[i][n - 1 - i] > 0) {
                sum += matrix[i][n - 1 - i];
            }
        }
        return sum;
    }
//12.Возвращает сумму двух двумерных массивов matrix1 и matrix2 одинаковых размеров
    public int[][] matrixSum(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][];

        for (int i = 0; i < matrix1.length; i++) {
            result[i] = new int[Math.min(matrix1[i].length, matrix2[i].length)];
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }
//13.Транспонирует квадратный массив matrix, то есть меняет друг с другом значения matrix[i][j] и
//matrix[j][i] для всех i, j
    public void transpose(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
//14.Меняет местами четные и нечетные строки двумерного массива matrix. Количество строк в массиве
//четное. Строки массивов могут иметь разную длину, в том числе и нулевую.
    public void interchange(int[][] matrix) {
        for (int i = 0; i < matrix.length; i += 2) {
            int[] temp = matrix[i];
            matrix[i] = matrix[i + 1];
            matrix[i + 1] = temp;
        }
    }
//15.По двумерному массиву matrix делает одномерный массив, переписывая туда все элементы matrix,
//при проходе ее по строкам.
    public int[] toLinearByRow(int[][] matrix) {
        int totalLength = 0;
        for (int[] row : matrix) {
            totalLength += row.length;
        }

        int[] result = new int[totalLength];
        int index = 0;
        for (int[] row : matrix) {
            for (int num : row) {
                result[index++] = num;
            }
        }
        return result;
    }
//16.По двумерному квадратному массиву matrix делает одномерный массив, переписывая туда все
//элементы matrix, при проходе ее по столбцам.
    public int[] toLinearByColumn(int[][] matrix) {
        int n = matrix.length;
        int[] result = new int[n * n];
        int index = 0;

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                if (j < matrix[i].length) {
                    result[index++] = matrix[i][j];
                }
            }
        }
        return result;
    }
//17.По двумерному квадратному массиву matrix делает одномерный массив, переписывая туда все
//элементы верхнего треугольника matrix (то есть элементы на главной диагонали и выше ее), при
//проходе ее по строкам.
    public int[] toLinearByRowUpperTriangle(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix.length != matrix[0].length) {
            return new int[0];
        }

        int n = matrix.length;
        int elements = n * (n + 1) / 2;
        int[] linearArray = new int[elements];

        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                linearArray[index++] = matrix[i][j];
            }
        }

        return linearArray;
    }
//18.Находит сумму элементов двумерного массива matrix, проходя его по строкам.
    public int sumUntilNotFoundInRow(int[][] matrix, int barrier) {
        int totalSum = 0;

        for (int[] row : matrix) {
            int rowSum = 0;
            for (int num : row) {
                if (num == barrier) {
                    break;
                }
                rowSum += num;
            }
            totalSum += rowSum;
        }
        return totalSum;
    }
//19.Находит сумму элементов двумерного массива matrix, проходя его по строкам пока не встретится
//элемент со значением barrier, его в сумму не включают
    public int sumUntilNotFound(int[][] matrix, int barrier) {
        int sum = 0;

        for (int[] row : matrix) {
            for (int num : row) {
                if (num == barrier) {
                    return sum;
                }
                sum += num;
            }
        }
        return sum;
    }

}
