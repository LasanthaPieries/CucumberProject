package stepdefs;

import java.util.List;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorStepDef {
	
	int result;

	@Given("I have a calculator")
	public void i_have_a_calculator() {
		System.out.println("Opened the calculator");
	}

	@When("I add {int} and {int}")
	public void i_add_and(int int1, int int2) {
			result = int1 + int2;
	}

	@Then("I should get the result as {int}")
	public void i_should_get_the_result_as(int expResult) {
		Assert.assertEquals(expResult, result);
	}

	@Given("I have calculator")
	public void i_have_calculator() {
		System.out.println("Opened the calculator");
	}

	@When("I add number1 as {int} and number2 as {int}")
	public void i_add_number1_as_and_number2_as(int num1, int num2) {
		result = num1 + num2;
	}

	@Then("I should get the answer in {int}")
	public void i_should_get_the_answer_in(int expResult) {
		Assert.assertEquals(expResult, result);

	}
	
	@When("I add below numbers")
	public void i_add_below_numbers(List<Integer> numbers) {
			
		for(Integer num:numbers) {
				
			result = result +num;
		}
			
	}
	
}