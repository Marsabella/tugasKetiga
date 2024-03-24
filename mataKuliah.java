package tugasKetiga;

import java.util.*;
import java.lang.*;

public class mataKuliah {
    private String kode;
    private String namaMK;
    private int nilaiAngka;
    public mataKuliah(String kode, String namaMK, int nilaiAngka){
        this.kode = kode;
        this.namaMK = namaMK;
        this.nilaiAngka = nilaiAngka;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNamaMK() {
        return namaMK;
    }

    public void setNamaMK(String namaMK) {
        this.namaMK = namaMK;
    }

    public int getNilaiAngka() {
        return nilaiAngka;
    }

    public void setNilaiAngka(int nilaiAngka) {
        this.nilaiAngka = nilaiAngka;
    }
    public String getNilaiHuruf(){
        if (nilaiAngka>=80){
            return "A";
        } else if (nilaiAngka>=70){
            return "B";
        }else if (nilaiAngka>=60){
            return "C";
        }else if (nilaiAngka>=50){
            return "D";
        }else{
            return "E";
        }
    }
}
