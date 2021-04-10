import javax.xml.crypto.Data;
import java.sql.*;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class Cars {

    public static void main(String[] args) {
        ControlPanel c1 = new ControlPanel();
        Database d1 = new Database();
        do{
            c1.ChooseMenu();
        }while(true);
        }
}
