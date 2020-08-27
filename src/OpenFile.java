import model.Karbar;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OpenFile {
    private Scanner scanner;
    public void open(){
        try {
            scanner=new Scanner(new File("moshakhasat.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void read(){
        Karbar karbar=new Karbar();
        while (scanner.hasNext()){
            karbar.setEsm(scanner.next());
            karbar.setFamil(scanner.next());
            karbar.setTarikheTavalod(scanner.next());
            System.out.println(karbar.getEsm()+"-"+karbar.getFamil()+"-"+karbar.getTarikheTavalod());
        }
    }
    public void close(){
        scanner.close();
    }
}

