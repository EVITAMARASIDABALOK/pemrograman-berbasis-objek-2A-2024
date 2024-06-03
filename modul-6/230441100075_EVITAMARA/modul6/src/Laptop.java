public class Laptop extends Komputer implements Mouse,Keyboard,Printer{
    void hidupkan_os() {
        System.out.println("----------------");
        System.out.println("     LAPTOP     ");
        System.out.println("----------------");
        System.out.println("Hidupkan os");
    }

    void matikan_os() {
        System.out.println("----------------");
        System.out.println("     LAPTOP     ");
        System.out.println("----------------");
        System.out.println("Matikan os");
    }

    @Override
    public void klik_kanan() {
        System.out.println("----------------");
        System.out.println("     LAPTOP     ");
        System.out.println("----------------");
        System.out.println("Klik kanan");
    }

    @Override
    public void klik_kiri() {
        System.out.println("----------------");
        System.out.println("     LAPTOP     ");
        System.out.println("----------------");
        System.out.println("Klik kiri");
    }

    @Override
    public void tekan_enter() {
        System.out.println("----------------");
        System.out.println("     LAPTOP     ");
        System.out.println("----------------");    
        System.out.println("Tekan enter");
    }

    @Override
    public void cetak_data() {
        System.out.println("----------------");
        System.out.println("     LAPTOP     ");
        System.out.println("----------------");
        System.out.println("Cetak data");
    }
}
