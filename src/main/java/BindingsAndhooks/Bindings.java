package BindingsAndhooks;

import Pages.Page1;
import io.cucumber.java.en.Given;

public class Bindings {

	@Given("I enter data in search area")
	public void i_enter_data_in_search_area() throws InterruptedException {

		Page1.SearchText();

	}
}
