package compostos;

public class DuckFactory extends AbstractDuckFactory{
	
	private static DuckFactory duckFactory;
	private DuckFactory(){
		super();
	}
	
	@Override
	public Quackable createMallardDuck() {
		// TODO Auto-generated method stub
		return new MallardDuck();
	}

	@Override
	public Quackable createRedHeadDuck() {
		// TODO Auto-generated method stub
		return new RedHeadDuck();
	}

	@Override
	public Quackable createDuckCall() {
		// TODO Auto-generated method stub
		return new DuckCall();
	}

	@Override
	public Quackable createRubberDuck() {
		// TODO Auto-generated method stub
		return new RubberDuck();
	}

	// lazy instatiation
	public static AbstractDuckFactory getInstance(){
		if(duckFactory==null){
			return new DuckFactory();
		}
		return duckFactory;
	}
}
