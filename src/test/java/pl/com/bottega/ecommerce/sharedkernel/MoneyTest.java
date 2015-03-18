package pl.com.bottega.ecommerce.sharedkernel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class MoneyTest {

	@Test
	public void test_Money_multipledBy_2PLN_3Times_expectedTrue() {
		Money testValue = new Money(2,"PLN");
		Money expectedResult = new Money(6,"PLN");
		
		assertThat(testValue.multiplyBy(3), is(expectedResult));
	}

}
