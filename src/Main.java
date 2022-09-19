import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        task1(arr);
        task2(arr);
        task3(arr);
        task4(arr);
        task5(arr);


    }

    private static void task5(int[] arr) {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length -1; i != -1 ; i--) {
            System.out.print(reverseFullName[i]);
        }
    }


    private static void task4(int[] arr) {private static void task1(int[] arr) {

        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            System.out.println("Средняя сумма трат за месяц составила " + (sum/30) + " рублей");
    }

    private static void task3(int[] arr) {
        int min= arr[0]+1;
        for(int i=0;i<arr.length;i++) {if (arr[i]<min){ min=arr[i];}
            System.out.println(min);

    }
    }

    private static void task2(int[] arr) {int max = -1;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max=arr[i];

            }

    private static void task1(int[] arr) {
        arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        System.out.println(sum);
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            System.out.println(arr[i]);}}

        return arr;
    }
}}