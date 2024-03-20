import javax.xml.transform.Source;
import java.time.LocalDate;
import java.util.Scanner;
import java.time.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj nazwę miasta z którego jesteś: ");
        String city = scan.next();
        double priceStart=40;
        double price =priceStart;
        price=discountCity(city,price);
        System.out.println("Podaj swój wiek: ");
        int wiek = scan.nextInt();
        price=discountAge(price,wiek);
        price=discountIfThursday( price);
        int discount = (int) ((1 - (price / priceStart)) * 100);
        System.out.println("Data: "+city+", "+wiek+" years old, "+"weekday Ticket price: "+price+" PLN");
        System.out.println("Discount: "+discount+"%");




        }
        public static double discountCity(String city,double price){
        if (city.equals("Warszawa")) {
            price=price*0.9;
        }
        return price;
        }
        public static double discountAge(double price,int wiek){
        if (wiek<10){
            price=0;
        } else if (wiek>10 && wiek<=18) {
            price=price*0.5;
        }
            return price;
        }
        public static double discountIfThursday(double price){
            String dzien= LocalDate.now().getDayOfWeek().name();
        if (dzien.equals("Thursday")){
            price=0;
        }
        return price;
        }

    }
