package StringClass;

class Engine{
	int id;
	public Engine(int id) {
		this.id = id;
	}
	
}
public final class ImmutableClass {
	private final int id;
	private final String name;
	private final Engine engine;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Engine getEngine() {
		return engine;
	}
	
	public ImmutableClass(int id, String name, Engine engine) {
		this.id = id;
		this.name = name;
		Engine et = new Engine(engine.id);
		this.engine = et;
	}
	public static void main(String[] args) {
		Engine e = new Engine(50);
		ImmutableClass im = new ImmutableClass(2, "ritu", e);
		System.out.println(im.engine.id);
		e.id = 70;
		System.out.println(im.engine.id);
	}
}
