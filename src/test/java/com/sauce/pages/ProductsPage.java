package com.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProductsPage extends BasePage {
    @FindBy(xpath = "//span[.='Products']")
    public WebElement product;


    @FindBy(xpath ="//select[@class='product_sort_container']" )  //span[.='Price (high to low)']")
    public WebElement selectsirala;


   // public void highlow_mtd(Select slct){}



}
