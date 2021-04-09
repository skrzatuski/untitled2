import javax.xml.crypto.Data;
import java.util.Scanner;

public class ControlPanel extends Database {
    int wybor;

    DisplayMenu dmenu1 = new DisplayMenu();
    Scanner chmenu = new Scanner(System.in);

    void ChooseMenu(){
        dmenu1.DisplayChooseMenu();
        wybor = chmenu.nextInt();
        switch(wybor){
            case 1:
                DoReservation();
                break;
            case 2:

                break;
            case 3:

                break;
        }
    }
}
