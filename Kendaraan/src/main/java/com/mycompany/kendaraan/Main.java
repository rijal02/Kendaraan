/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kendaraan;

/**
 *
 * @author rizal
 */
public class Main {

    public static void main(String[] args) {
        MobilBaru MobilBaru = new MobilBaru("Kijang", "Avanza", "3 tahun");
        MobilBekas MobilBekas = new MobilBekas("Honda", "Hyundai", 2018, 200000000);
        Dealer Dealer = new Dealer("Mobilindo", MobilBaru, MobilBekas);
        Dealer.info();
    }
}
