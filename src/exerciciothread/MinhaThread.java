package exerciciothread;

public class MinhaThread extends Thread{
    
    int inicio;
    int fim;
    
    /*o construtor recebe o inicio e termino da contagem que cada Thread
    vai realizar*/
    public MinhaThread(int i, int f){
        this.inicio = i;
        this.fim = f;
    }
    
    /*é necessario sobrescrever o metodo run() da classe pai Thread
    pois nele consta o que vai ser executado pela Thread instanciada*/
    @Override
    public void run(){
        for (int i = inicio; i <= fim; i++) {
            System.out.println(Thread.currentThread()+" | i = "+i);
        }
    }
    
}
