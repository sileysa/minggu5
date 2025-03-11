public class NilaiMahasiswa {

    String nama;
    String nim;
    int tahunMasuk;
    int nilaiUts;
    int nilaiUas;
    int[] uts;

    public NilaiMahasiswa(String nm, String nim, int th, int uts, int uas) {
        nama = nm;
        this.nim = nim;
        tahunMasuk = th;
        nilaiUts = uts;
        nilaiUas = uas;
    }

    public static int utsTertinggiDC(int[] uts, int l, int r){
        if (l == r) {
            return uts[l];
        }
        int mid = (l + r) / 2;
        int ltertinggi = utsTertinggiDC(uts, l, mid);
        int rtertingi = utsTertinggiDC(uts, mid+1, r);
        return Math.max(ltertinggi, rtertingi);
    }

    public static int utsTerendahDC(int[] uts, int l, int r){
        if (l == r) {
            return uts[l];
        }
        int mid = (l + r) / 2;
        int lterendah = utsTerendahDC(uts, l, mid);
        int rterendah = utsTerendahDC(uts, mid+1, r);
        return Math.min(lterendah, rterendah);
    }

    public static double rata2BF(int[] uas){
        int sum = 0;
        for (int i : uas) {
            sum += i;
        }
        return (double)sum / uas.length;
    }
}
