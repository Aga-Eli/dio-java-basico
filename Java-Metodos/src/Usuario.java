public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.err.println("Tv Ligada? " + smartTv.ligada);
        System.err.println("Canal atual: " + smartTv.canal);
        System.err.println("Volume atual: " + smartTv.volume);

        smartTv.ligarTv();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal(25);

        System.err.println("Tv Ligada? " + smartTv.ligada);
        System.err.println("Canal atual: " + smartTv.canal);
        System.err.println("Volume atual: " + smartTv.volume);

    }

    // public double dividir(int dividendo, int divisor) throws Excepction{}
    // private void metodoPrivado(){}
}
