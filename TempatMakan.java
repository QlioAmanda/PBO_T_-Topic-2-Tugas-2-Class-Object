import java.util.ArrayList;

public abstract class TempatMakan {
    protected String namaTempat;
    protected ArrayList<Makanan> menu = new ArrayList<>();

    public TempatMakan(String namaTempat) {
        this.namaTempat = namaTempat;
    }

    public String getNamaTempat() {
        return namaTempat;
    }

    public void tambahMenu(Makanan item) {
        menu.add(item);
    }

    public ArrayList<Makanan> getMenu() {
        return menu;
    }

    // Abstract method wajib diimplementasikan di subclass
    public abstract void tampilkanMenu();
}
