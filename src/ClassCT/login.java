package ClassCT;

public class login {
    
    private int id;
    private String nome;
    private String senha;
    private String cfsenha;
 //contrutor limpo(para lembra como funciona)
public login(){
    
}
//construtor com paramentros
public login(int id,String nome,String senha,String cfsenha){

this.id = id;
this.nome = nome;
this.senha = senha;
this.cfsenha = cfsenha;
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
 
 public String getra(){
 return cfsenha;
 }
 
 public void setcfsenha (String cfsenha){
 this.cfsenha = cfsenha;
 }
}
