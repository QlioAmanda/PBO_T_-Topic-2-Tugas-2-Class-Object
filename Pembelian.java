import java.util.ArrayList;

public class Pembelian {
    private ArrayList<Makanan> pesanan = new ArrayList<>();
    private int totalHarga = 0;

    public void tambahPesanan(Makanan item) {
        pesanan.add(item);
        totalHarga += item.getHarga();
    }

    public int getTotalHarga() {
        return totalHarga;
    }

    public void cetakStruk(int uangDibayar) {
        System.out.println("\n===== STRUK PEMBELIAN =====");
        for (Makanan item : pesanan) {
            System.out.println("- " + item.getNama() + " : Rp" + item.getHarga());
        }
        System.out.println("Total Harga : Rp" + totalHarga);
        System.out.println("Uang Dibayar: Rp" + uangDibayar);

        if (uangDibayar > totalHarga) {
            System.out.println("Kembalian   : Rp" + (uangDibayar - totalHarga));
            System.out.println("Pembelian berhasil! Makanan siap dinikmati 🍽️");
        } else if (uangDibayar == totalHarga) {
            System.out.println("Uang pas. Terima kasih!");
            System.out.println("Pembelian berhasil! Makanan siap dinikmati 🍽️");
        } else {
            System.out.println("⚠️ Uang tidak cukup! Silakan pilih ulang atau kurangi pesanan.");
        }
    }
}
