import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] arr1 = {"Голова","Нога","Рука","Колено","Плечо"};
        Integer[] arr2 = {1,2,3,4,5,6,7,8,9};

        showArr(arr1);
        swapElements(arr1, 5,2);
        showArr(arr1);

        showArr(arr2);
        swapElements(arr2,1,9);
        showArr(arr2);

        transforms(arr1);

        Apple apple = new Apple(1f);
        Orange orange = new Orange(1.5f);
        Box orangeBox = new Box();
        Box appleBox = new Box();
        Box appleBox2 = new Box();

        orangeBox.add(orange);
        orangeBox.add(orange);
        appleBox.add(apple);
        appleBox.add(apple);

        System.out.println(orangeBox.getWeight());
        System.out.println(appleBox.getWeight());
        System.out.println(appleBox2.getWeight());

        System.out.println(orangeBox.compare(appleBox));

        appleBox.moveTo(appleBox2);

        System.out.println(appleBox.getWeight());
        System.out.println(appleBox2.getWeight());

    }

    private static void swapElements(Object[] array, int firstEl, int secondEl) {
        if (firstEl < 0 || firstEl > array.length ||
                secondEl < 0 || secondEl > array.length || firstEl == secondEl) {
            System.out.println("Неправильно указаны позиции элементов для замены");
        }
        Object temp = array[firstEl-1];
        array[firstEl-1] = array[secondEl-1];
        array[secondEl-1] = temp;
    }

    private static void showArr(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static <T> ArrayList transforms(Object[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }
}
