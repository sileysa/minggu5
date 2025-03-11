public class NilaiMahasiswa {

    int uts[];
    public NilaiMahasiswa(int nl) {
        uts = new int [nl];
    }

    int utsTertinggiDC(int[] uts, int l, int r){
        if (l == r) {
            return uts[l];
        }
        int mid = (l + r) / 2;
        int ltertinggi = utsTertinggiDC(uts, l, mid);
        int rtertingi = utsTertinggiDC(uts, mid+1, r);
        return Math.max(ltertinggi, rtertingi);
    }

    int utsTerendahDC(int[] uts, int l, int r){
        if (l == r) {
            return uts[l];
        }
        int mid = (l + r) / 2;
        int lterendah = utsTerendahDC(uts, l, mid);
        int rterendah = utsTerendahDC(uts, mid+1, r);
        return Math.min(lterendah, rterendah);
    }

    double rata2BF(int[] uas){
        int sum = 0;
        for (int i : uas) {
            sum += i;
        }
        return sum / uas.length;
    }
}
