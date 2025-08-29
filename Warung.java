import java.util.ArrayList;

public class Warung {
    private String namaWarung;
    private ArrayList<Makanan> menu = new ArrayList<>();

    public Warung(String namaWarung) {
        this.namaWarung = namaWarung;
    }

    public String getNamaWarung() {
        return namaWarung;
    }

    public void tambahMenu(Makanan item) {
        menu.add(item);
    }

    public ArrayList<Makanan> getMenu() {
        return menu;
    }

    public void tampilkanMenu() {
        System.out.println("Menu di " + namaWarung + ":");
        for (int i = 0; i < menu.size(); i++) {
            System.out.println((i + 1) + ". " + menu.get(i).getNama() + " - Rp" + menu.get(i).getHarga());
        }
    }
}
