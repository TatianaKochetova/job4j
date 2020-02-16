package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {

        for (int y = 0; y < data.length - 1; y++) {
            int min = MinDiapason.findMin(data, y, data.length - 1);
            int index = FindLoop.indexOf(data, min, y, data.length - 1);
            int temp = data[y];
            data[y] = data[index];
            data[index] = temp;
        }
        return data;
    }

}




