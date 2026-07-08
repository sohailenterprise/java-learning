import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        double temp = 0;
        
        System.out.println("Enter the temperature to convert");
        Scanner cin = new Scanner(System.in);


        temp = cin.nextDouble();     
        


        double result = (temp * (9.0/5.0 )) + 32;
        int roundedResult = (int)result;
        System.out.println("The temperature in Fahrenheit is: " + roundedResult);
        cin.close();

    }
}
