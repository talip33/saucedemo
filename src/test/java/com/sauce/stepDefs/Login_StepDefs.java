package com.sauce.stepDefs;

import com.sauce.pages.LoginPages;
import com.sauce.pages.ProductsPage;
import com.sauce.utilities.ConfigurationReader;
import com.sauce.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefs {
LoginPages loginPages=new LoginPages();
ProductsPage productsPage=new ProductsPage();
    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }
    @When("The user enters {string} and {string} credentials")
    public void the_user_enters_and_credentials(String username, String password) {
       loginPages.login_mtd(username,password);

    }
    @Then("The user should be able login and see {string} page")
    public void the_user_should_be_able_login_and_see_page(String expectedHeader) {
        Assert.assertEquals(expectedHeader,productsPage.product.getText());
    }
}
