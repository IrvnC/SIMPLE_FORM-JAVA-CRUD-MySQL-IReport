/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan12siakad;

/**
 *
 * @author Windows
 */
public class Mhs implements Nilai {
    public String nim,nama;
    double vUts,vUas,vTugas,nilaiAkhir;
    char nHuruf;
    String predikat;
    
    public Mhs(String nim,String nama, double vUts, double vUas, double vTugas){
        this.nim=nim;
        this.nama=nama;
        this.vUts=vUts;
        this.vUas=vUas;
        this.vTugas=vTugas;
    }
    
    public double uts(){
        return vUts *35/100;
    }
    public double uas(){
        return vUas *35/100;
    }
    public double tugas(){
        return vTugas *30/100;
    }
    public double nilaiAkhir(){
        return uts()+uas()+tugas();
    }
    
    @Override
    public char getNilaiHuruf(double nilaiAkhir) {
        if(nilaiAkhir>=85)
            nHuruf='A';
        else if(nilaiAkhir>=70&&nilaiAkhir<85)
            nHuruf='B';
        else if(nilaiAkhir>=60&&nilaiAkhir<70)
            nHuruf='C';
        else if(nilaiAkhir>=40&&nilaiAkhir<60)
            nHuruf='D';
        else
            nHuruf='E';
        return nHuruf;
    }

    @Override
    public String getPredikat(char nhuruf) {
        switch(nHuruf){
            case'A':predikat="Apik";
            break;
            case'B':predikat="Baik";
            break;
            case'C':predikat="Cukup";
            break;
            case'D':predikat="Dablek";
            break;
            case'E':predikat="Elek";
            break;
        }
        return predikat;
    }
}
