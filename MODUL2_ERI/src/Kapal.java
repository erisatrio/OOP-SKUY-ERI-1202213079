public class Kapal extends TransportasiAir{

    public String mesin;
    
    public Kapal(int jumlahKursi, int biaya, String mesin){
        super(jumlahKursi, biaya);
        this.mesin = mesin;
    }

    public void informasi(){
        System.out.println("Tranportasi Air jenis Kapal dengan kursi berjulah 50 ditetapkan dengan biaya sebesar Rp.10000");
    }

    public void berlayar(){
        System.out.println("Tranportasi Air jenis Kapal sedang berlayar menggunakan mesin " + mesin + " dengan kecepatan yang tidak stabil");
    }
    public void berlayar(int kecepatan){
        System.out.println("Tranportasi Air jenis Kapal sedang berlayar menggunakan mesin " + mesin+ " dengan kecepatan stabil di kisaran " + kecepatan + " knot");
        
    }

    public void berlabuh(){
        System.out.println("Transportasi Air jenis Kapal berlabuh di pantai");
    }
}