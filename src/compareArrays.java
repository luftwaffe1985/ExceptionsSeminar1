// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
// каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. 
// Если длины массивов не равны, необходимо как-то оповестить пользователя.

import java.util.Arrays;

public class compareArrays {
    public static int[] compareElementsDifference(int[] arr1, int[] arr2){
        if(arr1.length != arr2.length){
            System.out.println("Arrays are not equal");
            return null;
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2,43,55,65, 75};
        int[] arr1 = {2,43,55,65};

        int[] res = compareElementsDifference(arr, arr1);
        System.out.println(Arrays.toString(res));
    }
}