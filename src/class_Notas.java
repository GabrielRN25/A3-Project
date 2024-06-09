
public class class_Notas {
    
    private int id;
    private String nome;
    private double A1;
    private double A2;
    private double A3;


//contrutor com os parematros
public class_Notas (int id,String nome, double A1, double A2, double A3) {
    this.id =id;
    this.nome =nome;
    this.A1 =A1;
    this.A2 =A2;
    this.A3 =A3;
}
// getters ans setters
public int getid(){
    return id;
}

public String getnome() {
return nome;
}

public double getA1(){
 return A1;
}

public void setA1 (double A1){
this.A1 = A1;
}

public double getA2(){
 return A2;
}

public void setA2 (double A2){
this.A2 = A2;
}

public double getA3(){
 return A3;
}

public void setA3 (double A3){
this.A3 = A3;
}
}


