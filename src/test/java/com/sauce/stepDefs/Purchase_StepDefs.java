package com.sauce.stepDefs;

import com.sauce.pages.ProductsPage;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

public class Purchase_StepDefs {
    ProductsPage productsPage=new ProductsPage();
    @When("The user should be able to sort the product {string}")
    public void the_user_should_be_able_to_sort_the_product(String string) {
        Select select=new Select(productsPage.selectsirala);
        select.selectByIndex(3);





    }


}
