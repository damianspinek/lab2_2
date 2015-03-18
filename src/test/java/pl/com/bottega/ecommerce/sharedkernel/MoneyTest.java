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
	@Test
	public void test_Money_add_2PLN_3PLN_expectedTrue(){
		Money testValue1 = new Money(2,"PLN");
		Money testValue2 = new Money(3,"PLN");
		Money expectedResult = new Money(5,"PLN");
		
		assertThat(testValue1.add(testValue2), is(expectedResult));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test_Money_add_2PLN_3EUR_expectedIllegalArgumentException(){
		Money testValue1 = new Money(2,"PLN");
		Money testValue2 = new Money(3,"EUR");
		Money expectedResult = new Money(5,"PLN");
		
		assertThat(testValue1.add(testValue2), is(expectedResult));
	}
	
	@Test
	public void test_Money_substract_3PLN_2PLN_expectedTrue(){
		Money testValue1 = new Money(3,"PLN");
		Money testValue2 = new Money(2,"PLN");
		Money expectedResult = new Money(1,"PLN");
		
		assertThat(testValue1.subtract(testValue2), is(expectedResult));
	}

}
