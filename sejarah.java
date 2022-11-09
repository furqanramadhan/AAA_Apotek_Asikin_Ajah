/**
 * menyatakan class bernama sejarah serta extends.
 * yaitu inheritance dari class sejarah yang bersifat abstrak.
 *          
 * @author Furqan Ramadhan & Ardiansyah
 * @version 1.8          
 */
public class sejarah extends book {
    private String history;

    /**
     * 
     * @param judul     method constructor untuk menginisialisasikan judul.
     * @param kodeBuku  method constructor untuk menginisialisasikan KodeBuku.
     * @param pengarang method constructor untuk menginisialisasikan pengarang.
     * @param history   method constructor untuk menginisialisasikan history.
     */
    public sejarah(String judul, int kodeBuku, String pengarang, String history) {
        super(judul, kodeBuku, pengarang);
        this.history = history;
    }

    /**
     * 
     * @return method accessor untuk mengembalikan History kedalam buku.
     */
    public String getHistory() {
        return history;
    }
}