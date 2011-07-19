package compostos;

public class QuackCounter implements Quackable {
	
	private Quackable duck;
	public static Long numberOfQuacks;
	
	public QuackCounter(Quackable duck){
		this.duck = duck;
	}
	
	@Override
	public void quack() {
		this.quack();
		QuackCounter.numberOfQuacks++;
	}

	/**
	 * @param duck the duck to set
	 */
	public void setDuck(Quackable duck) {
		this.duck = duck;
	}

	/**
	 * @return the duck
	 */
	public Quackable getDuck() {
		return duck;
	}
}
