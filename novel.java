public class novel extends buku{
    private String genre;

    public novel(String judul,int kodeBuku,String pengarang, String genre){
        super(judul, kodeBuku, pengarang);
        this.genre = genre;
    }
    public String getgenre(){
        return genre;
    }

}
