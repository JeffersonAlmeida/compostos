package compostos;

public class CountingDuckFactory extends AbstractDuckFactory{
	
	private static CountingDuckFactory countingDuckFactory;
	
	private CountingDuckFactory(){
		super();
	}
	
	@Override
	public Quackable createMallardDuck() {
		// TODO Auto-generated method stub
		return new QuackCounter(new MallardDuck());
	}

	@Override
	public Quackable createRedHeadDuck() {
		// TODO Auto-generated method stub
		return new QuackCounter(new RedHeadDuck());
	}

	@Override
	public Quackable createDuckCall() {
		// TODO Auto-generated method stub
		return new QuackCounter(new DuckCall());
	}

	@Override
	public Quackable createRubberDuck() {
		// TODO Auto-generated method stub
		return new QuackCounter(new RubberDuck());
	}
	
	public static CountingDuckFactory getInstance(){
		if(countingDuckFactory==null){
			return new CountingDuckFactory();
		}
		return countingDuckFactory;
	}

}
