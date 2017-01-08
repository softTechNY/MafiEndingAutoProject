package SearchItems;

import org.testng.annotations.Test;
import PageFactorySearch.DropDownMenuPage;

import java.util.List;

/**
 * Created by rrt on 12/26/2015.
 */
public class DropDownMenuSearch extends DropDownMenuPage {

    @Test
    public void dropDownMenu()throws InterruptedException {
        List<String> text = getMenus();
        typeOnInputSearch(text);
    }
}
