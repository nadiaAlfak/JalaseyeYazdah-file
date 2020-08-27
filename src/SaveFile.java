import model.Karbar;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class SaveFile {
    private Formatter khoroji;

    public void bazkardanFile() {
        try {
            khoroji = new Formatter("moshakhasat.txt");
        } catch (FileNotFoundException e) {
            System.out.println("faile sakhte nashod");
        }

    }

    public void add() {
        Karbar karbar = new Karbar();
        Scanner scanner = new Scanner(System.in);

        int tekrar=0;
        while (tekrar<2) {
            tekrar++;
            System.out.println("name khod ra vared koni");
            karbar.setEsm(scanner.next());
            System.out.println("name khanevadegi ra vared konid");
            karbar.setFamil(scanner.next());
            System.out.println("sale tavalod khod ra vared konid");
            karbar.setTarikheTavalod(scanner.next());
            khoroji.format("%s %s %s\n", karbar.getEsm(), karbar.getFamil(), karbar.getTarikheTavalod());
        }
    }

    public void close() {
        if (khoroji != null) {
            khoroji.close();
        }
    }
}
