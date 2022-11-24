package task_1;

public class WorkingWithArray {
    public static void main (String [] args) {
        int [] myArray = new int[]{800, 11, 65, 4500, 1, 39};

        int maxValue = getMaxValue (myArray);
        int minValue = getMinValue(myArray);
        double mean = getMean (myArray);

        printArray(myArray);


        System.out.println("Максимальное значение в массиве: " + maxValue);
        System.out.println("Минимальное значение в массиве: " + minValue);
        System.out.print("Среднее значение всех чисел: ");
        System.out.printf("%.2f", mean); // округлила до двух знаков после запятой

    }
    //печатает в консоль массив

    public static void printArray (int[] array){
        System.out.print("Задан массив: {");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("}");
    }

    // находит среди массива максимальное число
    public static int getMaxValue(int[] array){
        int maxValue = array[0];
        for(int i=1; i < array.length; i++){
            if(array[i] > maxValue){
            maxValue = array[i];
            }
        }
        return maxValue;
    }

    // находит среди массива минимальное число
    public static int getMinValue(int[] array){
        int minValue = array[0];
        for(int i=1; i < array.length; i++){
            if(array[i] < minValue){
                minValue = array[i];
            }
        }
        return minValue;
    }

    // находит среднее значение всех чисел

    public static int findSumWithoutUsingStream(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    public static double getMean(int[] array){
        int sum = 0;
        double mean;
//        for(int i=0; i < array.length; i++){
//                sum += array[i];
//            }
        // попробую-ка for-each:
        for (int value : array) {
            sum += value;
        }
        mean = (double) sum/array.length;
        return mean;
    }
}

/*
Task 1
Написать программу, которая:
* находит среди массива максимальное число
* находит среди массива минимальное число
* находит среднее значение всех чисел
Все числа вывести на консоль.
 */