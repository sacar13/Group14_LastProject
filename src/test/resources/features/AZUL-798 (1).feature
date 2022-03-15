@AZUL-797
Feature: Default

	Background:
		#@AZUL-798
		Given the user logged in
		

	#User should be able to attach a link by clicking on the link icon.
	@AZUL-792 @AZUL-796 @smoke-test
	Scenario: clicking on the link icon
		When User should able to click POLL button
		Then User should able to click Link button
		And User should able to add link and save	

	#User should be able to add questions and multiple answers.
	@AZUL-793 @AZUL-796
	Scenario: Add questions and multiple answers.
		When User should able to add question and answer	

	#User should be able to delete questions and multiple answers.
	@AZUL-794 @AZUL-796
	Scenario: Delete questions and  answers.
		When User should able to click POLL button
		When User should able to click delete.	

	#User should be able to send a poll.
	@AZUL-795 @AZUL-796
	Scenario: Send a poll.
		When User should able to click SEND button