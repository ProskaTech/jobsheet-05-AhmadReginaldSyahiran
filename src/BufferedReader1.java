import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReader1 {
    public static void main(String[] args) {
        BufferedReader dataInt = new BufferedReader (new InputStreamReader (System.in));

        String a,b;
        float angka1, angka2, jumlah;
        System.out.println("Program Penjumlahan Dua buah Bilangan");

        try {
            System.out.print("Masukkan angka pertama    :   ");
            a = dataInt.readLine();
            angka1 = Float.parseFloat(a);

            System.out.print("Masukkan angka kedua    :   ");
            b = dataInt.readLine();
            angka2 = Float.parseFloat(b);
            
            jumlah = angka1+angka2;
            System.out.println("Jumlah = "+jumlah);
        }
        catch (IOException e){
            System.out.println("Gagal membaca keyboard");
        }        

    }
}
