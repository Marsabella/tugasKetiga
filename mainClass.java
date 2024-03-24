package tugasKetiga;

import java.util.*;
import java.lang.*;

public class mainClass {
    public static void main(String[] args) {
        Scanner bella = new Scanner(System.in);
        System.out.print("Masukkan NIM Mahasiswa : ");
        String nim = bella.nextLine();
        System.out.print("Masukkan Nama Mahasiswa : ");
        String nama = bella.nextLine();

        mahasiswa mahasiswa = new mahasiswa(nim, nama);
        khs KHS = new khs(mahasiswa);

        boolean lanjut = true;
        while (lanjut){
            System.out.print("\nMasukkan Kode Mata Kuliah : ");
            String kode = bella.nextLine();
            System.out.print("Masukkan Nama Mata Kuliah : ");
            String namaMK = bella.nextLine();
            System.out.print("Masukkan Nilai Angka Mata Kuliah : ");
            int nilaiAngka = bella.nextInt();
            bella.nextLine();

            KHS.addmataKuliah(new mataKuliah(kode,namaMK,nilaiAngka));
            System.out.println("Apakah ingin menginput lagi? (iya/tidak)");
            String jawaban = bella.nextLine();
            if (!jawaban.equalsIgnoreCase("iya")){
                lanjut = false;
            }
        }
        KHS.tampilkanKhs();
    }
}
