import java.util.Scanner;

public class TicTacToeGame {

    //Method to initialize array elements
    public static char[] createBorad() {
        char [] board = new char[10];
        for (int index = 1; index < board.length; index++) {
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

    //main method to execute the program
    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe Game.");
        //calling method to create board
        char [] board = createBorad();
        //calling method to take input
        userInput();
    }
}
