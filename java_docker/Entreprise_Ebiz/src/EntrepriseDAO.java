import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EntrepriseDAO extends DAO<Entreprise> {

    PreparedStatement ps;
    ResultSet result;

    public EntrepriseDAO(Connection conn) {
        super(conn);
    }

    //public EntrepriseDAO(){}

    @Override
    public void create(Entreprise obj) {
        try{
            String query = "INSERT INTO entreprise(ent_id, ent_nom) VALUES(?, ?)";
            ps = connection.prepareStatement(query);

            ps.setInt(1, obj.getId());
            ps.setString(2, obj.getNom());
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
    public void delete(Entreprise obj) {
        try{
            String query = "DELETE FROM entreprise WHERE en_id = ?";
            ps = connection.prepareStatement(query);

            ps.setInt(1, obj.getId());
            ps.executeUpdate();
            System.out.println("Data deleted");
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            try{
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
    public void update(Entreprise obj) {

        try{
            String query = "UPDATE entreprise SET ent_nom=? WHERE ent_id=?";
            ps = connection.prepareStatement(query);

            ps.setString(1, obj.getNom());
            ps.setInt(2, obj.getId());
            ps.executeUpdate();
            System.out.println("Table Updated");
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            try {
                if (ps != null)
                    ps.close();
                if (connection != null)
                    connection.close();
            }catch (SQLException e){
                e.printStackTrace();
            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }

    @Override
    public void find() {
        try {
            String query = "SELECT * FROM entreprise";
            ps = connection.prepareStatement(query);

            result = ps.executeQuery();

            while (result.next()){
                System.out.println("id : " + result.getInt("ent_id") + " nom : " + result.getString("ent_nom"));
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
