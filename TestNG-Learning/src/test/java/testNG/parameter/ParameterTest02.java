package testNG.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest02 {


    @Test
    @Parameters({"value 01","value 02"})
    public void Diff(int v1,int v2){
        int finalDiff = v1-v2;
        System.out.println("The final difference of the given value is "+ finalDiff);
    }
}
