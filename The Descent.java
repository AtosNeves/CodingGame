import java.util.*;
import java.io.*;
import java.math.*;

/**
 * The while loop represents the game.
 * Each iteration represents a turn of the game
 * where you are given inputs (the heights of the mountains)
 * and where you have to print an output (the index of the mountain to fire on)
 * The inputs you are given are automatically updated according to your last actions.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int maior = 0;
        int c = 0;
        int v = 0;
        // game loop
        while (true) {
            for (int i = 0; i < 8; i++) {
            
                int mountainH = in.nextInt(); // represents the height of one mountain.
                if( maior<mountainH){
                        maior = mountainH;
                        v = c;

                }
                c = c+1;
            }
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            System.out.println(v); // The index of the mountain to fire on.
            maior = 0;
            v = 0;
            c = 0;
        }
    }
}
