
Feature: As a user, I should be able to interact with employees on the posts that I have access to.


  Background:
    Given the user logged in

  @SA
    Scenario:User should be able to  make a comment to other employees.

    Then User should be able to make like, or unfollow on other employees' posts.
  @S
    Scenario:User should be able to  make a comment to all other reviewers.

    Then User should be able to like or make comments on all other reviewers' comments.
  @S
  Scenario: User should be able to click on reviewers' names and visit their profiles.

    Then User should be able to click on reviewers' names and visit their profiles.
  @S
    Scenario: User should be able to add others' posts to favorite by clicking on the Star icon.

    Then User should be able to add others' posts to favorite by clicking on the Star icon.

