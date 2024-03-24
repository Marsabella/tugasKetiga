package tugasKetiga;

import java.util.*;
import java.lang.*;

public class khs {
    private mahasiswa mahasiswa;
    private ArrayList<mataKuliah>mataKuliahs;
    public khs (mahasiswa mahasiswa){
        this.mahasiswa=mahasiswa;
        this.mataKuliahs=new ArrayList<>();
    }
    public void addmataKuliah(mataKuliah mataKuliah){
        mataKuliahs.add(mataKuliah);
    }
    public void tampilkanKhs(){
        System.out.println("Kartu Hasil Studi (KHS)");
        System.out.println("Nama : "+mahasiswa.getNama());
        System.out.println("NIM : "+mahasiswa.getNim());
        System.out.println("Mata Kuliah : ");
        for (mataKuliah MK:mataKuliahs){
            System.out.println("Kode : " +MK.getKode());
            System.out.println("Nama Mata Kuliah : " +MK.getNamaMK());
            System.out.println("Nilai Angka : " +MK.getNilaiAngka());
            System.out.println("Nilai Huruf : " +MK.getNilaiHuruf());
        }
    }
}
