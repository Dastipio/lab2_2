package pl.com.bottega.ecommerce.sharedkernel;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class MoneyTest {

	@Test
	public void test_equals_expected_value_shouldBeTrue() {
		Money money1 = new Money(10,"$");
		Money expected_value = new Money(10,"$");
		
		assertThat(money1,is(equalTo(expected_value)));
	}
	
	@Test
	public void test_add_10_and_10_shouldReturn20() {
		Money money1 = new Money(10, "$");
		Money money2 = new Money(10, "$");
		Money expected = new Money(20, "$");

		assertThat(money1.add(money2), is(equalTo(expected)));
	}

}