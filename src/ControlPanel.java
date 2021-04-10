import java.util.Scanner;
import java.util.InputMismatchException;

public class ControlPanel extends Database {
    String wybor;
    DisplayMenu dmenu1 = new DisplayMenu();
    Scanner input = new Scanner(System.in);
    void ChooseMenu(){
            try {
                dmenu1.DisplayChooseMenu();
                wybor = input.next();
                if (wybor.equals("1")||wybor.equals("2")||wybor.equals("3")) {
                    if(wybor.equals("1")) {
                        DoReservation();
                    }else if(wybor.equals("2")) {
                        ShowReservation();
                    }else if(wybor.equals("3")){

                    }
                }else{
                    throw new InputMismatchException("Not valid choice");
                }
            }catch(InputMismatchException ex){
                System.out.println("Zły wybór, wybierz ponownie");
            }
    }
}
