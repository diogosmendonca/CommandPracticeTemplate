# Practice of Command Design Pattern Implementation

Make the refactoring of app code to introduce Command pattern in the view layer (view package). In Main class of view layer there is a switch statemente that selects a command and call a ControlFacade method. Replace this structure with a call to the appropriate command using command design pattern. Implement the Command pattern in the view.commands package and call it from Main class.

For practice verification, run the tests. 

```bash
mvn test
```

Check the console messages of the tests to improve your Command. If all tests are passing, your implementation is correct. 

The minimum Java JDK  version for testing is 11.
