
// Testando para ver se vai dar certo esses commits
public class Contador
{
    int c = 0;    
    void contar(){
        c = c + 1;
    }    
    void descontar(){
        if (c > 0){
            c = c - 1;
        } else {
            System.out.println("Não há como descontar mais, pois contador já está zerado!!");
        }
    }    
    void zerar(){
        if (c != 0){
            c = 0;
        } else {
            System.out.println("O contador já está zerado!!");   
        }
    }    
    int qtd_voltas(){
        return c;
    }
    
}
