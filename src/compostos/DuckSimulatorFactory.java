package compostos;

public class DuckSimulatorFactory {
	
	public static void main(String[] args) {		
		DuckSimulatorFactory duckSimulate = new DuckSimulatorFactory();
		
		AbstractDuckFactory abstractDuckFactory = CountingDuckFactory.getInstance();
		
		System.out.println("Simulador de Patos");
		duckSimulate.simulate(abstractDuckFactory);	
	}			
			
			
	void simulate(AbstractDuckFactory abstractDuckFactory){
		
		Quackable quackCounter = abstractDuckFactory.createDuckCall();		
		quackCounter.quack();
		
		
		Quackable counter = abstractDuckFactory.createMallardDuck();
		counter.quack();
		
		Quackable redHeadDuck = abstractDuckFactory.createRedHeadDuck();
		redHeadDuck.quack();
		
		Quackable rubberDuck = abstractDuckFactory.createRubberDuck();
		rubberDuck.quack();
		
		Quackable goose = GooseFactory.getInstance().createJackGoose();
		goose.quack();
		
		System.out.println("Simulador de Patos quacks = " + QuackCounter.getQuacks() + "\n\n");
		
		
	}
	
	void simulate(Quackable duck){
		duck.quack();
	}
}
