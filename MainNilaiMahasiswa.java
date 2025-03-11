
import java.util.Scanner;

public class MainNilaiMahasiswa {
    public static void main(String[] args) {
        Scanner leli = new Scanner(System.in);
        int[] uts = {78, 85, 90, 76, 92, 88, 80, 82};
        int[] uas = {82, 88, 87, 79, 95, 85, 83, 84};
        NilaiMahasiswa nilaimhs = new NilaiMahasiswa(uts.length);

        System.out.println("Nilai UTS tertinggi: " + nilaimhs.utsTertinggiDC(uts, 0, uts.length-1));
        System.out.println("Nilai UTS terendah: " + nilaimhs.utsTerendahDC(uts, 0, uts.length-1));
        System.out.println("Rata-rata nilai UAS: " + nilaimhs.rata2BF(uas));
    }
}
