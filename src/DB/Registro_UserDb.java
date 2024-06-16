package DB;
import java.sql.PreparedStatement;
import java.sql.Connection;
import ClassCT.Usuario;
import javax.swing.JOptionPane;

public class Registro_UserDb {
    
    Connection con;
    PreparedStatement pstm;
    
    public void cadastrar(Usuario objUsuario){
    String sql = "insert into usuario (nome, senha) values (?, ?)";
    
    con = new Dbc().mycConnectionon();  
    
        try {
            
            pstm = con.prepareStatement(sql);
            pstm.setString(1, objUsuario.getnome());
            pstm.setString(2, objUsuario.getsenha());
            
            pstm.execute();
            pstm.close();
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"RegistroDb" + erro);
        }
    }
}
