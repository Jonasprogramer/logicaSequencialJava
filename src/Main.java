import java.util.Scanner;

public class Main {
    public static void main(String[] args){

       Scanner rd = new Scanner(System.in);
       int n1;
       int n2;

       n1 = rd.nextInt();
       n2 = rd.nextInt();

       int sum = n1 + n2;

       System.out.println("SOMA = " + sum);
    }
}