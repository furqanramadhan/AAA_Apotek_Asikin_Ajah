import java.util.Scanner;

public class pustaka {

    public static void main(String[] args) {

        String nama;
        int aksi, lamaPinjam, pinjam = 1, kembali;

        Scanner input = new Scanner(System.in);

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

        System.out.println("        SELAMAT DATANG DI PUSTAKA BERKAH BELAJAR BERSAMA        ");

        System.out.println("\nMasukkan Nama Anda :");
        nama = input.nextLine();

        System.out.println(" Apakah Anda ingin meminjam / mengembalikan Buku?");
        System.out.println(" 1. Pinjam");
        System.out.println(" 2. Kembalikan");
        System.out.println(" Masukkan Pilihan Anda :");
        aksi = input.nextInt();

        if (aksi == 1) {

            System.out.println(" Daftar Buku :");

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
            do {
                System.out.println(" Buku mana yg ingin Anda pinjam?");
                System.out.println(" Masukkan Pilihan Anda :");
                pinjam = input.nextInt();

                if (pinjam > 12 && pinjam < 1) {
                    System.out.println("MAAF BUKU TIDAK TERSEDIA");
                }

            } while (pinjam > 7 && pinjam < 1);

            System.out.println(" Berapa lama Anda ingin meminjam buku tersebut?");
            System.out.println(" 1. Tiga Hari");
            System.out.println(" 2. Lima Hari");
            System.out.println(" 3. Tujuh Hari");
            System.out.println(" Masukkan Pilihan Anda :");
            lamaPinjam = input.nextInt();

            System.out.println(" Nama            : " + nama);
            System.out.println(" Kegiatan        : Meminjam buku");
            switch (pinjam) {
                case 1:
                    System.out.println(" Judul buku      : " + n1.getJudul());
                    break;
                case 2:
                    System.out.println(" Judul buku      : " + n2.getJudul());
                    break;
                case 3:
                    System.out.println(" Judul buku      : " + n3.getJudul());
                    break;
                case 4:
                    System.out.println(" Judul buku      : " + n4.getJudul());
                    break;
                case 5:
                    System.out.println(" Judul buku      : " + s1.getJudul());
                    break;
                case 6:
                    System.out.println(" Judul buku      : " + s2.getJudul());
                    break;
                case 7:
                    System.out.println(" Judul buku      : " + s3.getJudul());
                    break;
                case 8:
                    System.out.println(" Judul buku      : " + s4.getJudul());
                    break;
                case 9:
                    System.out.println(" Judul buku      : " + sj1.getJudul());
                    break;
                case 10:
                    System.out.println(" Judul buku      : " + sj2.getJudul());
                    break;
                case 11:
                    System.out.println(" Judul buku      : " + sj3.getJudul());
                    break;
                case 12:
                    System.out.println(" Judul buku      : " + sj4.getJudul());
                    break;

                default:
                    System.out.println("MAAF TIDAK ADA BUKU");
            }
            switch (lamaPinjam) {
                case 1:
                    System.out.println(" Lama Peminjaman : Tiga Hari");
                    break;
                case 2:
                    System.out.println(" Lama Peminjaman : Lima Hari");
                    break;
                case 3:
                    System.out.println(" Lama Peminjaman : Tujuh Hari");
                    break;
            }
        }

        else if (aksi == 2) {

            System.out.println("Daftar Buku :");

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

            System.out.println("Buku mana yg ingin Anda kembalikan?");
            System.out.println("Masukkan Pilihan Anda :");
            kembali = input.nextInt();

            System.out.println(" Nama       : " + nama);
            System.out.println(" Kegiatan   : Mengembalikan buku");
            switch (kembali) {
                case 1:
                    System.out.println(" Judul buku : " + n1.getJudul());
                    break;
                case 2:
                    System.out.println(" Judul buku : " + n2.getJudul());
                    break;
                case 3:
                    System.out.println(" Judul buku : " + n3.getJudul());
                    break;
                case 4:
                    System.out.println(" Judul buku : " + n4.getJudul());
                    break;
                case 5:
                    System.out.println(" Judul buku : " + s1.getJudul());
                    break;
                case 6:
                    System.out.println(" Judul buku : " + s2.getJudul());
                    break;
                case 7:
                    System.out.println(" Judul buku : " + s3.getJudul());
                    break;
                case 8:
                    System.out.println(" Judul buku : " + s4.getJudul());
                    break;
                case 9:
                    System.out.println(" Judul buku : " + sj1.getJudul());
                    break;
                case 10:
                    System.out.println(" Judul buku : " + sj2.getJudul());
                    break;
                case 11:
                    System.out.println(" Judul buku : " + sj3.getJudul());
                    break;
                case 12:
                    System.out.println(" Judul buku : " + sj4.getJudul());
                    break;

            }
        }
        System.out.println(" \nTerima Kasih telah berkunjung\n ");
        input.close();
    }

}
