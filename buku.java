/**
 * menyatakan class bernama buku dan extends,
 * yaitu kelanjutan dari abstractBuku
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
     * @param judul     method constructor untuk menentukan judul.
     * @param kodeBuku  method constructor untuk menentukan judul.
     * @param pengarang method constructor untuk menentukan judul.
     */
    public buku(String judul, int kodeBuku, String pengarang) {

        this.judul = judul;
        this.kodeBuku = kodeBuku;
        this.pengarang = pengarang;

    }

    /** @return */
    public String getJudul() {
        return this.judul;
    }

    public int getKodeBuku() {
        return this.kodeBuku;
    }

    public String getPengarang() {
        return this.pengarang;
    }

}
