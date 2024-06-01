
import java.util.ArrayList;


public class registro_array {
    
    
  private ArrayList<Usuario> Usuario = new ArrayList<>();
  
  public boolean salvar(Usuario u ){
      if(u != null){
          Usuario.add(u);
          return true;
      }else{
          
          return false;
      }
  
  }
   public ArrayList<Usuario> retornar (){
   return Usuario;
   }
}
