package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        char symb = 'X';
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] != symb) {
                    result = false;
                    break;
                }
        }
        return result;
    }
}