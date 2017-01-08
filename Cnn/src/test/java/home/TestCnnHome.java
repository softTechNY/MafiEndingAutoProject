package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import javax.smartcardio.CommandAPDU;

/**
 * Created by PIIT_NYA on 12/31/2016.
 */
public class TestCnnHome extends CommonAPI{

    @Test
    public void testHome(){
        clickByXpath(".//*[@id='nav']/div[2]/div[2]/a[2]");
        navigateBack();
        clickByXpath(".//*[@id='nav']/div[2]/div[2]/a[3]");

    }
}
