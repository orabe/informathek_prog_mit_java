package medizin_technik;



public class Main_TickTacToe {
    public static boolean checkTicTacToe(char[][] field, char symbol) {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (field[i][0] == symbol && field[i][1] == symbol && field[i][2] == symbol) {
                return true;
            }
        }

        // Check columns
        for (int j = 0; j < 3; j++) {
            if (field[0][j] == symbol && field[1][j] == symbol && field[2][j] == symbol) {
                return true;
            }
        }

        // Check diagonals
        if (field[0][0] == symbol && field[1][1] == symbol && field[2][2] == symbol) {
            return true;
        }
        if (field[0][2] == symbol && field[1][1] == symbol && field[2][0] == symbol) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        char[][] field1 = {{'x', 'x', 'x'},
                           {'x', 'o', 'o'},
                           {'o', 'o', 'x'}};

        char[][] field2 = {{'o', 'x', 'x'},
                           {'x', 'o', 'o'},
                           {'x', 'x', 'o'}};

        System.out.println(checkTicTacToe(field1, 'x'));
        System.out.println(checkTicTacToe(field1, 'o'));
        System.out.println(checkTicTacToe(field2, 'x'));
        System.out.println(checkTicTacToe(field2, 'o'));
    }
}
