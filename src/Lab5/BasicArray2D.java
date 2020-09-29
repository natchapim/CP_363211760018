package Lab5;
import java.util.Scanner;
public class BasicArray2D {
    public static void main (String[] args){
        int number[][] = new int [2][3]; // 2*3 = 6 blocks
        //input Data to array 2D
        number = inputData (number);
        //display data to  array 2 D
        displayArray(number);

    }
    private static void displayArray(int[][] number) {
        int t = 0;
        for (int i = 0; i <number.length ; i++) { //row
            for (int j = 0; j <number[i].length ; j++) { //column

                t += number[i][j]; // t=t+number[i][j]


            }
            System.out.println();
        }
    }
    private static int[][] inputData(int[][] number) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pleasa,input integers to array 2D:  ");
        for (int i = 0; i < number.length; i++) { //row
            for (int j = 0; j < number[i].length; j++) { //column
                System.out.print("number[" + i + "][" + j + "]:");//number[0][0]:
                number[i][j] = sc.nextInt();

            }
        }
        return  number;
    }
}
