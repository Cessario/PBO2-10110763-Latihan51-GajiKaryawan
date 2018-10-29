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
public class Karyawan {
    protected String Nik;
    protected String Nama;
    protected String Jabatan;
    private int golongan;

    public String getNik() {
        return Nik;
    }

    public void setNik(String Nik) {
        this.Nik = Nik;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getJabatan() {
        return Jabatan;
    }

    public void setJabatan(String Jabatan) {
        this.Jabatan = Jabatan;
    }

    public int getGolongan() {
        return golongan;
    }

    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }
    
    
    
}
