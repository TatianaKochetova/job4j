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
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        char symb = 'X';
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != symb) {
                result = false;
                break;
            }
        }
        return result;
    }
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i=0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }
    public static boolean isWin(char[][] board) {

        boolean result = false;
                for (int i=0; i < board.length; i++) {
            if (monoHorizontal(board, i) || monoVertical(board, i))  {
                result = true;
                break;
            }
        }
        return result;
    }
}
