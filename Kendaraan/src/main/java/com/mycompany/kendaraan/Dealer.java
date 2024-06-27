/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kendaraan;

/**
 *
 * @author rizal
 */
class Dealer {

    private String nama;
    private MobilBaru mobilBaru;
    private MobilBekas mobilBekas;

    public Dealer(String nama, MobilBaru MobilBaru, MobilBekas MobilBekas) {
        this.nama = nama;
        this.mobilBaru = MobilBaru;
        this.mobilBekas = MobilBekas;
    }

    public String getNama() {
        return nama;
    }

    public void info() {
        System.out.println("Dealer: " + nama);
        mobilBaru.info();
        mobilBekas.info();
    }
}
