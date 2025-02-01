package testNG.dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CustomDataProvider {


    @DataProvider
    public Object[] [] getData(){
        Object[] [] data={{"abc@gmail.com","abc123"},{"def@gmail.com","abc123"},{"xyz@gmail.com","xyz123"}};
        return data;
    }
}
