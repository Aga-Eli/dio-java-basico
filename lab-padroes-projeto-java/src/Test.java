import oneDigitalinnovationGof.Strategy.Comportamento;
import oneDigitalinnovationGof.Strategy.ComportamentoAgressivo;
import oneDigitalinnovationGof.Strategy.ComportamentoDefensivo;
import oneDigitalinnovationGof.Strategy.ComportamentoNormal;
import oneDigitalinnovationGof.Strategy.Robo;
import oneDigitalinnovationGof.facade.Facade;
import oneDigitalinnovationGof.singleton.SingletonEager;
import oneDigitalinnovationGof.singleton.SingletonLazy;
import oneDigitalinnovationGof.singleton.SingletonLazyHolder;

public class Test {
    public static void main(String[] args) throws Exception {
        // Singleton
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);

		// Strategy
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();

		// Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Venilton", "14801788");
    }
}
