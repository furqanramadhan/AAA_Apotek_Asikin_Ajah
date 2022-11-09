import java.util.Scanner;

public class pustaka {

    public static void main(String[] args) {

        String nama;
        int aksi, lamaPinjam, pinjam = 1, kembali;

        Scanner input = new Scanner(System.in);

        novel n1 = new novel("Jurnal Risa", 0101, "Risa Saraswati", "Horror");
        novel n2 = new novel("Angkasa dan 56 Hati",0102 , "Destashsya", "Romance");
        novel n3 = new novel("Harry Potter",0103, "J. K. Rowling", "Fantasy");
        novel n4 = new novel("Max Havelaar", 0104,"Eduard Douwes Dekker", "History");

        sains s1 = new sains(judul: "Kartun Statistik", 0201, "Woollcott Smith", "Statistika");
        sains s2 = new sains(judul: "Kimia Forensik", KodeBuku: 0202, "prof.Riyanto,ph.D.", "Kimia");
        sains s3 = new sains(judul: "Biologi sel", KodeBuku:0203, Pengarang: "Oeke Yunita", "Biologi");
        sains s4 = new sains(judul: "Anatomi Hewan", KodeBuku:0204, Pengarang: "Ruqiah Ganda Panjaitan", "Struktur Hewan");

        sejarah sj1 = ne
        sejarah sj2 = 
        sejarah sj3 = 
        sejarah sj4

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


            System.out.println(" 4. " + inf1.getjudul());
            System.out.println(" 5. " + inf2.getjudul());
            System.out.println(" 6. " + umum1.getjudul());
            System.out.println(" 7. " + umum2.getjudul());
,
            do {
                System.out.println(" Buku mana yg ingin Anda pinjam?");
                System.out.println(" Masukkan Pilihan Anda :");
                pinjam = input.nextInt();

                if (pinjam > 7 && pinjam < 1) {
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
                    System.out.println(" Judul buku      : " + n1.getjudul());
                    break;
                case 2:
                    System.out.println(" Judul buku      : " + n2.getjudul());
                    break;
                case 3:
                    System.out.println(" Judul buku      : " + n3.getjudul());
                    break;
                case 4:
                    System.out.println(" Judul buku      : " + inf1.getjudul());
                    break;
                case 5:
                    System.out.println(" Judul buku      : " + inf2.getjudul());
                    break;
                case 6:
                    System.out.println(" Judul buku      : " + umum1.getjudul());
                    break;
                case 7:
                    System.out.println(" Judul buku      : " + umum2.getjudul());
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

            System.out.println(" 1. " + n1.getjudul());
            System.out.println(" 2. " + n2.getjudul());
            System.out.println(" 3. " + n3.getjudul());

            System.out.println(" 4. " + inf1.getjudul());
            System.out.println(" 5. " + inf2.getjudul());
            System.out.println(" 6. " + umum1.getjudul());
            System.out.println(" 7. " + umum2.getjudul());

            System.out.println("Buku mana yg ingin Anda kembalikan?");
            System.out.println("Masukkan Pilihan Anda :");
            kembali = input.nextInt();

            System.out.println(" Nama       : " + nama);
            System.out.println(" Kegiatan   : Mengembalikan buku");
            switch (kembali) {
                case 1:
                    System.out.println(" Judul buku : " + n1.getjudul());
                    break;
                case 2:
                    System.out.println(" Judul buku : " + n2.getjudul());
                    break;
                case 3:
                    System.out.println(" Judul buku : " + n3.getjudul());
                    break;
                case 4:
                    System.out.println(" Judul buku : " + inf1.getjudul());
                    break;
                case 5:
                    System.out.println(" Judul buku : " + inf2.getjudul());
                    break;
                case 6:
                    System.out.println(" Judul buku : " + umum1.getjudul());
                    break;
                case 7:
                    System.out.println(" Judul buku : " + umum2.getjudul());
                    break;

            }
        }
        System.out.println(" \nTerima Kasih telah berkunjung\n ");
        input.close();
    }

}
