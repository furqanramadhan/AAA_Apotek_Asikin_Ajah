import java.util.Scanner;

public class Main {

    /**
     * 
     */
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
        char pil;
        int borrow;
        Guest guest;
        int lamaPinjam;
        String nama;
        String[] buku = new String[12];

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

                buku[0] = n1.getJudul();
                buku[1] = n2.getJudul();
                buku[2] = n3.getJudul();
                buku[3] = n4.getJudul();
                buku[4] = s1.getJudul();
                buku[5] = s2.getJudul();
                buku[6] = s3.getJudul();
                buku[7] = s4.getJudul();
                buku[8] = sj1.getJudul();
                buku[9] = sj2.getJudul();
                buku[10] = sj3.getJudul();
                buku[11] = sj4.getJudul();

                boolean lanjut = true;
                while (lanjut) {
                    System.out.println("Apakah anda ingin melakukan peminjaman ??? : (y/n)");
                    pil = sc.next().charAt(0);
                    if (pil == 'y' || pil == 'Y') {
                        for (int i = 0; i < 12; i++) {
                            System.out.print("Pilih buku yang mana : ");
                            borrow = sc.nextInt();
                            System.out.print("Berapa hari?? : ");
                            lamaPinjam = sc.nextInt();
                            System.out.println("Oke, buku yang anda pinjam adalah : " + buku[borrow - 1]);
                            System.out.println("Waktu peminjaman adalah: " + lamaPinjam + " hari");
                            System.out.println("");
                            System.out.println("Apakah anda ingin melanjutkan??? (y/n)");
                            pil = sc.next().charAt(0);
                            if (pil == 'y' || pil == 'Y') {
                                continue;
                            } else {
                                System.out.println("Terima kasih sudah mampir.");
                                System.exit(0);
                            }
                        }
                    } else if (pil == 'n' || pil == 'N') {
                        lanjut = false;
                        System.out.println("Terima kasih sudah mampir.");
                        System.exit(0);
                    } else {
                        System.out.println("Pilih Y/N....!!!!!");
                        continue;
                    }

                }
                break;

            case 2:
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
                buku[0] = n1.getJudul();
                buku[1] = n2.getJudul();
                buku[2] = n3.getJudul();
                buku[3] = n4.getJudul();
                buku[4] = s1.getJudul();
                buku[5] = s2.getJudul();
                buku[6] = s3.getJudul();
                buku[7] = s4.getJudul();
                buku[8] = sj1.getJudul();
                buku[9] = sj2.getJudul();
                buku[10] = sj3.getJudul();
                buku[11] = sj4.getJudul();

                System.out.println("Apakah anda ingin melakukan pengembalian ? : (y/n)");
                pil = sc.next().charAt(0);
                while (true) {
                    if (pil == 'y' || pil == 'Y') {
                        for (int i = 0; i < 12; i++) {
                            System.out.print("Buku mana yang ingin dikembalikan? : ");
                            borrow = sc.nextInt();
                            System.out.println("Oke, buku yang anda kembalikan adalah : " + buku[borrow - 1]);
                            System.out.println("");
                            System.out.println("Apakah anda ingin melanjutkan??? (y/n)");
                            pil = sc.next().charAt(0);
                            if (pil == 'y' || pil == 'Y') {
                                continue;
                            } else {
                                System.out.println("Terima kasih sudah mampir.");
                                System.exit(0);
                            }
                        }
                    } else if (pil == 'n' || pil == 'N') {
                        lanjut = false;
                        System.out.println("Terima kasih sudah mampir.");
                        System.exit(0);
                    } else {
                        System.out.println("Pilih Y/N....!!!!!");
                        continue;
                    }
                }
            case 3:
                System.out.println("Terima kasih sudah mampir.");
                System.exit(1);
        }
        sc.close();
    }

    public static void main(String[] args) {
        Main runApp = new Main();
        runApp.runApp();
    }
}