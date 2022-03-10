package com.azulcrm.step_definitions;

import com.azulcrm.pages.EmployeesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class EmployeesStepDefs {
    @When("user can click the with employees on the posts")
    public void userCanClickTheWithEmployeesOnThePosts() {
        EmployeesPage employeesPage=new EmployeesPage();
        employeesPage.postName.click();



    }

    @And("User should be able to make a comment, like, or unfollow on other employees' posts.")
    public void userShouldBeAbleToMakeACommentLikeOrUnfollowOnOtherEmployeesPosts() {
    }
}
