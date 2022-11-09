import java.util.Scanner;

public class mainPustaka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namaPengunjung;
        int opsi = 0;
        int waktuPinjam;
        int borrow;

        Guest guest;

        System.out.println("SELAMAT DATANG DI PERPUSTAKAAN");
        System.out.println("Masukkan nama pengunjung: ");
        namaPengunjung = sc.nextLine();
        guest = new Guest(namaPengunjung);

        System.out.println("Apakah anda ingin meminjam atau mengembalikan buku?");
        System.out.println("1. Meminjam");
        System.out.println("2. Kembalikan");
        System.out.println("Masukkan pilihan: ");
        opsi = sc.nextInt();

        System.out.println("SELAMAT DATANG DI PERPUSTAKAAN");
        System.out.println("Masukkan nama pengunjung: ");
        namaPengunjung = sc.nextLine();

        System.out.println("Apakah anda ingin meminjam atau mengembalikan buku?");
        System.out.println("1. Meminjam");
        System.out.println("2. Kembalikan");
        System.out.println("Masukkan pilihan: ");
        opsi = sc.nextInt();

        // Memberi list buku
        novel n1 = new novel("Jurnal Risa", 0101, "Risa Saraswati", "Horror");
        novel n2 = new novel("Angkasa dan 56 Hati", 0102, "Destashsya", "Romance");
        novel n3 = new novel("Harry Potter", 0103, "J. K. Rowling", "Fantasy");
        novel n4 = new novel("Max Havelaar", 0104, "Eduard Douwes Dekker", "History");

        sains s1 = new sains("Kartun Statistik", 0201, "Woollcott Smith", "Statistika");
        sains s2 = new sains("Kimia Forensik", 0202, "prof.Riyanto,ph.D.", "Kimia");
        sains s3 = new sains("Biologi sel", 0203, "Oeke Yunita", "Biologi");
        sains s4 = new sains("Anatomi Hewan", 0204, "Ruqiah Ganda Panjaitan", "Struktur Hewan");

        sejarah sj1 = new sejarah("Sejarah Dunia yang Disembunyikan", 0301, "Jonathan Black", "History of world");
        sejarah sj2 = new sejarah("Sapiens", 0302, "Yuval Noah Harari", "History of humans");
        sejarah sj3 = new sejarah("The History of the Ancient World", 0303, "W. W. Norton & Company", "General");
        sejarah sj4 = new sejarah("Percakapan Dengan Stalin", 0304, "Milovan Djilas", "Philosophy");

    }
}