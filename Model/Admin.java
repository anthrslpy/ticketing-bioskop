/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author anasyalaili
 */
public class Admin extends Pengguna {
    private String nip;

    public Admin(String id, String nama, String email, String password, String nip) {
        super(id, nama, email, password, "ADMIN");
        this.nip = nip;
    }
    
    public String getCode(){
        return nip;
    }
}