# calculator-madeleineb

path for gitbash windows:
cd c/Users/Maaaads/Desktop/GitHub-Projects/calculator-madeleineb 

This a calculator with a GUI made for my final assignment in the Java OOP course at Nackademin, Stockholm, Sweden. 2017.

To Do List
1. Add tests to all methods (at: divide method).
1. Check if test method for doubles with deltas is written correct
1. Check if UML still is accurate after application is complete.
1. change back all methods loops to 50, from 3000.

Questions:
1. "Is it ok, when running Junit-tests on divition method, that the program breaks/stops looping when a 0.00 is randomed to divide with?  I would like it to continue looping, just noting the specific loop with 0, then moving on..? "
Bad theory: 
I made the loops exit to be when it saw second was 0.. Haha.
But:
It still breaks after removing the BP..!!
1. //Why doesn't it print out the "Can't devide by 0" from method when breaks?
	@Test
	public void testDivideFirstZero() {
  My Answer (By debugging. Setting a breakP at a temporary If statement to stop when second randomed 0):
  Here firstNr is always 0, so when getting randomed second 0, inside the method - it checks for Infinite, and when two 0 the result becomes NaN..! So maybe add a check for NaN in that statement aswell..
  1. 	//QUESTION: Do we really need try catch? Program never seems so access it? Divition tests
1. //QUESTION: Is ther ANY point to have a loop here? Maybe? testDivideSecondZero
1. //Q: Javadoc - ok to only have in interfaces? 
1. //Q: target (therefor the index) don't get added to github. Should it? 
