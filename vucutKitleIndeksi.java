import java.util.Scanner;
public class vucutKitleIndeksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kilonuzu kg cinsinden giriniz: ");
        int kg = input.nextInt();

        System.out.print("Boyunuzu m cinsinden giriniz: ");
        double m = input.nextDouble();

        double vke = kg / (m*m);

        System.out.println("Vücut Kitle İndeksiniz: " + vke);
    }
}