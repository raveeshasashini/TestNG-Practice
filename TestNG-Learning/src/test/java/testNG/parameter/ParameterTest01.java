package testNG.parameter;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest01 {


    @Test
    @Parameters({"value 01","value 02"})
    public void Sum(@Optional("75") int v1,@Optional("4") int v2){
        int finalSum = v1+v2;
        System.out.println("The final sum of the given value is "+ finalSum);
    }
}
