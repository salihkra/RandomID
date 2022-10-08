import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        RandomUser Ru = new RandomUser();
        Ru.uretim();
    }
}
/*
FileReader fileReader = new FileReader("name.txt");
        String line;
        BufferedReader br = new BufferedReader(fileReader);
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
*/