public class PowerOf2{
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        if (N >= 31){
            System.out.println("Please enter a number less than 31.");
        } else {
            double result = 0;
            for (int i = 0; i <= N; i++){
                result = Math.pow(2, i);
                System.out.println("2^"+i+" = " + result);
            }
        }
    }
}