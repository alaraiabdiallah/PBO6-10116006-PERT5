package me.alarai;

import java.util.Scanner;

/*
 *
 * @author
 * NAMA  : Ala Rai AbdiAllah
 * Kelas : PBO 6
 * NIM   : 10116006
 * Deskripsi Program : Program menghitung gaji karyawan berdasarkan jabatan dan golongan
 * */
public class Main {

    public static void main(String[] args) {

        Manager man = new Manager();

        System.out.println("====Program Penghitungan Gaji Karyawan====");

        System.out.print("Masukkan NIK : ");
        Scanner scan1 = new Scanner(System.in);
        man.setNik(scan1.nextLine());

        System.out.print("Masukkan Nama : ");
        Scanner scan2 = new Scanner(System.in);
        man.setNama(scan2.nextLine());

        System.out.print("Masukkan Golongan (1/2/3) : ");
        Scanner scan3 = new Scanner(System.in);
        man.setGolongan(scan3.nextInt());

        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        Scanner scan4 = new Scanner(System.in);
        man.setJabatan(scan4.nextLine());

        System.out.print("Masukkan Jumlah Kehadiran : ");
        Scanner scan5 = new Scanner(System.in);
        man.setKehadiran(scan5.nextInt());

        System.out.println();
        System.out.println("====Hasil Perhitungan====");
        System.out.println("NIK \t : "+man.getNik());
        System.out.println("NAMA \t : "+man.getNama());
        System.out.println("GOLONGAN : "+man.getGolongan());
        System.out.println("JABATAN : "+man.getJabatan());

        System.out.println();
        System.out.println("TUNJANGAN GOLONGAN  \t: "+man.tunjanganGolongan(man.getGolongan()));
        System.out.println("TUNJANGAN JABATAN  \t\t: "+man.tunjanganJabatan(man.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN  \t: "+man.tunjanganKehadiran(man.getKehadiran()));

        System.out.println();

        System.out.println("GAJI TOTAL \t: "+man.totalGaji());
    }
}
