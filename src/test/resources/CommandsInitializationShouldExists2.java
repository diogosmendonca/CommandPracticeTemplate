
//Alert: initialize with a static block the StudentSpecificCommand. Put it into your commands with the key studentSpecificCommand.
public class AnyClass {
    
    static{
        //not_exists
        commands.put("studentSpecificCommand", new StudentSpecificCommand());
    }
    
}
