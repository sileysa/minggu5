
import java.util.Scanner;

public class MainNilaiMahasiswa {
    public static void main(String[] args) {
        Scanner leli = new Scanner(System.in);
        NilaiMahasiswa[] nilaimhs = {
            new NilaiMahasiswa("Ahmad", "220101001", 2022, 78, 82),
            new NilaiMahasiswa("Budi", "220101002", 2022, 85, 88),
            new NilaiMahasiswa("Cindy", "220101003", 2021, 90, 87),
            new NilaiMahasiswa("Dian", "220101004", 2021, 76, 79),
            new NilaiMahasiswa("Eko", "220101005", 2023, 92, 95),
            new NilaiMahasiswa("Fajar", "220101006", 2020, 88, 85),
            new NilaiMahasiswa("Gina", "220101007", 2023, 80, 83),
            new NilaiMahasiswa("Hadi", "220101008", 2020, 82, 84),
        };
        int[] uts = new int[nilaimhs.length];
        int[] uas = new int[nilaimhs.length];

        for (int i = 0; i < nilaimhs.length; i++) {
            uts[i] = nilaimhs[i].nilaiUts;
            uas[i] = nilaimhs[i].nilaiUas;
        }

        System.out.println("Nilai UTS tertinggi: " + NilaiMahasiswa.utsTertinggiDC(uts, 0, uts.length-1));
        System.out.println("Nilai UTS terendah: " + NilaiMahasiswa.utsTerendahDC(uts, 0, uts.length-1));
        System.out.println("Rata-rata nilai UAS: " + NilaiMahasiswa.rata2BF(uas));
    }
}
