import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj dowolną liczbę całkowitą: ");
        int liczba = scan.nextInt();
        if (liczba<0){
            System.out.println( "The number is negative");
        } else if (liczba==0){
            System.out.println("The value equals 0");
        }
        else {
            System.out.println("The number is positive");
        }
        }
    }
