package oneDigitalinnovationGof.singleton;

/**
 * Singleton "apressado"
 * @author Aga-Eli
 */
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia(){
        return instancia;
    }
}