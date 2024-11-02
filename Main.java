// Main.java

public class Main {
    public static void main(String[] args) {
        // Пример массива 4x4 с ощибкой
        String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "A", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            // обработка массива и получение суммы
            int result = ArrayProcessor.processArray(array);
            System.out.println("Сумма всех элементов массива: " + result);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
}