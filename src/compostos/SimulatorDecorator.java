package compostos;

public class SimulatorDecorator {
	
	public static void main(String[] args) {		
		SimulatorDecorator duckSimulate = new SimulatorDecorator();
		System.out.println("Simulador de Patos");
		duckSimulate.simulate();	
	}			
			
			
	void simulate(){
		
		Quackable duckCall = new DuckCall();
		Quackable quackCounter = new QuackCounter(duckCall);		
		quackCounter.quack();
		
		
		Quackable counter = new QuackCounter(new MallardDuck());
		counter.quack();
		
		Quackable redHeadDuck = new QuackCounter(new RedHeadDuck());
		redHeadDuck.quack();
		
		Quackable rubberDuck = new QuackCounter(new RubberDuck());
		rubberDuck.quack();
		
		Quackable goose = new GooseAdapter(new Goose());
		goose.quack();
		
		System.out.println("Simulador de Patos quacks = " + QuackCounter.getQuacks() + "\n\n");
		
		
	}
	
	void simulate(Quackable duck){
		duck.quack();
	}

}
