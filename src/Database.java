import java.sql.*;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.util.Scanner;

public class Database {


    String url = "jdbc:mysql://localhost:3306/";
    String dbName = "hotel";
    String driver = "com.mysql.cj.jdbc.Driver";
    String userName = "root";
    String password = "";
    Connection con = null;
    Statement stt = null;
    String column;

    void Connection() {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Podaj nazwe kolumny");
        column = s1.nextLine();
        try {
            //Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url + dbName, userName, password);
            stt = con.createStatement();

            ResultSet res = stt.executeQuery("SELECT * FROM pokoje");
            while (res.next()) {

                System.out.println(res.getString(column));
            }
            System.out.println("");



        } catch (
                SQLException throwables) {
            throwables.printStackTrace();
        }

    }
    void DoReservation(){
        String imie;
        String nazwisko;
        int idpokoju;
        String dataod;
        String datado;
        Scanner s2 = new Scanner(System.in);
        System.out.println("Podaj imie: ");
        imie = s2.nextLine();
        System.out.println("Podaj nazwisko: ");
        nazwisko = s2.nextLine();
        System.out.println("Podaj ID pokoju: ");
        idpokoju = s2.nextInt();
        s2.nextLine();
        System.out.println("Podaj od kiedy DD-MM-RR ");
        dataod = s2.nextLine();
        System.out.println("Podaj do kiedy DD-MM-RR ");
        datado = s2.nextLine();

        try {
            //Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url + dbName, userName, password);
            String sql = "INSERT INTO rezerwacje (imie,nazwisko,idpokoju,dataod,datado) VALUES (?,?,?,?,?)";
            PreparedStatement stt = con.prepareStatement(sql);
            stt.setString(1,imie);
            stt.setString(2,nazwisko);
            stt.setString(3,String.valueOf(idpokoju));
            stt.setString(4,dataod);
            stt.setString(5,datado);




            stt.executeUpdate();
        } catch (
                SQLException throwables) {
            throwables.printStackTrace();
        }

    }

}
