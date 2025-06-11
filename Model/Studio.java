/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author anasyalaili
 */
public class Studio {
    private String idStudio;
    private String namaStudio;
    private String tipeStudio;
    private String[][] kursi;
    private boolean [][] sudahDipesan;

    public Studio(String idStudio, String namaStudio, String tipeStudio) {
        this.idStudio = idStudio;
        this.namaStudio = namaStudio;
        this.tipeStudio = tipeStudio;
    }  
    
    public Studio(String idStudio, String namaStudio, String tipeStudio, String[][] kursi, boolean[][] sudahDipesan) {
        this.idStudio = idStudio;
        this.namaStudio = namaStudio;
        this.tipeStudio = tipeStudio;
        this.kursi = kursi;
        this.sudahDipesan = sudahDipesan;
    }    

    public String getIdStudio() {
        return idStudio;
    }

    public String getNamaStudio() {
        return namaStudio;
    }

    public String getTipeStudio() {
        return tipeStudio;
    }   

    public String[][] getKursi() {
        return kursi;
    }

    public boolean[][] getSudahDipesan() {
        return sudahDipesan;
    }
    
    @Override
    public String toString() {
        return namaStudio; 
    }
}
