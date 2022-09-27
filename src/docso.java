import java.util.Scanner;

public class docSoThanhChu {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int number10 = number%10;
        int numberChuc = number/10;
        int numberDonVi = number%10;
        int numberTram = number/100;
        int numberHangChucCuaSoCo3ChuSo = number%100;
        int numberHangDonViCuaSoCo3ChuSo = numberHangChucCuaSoCo3ChuSo/10;
        String donVi = "";
        String chuc = "";
        String chuc2= "";
        String tram = "";
        if (number>=0 && number<10) {
            switch (number) {
                case 0:
                    donVi = "Zero";
                    System.out.printf(donVi);
                    break;
                case 1:
                    donVi ="One";
                    System.out.printf(donVi);
                    break;
                case 2:
                    donVi ="Two";
                    System.out.printf(donVi);
                    break;
                case 3:
                    donVi ="Three";
                    System.out.printf(donVi);
                    break;
                case 4:
                    donVi ="Four";
                    System.out.printf(donVi);
                    break;
                case 5:
                    donVi ="Five";
                    System.out.printf(donVi);
                    break;
                case 6:
                    donVi ="Six";
                    System.out.printf(donVi);
                    break;
                case 7:
                    donVi ="Seven";
                    System.out.printf(donVi);
                    break;
                case 8:
                    donVi ="Eight";
                    System.out.printf(donVi);
                    break;
                case 9:
                    donVi ="Nine";
                    System.out.printf(donVi);
                    break;
            }
        } else if(number>=10 && number<20) {
            switch (number10) {
                case 0:
                    chuc = "Ten";
                    System.out.printf(chuc);
                    break;
                case 1:
                    chuc = "Eleven";
                    System.out.printf(chuc);
                    break;
                case 2:
                    chuc = "Twelve";
                    System.out.printf(chuc);
                    break;
                case 3:
                    chuc = "Thirteen";
                    System.out.printf(chuc);
                    break;
                case 4:
                    chuc = "Fourteen";
                    System.out.printf(chuc);
                    break;
                case 5:
                    chuc = "Fifteen";
                    System.out.printf(chuc);
                    break;
                case 6:
                    chuc = "Sixteen";
                    System.out.printf(chuc);
                    break;
                case 7:
                    chuc = "Seventeen";
                    System.out.printf(chuc);
                    break;
                case 8:
                    chuc = "Eighteen";
                    System.out.printf(chuc);
                    break;
                case 9:
                    chuc = "Nineteen";
                    System.out.printf(chuc);
                    break;
            }
        } else if (number>=20 && number<100) {
            switch (numberDonVi) {
                case 1:
                    donVi ="One";
                    break;
                case 2:
                    donVi ="Two";
                    break;
                case 3:
                    donVi ="Three";
                    break;
                case 4:
                    donVi ="Four";
                    break;
                case 5:
                    donVi ="Five";
                    break;
                case 6:
                    donVi ="Six";
                    break;
                case 7:
                    donVi ="Seven";
                    break;
                case 8:
                    donVi ="Eight";
                    break;
                case 9:
                    donVi ="Nine";
                    break;
            }
            switch (numberChuc) {
                case 2:
                    chuc2 = "Twenty";
                    System.out.printf("%s  %s",chuc2,donVi);
                    break;
                case 3:
                    chuc2 = "Thirty";
                    System.out.printf("%s  %s",chuc2,donVi);
                    break;
                case 4:
                    chuc2 = "Forty";
                    System.out.printf("%s  %s",chuc2,donVi);
                    break;
                case 5:
                    chuc2 = "Fifty";
                    System.out.printf("%s  %s",chuc2,donVi);
                    break;
                case 6:
                    chuc2 = "Sixty";
                    System.out.printf("%s  %s",chuc2,donVi);
                    break;
                case 7:
                    chuc2 = "Seventy";
                    System.out.printf("%s  %s",chuc2,donVi);
                    break;
                case 8:
                    chuc2 = "Eighty";
                    System.out.printf("%s  %s",chuc2,donVi);
                    break;
                case 9:
                    chuc2 = "Ninety";
                    System.out.printf("%s  %s",chuc2,donVi);
                    break;
            }
        } else if (number>=100 && number<1000) {
            if (numberHangChucCuaSoCo3ChuSo>=10 && numberHangChucCuaSoCo3ChuSo<20){
                switch (number10) {
                    case 0:
                        chuc = "Ten";
                        break;
                    case 1:
                        chuc = "Eleven";
                        break;
                    case 2:
                        chuc = "Twelve";
                        break;
                    case 3:
                        chuc = "Thirteen";
                        break;
                    case 4:
                        chuc = "Fourteen";
                        break;
                    case 5:
                        chuc = "Fifteen";
                        break;
                    case 6:
                        chuc = "Sixteen";
                        break;
                    case 7:
                        chuc = "Seventeen";
                        break;
                    case 8:
                        chuc = "Eighteen";
                        break;
                    case 9:
                        chuc = "Nineteen";
                        break;
                }
                switch (numberTram) {
                    case 1:
                        tram = "One hundred";
                        System.out.printf("%s %s",tram,chuc);
                        break;
                    case 2:
                        tram = "Two hundred";
                        System.out.printf("%s %s",tram,chuc);
                        break;
                    case 3:
                        tram = "Three hundred";
                        System.out.printf("%s %s",tram,chuc);
                        break;
                    case 4:
                        tram = "Four hundred";
                        System.out.printf("%s %s",tram,chuc);
                        break;
                    case 5:
                        tram = "Five hundred";
                        System.out.printf("%s %s",tram,chuc);
                        break;
                    case 6:
                        tram = "Six hundred";
                        System.out.printf("%s %s",tram,chuc);
                        break;
                    case 7:
                        tram = "Seven hundred";
                        System.out.printf("%s %s",tram,chuc);
                        break;
                    case 8:
                        tram = "Eight hundred";
                        System.out.printf("%s %s",tram,chuc);
                        break;
                    case 9:
                        tram = "Nine hundred";
                        System.out.printf("%s %s",tram,chuc);
                        break;
                }
            } else if (numberHangChucCuaSoCo3ChuSo>= 20 && numberHangChucCuaSoCo3ChuSo < 100 ) {
                switch (numberDonVi) {
                    case 1:
                        donVi ="One";
                        break;
                    case 2:
                        donVi ="Two";
                        break;
                    case 3:
                        donVi ="Three";
                        break;
                    case 4:
                        donVi ="Four";
                        break;
                    case 5:
                        donVi ="Five";
                        break;
                    case 6:
                        donVi ="Six";
                        break;
                    case 7:
                        donVi ="Seven";
                        break;
                    case 8:
                        donVi ="Eight";
                        break;
                    case 9:
                        donVi ="Nine";
                        break;
                }
                switch (numberHangDonViCuaSoCo3ChuSo) {
                    case 2:
                        chuc2 = "Twenty";
                        break;
                    case 3:
                        chuc2 = "Thirty";
                        break;
                    case 4:
                        chuc2 = "Forty";
                        break;
                    case 5:
                        chuc2 = "Fifty";
                        break;
                    case 6:
                        chuc2 = "Sixty";
                        break;
                    case 7:
                        chuc2 = "Seventy";
                        break;
                    case 8:
                        chuc2 = "Eighty";
                        break;
                    case 9:
                        chuc2 = "Ninety";
                        break;
                }
                switch (numberTram) {
                    case 1:
                        tram = "One hundred";
                        System.out.printf("%s %s %s",tram,chuc2,donVi);
                        break;
                    case 2:
                        tram = "Two hundred";
                        System.out.printf("%s %s %s",tram,chuc2,donVi);
                        break;
                    case 3:
                        tram = "Three hundred";
                        System.out.printf("%s %s %s",tram,chuc2,donVi);
                        break;
                    case 4:
                        tram = "Four hundred";
                        System.out.printf("%s %s %s",tram,chuc2,donVi);
                        break;
                    case 5:
                        tram = "Five hundred";
                        System.out.printf("%s %s %s",tram,chuc2,donVi);
                        break;
                    case 6:
                        tram = "Six hundred";
                        System.out.printf("%s %s %s",tram,chuc2,donVi);
                        break;
                    case 7:
                        tram = "Seven hundred";
                        System.out.printf("%s %s %s",tram,chuc2,donVi);
                        break;
                    case 8:
                        tram = "Eight hundred";
                        System.out.printf("%s %s %s",tram,chuc2,donVi);
                        break;
                    case 9:
                        tram = "Nine hundred";
                        System.out.printf("%s %s %s",tram,chuc2,donVi);
                        break;
                }
            }
        } else {
            System.out.println("Out of ability");
        }
    }
}