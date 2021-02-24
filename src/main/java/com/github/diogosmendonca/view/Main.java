  
package com.github.diogosmendonca.view;

import com.github.diogosmendonca.control.*;

public class Main{

    private static String output = null;

    public static void main(String[] args){
        String result = null;
        if(args != null && args.length > 0){
            switch(args[0]){
                case "firstSpecificCommand":
                    result = ControlFacade.firstSpecificService();
                    break;
                case "secondSpecificCommand":
                    result = ControlFacade.secondSpecificService();
                    break;
                default:
                    result = "Command not found";
                    break;
            }
        }else{
            result = "Command not found";
        }
        System.out.println(result);
        output = result;
    }

    public static String getOutput(){
        return output;
    }

}