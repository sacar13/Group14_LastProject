@AZUL-833
Feature: Default

	Background:
		#@AZUL-828
		Given the user logged in
		When the user clicks to Employees tab
		

	#*User Story:* As a user, I should be able to use functions under Employee menu
	#
	# 
	#
	#*Acceptance Criteria:*
	# # User should be able to display company structure. 
	# # User should be able to add a department.
	# # User should be able to find employees by search box.
	# # User should be able to find employees by search by Alphabet.
	@AZUL-829
	Scenario: User should be able to display company structure
		Then the user should be able to see title as "(1) Company Structure"	

	#*User Story:* As a user, I should be able to use functions under Employee menu
	#
	# 
	#
	#*Acceptance Criteria:*
	# # User should be able to display company structure. 
	# # {color:#de350b}*User should be able to add a department.*{color}
	# # User should be able to find employees by search box.
	# # User should be able to find employees by search by Alphabet.
	@AZUL-830
	Scenario: User should be able to add a department
		Then the user should be able to see title as "(1) Company Structure"
		When the user clicks the Add Department button
		And the user writes Department Name
		And the user select Parent Department
		And the user clicks Add button
		Then the user should be able to see the added department	

	#h4. *User Story:* As a user, I should be able to use functions under Employee menu
	#
	# 
	#
	#*Acceptance Criteria:*
	# # User should be able to display company structure. 
	# # User should be able to add a department.
	# # User should be able to find employees by search box.
	# # User should be able to find employees by search by Alphabet.
	@AZUL-831
	Scenario: User should be able to find employees by search box
		Given the user clicks Find Employee tab
		Then the user should be able to see title as "(1) Find Employee"
		When the user search "Alex Deep" via search box
		Then the user should be able to see employees name as "Alex Deep"	

	#h4. *User Story:* As a user, I should be able to use functions under Employee menu
	#
	# 
	#
	#*Acceptance Criteria:*
	# # User should be able to display company structure. 
	# # User should be able to add a department.
	# # User should be able to find employees by search box.
	# # *{color:#de350b}User should be able to find employees by search by Alphabet.{color}*
	@AZUL-832
	Scenario: User should be able to find employees by search by Alphabet
		Given the user clicks Find Employee tab
		Then the user should be able to see title as "(1) Find Employee"
		When the user clicks Search By Alphabet tab
		And the user choose any alphabet
		Then the user should be able to see the employees name