import java.util.Scanner;
import java.util.Random;

public class BrickBreaker {

    public static void main(String [] args) {
        char[] ball = {'o'};
        char[][] brickwall = {{'_','_','_','_','_','_','_','_','_','_','_','_','_','_','_'},
                              {'_','_','_','_','_','_','_','_','_','_','_','_','_','_','_'}};
        char [] platform = {'\\','_','_','_','_','_','_','/'};

        printGame(brickwall, platform, ball);
    }

    public static void printGame(char[][] brickwall, char[] platform, char[] ball) {
        for(char[] row: brickwall){
            for(char c : row) {
                System.out.print(c);
            }
            System.out.println(row);
        }

        for(int c = 0; c < 5; c++) {
            System.out.println(" ");
        }


            for(char i : ball) {
                System.out.print(i);
            }

            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");

        for(char row : platform) {
            System.out.print(row);
        }


    }
    public static void brickUpdate(char[][] brickwall) {}

    public static void platformUpdate(char [][] platform){}

    public static void Collision(char[][] brickwall, char[] platform, char[] ball){


    }
}
