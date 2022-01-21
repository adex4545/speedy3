package pages;


public class Common_Method extends  Base_Page{

    public static void enter_Text(By by , String text) {
        driver.findElement(by).sendKeys(text);
    }
    public static void click_on_Element (By by){
        driver.findElement(by).click();
    }

}
