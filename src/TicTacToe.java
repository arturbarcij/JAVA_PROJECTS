import java.util.Scanner;
import java.util.Random;

public class TicTacToe {

    /*
    Notes:
        _ | _ | _
        _ | _ | _
          |   |
         Helpful indices
         [0][0] , [0][2] , [0][4]
         [1][0] , [1][2] , [1][4]
         [2][0] , [2][2] , [2][4]
        Player = 1
        Computer = 2
 */

    static int playerScore = 0;
    static int computerScore = 0;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        char[][] board = {{'_','|','_', '|','_'},{'_','|','_','|','_'},{'_','|','_','|','_'}};
        printBoard(board);
        boolean gameOver = false;
        boolean playAgain = true;

        while(playAgain) {


            while (!gameOver) {
                playerMove(board);
                gameOver = isGameOver(board);
                if (gameOver) {
                    break;
                }
                computerMove(board);
                gameOver = isGameOver(board);
                if (gameOver) {
                    break;
                }
            }
            System.out.println("Player score: " +playerScore);
            System.out.println("Computer score: " +computerScore);
            System.out.println("Would you like to play again? Y/N");
            input.nextLine();
            String result = input.nextLine();

            switch (result){
                case "Y":
                case "y":
                    playAgain = true;
                    System.out.println("Dope! Let's play again");
                    resetBoard(board);
                    gameOver = false;
                    printBoard(board);
                    break;

                case "N":
                case "n":
                        playAgain = false;
                        System.out.println("Thanks for playing");
                        break;
                default:
                    break;
            }

        }
//        playerMove(board);
//        computerMove(board);
//        playerMove(board);
//        computerMove(board);
//        playerMove(board);
//        computerMove(board);
//        playerMove(board);
//        computerMove(board);
    }

    public static void printBoard(char [][] board) {
        for(char[] row : board){
            for(char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void updateBoard(int position, int player, char [][] board) {
        char character;

        if (player == 1) {
            character = 'X';
        } else {
            character = 'O';
        }

        switch (position) {
            case 1:
                    board[0][0] = character;
                    printBoard(board);
                    break;
            case 2:
                board[0][2] = character;
                printBoard(board);
                break;
            case 3:
                board[0][4] = character;
                printBoard(board);
                break;
            case 4:
                board[1][0] = character;
                printBoard(board);
                break;
            case 5:
                board[1][2] = character;
                printBoard(board);
            case 6:
                board[1][4] = character;
                printBoard(board);
                break;
            case 7:
                board[2][0] = character;
                printBoard(board);
                break;
            case 8:
                board[2][2] = character;
                printBoard(board);
                break;
            case 9:
                board[2][4] = character;
                printBoard(board);
                break;
            default:
                break;
        }
    }

    public static void playerMove(char[][] board) {
        System.out.println("Please make a move. 1-9 ");

        int move = input.nextInt();

        boolean result = isValidMove(move, board);

        while(!result){
            System.out.println("Sorry! Invalid Move. Try again");
            move = input.nextInt();
            result = isValidMove(move, board);
        }

        System.out.println("Player moved at " + move);

        updateBoard(move,1, board);
    }

    public static void computerMove(char [][] board){

        Random rand = new Random();
        int move = rand.nextInt(9)+1;

        boolean result = isValidMove(move, board);

        while(!result) {
            move = rand.nextInt(9)+1;
            result = isValidMove(move, board);
        }
        System.out.println("Computer moved at position " + move);
        updateBoard(move, 2, board);
    }
    public static boolean isGameOver(char [][] board) {
        if(board[0][0] == 'X' && board[0][2] == 'X' && board [0][4] == 'X') {
            System.out.println("Player Wins");
            playerScore++;
            return true;
        }
        if(board[0][0] == 'O' && board[0][2] == 'X' && board [0][4] == 'O') {
            System.out.println("Computer Wins");
            computerScore++;
            return true;
        }
        if(board[1][0] == 'X' && board[1][2] == 'X' && board [1][4] == 'X') {
            System.out.println("Player Wins");
            playerScore++;
            return true;
        }
        if(board[1][0] == 'O' && board[1][2] == 'O' && board [1][4] == 'O') {
            System.out.println("Computer Wins");
            computerScore++;
            return true;
        }
        if(board[2][0] == 'X' && board[2][2] == 'X' && board [2][4] == 'X') {
            System.out.println("Player Wins");
            playerScore++;
            return true;
        }
        if(board[2][0] == 'O' && board[2][2] == 'O' && board [2][4] == 'O') {
            System.out.println("Computer Wins");
            computerScore++;
            return true;
        }


        //VERTICAL WINS
        if(board[0][0] == 'X' && board[1][0] == 'X' && board [2][0] == 'X') {
            System.out.println("Player Wins");
            playerScore++;
            return true;
        }
        if(board[0][2] == 'O' && board[1][4] == 'O' && board [2][4] == 'O') {
            System.out.println("Computer Wins");
            computerScore++;
            return true;
        }
        if(board[0][4] == 'X' && board[1][4] == 'X' && board [2][4] == 'X') {
            System.out.println("Player Wins");
            playerScore++;
            return true;
        }
        if(board[0][4] == 'O' && board[1][4] == 'O' && board [2][4] == 'O') {
            System.out.println("Computer Wins");
            computerScore++;
            return true;
        }

        //DIAGONAL

        if(board[0][0] == 'X' && board[1][2] == 'X' && board [2][4] == 'X') {
            System.out.println("Player Wins");
            playerScore++;
            return true;
        }
        if(board[0][0] == 'O' && board[1][2] == 'O' && board [2][4] == 'O') {
            System.out.println("Computer Wins");
            computerScore++;
            return true;
        }
        if(board[2][4] == 'X' && board[1][2] == 'O' && board [0][4] == 'X') {
            System.out.println("Player Wins");
            playerScore++;
            return true;
        }
        if(board[2][0] == 'O' && board[1][2] == 'O' && board [2][4] == 'O') {
            System.out.println("Computer Wins");
            computerScore++;
            return true;
        }

        if(board[0][0] != '_' && board[0][2] != '_' && board[0][4] != '_' && board[1][0] != '_' &&
            board[1][2] != '_' && board[1][4] != '_' && board[2][0] != '_' && board[2][2] != '_'
            && board[2][4] != '_') {

            System.out.println("Its a tie");
            return true;
        }

        return false;
    }
    public static boolean isValidMove(int move, char[][] board) {

        switch (move) {
            case 1:
                if (board[0][0] == '_') {
                    return true;
                } else {
                    return false;
                }


            case 2:
                if (board[0][2] == '_') {
                    return true;
                } else {
                    return false;
                }



            case 3:
                if (board[0][4] == '_') {
                    return true;
                } else {
                    return false;
                }


            case 4:
                if (board[1][0] == '_') {
                    return true;
                } else {
                    return false;
                }


            case 5:
                if (board[1][2] == '_') {
                    return true;
                } else {
                    return false;
                }



            case 6:
                if (board[1][4] == '_') {
                    return true;
                } else {
                    return false;
                }


            case 7:
                if (board[2][0] == '_') {
                    return true;
                } else {
                    return false;
                }


            case 8:
                if (board[2][2] == '_') {
                    return true;
                } else {
                    return false;
                }



            case 9:
                if (board[2][4] == '_') {
                    return true;
                } else {
                    return false;
                }


        default:
        return false;

        }

    }

    public static void resetBoard(char [][] board){
        board[0][0] = '_';
        board[0][2] = '_';
        board[0][4] = '_';
        board[1][0] = '_';
        board[1][2] = '_';
        board[1][4] = '_';
        board[2][0] = '_';
        board[2][2] = '_';
        board[2][4] = '_';
    }
}
