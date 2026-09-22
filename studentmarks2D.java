import java.io.*;
import java.util.*;

public class studentmarks2D {
    public static void main(String[] args) {
        
        int marks[][] = {
            {80, 75, 90},
            {85, 70, 88},
            {92, 80, 95}
        };

        System.out.println("Student marks are:");

        for(int i = 0; i < marks.length; i++) {
            for(int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + "\t");
            }
            System.out.println();
        }
    }
}