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
                    donVi = "không";
                    System.out.printf(donVi);
                    break;
                case 1:
                    donVi ="một";
                    System.out.printf(donVi);
                    break;
                case 2:
                    donVi ="hai";
                    System.out.printf(donVi);
                    break;
                case 3:
                    donVi ="ba";
                    System.out.printf(donVi);
                    break;
                case 4:
                    donVi ="bốn";
                    System.out.printf(donVi);
                    break;
                case 5:
                    donVi ="năm";
                    System.out.printf(donVi);
                    break;
                case 6:
                    donVi ="sáu";
                    System.out.printf(donVi);
                    break;
                case 7:
                    donVi ="bảy";
                    System.out.printf(donVi);
                    break;
                case 8:
                    donVi ="tám";
                    System.out.printf(donVi);
                    break;
                case 9:
                    donVi ="chín";
                    System.out.printf(donVi);
                    break;
            }
        } else if(number>=10 && number<20) {
            switch (number10) {
                case 0:
                    chuc = "mười";
                    System.out.printf(chuc);
                    break;
                case 1:
                    chuc = "mười một";
                    System.out.printf(chuc);
                    break;
                case 2:
                    chuc = "mười hai";
                    System.out.printf(chuc);
                    break;
                case 3:
                    chuc = "mười ba";
                    System.out.printf(chuc);
                    break;
                case 4:
                    chuc = "mười bốn";
                    System.out.printf(chuc);
                    break;
                case 5:
                    chuc = "mười lăm";
                    System.out.printf(chuc);
                    break;
                case 6:
                    chuc = "mười sáu";
                    System.out.printf(chuc);
                    break;
                case 7:
                    chuc = "mười bảy";
                    System.out.printf(chuc);
                    break;
                case 8:
                    chuc = "mười tám";
                    System.out.printf(chuc);
                    break;
                case 9:
                    chuc = "mười chín";
                    System.out.printf(chuc);
                    break;
            }
        } else if (number>=20 && number<100) {
            switch (numberDonVi) {
                case 1:
                    donVi ="một";
                    break;
                case 2:
                    donVi ="hai";
                    break;
                case 3:
                    donVi ="ba";
                    break;
                case 4:
                    donVi ="bốn";
                    break;
                case 5:
                    donVi ="năm";
                    break;
                case 6:
                    donVi ="sáu";
                    break;
                case 7:
                    donVi ="bảy";
                    break;
                case 8:
                    donVi ="tám";
                    break;
                case 9:
                    donVi ="chín";
                    break;
            }
            switch (numberChuc) {
                case 2:
                    chuc2 = "hai mươi ";
                    System.out.printf("%s  %s",chuc2,donVi);
                    break;
                case 3:
                    chuc2 = "ba mươi";
                    System.out.printf("%s  %s",chuc2,donVi);
                    break;
                case 4:
                    chuc2 = "bốn mươi";
                    System.out.printf("%s  %s",chuc2,donVi);
                    break;
                case 5:
                    chuc2 = "năm mươi";
                    System.out.printf("%s  %s",chuc2,donVi);
                    break;
                case 6:
                    chuc2 = "sáu mươi";
                    System.out.printf("%s  %s",chuc2,donVi);
                    break;
                case 7:
                    chuc2 = "bảy mươi";
                    System.out.printf("%s  %s",chuc2,donVi);
                    break;
                case 8:
                    chuc2 = "tám mươi";
                    System.out.printf("%s  %s",chuc2,donVi);
                    break;
                case 9:
                    chuc2 = "chín mươi";
                    System.out.printf("%s  %s",chuc2,donVi);
                    break;
            }
        } else if (number>=100 && number<1000) {
            if (numberHangChucCuaSoCo3ChuSo>=10 && numberHangChucCuaSoCo3ChuSo<20){
                switch (number10) {
                    case 0:
                        chuc = "mười ";
                        break;
                    case 1:
                        chuc = "mười một";
                        break;
                    case 2:
                        chuc = "mười hai";
                        break;
                    case 3:
                        chuc = "mười ba";
                        break;
                    case 4:
                        chuc = "mười bốn";
                        break;
                    case 5:
                        chuc = "mười lăm";
                        break;
                    case 6:
                        chuc = "mười sáu";
                        break;
                    case 7:
                        chuc = "mười bảy";
                        break;
                    case 8:
                        chuc = "mười tám";
                        break;
                    case 9:
                        chuc = "mười chín";
                        break;
                }
                switch (numberTram) {
                    case 1:
                        tram = "một trăm";
                        System.out.printf("%s %s",tram,chuc);
                        break;
                    case 2:
                        tram = "hai trăm";
                        System.out.printf("%s %s",tram,chuc);
                        break;
                    case 3:
                        tram = "ba trăm";
                        System.out.printf("%s %s",tram,chuc);
                        break;
                    case 4:
                        tram = "bốn trăm";
                        System.out.printf("%s %s",tram,chuc);
                        break;
                    case 5:
                        tram = "năm trăm";
                        System.out.printf("%s %s",tram,chuc);
                        break;
                    case 6:
                        tram = "sáu trăm";
                        System.out.printf("%s %s",tram,chuc);
                        break;
                    case 7:
                        tram = "bảy trăm";
                        System.out.printf("%s %s",tram,chuc);
                        break;
                    case 8:
                        tram = "tám trăm";
                        System.out.printf("%s %s",tram,chuc);
                        break;
                    case 9:
                        tram = "chín trăm";
                        System.out.printf("%s %s",tram,chuc);
                        break;
                }
            } else if (numberHangChucCuaSoCo3ChuSo>= 20 && numberHangChucCuaSoCo3ChuSo < 100 ) {
                switch (numberDonVi) {
                    case 1:
                        donVi ="một";
                        break;
                    case 2:
                        donVi ="hai";
                        break;
                    case 3:
                        donVi ="ba";
                        break;
                    case 4:
                        donVi ="bốn";
                        break;
                    case 5:
                        donVi ="năm";
                        break;
                    case 6:
                        donVi ="sáu";
                        break;
                    case 7:
                        donVi ="bảy";
                        break;
                    case 8:
                        donVi ="tám";
                        break;
                    case 9:
                        donVi ="chín";
                        break;
                }
                switch (numberHangDonViCuaSoCo3ChuSo) {
                    case 2:
                        chuc2 = "hai mươi";
                        break;
                    case 3:
                        chuc2 = "ba mươi";
                        break;
                    case 4:
                        chuc2 = "bốn mươi";
                        break;
                    case 5:
                        chuc2 = "năm mươi";
                        break;
                    case 6:
                        chuc2 = "sáu mươi";
                        break;
                    case 7:
                        chuc2 = "bảy mươi";
                        break;
                    case 8:
                        chuc2 = "tám mươi";
                        break;
                    case 9:
                        chuc2 = "chín mươi";
                        break;
                }
                switch (numberTram) {
                    case 1:
                        tram = "một trăm";
                        System.out.printf("%s %s %s",tram,chuc2,donVi);
                        break;
                    case 2:
                        tram = "hai trăm";
                        System.out.printf("%s %s %s",tram,chuc2,donVi);
                        break;
                    case 3:
                        tram = "ba trăm";
                        System.out.printf("%s %s %s",tram,chuc2,donVi);
                        break;
                    case 4:
                        tram = "bốn trăm";
                        System.out.printf("%s %s %s",tram,chuc2,donVi);
                        break;
                    case 5:
                        tram = "năm trăm";
                        System.out.printf("%s %s %s",tram,chuc2,donVi);
                        break;
                    case 6:
                        tram = "sáu trăm";
                        System.out.printf("%s %s %s",tram,chuc2,donVi);
                        break;
                    case 7:
                        tram = "bảy trăm";
                        System.out.printf("%s %s %s",tram,chuc2,donVi);
                        break;
                    case 8:
                        tram = "tám trăm";
                        System.out.printf("%s %s %s",tram,chuc2,donVi);
                        break;
                    case 9:
                        tram = "chín trăm";
                        System.out.printf("%s %s %s",tram,chuc2,donVi);
                        break;
                }
            }
        } else {
            System.out.println("Out of ability");
        }
    }
}