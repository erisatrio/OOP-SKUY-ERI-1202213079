public class TransportasiAir{
    public int jumlahKursi;
    public int biaya;
    

    public TransportasiAir(int jumlahKursi, int biaya){
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;
        
    }

    public void informasi(){
        System.out.println("Tranportasi Air jenis ini tidak diketahui dengan kursi berjumlah" + jumlahKursi+ " ditetapkan dengan biaya sebesar Rp." + biaya + "");

    }

    public void berlayar(){
        System.out.println("Tranportasi Air dengan jenis yang tidak diketahui sedang berlayar");
    }
    public void berlabuh(){
        System.out.println("Transportasi Air jenis yang tidak diketahui berlabuh di pantai");
    }

}