/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10110763.latihan51.gajikaryawan;

import java.util.Scanner;

/*
Nama : Cessario Sheva L.P.A
Nim  : 10117063
Kelas: IF-2
Deskripsi Program : Menampilkan Gaji
 */
public class PBO210110763Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Karyawan kry = new Karyawan();
        Manager mng = new Manager();
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan NIK : ");
        String Nik  = (sc.nextLine());
        System.out.print("Masukkan Nama : ");
        String Nama = (sc.nextLine());
        System.out.print("Masukkan Golongan (1/2/3) : ");
        int Golongan = (sc.nextInt());
        System.out.print("Masukkan Jabatan(Manager/Kabag) : ");
        String Jabatan = (sc.next());
        System.out.print("Masukkan Jumlah Kehadiran : ");
        int hadir = sc.nextInt();
        
        mng.setNik(Nik);
        mng.setNama(Nama);
        mng.setGolongan(Golongan);
        mng.setJabatan(Jabatan);
        mng.setKehadiran(hadir);
        
        System.out.println("");
        System.out.println("===Hasil Perhitungan===");
        System.out.print("NIK : " +mng.getNik());
        System.out.print("\nNama : "+mng.getNama());
        System.out.print("\nGolongan : "+mng.getGolongan());
        System.out.println("");
        System.out.println("TUNJANGAN GOLONGAN : "+mng.tunjanganGolongan(mng.getGolongan()));
        System.out.println("TUNJANGAN JABATAN : "+mng.tunjanganJabatan(mng.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN : "+mng.tunjanganKehadiran(mng.getKehadiran()));
        
        System.out.println("GAJI TOTAL : "+mng.gajiTotal());
        
                
    }
    
}
