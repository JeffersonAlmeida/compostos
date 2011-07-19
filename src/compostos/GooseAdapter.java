package compostos;

public class GooseAdapter implements Quackable {
	private Goose goose;
	public GooseAdapter(Goose goose){
		this.goose = goose;
	}

	@Override
	public void quack() {
		this.goose.honk();
	}

	/**
	 * @param goose the goose to set
	 */
	public void setGoose(Goose goose) {
		this.goose = goose;
	}

	/**
	 * @return the goose
	 */
	public Goose getGoose() {
		return goose;
	}

}
