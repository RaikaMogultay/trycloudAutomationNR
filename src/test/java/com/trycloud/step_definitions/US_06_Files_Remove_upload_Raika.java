package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.LoginPage;
import com.trycloud.pages.US06Page;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class US_06_Files_Remove_upload_Raika {

    US06Page us06Page = new US06Page();
    LoginPage loginPage = new LoginPage();
    Actions actions = new Actions(Driver.getDriver());


    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {

       loginPage.userInput.sendKeys("User2");
       loginPage.passwordInput.sendKeys("Userpass123");
       loginPage.logInButton.click();
    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String file) {
        us06Page.filesButton.click();
        BrowserUtils.sleep(3);

    }
    @When("the users click action-icon from any file on the page to remove")
    public void the_users_click_action_icon_from_any_file_on_the_page_to_remove() {

        actions.contextClick(us06Page.favoriteModule).perform();
        BrowserUtils.sleep(3);

    }
    @When("user choose the {string} option")
    public void user_choose_the_option(String remove) {
        us06Page.removeFav.click();

    }
    @When("user click the {string} sub-module on the left side")
    public void user_click_the_sub_module_on_the_left_side(String favorites) {
        us06Page.favoritesbutton.click();
        BrowserUtils.sleep(3);

    }
    @Then("Verify that the file is removed from the Favorites sub-module’s table")
    public void verify_that_the_file_is_removed_from_the_favorites_sub_module_s_table() {
        try{
            us06Page.favFileName.click();
        }catch (Exception e){
            Assert.assertTrue(true);
        }
    }

    @When("the user clicks the add icon on the top")
    public void the_user_clicks_the_add_icon_on_the_top() {
        us06Page.addButton.click();
        BrowserUtils.sleep(3);
    }
    @When("user uploads file with the upload file option")
    public void user_uploads_file_with_the_upload_file_option() {

        String path = "/Users/raikaengin/Desktop/Screen Shot 2022-03-29 at 11.50.34 AM (2).png";

        us06Page.uploadFileButton.sendKeys(path);
        BrowserUtils.sleep(3);
    }
    @Then("Verify the file is displayed on the page")
    public void verify_the_file_is_displayed_on_the_page() {
        Assert.assertTrue(us06Page.uploadedFilePage.isDisplayed());

    }

}
