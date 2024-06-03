/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biodatadiri_mahasiswa;

/**
 *
 * @author evisi
 */
public class Biodatadiri_mahasiswa {
    class mahasiswa{
    String nama;
    int nim;
    String asal;
    int tanggallahir;
    String prodi;
        private String asalkota;
        private int tanggal;
   
   
    public mahasiswa (String[] args) {
        this.nama = nama;
        this.nim =  nim;
        this.asal = asalkota ;
        this.tanggallahir = tanggallahir ;
        this.prodi = prodi;
        
        
        public String getname(){
            return nama;
        }
        public int getNim(){
            return nim;
        }
        public String getasal(){
            return asal;
        }
        public int gettanggal(){
            return tanggallahir;
        }
        public String getprodi(){
            return prodi;
        }
       
    }
    while (true) {
            System.out.print("nama: ");
            String nama = input.nextLine();
            System.out.print("nim: ");
            String nim = input.nextLine();
            System.out.print("asal: ");
            String asal = input.nextLine();
            system.out.print("tanggallahir");
            String tanggal = input.nextline();
            System.out.println("Kode Jurusan:");
            System.out.println("41. TEKNIK INFORMATIKA");
            System.out.println("42. TEKNIK INDUSTRI");
            System.out.println("43. TEKNIK ELEKTRO");
            System.out.println("44. SISTEM INFORMASI");
            System.out.println("48. TEKNIK MESIN");
            System.out.println("49. TEKNIK MEKATRONIKA");
            System.out.print("Pilih Kode Jurusan: ");
            String kodeJurusan = input.nextLine();

            String jurusan;
            switch (kodeJurusan) {
                case "41":
                    jurusan = "Teknik Informatika";
                    break;
                case "42":
                    jurusan = "Teknik Industri";
                    break;
                case "43":
                    jurusan = "Teknik Elektro";
                    break;
                case "44":
                    jurusan = "Sistem Informasi";
                    break;
                case "48":
                    jurusan = "Teknik Mesin";
                    break;
                case "49":
                    jurusan = "Teknik Mekatronika";
                    break;
                default:
                    jurusan = "Jurusan Tidak Terdaftar";
                    break;
    
}


   
    
        
    
}
