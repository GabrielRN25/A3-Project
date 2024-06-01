public class Usuario {
    
    private int id;
    private String nome;
    private String senha;
    private String confirSenha;
 //contrutor limpo(para lembra como funciona)
public Usuario(){
    
}
//construtor com paramentros
public Usuario(int id,String nome,String senha,String confirSenha){

this.id = id;
this.nome = nome;
this.senha = senha;
this.confirSenha = confirSenha;
}
//getters and setters
 public int getid(){
 return id;
 }
 
 public String getnome(){
 return nome;
 }
 
 public void setnome(String nome){
 this.nome = nome;
 }
 
 public String getsenha(){
 return senha;
}
 
 public void setsenha(String senha){
 this.senha = senha;
 }
 
 public void setconfirSenha (String confirSenha){
 this.confirSenha = confirSenha;
 }
}
