package DB;

import ClassCT.class_Notas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.HashSet;




public class NotasDb {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<class_Notas> lista = new ArrayList<>();

    public void cadastrarNotas(class_Notas objNotas) {

        String sql = "insert into notas (nome, a1, a2, a3) values (?, ?, ?, ?)";

        conn = new Dbc().mycConnectionon();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objNotas.getNome());
            pstm.setDouble(2, objNotas.getA1());
            pstm.setDouble(3, objNotas.getA2());
            pstm.setDouble(4, objNotas.getA3());

            pstm.execute();
            pstm.close();
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "NotasDb, cadastrar" + e);
        }

    }

    public ArrayList<class_Notas> pesquisar() {

        String sql = ("select * from notas");
        
        conn = new Dbc().mycConnectionon();
        
        try {
            pstm = conn.prepareCall(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {

                class_Notas obNotas = new class_Notas();

                obNotas.setId(rs.getInt("id_notas"));
                obNotas.setNome(rs.getNString("nome"));
                obNotas.setA1(rs.getDouble("a1"));
                obNotas.setA2(rs.getDouble("a2"));
                obNotas.setA3(rs.getDouble("a3"));
                obNotas.setTotal(rs.getDouble("total"));
             
                lista.add(obNotas);
            }
        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "NotasDb, pesquisar" + erro);
        }
        return lista;
    }


    
    public void EditarNotas(class_Notas objNotas){
    
    String sql = "update notas set nome = ?, a1 = ?, a2 = ?, a3 = ? where id_notas = ?";
    conn = new Dbc().mycConnectionon();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objNotas.getNome());
            pstm.setDouble(2, objNotas.getA1());
            pstm.setDouble(3, objNotas.getA2());
            pstm.setDouble(4, objNotas.getA3());
            pstm.setInt(5, objNotas.getId());

            pstm.execute();
            pstm.close();
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "NotasDb, EditarNotas" + e);
        }

    
    
    }
    
    public void ExcluirAluno(class_Notas objNotas){
        String sql = "delete from notas where id_notas = ?";
        conn = new Dbc().mycConnectionon();
        try {

            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objNotas.getId());

            pstm.execute();
            pstm.close();
            
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "NotasDb, ExcluirNotas" + e);
    }
    
    }

}
