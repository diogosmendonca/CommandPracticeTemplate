
//Alert: initialize with a static block the DiciplineSpecificCommand. Put it into your commands with the key diciplineSpecificCommand.
public class AnyClass {
    
    static{
        //not_exists
        commands.put("diciplineSpecificCommand", new DiciplineSpecificCommand());
    }
    
}
