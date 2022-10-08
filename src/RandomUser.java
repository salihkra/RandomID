import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class RandomUser {
    static Random rd = new Random();

    //***KİMLİK NUMARASI ÜRETME ALANI***//
    public int idNumber(int idno){
        idno = rd.nextInt(1000);
        System.out.println(" " + idno);
        return idno;
    }
    //***İSİM ÜRETME ALANI***//
    public String name(int Namesatirno) throws IOException {
        String names = null;
        File file = new File("C:\\Users\\capsl\\Desktop\\Yazjava\\RandomID\\name.txt");
        BufferedReader reader = null;
        reader = new BufferedReader(new FileReader(file));
        int i = 0;
        String satir = reader.readLine();
        while (satir!=null){
            i++;
        if (i==Namesatirno){
            System.out.print(satir+" ");
        }
        satir = reader.readLine();
        }
        return names;
    }
    public String Surname(int Surnamesatirno) throws IOException {
        String surnames = null;
        File file = new File("C:\\Users\\capsl\\Desktop\\RandomID\\surname.txt");
        BufferedReader reader = null;
        reader = new BufferedReader(new FileReader(file));
        int i = 0;
        String satir = reader.readLine();
        while (satir!=null){
            i++;
            if (i==Surnamesatirno){
                System.out.print(satir);
            }
            satir = reader.readLine();
        }
        return surnames;
        
    }

    //***HARMANLANDIĞI YER***//
    public  void uretim() throws IOException {
        int Namesatirno = rd.nextInt(2446);
        int Surnamesatirno =  rd.nextInt(2446);
        int idno = 0;

        System.out.print("ISIM-SOYISIM-KIMLIK NO : ");
        name(Namesatirno);
        Surname(Surnamesatirno);
        idNumber( idno );
    }


}
