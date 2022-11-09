/**
 * menyatakan class bernama buku sert extends,
 * yaitu inheritance dari abstractBuku.
 * 
 * @author Furqan Ramadhan & Ardiansyah
 * @version 1.3
 */
public class buku extends abstractBuku {
    private String judul;
    private int kodeBuku;
    private String pengarang;

    /**
     * 
     * @param judul     method constructor untuk menginisialisasikan judul.
     * @param kodeBuku  method constructor untuk menginisialisasikan kodeBuku.
     * @param pengarang method constructor untuk menginisialisasikan pengarang.
     */
    public buku(String judul, int kodeBuku, String pengarang) {

        this.judul = judul;
        this.kodeBuku = kodeBuku;
        this.pengarang = pengarang;

    }

    /**
     * @return method accessor untuk mengembalikan judul kedalam buku.
     */
    public String getJudul() {
        return this.judul;
    }

    /**
     * @return method accessor untuk mengembalikan kode buku kedalam buku.
     */
    public int getKodeBuku() {
        return this.kodeBuku;
    }

    /**
     * @return method accessor untuk mengembalikan pengarang kedalam buku.
     */
    public String getPengarang() {
        return this.pengarang;
    }

}
