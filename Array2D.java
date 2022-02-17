import java.io.PrintWriter;
import java.util.Scanner;

public class Array2D{
    
    public static void main(String[] args){
        Array2D obj = new Array2D();

        // int[][] int2DArray = obj.read2DInt();
        // obj.print(int2DArray);

        // double[][] double2DArray = obj.read2DDouble();
        // obj.print(double2DArray);

        boolean[][] boolean2DArray = obj.read2DBoolean();
        obj.print(boolean2DArray);

    }
    /**
     * function to read a 2D integer array
     * @return
     */
    public int[][] read2DInt() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int m = input.nextInt();
        System.out.print("Enter number of columns: ");
        int n = input.nextInt();

        int[][] a = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = input.nextInt();
            }
        }

        input.close();
        return a;
    }

    /**
     * function to read double type 2D array
     * @return
     */
    public double[][] read2DDouble() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int m = input.nextInt();
        System.out.print("Enter number of columns: ");
        int n = input.nextInt();

        double[][] array = new double[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = input.nextDouble();
            }
        }

        input.close();
        return array;
    }

    /**
     *  function to read boolean type 2D array
     * @return
     */
    public boolean[][] read2DBoolean() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int m = input.nextInt();
        System.out.print("Enter number of columns: ");
        int n = input.nextInt();

        boolean[][] array = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = input.nextBoolean();
            }
        }
        input.close();
        return array;
    }
    /**
     * function to print integer type 2D array
     * @param a
     */
    public void print(int[][] a) {
        int m = a.length;
        int n = a[0].length;
        //System.out.println(m + " " + n);
        PrintWriter writer = new PrintWriter(System.out);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                writer.print(a[i][j] + "  ");
            }
            writer.println();
        }
        writer.flush();
        writer.close();
    }

    /**
     * function to print double type 2D array
     * @param a
     */
    public void print(double[][] a) {
        int m = a.length;
        int n = a[0].length;
        //System.out.println(m + " " + n);
        PrintWriter writer = new PrintWriter(System.out);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                writer.print(a[i][j] + "  ");
            }
            writer.println();
        }
        writer.flush();
        writer.close();
    }

    /**
     * function to print boolean type 2D array
     * @param a
     */
    public void print(boolean[][] a) {
        int m = a.length;
        int n = a[0].length;
        //System.out.println(m + " " + n);
        PrintWriter writer = new PrintWriter(System.out);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                writer.print(a[i][j] + "  ");
            }
            writer.println();
        }
        writer.flush();
        writer.close();
    }

}