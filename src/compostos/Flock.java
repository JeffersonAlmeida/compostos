package compostos;

import java.util.ArrayList;
import java.util.Iterator;



public class Flock implements Quackable{
	
	private ArrayList<Quackable> quackers = new ArrayList<Quackable>();
	
	public void add(Quackable quackable){
		this.quackers.add(quackable);
	}
	@Override
	public void quack() {
		Iterator<Quackable> iterator = quackers.iterator();
		while (iterator.hasNext()) {
			Quackable duck = (Quackable) iterator.next();
			duck.quack();
		}
	}

}
