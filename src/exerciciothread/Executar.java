package exerciciothread;

public class Executar {

    public static void main(String[] args) {
        
        /*Criar 5 Threads que vão de 0-9, 10-19, 20-29, 30-39 e 40-49*/
        MinhaThread minhaThreadUm = new MinhaThread(0, 9);
        MinhaThread minhaThreadDois = new MinhaThread(10, 19);
        MinhaThread minhaThreadTres = new MinhaThread(20, 29);
        MinhaThread minhaThreadQuatro = new MinhaThread(30, 39);
        MinhaThread minhaThreadCinco = new MinhaThread(40, 49);
        
        //Iniciar as Threads
        minhaThreadUm.start();
        minhaThreadDois.start();
        minhaThreadTres.start();
        minhaThreadQuatro.start();
        minhaThreadCinco.start();
        
    }
    
}
