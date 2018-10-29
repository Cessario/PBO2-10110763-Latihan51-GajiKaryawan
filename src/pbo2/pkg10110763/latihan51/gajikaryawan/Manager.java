/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10110763.latihan51.gajikaryawan;

/*
Nama : Cessario Sheva L.P.A
Nim  : 10117063
Kelas: IF-2
Deskripsi Program : Menampilkan Gaji
 */
public class Manager extends Karyawan {
    private int kehadiran;
    private float tunjanganGolongan;
    private float tunjanganJabatan;
    private float tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }
    
    public float tunjanganKehadiran(int hadir){
        return hadir * 10000;
    }
    public float tunjanganJabatan(String jabatan){
        if (jabatan.equalsIgnoreCase("Manager")){
            tunjanganJabatan = 2000000;
        return tunjanganJabatan;
        }else if (jabatan.equalsIgnoreCase("Kabag")){
            tunjanganJabatan = 1000000;
        return tunjanganJabatan;
        }
        return 0;
    }
    public float tunjanganGolongan(int golongan){
        if (golongan == 1){
            tunjanganGolongan = 500000;
            return tunjanganGolongan;
        }
        else if (golongan == 2){
            tunjanganGolongan = 1000000;
            return tunjanganGolongan;
        }
        else if (golongan == 3){
            tunjanganGolongan = 1500000;
            return tunjanganGolongan;
        }
        return 0;
    }
    public float gajiTotal(){
    return tunjanganJabatan +tunjanganGolongan +tunjanganKehadiran;
}
}
