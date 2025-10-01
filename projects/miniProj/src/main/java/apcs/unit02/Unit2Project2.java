package apcs.unit02;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Unit2Project2{
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("$#,##0.00");
        Scanner sc = new Scanner(System.in);
        System.out.println("Age: ");
        int age = sc.nextInt();
        double price;
        if(age<=0){
            System.out.println("Invalid input");
            sc.close();
            return;
        }else if(age<6){
            System.out.println("Free");
            sc.close();
            return;
        }else if(age<=15){
            double weight;
            System.out.println("Enter weight");
            weight = sc.nextDouble();
            if (weight<=0){
                System.out.println("Invalid input");
                sc.close();
                return;
            }
            price = 0.09*weight;
        }else if (age <=59){
            price = 10.95;
        }else{
            price = 8.95;
        }
        System.out.println("Price: " + df.format(price));
        sc.close();
    }
}