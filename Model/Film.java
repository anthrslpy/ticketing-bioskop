package Model;

/**
 *
 * @author anasyalaili
 */

import java.util.ArrayList;
import java.util.List;

public class Film {
    private String idFilm;
    private String judul;
    private String genre;
    private String durasi;
    private String sinopsis;
    private String posterPath1;
    private String posterPath2;
    private List<Jadwal> jadwalList;

    public Film(String idFilm, String judul, String genre, String durasi, String sinopsis, String posterPath1, String posterPath2) {
        this.idFilm = idFilm;
        this.judul = judul;
        this.genre = genre;
        this.durasi = durasi;
        this.sinopsis = sinopsis;
        this.posterPath1 = posterPath1;
        this.posterPath2 = posterPath2;
    }
    
    public Film() {
        this.jadwalList = new ArrayList<>();
    }
    
    public void tambahJadwal(Jadwal jadwal) {
        this.jadwalList.add(jadwal);
    }

    public void setIdFilm(String idFilm) {
        this.idFilm = idFilm;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setDurasi(String durasi) {
        this.durasi = durasi;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public void setPosterPath1(String posterPath1) {
        this.posterPath1 = posterPath1;
    }

    public void setPosterPath2(String posterPath2) {
        this.posterPath2 = posterPath2;
    }   

    public void setJadwalList(List<Jadwal> jadwalList) {
        this.jadwalList = jadwalList;
    }    
    
    public String getIdFilm() {
        return idFilm;
    }

    public String getJudul() {
        return judul;
    }

    public String getGenre() {
        return genre;
    }

    public String getDurasi() {
        return durasi;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public String getPosterPath1() {
        return posterPath1;
    }
    
    public String getPosterPath2() {
        return posterPath2;
    }

    public List<Jadwal> getJadwalList() {
        return jadwalList;
    }      
    
    @Override
    public String toString() {
        return idFilm + "|" + judul + "|" + genre + "|" + durasi + "|" + sinopsis + "|" + posterPath1 + "|" + posterPath2;
    }
}