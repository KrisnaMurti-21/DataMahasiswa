/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.mhs;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class DataMhs {
    int pilih;
    ArrayList<Mahasiswa> dataMhs = new ArrayList<Mahasiswa>();
    
    void tambahData(Mahasiswa data){
        this.dataMhs.add(data);
    }
    
    void hapusData(String nim){
        this.dataMhs.removeIf(item -> item.nimMhs.equals(nim));
    }
    
    
    void menu(){
        Scanner input = new Scanner(System.in);
        
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
                System.out.println("Masukkan tanggal lahir(dd/mm/yyyy)");
                String tgl = input.next();
                System.out.println("Masukkan Gender :");
                System.out.println("0 = Laki-laki dan 1 = Perempuan");
                int gender = input.nextInt();
                tambahData(new Mahasiswa(nama, nim, tgl, gender));
                menu();
                break;
            case 2 :
                System.out.println("Menghapus data");
                System.out.println("Masukkan nim mahasiswa");
                String kode = input.next();
                hapusData(kode);
                menu();
                break;
            case 3 :
                System.out.println("1. Berdasarkan NIM");
                System.out.println("2. Berdasarkan Gender");
                System.out.println("Pilihanmu : ");
                int filter = input.nextInt();
                input.nextLine();
                ArrayList<Mahasiswa> filtered_data = new ArrayList<>(dataMhs);
                if (filter == 1){
                    System.out.println("Masukkan NIM : ");
                    String nimM = input.next();
                    filtered_data.removeIf(t -> !t.nimMhs.equals(nimM));
                } else if(filter == 2){
                    System.out.println("Keterangan : 0 = Laki - laki & 1 = perempuan");
                    System.out.println("Pilihanmu : ");
                    int genderM = input.nextInt();
                    filtered_data.removeIf(t -> t.gender != genderM);
                }
                
                
                if (filtered_data.isEmpty()){
                    System.out.println("Tidak Ditemukan");
                } else {
                    filtered_data.forEach(n -> System.out.println(n.nimMhs + " - "+ n.namaMhs + " - " + n.tglLahirStr + " - " + n.genderStr)); 
                }
                menu();
                break;
                
            case 4 :
                System.out.println("Menampilkan data");
                dataMhs.forEach((n) -> System.out.println(n.nimMhs + " - "+ n.namaMhs + " - " + n.tglLahirStr + " - " + n.genderStr));
                menu();
                break;
            default :
                // Balik Ke Menu 
                this.menu(); 

                
                
        } 
    }
}
