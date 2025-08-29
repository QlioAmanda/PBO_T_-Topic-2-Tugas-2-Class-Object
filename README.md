# Kantin Pujasera Polban (Java OOP)

Program sederhana simulasi pembelian makanan di kantin Pujasera Polban menggunakan **Java** dengan konsep **Class, Object, dan Enkapsulasi**.

## ✨ Fitur
- Terdapat 4 warung dengan menu berbeda.
- Setiap warung memiliki daftar makanan dan harga masing-masing.
- User memilih warung, lalu memilih menu (bisa lebih dari 1).
- Pembayaran dapat dilakukan dengan uang pas, lebih (ada kembalian), atau kurang.
- Jika uang kurang → pembelian gagal, user bisa coba lagi.

## 📂 Struktur File
- `Makanan.java` → Class untuk menyimpan data makanan (nama & harga).
- `Warung.java` → Class untuk menyimpan data warung dan daftar menu.
- `Pembelian.java` → Class untuk menyimpan pesanan, total harga, dan cetak struk.
- `Main.java` → Program utama untuk menjalankan simulasi.

## ▶️ Cara Menjalankan
Compile semua file:
   javac *.java
   
   java Main
