/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author anasyalaili
 */

public class Jadwal {
    private String idJadwal;
    private String tanggal;
    private String jamMulai;
    private Film film;
    private Studio studio;

    public Jadwal(String idJadwal, Film film, Studio studio, String jamMulai, String tanggal) {
        this.idJadwal = idJadwal;
        this.tanggal = tanggal;
        this.jamMulai = jamMulai;
        this.film = film;
        this.studio = studio;
    }

    public String getIdJadwal() {
        return idJadwal;
    }

    public String getTanggal() {
        return tanggal;
    }

    public String getJamMulai() {
        return jamMulai;
    }

    public Film getFilm() {
        return film;
    }

    public Studio getStudio() {
        return studio;
    }
   
}
