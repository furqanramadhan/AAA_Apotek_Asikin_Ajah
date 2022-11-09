import java.util.Scanner;

public class main {
    public main() {
    }

    public void runApp() {

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

        Scanner sc = new Scanner(System.in);
        int option;
        char confirm;
        int borrow;
        Guest guest;
        int returnBook;
        String nama;

        System.out.println("Masukkan nama : ");
        nama = sc.nextLine();
        guest = new Guest(nama);
        System.out.println("Selamat Datang di perpustakaan " + guest.getNama());

        // Perintah
        System.out.println("Pilihan : ");
        System.out.println("1. Pinjam buku");
        System.out.println("2. kembalikan buku");
        System.out.println("3. keluar");
        option = sc.nextInt();

        switch (option) {
            case 1:
                System.out.println("Buku yang tersedia: ");
                System.out.println(" 1. " + n1.getJudul());
                System.out.println(" 2. " + n2.getJudul());
                System.out.println(" 3. " + n3.getJudul());
                System.out.println(" 4. " + n4.getJudul());
                System.out.println(" 5. " + s1.getJudul());
                System.out.println(" 6. " + s2.getJudul());
                System.out.println(" 7. " + s3.getJudul());
                System.out.println(" 8. " + s4.getJudul());
                System.out.println(" 9. " + sj1.getJudul());
                System.out.println("10. " + sj2.getJudul());
                System.out.println("11. " + sj3.getJudul());
                System.out.println("12. " + sj4.getJudul());

                boolean lanjut = true;
                while (lanjut) {
                    System.out.println("Buku mana yang ingin dipinjam?");
                    System.out.println("Masukkan pilihan: ");
                    borrow = sc.nextInt();

                    while (borrow > 12 || borrow < 1) {
                        System.out.println("Pilihan salah!");
                        System.out.println("Masukkan pilihan : ");

                        borrow = sc.nextInt();

                    }
                    char pil;

                    System.out.println("Apakah anda ingin meminjam buku ??? : ");
                    pil = sc.next().charAt(0);
                    if (pil == 'y' || pil == 'Y') {
                        for()
                    } else {
                        lanjut = false;
                        break;
                    }

                }

            case 2:

            case 3:
                System.exit(1);
        }
    }

    public static void main(String[] args) {
        main runApp = new main();
        runApp.runApp();
    }
}
