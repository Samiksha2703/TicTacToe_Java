import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
public class TicTacToeGame {
    public static int index;
    public static char[] board;
    public static Scanner sc = new Scanner(System.in);

    //Method to initialize array elements
    public static char[] createBorad() {
        char[] board = new char[10];
        for (index = 1; index < board.length; index++) {
            board[index] = ' ';
        }
        return board;
    }

    //method to take user input
    public static char userInput() {
        System.out.println("Enter the input X/O.");
        char userInput = sc.next().toUpperCase().charAt(0);
        int computer = (userInput == 'X') ? 'O' : 'X';
        return userInput;
    }

    //method to display board
    public static char[] displayBoard() {
            index = 1;
            System.out.println(" | " + board[index] + " | " + board[index + 1] + " | " + board[index + 2] + " | ");
            System.out.println(" | " + board[index + 3] + " | " + board[index + 4] + " | " + board[index + 5] + " | ");
            System.out.println(" | " + board[index + 6] + " | " + board[index + 7] + " | " + board[index + 8] + " | ");
        return board;
    }

    //method to make a move by user
    private static int makeMove(char [] board) {
        Integer[] validCells = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        while (true) {
            System.out.println("What is the next move? (1-9): ");
            int userIndex = sc.nextInt();
            if (Arrays.asList(validCells).contains(userIndex) && isSpaceFree(board, userIndex)){
                board[userIndex] = userInput();
                displayBoard();
            }
                return userIndex;
        }
    }

    //method to check whether particular index is free or not
    private static boolean isSpaceFree(char[] board, int index){
            return board[index] == ' ';
        }

    private static boolean takeToss() {
        System.out.println("Enter the number\n1 for Head\n2 for Tail");
        int choice = sc.nextInt();
        int random = (int) Math.floor(Math.random() * 2 );
        boolean won = (random == choice) ? true : false;
        return won;
    }

    //main method to execute the program
    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe Game.");
        //calling method to create board
        board = createBorad();
        //calling method to display board
        displayBoard();
        //check who won the toss
        boolean wonOrLoss = takeToss();
        //calling method to make a move
        int userMove = makeMove(board);


    }
}
