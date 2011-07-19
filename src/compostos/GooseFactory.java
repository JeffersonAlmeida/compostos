package compostos;

public class GooseFactory extends AbstractGooseFactory{
	
	private static GooseFactory gooseFactory;
	private GooseFactory(){
		super();
	}
	
	@Override
	public Quackable createJackGoose() {
		return new GooseAdapter(new Goose());
	}
	
	public static GooseFactory getInstance(){
		if(gooseFactory==null){
			return new GooseFactory();
		}
		return gooseFactory;
	}

}
