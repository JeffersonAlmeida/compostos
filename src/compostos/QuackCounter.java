package compostos;

public class QuackCounter implements Quackable {
	
	Quackable duck;
	static int numberOfQuacks;
	
	public QuackCounter(Quackable duck){
		this.duck = duck;
	}
	
	@Override
	public void quack() {
		System.out.println("++");
		this.duck.quack();		
		numberOfQuacks++;
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
	
	public static int getQuacks(){
		return numberOfQuacks;
	}
}
