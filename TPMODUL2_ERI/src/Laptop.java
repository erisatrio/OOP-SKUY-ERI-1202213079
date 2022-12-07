public class Laptop extends Perangkat{

    public boolean webcam;


    public Laptop(String drive, int ram, float processor, boolean webcam){
        super(drive, ram, processor);
        this.webcam = webcam;
    }

    public void informasi(){
        if (this.webcam == true) {
            System.out.println("Laptop ini tidak diketahui memiliki drive tipe " + drive + " dengan ram sebesar " + ram + " dan processor secepat " + processor + " Ghz. Selain itu laptop ini juga memiliki webcam");

        }else{
            System.out.println("laptop ini tidak diketahui memiliki drive tipe " + drive + " dengan ram sebesar " + ram + " dan processor secepat " + processor + " Ghz. Selain itu laptop ini juga TIDAK memiliki webcam");
        }
    }

    public void bukaGame(String nama_game){
        System.out.println("laptop berhasil  membuka game " + nama_game);
    }

    public void kirimEmail(String email){
        System.out.println("Laptop berhasil mengirim Email ke " + email);
    }

    public void kirimEmail(String email1, String email2){
        System.out.println("Laptop berhasil mengirim Email ke " + email1 + " dan " + email2);
    }






}

