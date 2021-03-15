import java.util.Locale;
import java.util.Scanner;

public class TicTacToeGame {

    public static int index;
    public static char [] board;

    //Method to initialize array elements
    public static char[] createBorad() {
        char [] board = new char[10];
        for (index = 1; index < board.length; index++) {
            board[index] = ' ';
        }
        return board;
    }

    //method to take user input
    public static char userInput() {
        char computer = 'O';
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input X/O.");
        char userInput = sc.next().charAt(0);
        if (userInput == computer) {
            computer = 'X';
        } else if (userInput != computer) {
            computer = 'O';
        } else {
            System.out.println("Invalid input.");
        }
        return userInput;
    }

    //method to display board
    public static char[] displayBoard() {
        int initialize = 1;
        for (index = initialize; index <= board.length - initialize; index++) {
            System.out.println(board[index] + " | " + board[index + 1] + " | " + board[index + 2]);
            initialize = initialize + 3;
        }
        return board;
    }
    //main method to execute the program
    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe Game.");
        //calling method to create board
         board = createBorad();
        //calling method to take input
        char input = userInput();
        displayBoard();
    }
}
