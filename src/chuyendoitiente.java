import java.util.Scanner;

public class chuyendoitiente {
    public static void main(String[] args) {
        System.out.println("Currency conversion!");
        Scanner scanner=new Scanner(System.in);
        double usd,vn;
        System.out.println("Enter USD currency:");
        usd=scanner.nextDouble();
        vn=usd*23000;
        System.out.println(usd+" US currency after being converted into Vietnamese currency is "+vn);
    }
}
