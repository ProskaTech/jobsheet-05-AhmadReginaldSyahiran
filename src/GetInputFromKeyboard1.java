/**
 * Created by 21343039_Ahmad Reginald Syahiran
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GetInputFromKeyboard1 {
    public static void main(String[] args) {
        BufferedReader dataInt = new BufferedReader (new InputStreamReader (System.in));
        
        String name = "", hoby = "";

        try {
            System.out.print("Nama anda:    ");
            name = dataInt.readLine();
            System.out.print("Hobi anda:    ");
            hoby = dataInt.readLine();
        }

        catch (IOException e){
            System.out.println("Gagal membaca keyboard");
        }        
        System.out.println("Jadi Hobi anda "+hoby+". hobi yang bagus "+name);
    }
}
