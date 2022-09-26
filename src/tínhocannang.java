import java.util.Scanner;

public class tínhocannang {
    public static void main(String[] args) {
        System.out.println("Calculate body mass index!");
        double width;
        double height;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter is Width: ");
        width= scanner.nextDouble();
        System.out.println("Enter is Height: ");
        height= scanner.nextDouble();
        double bmi=width/ Math.pow(height,2);
        if (bmi<18.5){
            System.out.println(bmi+" is Underweight");
        }else if (bmi>=18.5&&bmi<25.0){
            System.out.println(bmi+" is Normal");
        }else if (bmi>=25.0&&bmi<30.0){
            System.out.println(bmi+" is OverWeight");
        }else {
            System.out.println(bmi+" is Obese");
        }

    }
}
