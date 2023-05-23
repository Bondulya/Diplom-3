package pages;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;

public class BasePage {
    WebDriver webDriver;

    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    protected void click(By locator) {
        webDriver.findElement(locator).click();
    }
    protected void type(By locator, String text) {
        webDriver.findElement(locator).sendKeys(text);
    }
    protected void checkLocator(By locator) {
        webDriver.findElement(locator).isEnabled();
    }

    protected void getPage(String url) {
        webDriver.get(url);
    }

    protected String getText(By locator) {
        return  webDriver.findElement(locator).getText();
    }
}