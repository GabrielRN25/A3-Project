
package DB;

import ClassCT.class_Notas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
public class NotasDb {
    
 Connection conn;
 PreparedStatement pstm;
 
public void cadastrarNotas(class_Notas objNotas){
    
  String sql = "insert into notas (nome, a1, a2, a3) values (?, ?, ?, ?)";
  
  conn = new  Dbc().mycConnectionon();
  
    try {
        
        pstm = conn.prepareStatement(sql);
        pstm.setString(1, objNotas.getNome());
        pstm.setDouble(2, objNotas.getA1());
        pstm.setDouble(3, objNotas.getA2());
        pstm.setDouble(4, objNotas.getA3());
        
        pstm.execute();
        pstm.close();
    } catch (Exception e) {
        
        JOptionPane.showMessageDialog(null,"NotasDb" + e);
    }

   
}
}
