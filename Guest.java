/**
 * @author Furqan Ramadhan & Ardiansyah
 * @version 1.4
 * 
 *          menyatakan class Guest
 *          dimana terdapat nama
 */
public class Guest {
    private String nama;

    /**
     * 
     * @param nama method constructor dengan parameter untuk menginisialisasi nama.
     */
    public Guest(String nama) {
        this.nama = nama;
    }

    /**
     * 
     * @return method accessor digunakan untuk mengembalikan nama
     */
    public String getNama() {
        return this.nama;
    }
}