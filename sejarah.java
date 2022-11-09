/**
 * menyatakan class bernama sejarah serta extends.
 * yaitu inheritance dari abstractsejarah.
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