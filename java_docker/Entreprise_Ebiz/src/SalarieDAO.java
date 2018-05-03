import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class SalarieDAO extends DAO<Salarie>{

    PreparedStatement ps;
    ResultSet result;

    public SalarieDAO(Connection conn) {
        super(conn);
    }

   // public SalarieDAO(){
     //   super();
    //}

    @Override
    public void create(Salarie obj) {
        try{
            String query = "INSERT INTO salarie(sal_id, sal_nom, sal_ent_id) VALUES(?, ?, ?)";
            ps = connection.prepareStatement(query);

            ps.setInt(1, obj.getId());
            ps.setString(2, obj.getNom());
            ps.setInt(3, obj.getId_ent());
            ps.executeUpdate();
            System.out.println("Data added");

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            try {
                if (ps != null){
                    ps.close();
                }
                if (connection != null){
                    connection.close();
                }
            }catch (SQLException e){
                e.printStackTrace();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    @Override
    public void delete(Salarie obj) {

    }

    @Override
    public void update(Salarie obj) {

    }

    @Override
    public void find() {
        try {
            String query = "SELECT * FROM salarie";
            ps = connection.prepareStatement(query);

            result = ps.executeQuery();

            while (result.next()){
                System.out.println("id : " + result.getInt("sal_id") + " nom : " + result.getString("sal_nom"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            try {
                if (result != null){
                    result.close();
                }
                if (ps != null){
                    ps.close();
                }
                if (connection != null){
                    connection.close();
                }
            }catch (SQLException e){
                e.printStackTrace();
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}

