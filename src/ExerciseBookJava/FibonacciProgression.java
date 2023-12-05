package ExerciseBookJava;

public class FibonacciProgression extends Progression {

	protected long prev;
	
	FibonacciProgression(){ //method for make a sery fibonnaci normal
		this(0,1);
	}
	
	
	protected FibonacciProgression(long value2, long value1) { //method for create a sery fibonacci from a value predefinided for parameters
		first = value1;
		prev = value2 - value1;
	}
	
	@Override
	protected long nextValue() {
		long temp = first;
		prev = cur;
		cur += temp;
		return cur;
	}
	
	
	
	
}

	
	
