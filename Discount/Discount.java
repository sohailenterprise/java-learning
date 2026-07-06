import java.util.Scanner;

public class Discount{
    public static void main(String[] args) {
        int price = 0;
        
        int finalPrice = 0;
        int discountprice  = 0;
        Scanner cin = new Scanner(System.in);

        
        System.out.println("Enter the cost of the item");
        price = cin.nextInt();

       
        


        if (price > 500) {
           discountprice = price * 20 / 100;
            finalPrice = price - discountprice;
            System.out.println("The final price after discount is: " + finalPrice + "\n The discount given is: " + discountprice);

        } else if (price >=200 && price <= 500) {
            discountprice = price * 10 / 100;
            finalPrice = price - discountprice;
            System.out.println("The final price after discount is: " + finalPrice + "\n The discount given is: " + discountprice);

        } else {
            System.out.println("No discount is given. The final price is: " + price);
        }
        

        cin.close();

    }
}
