/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author anasyalaili
 */
public class Penonton extends Pengguna {
    private String noTelepon;

    public Penonton(String id, String nama, String email, String password, String noTelepon) {
        super(id, nama, email, password, "CUSTOMER");
        this.noTelepon = noTelepon;
    }
}
