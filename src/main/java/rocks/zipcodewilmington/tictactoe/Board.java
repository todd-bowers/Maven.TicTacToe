package rocks.zipcodewilmington.tictactoe;

import java.security.PublicKey;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    public Character[][] matrix;
    public char X = 'X';
    public char O = 'O';
    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Boolean isInFavorOfX() {
        if (matrix[0][0].equals('X') && matrix[0][1].equals('X') && matrix[0][2].equals('X')) return true;
            else if (matrix[1][0].equals('X') && matrix[1][1].equals('X') && matrix[1][2].equals('X')) return true;
            else if (matrix[2][0].equals('X') && matrix[2][1].equals('X') && matrix[2][2].equals('X')) return true;
            else if (matrix[0][0].equals('X') && matrix[1][1].equals('X') && matrix[2][2].equals('X')) return true;
            else if (matrix[2][0].equals('X') && matrix[1][1].equals('X') && matrix[0][2].equals('X')) return true;
            else if (matrix[0][0].equals('X') && matrix[1][0].equals('X') && matrix[2][0].equals('X')) return true;
            else if (matrix[0][1].equals('X') && matrix[1][1].equals('X') && matrix[2][1].equals('X')) return true;
            else if (matrix[0][2].equals('X') && matrix[1][2].equals('X') && matrix[2][2].equals('X')) return true;
            else return false;
    }

    public Boolean isInFavorOfO() {
        if (matrix[0][0].equals('O') && matrix[0][1].equals('O') && matrix[0][2].equals('O')) return true;
            else if (matrix[1][0].equals('O') && matrix[1][1].equals('O') && matrix[1][2].equals('O')) return true;
            else if (matrix[2][0].equals('O') && matrix[2][1].equals('O') && matrix[2][2].equals('O')) return true;
            else if (matrix[0][0].equals('O') && matrix[1][1].equals('O') && matrix[2][2].equals('O')) return true;
            else if (matrix[2][0].equals('O') && matrix[1][1].equals('O') && matrix[0][2].equals('O')) return true;
            else if (matrix[0][0].equals('O') && matrix[1][0].equals('O') && matrix[2][0].equals('O')) return true;
            else if (matrix[0][1].equals('O') && matrix[1][1].equals('O') && matrix[2][1].equals('O')) return true;
            else if (matrix[0][2].equals('O') && matrix[1][2].equals('O') && matrix[2][2].equals('O')) return true;
            else return false;
    }

    public Boolean isTie() {
        if (this.isInFavorOfO().equals(false) && this.isInFavorOfX().equals(false)) return true;
        else return false;
    }

    public String getWinner() {
        if (this.isInFavorOfX().equals(true)) return "X";
        else if (this.isInFavorOfO().equals(true)) return "O";
        else return "";
    }

}
