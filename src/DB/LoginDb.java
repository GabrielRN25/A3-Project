package DB;

import ClassCT.login;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class LoginDb {

    Connection con;

    public ResultSet autenticacaoUser(login objetoUsuario) {

        con = new Dbc().mycConnectionon();

        try {

            String sql = "select * from usuario where nome = ? and senha = ?";

            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, objetoUsuario.getnome());
            pstm.setString(2, objetoUsuario.getsenha());

            ResultSet rs = pstm.executeQuery();
            return rs;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDb" + erro);
            return null;
        }
    }
}
