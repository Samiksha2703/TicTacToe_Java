public class TicTacToeGame {

    //Method to initialize array elements
    public char[] createBorad() {
            char [] board = new char[10];
            for (int index = 1; index < board.length; index++){
                board[index] = ' ';
            }
            return board;
    }

    //main method to execute the program
    public static void main(String [] args){
        System.out.println("Welcome to Tic Tac Toe Game.");
        //creating object of class
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        ticTacToeGame.createBorad();
    }

}
