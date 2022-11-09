/**
 *menyatakan class bernama novel serta extends.
 * yaitu inheritance dari class novel yang bersifat abstrak.
 * 
 * @author Furqan Ramadhan & Ardiansyah 
 * @version 1.6         
 */
public class novel extends book {
    private String genre;

    /**
     * 
     * @param judul     method constructor untuk menginisialisasikan judul.
     * @param kodeBuku  method constructor untuk menginisialisasikan KodeBuku.
     * @param pengarang method constructor untuk menginisialisasikan pengarang.
     * @param genre     method constructor untuk menginisialisasikan genre.
     */
    public novel(String judul, int kodeBuku, String pengarang, String genre) {
        super(judul, kodeBuku, pengarang);
        this.genre = genre;
    }

    /**
     * 
     * @return method accessor untuk mengembalikan genre kedalam buku.
     */
    public String getgenre() {
        return genre;
    }

}
