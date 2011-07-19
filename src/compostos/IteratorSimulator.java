package compostos;

public class IteratorSimulator {

	public static void main(String[] args) {		
		
		IteratorSimulator duckSimulate = new IteratorSimulator();
		
		AbstractDuckFactory abstractDuckFactory = CountingDuckFactory.getInstance();
		
		System.out.println("Simulador de Patos");
		duckSimulate.simulate(abstractDuckFactory);	
	}			
			
			
	void simulate(AbstractDuckFactory abstractDuckFactory){
		
		Quackable quackCounter = abstractDuckFactory.createDuckCall();		
		Quackable counter = abstractDuckFactory.createMallardDuck();		
		Quackable redHeadDuck = abstractDuckFactory.createRedHeadDuck();		
		Quackable rubberDuck = abstractDuckFactory.createRubberDuck();		
		Quackable goose = GooseFactory.getInstance().createJackGoose();
				
		
		Flock flockOfDucks = new Flock();
		flockOfDucks.add(quackCounter);
		flockOfDucks.add(counter);
		flockOfDucks.add(redHeadDuck);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(goose);
		
		simulate(flockOfDucks);
		
		System.out.println("Simulador de Patos quacks = " + QuackCounter.getQuacks() + "\n\n");
	
		Flock flockOfMallard = new Flock();
		Quackable mallard1 = abstractDuckFactory.createMallardDuck();
		Quackable mallard2 = abstractDuckFactory.createMallardDuck();
		Quackable mallard3 = abstractDuckFactory.createMallardDuck();
		Quackable mallard4 = abstractDuckFactory.createMallardDuck();
		
		flockOfMallard.add(mallard1);
		flockOfMallard.add(mallard2);
		flockOfMallard.add(mallard3);
		flockOfMallard.add(mallard4);
		
		simulate(flockOfMallard);
		System.out.println("Simulador de Patos quacks = " + QuackCounter.getQuacks() + "\n\n");
		
		
	}
	
	void simulate(Quackable duck){
		duck.quack();
	}

}
