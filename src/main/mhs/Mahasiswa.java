/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.mhs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class Mahasiswa {
    String genderStr;
    String namaMhs;
    String nimMhs;
    String tglLahirStr;
    Date tglLahir;
    int gender;
 
    // konstruktor
    Mahasiswa( String nama, String nim, String date, int gender){
        this.namaMhs = nama;
        this.nimMhs = nim;
        this.tglLahirStr = date;
        try {
            this.tglLahir = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        } catch (ParseException ex) {
            Logger.getLogger(Mahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.gender = gender;
        this.genderStr = (gender == 0) ? "Laki - laki" : "Perempuan";
    }
     
    // method untuk menampilkan object Mahasiswa
    void print(){
        
        System.out.println("Nama Mahasiswa: " + this.namaMhs);
        System.out.println("NIM           : " + this.nimMhs);
        System.out.println("Gender        : " + this.gender);
    }
}

