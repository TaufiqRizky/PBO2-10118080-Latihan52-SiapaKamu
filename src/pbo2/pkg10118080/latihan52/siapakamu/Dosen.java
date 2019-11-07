/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118080.latihan52.siapakamu;

/**
 *
 * @author USER
 */
public class Dosen extends Manusia{
 private String nip,mataKuliah;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    
    public void mengajarApa(){
        System.out.println("Saya "+getNama()+" umur "+getUmur()+" tahun sedang mengajar matakuliah "+getMataKuliah());
    }

    @Override
    public void siapaKamu() {
        //super.siapaKamu(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Saya Dosen");
    }
    
}
