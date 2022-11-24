import sun.security.util.Length;

import java.util.Arrays;

public class JavaSyntax_4_3_Methods {
    public static void main (String[] args) {

        int [] arrayOfRandNumbers = createArrayOfRandomIntValues (8); // Задача 1
        //System.out.print(Arrays.toString(arrayOfRandNumbers));
        System.out.println();

        int[] array = {7, 6, 7, 8, 3}; // Задача 2, 3
        int maxValueinArray = findMaxValueInArray(arrayOfRandNumbers);
        System.out.println("Максимальное значение в массиве = "+ maxValueinArray);
        int minValueinArray = findMinValueInArray(arrayOfRandNumbers);
        System.out.println("Минимальное значение в массиве = "+ minValueinArray);

        //Задача 4
        int [] sortedArray = sortInAscOrder(array);
        System.out.println(sortedArray);


    }

    // Задача 1
    public static int[] createArrayOfRandomIntValues (int razmer){
        int[] resultArray = new int[razmer];

        for (int i = 0; i < razmer; i++){
            resultArray [i] = (int) (Math.random()*10 - 5);
            System.out.print(resultArray [i] + " ");
        }
        return resultArray;
    }

    // Задача 2
    public static int findMaxValueInArray (int [] array){
        int maxValue = array[0];

        for (int i = 1; i < array.length; i++){
            if (maxValue <= array[i])
                maxValue = array[i];
        }
        return maxValue;
    }
    // Задача 3
    public static int findMinValueInArray (int [] array){
        int minValue = array[0];

        for (int i = 1; i < array.length; i++){
            if (minValue >= array[i])
                minValue = array[i];
        }
        return minValue;
    }

    // Задача 4
    public static int[] sortInAscOrder (int [] array){
        int[] resultArray = array;

        for (int i = 0; i < array.length - 1; i++){
            int a = resultArray [i];
            if (resultArray [i] > resultArray [i+1])
            resultArray [i] = resultArray [i+1];
            resultArray [i+1] =a;

            System.out.print(resultArray [i] + " ");
        }
        return resultArray;
    }

    // Задача 5
    public static int sortInDescOrder (int [] array){
        int minValue = array[0];

        for (int i = 1; i < array.length; i++){
            if (minValue >= array[i])
                minValue = array[i];
        }
        return minValue;
    }


}
