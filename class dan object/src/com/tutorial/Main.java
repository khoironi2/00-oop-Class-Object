package com.tutorial;

class Mahasiswa{
    String nama;
    String nrp;
    String Jenis_kelamin;
    double IPK;
    int umur;
}

public class Main {
    
    public static void main(String[] args){

        Mahasiswa mahasiswa1 = new Mahasiswa();
        
        mahasiswa1.nama = "Ucup";
        mahasiswa1.nrp = "123231";
        mahasiswa1.Jenis_kelamin = "Laki-Laki";
        mahasiswa1.IPK = 3.70;
        mahasiswa1.umur = 21;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.nrp);
        System.out.println(mahasiswa1.Jenis_kelamin);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "Utul";
        mahasiswa2.nrp = "12321231";
        mahasiswa2.Jenis_kelamin = "Perempuan";
        mahasiswa2.IPK = 3.80;
        mahasiswa2.umur = 21;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.nrp);
        System.out.println(mahasiswa2.Jenis_kelamin);
        System.out.println(mahasiswa2.IPK);
        System.out.println(mahasiswa2.umur);
    }
    
}
