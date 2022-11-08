public class sejarah extends buku{
    private String history;
    
    public sejarah(String judul,int kodeBuku,String pengarang, String history){
        super(judul, kodeBuku, pengarang);
        this.history = history;
    }
    public String getHistory(){
        return history;
    }
}