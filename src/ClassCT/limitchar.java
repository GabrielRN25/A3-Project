package ClassCT;


import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;


public class limitchar extends PlainDocument {
    
    public enum TipoEntrada{
        NUMEROINTEIRO, NUMERODECIMAL, NOME, SENHA, CFSENHA
    };
    private int qtcaracteres;
    private TipoEntrada tpEntrada;

    public limitchar(int qtcaracteres, TipoEntrada tpEntrada) {
        this.qtcaracteres = qtcaracteres;
        this.tpEntrada = tpEntrada;
    }

    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        if(str == null || getLength()== qtcaracteres){
        return;
        }
        int totalChar = getLength() + str.length();    
        //filtro de Char
        String regex ="";
        switch (tpEntrada) {
            case NUMEROINTEIRO: regex = "[^0-9]"; break;
            case NUMERODECIMAL: regex = "[^0-9,.]"; break;
            case NOME:          regex ="[^\\p{IsLatin} ]"; break;
            case SENHA:         regex ="[^\\p{IsLatin}@.\\!#$%¨&*-+*//_-][^0-9]"; break;
            case CFSENHA:       regex ="[^\\p{IsLatin}@.\\!#$%¨&*-+*//_-][^0-9]"; break;   
        }
        //fazer substituição
        
        str = str.replaceAll(regex,"");
        
        if(totalChar<= qtcaracteres){          
        super.insertString(offs, str, a); 
    }else{
            String nova = str.substring(0, qtcaracteres);
            super.insertString(offs, nova, a);
        }
    }

}

