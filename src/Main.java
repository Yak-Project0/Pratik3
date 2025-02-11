import java.util.Scanner;
//Java Karesini alma math kütüphanesi pow(a,b)
import static java.lang.Math.pow;
//Java Karekök alma math kütüphanesi sqrt(a)
import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*Aşağıda iki dik kenarı verilen bir üçgenin hipotenüsünü bulma
        kısmı verilmiştir.*/

        int dikKenar1,dikKenar2;
        double hipo;
        System.out.println("----------------------------------------------------");
        System.out.println("İki  dik kenarı verilen üçgenin hipotenüsünü bulmak: \n");
        System.out.print("Birinci dik kenarı giriniz: ");
        dikKenar1 = scanner.nextInt();
        System.out.print("İkinci dik kenarı giriniz: ");
        dikKenar2 = scanner.nextInt();
        hipo = sqrt(pow(dikKenar1,2)+pow(dikKenar2,2));
        System.out.println("Dik üçgenin Hipotenüsü: "+hipo);

        /*Aşağıda Üç kenar uzunluğunu kullancıdan aldığımız üçgenin alanını
        hesaplayan uygulama kısmı verilmiştir.*/

        int kenar1,kenar2,kenar3,cevre,u;
        double alan;
        System.out.println("----------------------------------------------------");
        System.out.println("Üç kenarı verilen üçgenin alanını bulmak: \n");
        System.out.print("Birinci kenarı giriniz:");
        kenar1 = scanner.nextInt();
        System.out.print("İkinci kenarı giriniz:");
        kenar2 = scanner.nextInt();
        System.out.print("Üçüncü kenarı giriniz: ");
        kenar3 = scanner.nextInt();
        cevre = kenar1+kenar2+kenar3;
        u = cevre/2;
        alan = sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));
        System.out.println("Üçgenin çevresi: "+cevre);
        System.out.println("Üçgenin alanı: "+alan);

    }
}