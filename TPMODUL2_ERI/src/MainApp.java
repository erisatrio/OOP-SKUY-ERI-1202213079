public class MainApp{

    public static void main(String[] args) {
        Perangkat perangkat1 = new Perangkat("Agata", 2, 1.80f);
        perangkat1.informasi();

        System.out.println(" ");

        Laptop laptop1 = new Laptop("Seagate", 8, 2.40f, true );
        laptop1.informasi();
        laptop1.bukaGame("Dota");
        laptop1.kirimEmail("niceyuk@gmail.com");
        laptop1.kirimEmail("aanarji@gmail.com", "rusmango@gmail.com");

        System.out.println(" ");

        Handphone handphone1 = new Handphone("Sandisk", 3, 2.20f, false);
        handphone1.informasi();
        handphone1.telfon(627384);
        handphone1.kirimSMS(63536);
        handphone1.kirimSMS(72833, 3445);
       
        






    }
}