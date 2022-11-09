/**
 * @author Furqan Ramadhan & Ardiansyah
 * @version 1.7
 * 
 *          menyatakan class bernama sains serta extends.
 *          yaitu inheritance dari class sains yang bersifat abstrak.
 */
public class sains extends book {
    private String mk;

    /**
     * 
     * @param judul     method constructor untuk menginisialisasikan judul.
     * @param kodeBuku  method constructor untuk menginisialisasikan KodeBuku.
     * @param pengarang method constructor untuk menginisialisasikan pengarang.
     * @param mk        method constructor untuk menginisialisasikan mk.
     */
    public sains(String judul, int kodeBuku, String pengarang, String mk) {
        super(judul, kodeBuku, pengarang);
        this.mk = mk;
    }

    /**
     * 
     * @return method accessor untuk mengembalikan mk kedalam buku.
     */
    public String getmk() {
        return mk;
    }
}
