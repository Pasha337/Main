public class Main {
    public static void main(String[] args) {
        // Задание 1
        printThreeWords();
        // Задание 2
        checkSumSign();
        // Задание 3
        printColor();
        // Задание 4
        comppareNumbers();
        // Задание 5
        System.out.println(sumOfNumbers(7, 5));
        // Задание 6
        identifyNumber(0);
        identifyNumber(-7);
        // Задание 7
        System.out.println(identifyNumberTrue(7));
        System.out.println(identifyNumberTrue(-7));
        // Задание 8
        printStringAnyTimes("Тестовое сообщение", 3);
        // Задание 9
        System.out.println(leapYear(2024));
        System.out.println(leapYear(2012));
        System.out.println(leapYear(1994));
        // Задание 10
        int[] nums = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        invertNums(nums);
        printNums(nums);
        // Задание 11
        int[] numsHundred = new int[100];
        fillNums(numsHundred);
        printNums(numsHundred);
        // Задание 12
        int[] multi = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        modifyNumsMulti(multi);
        printNumsMulti(multi);
        // Задание 13
        int size = 6;
        int[][] squareNums = new int [size][size];
        fillDiagonal(squareNums);
        printDiagonal(squareNums);
        // Задание 14
        int[] customNums = createNums(3, 0);
        printNums(customNums);

        // Задание 1
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    // Задание 2
    public static void checkSumSign() {
        int a = 2;
        int b = 1;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    // Задание 3
    public static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    // Задание 4
    public static void comppareNumbers() {
      int a = 50;
      int b = 50;
      if (a >= b) {
          System.out.println("a >= b");
      } else {
          System.out.println("a < b");
      }
    }
    // Задание 5
    public static boolean sumOfNumbers(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }
    // Задание 6
    public static void identifyNumber(int a) {
        if (a >= 0) {
         System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    // Задание 7
    public static boolean identifyNumberTrue(int a) {
        if (a >= 0) {
            return false;
        } else {
            return true;
        }
    }
    // Задание 8
    public static void printStringAnyTimes(String text, int times) {
        for (int i=0; i < times; i++) {
            System.out.println(text);
        }
    }
    // Задание 9
    public static boolean leapYear (int year) {
        if (year % 400 == 0){
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0){
            return true;
        }else {
            return false;
        }
    }
    // Задание 10
    public static void invertNums(int[] nums) {
        for (int i=0; i<nums.length; i++){
            nums[i]=(nums[i] == 0) ? 1:0;
        }
    }
    // Задание 11
    public static void printNums(int[] nums) {
        for (int value: nums) {
            System.out.println(value + "");
        }
        System.out.println();
    }
    public static void fillNums(int [] nums){
        for (int i=0; i<nums.length; i++){
            nums[i] = i + 1;
        }
    }
    // Задание 12
    public static void modifyNumsMulti(int[] multi){
        for (int i=0; i< multi.length; i++){
            if (multi[i]<6){
                multi[i] *=2;
            }
        }
    }
    public static void printNumsMulti(int[] multi){
        for (int value : multi) {
            System.out.print(value + "");
        }
    }
    // Задание 13
    public static void fillDiagonal(int[][] nums){
        for (int i=0; i< nums.length; i++){
            nums[i][i]=1;
        }
    }
    public static void printDiagonal(int[][] nums) {
        for (int[] row : nums){
            for(int value : row){
                System.out.print(value +"");
            }
            System.out.println();

        }
    }
    // Задание 14
    public static int[] createNums(int len, int initialValue) {
        int[] nums = new int[len];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = initialValue;
        }
        return nums;
    }

}

