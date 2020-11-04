package  com.github.diogosmendonca.control;

public class ControlFacade{

    public static String diciplineSpecificService(){
        return DiciplineBusinessObject.diciplineSpecificService();
    }

    public static String studentSpecificService(){
        return StudentBusinessObject.studentSpecificService();
    }

}