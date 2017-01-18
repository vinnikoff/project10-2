

import java.lang.String;

public class Main {
    public static void main(String[] args) {
        try{
            throw new Ex("My Error");
        }
        catch (Ex e)
        {System.out.println("error: "+e);}
    }
}