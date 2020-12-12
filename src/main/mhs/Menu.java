/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.mhs;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Menu {
    int pilih;
    void menu(){
        /* Scanner input = new Scanner(System.in);
        DataMhs a = new DataMhs();
        System.out.println("***************");
        System.out.println("DATA MAHASISWA");
        System.out.println("***************");
        System.out.println("Menu :");
        System.out.println("1. Tambah Data");
        System.out.println("2. Hapus Data");
        System.out.println("3. Cari Data");
        System.out.println("4. Tampil Data");       
        System.out.println("Pilih no menu :");
        this.pilih = input.nextInt();
        
        switch (pilih){
            case 1 :
                System.out.println("Memasukkan data");
                System.out.println("Masukkan nama: ");
                String nama = input.next();
                System.out.println("Masukkan nim :");
                String nim = input.next();
                System.out.println("Masukkan Gender :");
                String gender = input.next();
                a.tambahData(new Mahasiswa(nama, nim, gender));
                menu();
                break;
            case 2 :
                System.out.println("Menghapus data");
                menu();
                break;
            case 3 :
                
            case 4 :
                System.out.println("Menampilkan data");
                a.tampilData();
                menu();
                break;
            default :
                // Balik Ke Menu 
                this.menu(); 

                
                
        } 
        /*if (pilih == 1) {
            System.out.println("Memasukkan data");
            System.out.println("Masukkan nama: ");
            String nama = input.next();
            System.out.println("Masukkan nim :");
            String nim = input.next();
            System.out.println("Masukkan Gender :");
            String gender = input.next();
            a.tambahData(new Mahasiswa(nama, nim, gender));
            menu();
          } else if (pilih == 2) {
            System.out.println("Menampilkan data");
            a.tampilData();
            menu();
          } else 
              menu();
          // Outputs "Good evening. */
    }
}
