package ExerciseBookJava;

public class ArithMethicProgression extends Progression{
	protected long inc;
	
	protected ArithMethicProgression() {
		this(1);
	}
	
	protected ArithMethicProgression(long inc) {
		inc = inc;
	}	@Override
	protected long nextValue() {
		inc++;
		return inc;
	}
}