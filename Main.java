import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       double kılo, boy, vucutKıtleIndexı;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Lütfen Boyunuzu (metre cinsinde) Giriniz: ");
        boy=scanner.nextDouble();
        System.out.print("Lütfen Kilonuzu Giriniz: ");
        kılo=scanner.nextDouble();
        vucutKıtleIndexı=kılo/(boy*boy);
        System.out.println("Vücut Kitle İndexiniz: "+vucutKıtleIndexı);
    }
}