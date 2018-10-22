package me.alarai;

public class Manager extends Karyawan{

    private int kehadiran;
    private float tunjanganGolongan,tunjanganJabatan,tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }

    public float tunjanganKehadiran(int hadir){
        float tunj = hadir * 10000;
        this.tunjanganKehadiran = tunj;
        return tunj;
    }

    public float tunjanganJabatan(String jabatan){
        float tunj = 0;
        if(jabatan.toLowerCase().equals("manager")){
            tunj = 2000000;
        }else if(jabatan.toLowerCase().equals("kabag")){
            tunj = 1000000;
        }

        this.tunjanganJabatan = tunj;

        return tunj;
    }

    public float tunjanganGolongan(int golongan){
        float tunj = 0;
        if(golongan == 1){
            tunj = 500000;
        }else if(golongan == 2){
            tunj = 1000000;
        }else if(golongan == 3){
            tunj = 1500000;
        }

        this.tunjanganGolongan = tunj;

        return tunj;
    }

    public float totalGaji(){
        return tunjanganGolongan + tunjanganJabatan + tunjanganKehadiran;
    }
}
