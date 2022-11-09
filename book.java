/**
 * @author Furqan Ramadhan & Ardiansyah
 * @version 1.5
 * 
 *          menyatakan class bernama book serta extends.
 *          yaitu inheritance dari class book yang bersifat abstrak.
 */
public abstract class book {

    private String judul;
    private int kodeBuku;
    private String pengarang;

    /**
     * 
     * @param judul     method constructor untuk menginisialisasikan judul.
     * @param kodeBuku  method constructor untuk menginisialisasikan KodeBuku.
     * @param pengarang method constructor untuk menginisialisasikan pengarang.
     */
    public book(String judul, int kodeBuku, String pengarang) {
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
     * @return method accessor untuk mengembalikan kodeBuku kedalam buku.
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

    // abstract void available();
}