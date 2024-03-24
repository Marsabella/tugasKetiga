package tugasKetiga;

import java.util.*;
import java.lang.*;

public class mahasiswa {
    private String nim;
    private String nama;
    public mahasiswa(String nim, String nama){
        this.nim = nim;
        this.nama = nama;

    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
