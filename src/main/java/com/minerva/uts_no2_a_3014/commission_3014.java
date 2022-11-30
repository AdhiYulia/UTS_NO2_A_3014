/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.minerva.uts_no2_a_3014;

/**
 *
 * @author VIOLA GITASYA
 */
public class commission_3014 extends employee_3014{
    String nama;
    int NIP;
    int totalp;
    int komisi;
    int gajip;
    public void datacommission(){
        System.out.println("Komisi : "+komisi);
        System.out.println("Total penjualan : "+totalp);
        System.out.println("Gaji pokok : "+gajip);
    }
    public double gajip(){
        return gajip = gajip+(komisi*totalp);
    }
}
