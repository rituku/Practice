package Singleton;

class SingletonEgar{
	private static SingletonEgar instance = new SingletonEgar();
	private SingletonEgar() {}
	
	public static SingletonEgar getInstance() {
		return instance;
	}
}

class singletonLazy{
	private static singletonLazy instance;
	private singletonLazy() {}
	
	public static singletonLazy getInstance() {
		if(instance == null) {
			 instance = new singletonLazy();
		}
		return instance;
	}
}

class singletonThreadSafeOnMethod{
	private static singletonThreadSafeOnMethod instance;
	private singletonThreadSafeOnMethod() {}
	
	public static synchronized singletonThreadSafeOnMethod getInstance() {
		if(instance == null) {
			instance = new singletonThreadSafeOnMethod();
		}
		return instance;
	}
}

class singletonThreadSafeOnBlock{
	private static singletonThreadSafeOnBlock instance;
	private singletonThreadSafeOnBlock() {}
	
	public static singletonThreadSafeOnBlock getInstance() {
		if(instance == null) {
			synchronized (singletonThreadSafeOnBlock.class) {
				if(instance == null) {
					instance = new singletonThreadSafeOnBlock();
				}				
			}		
		}
		return instance;
	}
}

public class SingletonEagar {
	
	public static void main(String[] args) {
		/*
		 * SingletonEgar SE = SingletonEgar.getInstance(); System.out.println(SE);
		 * SingletonEgar SE1 = SingletonEgar.getInstance(); System.out.println(SE1);
		 */
		
		/*
		 * singletonLazy SL = singletonLazy.getInstance(); singletonLazy SL1 =
		 * singletonLazy.getInstance();
		 */
		
		singletonThreadSafeOnMethod SL = singletonThreadSafeOnMethod.getInstance();
		singletonThreadSafeOnMethod SL1 = singletonThreadSafeOnMethod.getInstance();
		
	}
}
