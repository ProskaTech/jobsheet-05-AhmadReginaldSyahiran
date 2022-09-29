/**
 * Created by 21343039_Ahmad Reginald Syahiran
 */
import javax.swing.JOptionPane;

public class GetInputFromKeyboard2 {
    public static void main(String[] args) {
        String name="", hoby="";
        name = JOptionPane.showInputDialog("Nama anda   :   ");
        hoby = JOptionPane.showInputDialog("Hobi anda   :   ");

        String msg = "jadi hobi anda "+hoby+". "
                +"hobi yang bagus"+name;

        JOptionPane.showMessageDialog(null, msg);

        System.out.println("Jadi hobi anda"+hoby+". Hobi yang bagu s"+name+"");

    }
    
}
