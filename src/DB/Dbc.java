package DB;

// Data base connection
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Dbc {
    
    public Connection mycConnectionon(){
    
        Connection con = null;
        try {
            String url = "jdbc:mysql://localhost:3306/projetoa3?user=root&password=Sql25*";
            con = DriverManager.getConnection(url);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"ConexãoDbc" + erro.getMessage());
        }
        
        return con;
        }
            
            
        
        

   

    }
    
    
    
