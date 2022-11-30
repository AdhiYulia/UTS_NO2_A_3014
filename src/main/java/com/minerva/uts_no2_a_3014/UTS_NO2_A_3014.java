/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.minerva.uts_no2_a_3014;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author VIOLA GITASYA
 */
public class UTS_NO2_A_3014 {
    public static void main(String[] args) {
        salaried_3014 s1 = new salaried_3014();
        commission_3014 c1= new commission_3014();
        planner_3014 p1= new planner_3014();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.println("Data Salaried");
            System.out.println("Nama : ");
            s1.nama = br.readLine();
            System.out.println("NIP : ");
            s1.NIP = Integer.parseInt(br.readLine());
            System.out.println("Upah mingguan : ");
            s1.upah = Integer.parseInt(br.readLine());
           
            System.out.println();
            
            System.out.println("Data Commission");
            System.out.println("Nama : ");
            c1.nama = br.readLine();
            System.out.println("NIP : ");
            c1.NIP = Integer.parseInt(br.readLine());
            System.out.println("Total penjualan : ");
            c1.totalp = Integer.parseInt(br.readLine());
            System.out.println("Komisi : ");
            c1.komisi = Integer.parseInt(br.readLine());
            System.out.println("Gaji pokok : ");
            c1.gajip = Integer.parseInt(br.readLine());
            
            System.out.println();
            
            System.out.println("Data Planner");
            System.out.println("Nama : ");
            p1.nama = br.readLine();
            System.out.println("NIP : ");
            p1.NIP = Integer.parseInt(br.readLine());
            System.out.println("Total hasil proyek : ");
            p1.totalp = Integer.parseInt(br.readLine());
            System.out.println("Komisi : ");
            p1.komisi = Integer.parseInt(br.readLine());
            System.out.println("Gaji pokok : ");
            p1.gajip = Integer.parseInt(br.readLine());
            
            System.out.println("=========== Data Salaried ===========");
            s1.tampildata();
            s1.datasalaried();
            s1.upah();
            
            System.out.println();
            
            System.out.println("=========== Data Commission ===========");
            
            c1.tampildata();
            c1.datacommission();
            c1.gajip();
            
            System.out.println();
            
            System.out.println("=========== Data Planner ===========");
            
            p1.tampildata();
            p1.dataplanner();
            p1.gajip();

        } catch (IOException eox) // menangkap kesalahan
        {
            System.out.println(eox);
        }
    }
}
