public class SmartTv {
    boolean ligada = false;

    int canal = 1;

    int volume = 25;

    public void ligarTv(){
        ligada = true;
    }

    public void desligarTv(){
        ligada = false;
    }

    public void aumentarCanal(){
        canal++;
        System.err.println("Aumentando o canal para: " + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.err.println("Diminuindo o canal para: " + canal);
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.err.println("Canal trocado para: " + canal);
    }

    public void aumentarVolume(){
        volume++;
        System.err.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.err.println("Diminuindo o volume para: " + volume);
    }
}