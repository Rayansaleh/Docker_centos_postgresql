import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

    private String url = "jdbc:postgresql://localhost:5432/EntEbiz";

    private String user = "Boldo";

    private String passwd = "jmarsjhe43";

    private static Connection connect;


    private Connect(){
        try {
            connect = DriverManager.getConnection(url, user, passwd);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static Connection getInstance(){
        if (connect == null){
            new Connect();
        }
        return connect;
    }
}
