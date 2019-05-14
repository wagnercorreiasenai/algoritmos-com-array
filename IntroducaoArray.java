package javaapplication2;

public class IntroducaoArray {

    public static void main(String[] args) {
       
       String[] listaDeProdutos = new String[5];
       
       listaDeProdutos[0] = "Mouse";
       listaDeProdutos[1] = "Teclado";
       listaDeProdutos[2] = "Monitor";
       listaDeProdutos[3] = "Processador";
       listaDeProdutos[4] = "Pen drive";
       
       for(int i = 0; i < listaDeProdutos.length; i++) {
           System.out.println(i+": "+listaDeProdutos[i]);
       }
        
    }
    
}
