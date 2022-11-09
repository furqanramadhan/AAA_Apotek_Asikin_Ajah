/**
 * Menyatakan Class Bernama abstractBuku
 * Untuk Menentukan Classnya
 * 
 * @author Furqan Ramadhan & Ardiansyah
 * @version 1.2
 */
public abstract class abstractBuku {
    /**
     * 
     * @return method accessor getjudul untuk mengembalikan judul dari buku
     */
    public abstract String getJudul();

    /**
     * 
     * @return method accessor getKodeBuku untuk mengembalikan kode dari buku
     */
    public abstract int getKodeBuku();

    /**
     * 
     * @return method accessor getPengarang untuk mengembalikan nama pengarang
     */
    public abstract String getPengarang();

}