package parametrizedTest;

public class PrimeNumberChecker {
	public Boolean validate(final Integer finalNumber) {
		for (int i = 2; i < (finalNumber / 2); i++) {
			if(finalNumber % i == 0) {
				return false;
			}
		}
		return true;
	}

}
