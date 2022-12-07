import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Database {
    // TODO Create List of Menu Object to Store Menu from Menu Class
    public static ArrayList<String> daftar_menu= new ArrayList<String>();

    // TODO Create Method to Insert Menu to Database
    public static void Insert_Menu(String nama_menu, String type_menu, int menu_harga){
        daftar_menu.add(nama_menu);
        daftar_menu.add(type_menu);
        daftar_menu.add(Integer.toString(menu_harga));
    }
    // TODO Create Method to Show Menu from Database
    public static void Show_Menu(){
        System.out.println("Menu");
        System.out.println("=====================");
        for (int i =0; i<daftar_menu.size(); i+=3){
            System.out.println((i/3+1)+". "+daftar_menu.get(i)+". ("+ daftar_menu.get(i+1)+") "+daftar_menu.get(i+2));
        }
    }

    // TODO Create Method to Search Menu from Database
    public static void Search_Menu(){
        System.out.print("Masukan nama menu :");
        scan.nextLine;
    }


}
