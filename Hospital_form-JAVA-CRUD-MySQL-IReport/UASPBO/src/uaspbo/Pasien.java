/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uaspbo;

/**
 *
 * @author Windows
 */
public class Pasien implements Kelas {
     public String nik,nama,tanggal,alamat,ruangan,biaya;
     double umur,iLantai;
     char rKelas;
    
     
     public Pasien(String tanggal,String nik,String nama, String alamat, double umur, double iLantai){
        this.tanggal=tanggal;
        this.nik=nik;
        this.nama=nama;
        this.alamat=alamat;
        this.umur=umur;
        this.iLantai=iLantai;
    }
     
    @Override
    public char getKelas(double iLantai) {
        if(iLantai==5)
            rKelas='A';
        else if(iLantai==4)
            rKelas='B';
        else if(iLantai==3)
            rKelas='C';
        else if(iLantai==2)
            rKelas='D';
        else
            rKelas='E';
        return rKelas;
    }

    @Override
    public String getRuangan(char rKelas) {
       switch(rKelas){
            case'A':ruangan="R.Dahlia";
            break;
            case'B':ruangan="R.Mawar";
            break;
            case'C':ruangan="R.Melati";
            break;
            case'D':ruangan="R.Sepatu";
            break;
            case'E':ruangan="R.Anggrek";
            break;
        }
        return ruangan;
    }

    @Override
    public String getBiaya(char rKelas) {
        switch(rKelas){
            case'A':biaya="Rp. 2.000.000";
            break;
            case'B':biaya="Rp. 1.500.000";
            break;
            case'C':biaya="Rp. 1.00.000";
            break;
            case'D':biaya="Rp. 750.000";
            break;
            case'E':biaya="Rp. 500.000";
            break;
        }
        return biaya;
   }

    
    
}
