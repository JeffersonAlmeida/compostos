package compostos;

public class DuckSimulate {

	
	
	public static void main(String[] args) {
		DuckSimulate duckSimulate = new DuckSimulate();
		System.out.println("Simulador de Patos");
		duckSimulate.simulate();			
	}
	
	void simulate(){
		
		DuckCall duckCall = new DuckCall();
		MallardDuck  mallardDuck = new MallardDuck();
		RedHeadDuck redHeadDuck = new RedHeadDuck();
		RubberDuck rubberDuck = new RubberDuck();	
		
		GooseAdapter goose = new GooseAdapter(new Goose());
		
		simulate(duckCall);
		simulate(mallardDuck);
		simulate(redHeadDuck);
		simulate(rubberDuck);
		simulate(goose);
		
		
	}
	
	void simulate(Quackable duck){
		duck.quack();
	}

}
