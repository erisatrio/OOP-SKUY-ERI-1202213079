public class Perangkat{
    public String drive;
    public int ram;
    public float processor;

    public Perangkat(String drive, int ram, float processor){
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;
    }

    public void informasi(){
        System.out.println("Perangkat ini tidak diketahui memiliki drive tipe " + drive + " dengan ram sebesar " + ram + " dan processor secepat " + processor + " Ghz");
    }
}