package parametrizedTest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
//import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PrimeNumberCheckerTest {
	private final Integer inputNumber;
	private final Boolean expectedResult;
	private PrimeNumberChecker primeNumberChecker;
	
	@Before
	public void initialize() {
		primeNumberChecker = new PrimeNumberChecker();
	}
	
	public PrimeNumberCheckerTest(Integer inputNumber, Boolean expectedResult) {
		this.inputNumber = inputNumber;
		this.expectedResult = expectedResult;
	}
	
	@Parameterized.Parameters
	public static Collection primeNumbers() {
		return Arrays.asList(new Object [][] {{2, true},{6, false}, {19, true}, {22, false}, {23, true}});
	}
	
	@Test
	public void testPrimeNumber() {
		System.out.println("test : "+inputNumber);
		assertEquals(expectedResult, primeNumberChecker.validate(inputNumber));
	}

}
