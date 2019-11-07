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
public class PBO210118080Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dosen d = new Dosen();
        Mahasiswa m = new Mahasiswa();
        d.setNip("41227829930");
        d.setNama("Rizki Adam Kurniawan");
        d.setUmur(27);
        d.setMataKuliah("PBO");
        System.out.println("NIP DOSEN : "+d.getNip());
        d.siapaKamu();
        d.mengajarApa();
        
        System.out.println("");
        
        m.setNama("Nindi");
        m.setNim("10110269");
        m.setUmur(17);
        System.out.println("NIM MAHASISWA : "+m.getNim());
        m.siapaKamu();
        m.kelasApa();
    }
    
}
