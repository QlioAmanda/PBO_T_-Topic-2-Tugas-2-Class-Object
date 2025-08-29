import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Warung> daftarWarung = new ArrayList<>();

        Warung w1 = new Warung("Warung Nasi Goreng");
        w1.tambahMenu(new Makanan("Nasi Goreng Seafood", 17000));
        w1.tambahMenu(new Makanan("Nasi Goreng Katsu", 12000));
        w1.tambahMenu(new Makanan("Nasi Goreng Kweatiau", 15000));

        Warung w2 = new Warung("Warung Mie Ayam");
        w2.tambahMenu(new Makanan("Mie Ayam Original", 10000));
        w2.tambahMenu(new Makanan("Mie Ayam Bakso", 13000));
        w2.tambahMenu(new Makanan("Mie Ayam Pangsit", 14000));

        Warung w3 = new Warung("Warung Spaghetti");
        w3.tambahMenu(new Makanan("Spaghetti Katsu", 12000));
        w3.tambahMenu(new Makanan("Spaghetti Original", 10000));
        w3.tambahMenu(new Makanan("Spaghetti Carbonara", 13000));

        Warung w4 = new Warung("Warung Katsu");
        w4.tambahMenu(new Makanan("Nasi Katsu Kari", 15000));
        w4.tambahMenu(new Makanan("Nasi Katsu Lada Hitam", 14000));
        w4.tambahMenu(new Makanan("Nasi Katsu Original", 12000));

        daftarWarung.add(w1);
        daftarWarung.add(w2);
        daftarWarung.add(w3);
        daftarWarung.add(w4);

        // Pilih warung
        System.out.println("===== Selamat Datang di Kantin Pujasera Polban =====");
        System.out.println("Pilih Warung:");
        for (int i = 0; i < daftarWarung.size(); i++) {
            System.out.println((i + 1) + ". " + daftarWarung.get(i).getNamaWarung());
        }

        System.out.print("Masukkan pilihan warung: ");
        int pilihWarung = sc.nextInt();
        Warung warungDipilih = daftarWarung.get(pilihWarung - 1);

        // Pilih menu
        Pembelian pembelian = new Pembelian();
        char lagi;
        do {
            warungDipilih.tampilkanMenu();
            System.out.print("Pilih menu: ");
            int pilihMenu = sc.nextInt();
            pembelian.tambahPesanan(warungDipilih.getMenu().get(pilihMenu - 1));

            System.out.print("Tambah makanan lagi? (y/n): ");
            lagi = sc.next().charAt(0);
        } while (lagi == 'y');

        // Pembayaran
        System.out.println("\nTotal belanja: Rp" + pembelian.getTotalHarga());
        System.out.print("Masukkan uang pembayaran: Rp");
        int uang = sc.nextInt();

        pembelian.cetakStruk(uang);

        sc.close();
    }
}
