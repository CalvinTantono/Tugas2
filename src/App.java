import BangunRuang.Balok;
import java.util.Scanner;

public class App{
    public static void main(String[] args) throws Exception{
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Menghitung Volume Balok");
        Balok balok = new Balok();

        System.out.print("Masukkan panjang sisi balok ");
        balok.p = keyboard.nextInt();

        System.out.print("Masukkan lebar sisi balok ");
        balok.l = keyboard.nextInt();

        System.out.print("Masukkan tinggi sisi balok ");
        balok.t = keyboard.nextInt();

        balok.caraVolumeBalok();
        balok.showVolumeBalok();

    }
}