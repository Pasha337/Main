// Класс исключения для ошибки размера массива
class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}

// Класс исключения для ошибки преобразования данных в массиве
class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super(message);
    }
}

public class ArrayProcessor {
    public static int processArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        // Проверка размера массива
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Ошибка: массив должен быть размером 4x4.");
        }

        int sum = 0; // Переменная для хранения суммы всех элементов

        // Проход по всем элементам массива
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    // Преобразуем текущий элемент массива в число и добавляем к сумме
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    // Если преобразование не удалось, выбрасываем исключение
                    throw new MyArrayDataException("Ошибка данных в ячейке [" + i + "][" + j + "]: \"" + array[i][j] + "\" не является числом.");
                }
            }
        }

        // Возвращаем сумму, если все элементы корректные
        return sum;
    }
}