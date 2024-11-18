import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MtsTest {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testOnlineTopUpBlockTitle() {
        driver.get("https://mts.by");
        HomePage homePage = new HomePage(driver);
        assertEquals("Онлайн пополнение без комиссии", homePage.getOnlineTopUpBlockTitle());
    }

    @Test
    public void testPaymentLogosAreDisplayed() {
        driver.get("https://mts.by");
        OnlineTopUpPage onlineTopUpPage = new OnlineTopUpPage(driver);
        assertTrue(onlineTopUpPage.arePaymentLogosDisplayed());
    }

    @Test
    public void testMoreInfoLink() {
        driver.get("https://mts.by");
        HomePage homePage = new HomePage(driver);
        homePage.clickMoreInfoLink();
        assertTrue(driver.getTitle().contains("Подробнее о сервисе"));
    }

    @Test
    public void testOnlineTopUpForm() {
        driver.get("https://mts.by");
        OnlineTopUpPage onlineTopUpPage = new OnlineTopUpPage(driver);
        onlineTopUpPage.selectServiceType("Услуги связи");
        onlineTopUpPage.enterPhoneNumber("297777777");
        onlineTopUpPage.enterAmount("10");
        onlineTopUpPage.clickContinue();
        // Здесь проверьте поведение после клика (например, сообщение или переход)
    }

    // Inner class: HomePage
    private static class HomePage {
        private final WebDriver driver;

        private final By onlineTopUpBlock = By.xpath("//div[@class='block-title'][text()='Онлайн пополнение без комиссии']");
        private final By moreInfoLink = By.linkText("Подробнее о сервисе");

        public HomePage(WebDriver driver) {
            this.driver = driver;
        }

        public String getOnlineTopUpBlockTitle() {
            return driver.findElement(onlineTopUpBlock).getText();
        }

        public void clickMoreInfoLink() {
            driver.findElement(moreInfoLink).click();
        }
    }

    // Inner class: OnlineTopUpPage
    private static class OnlineTopUpPage {
        private final WebDriver driver;

        private final By paymentSystemsLogos = By.xpath("//div[contains(@class, 'payment-system-logos')]//img");
        private final By serviceTypeDropdown = By.id("serviceType");
        private final By phoneNumberField = By.id("phoneNumber");
        private final By amountField = By.id("amount");
        private final By continueButton = By.id("continueButton");

        public OnlineTopUpPage(WebDriver driver) {
            this.driver = driver;
        }

        public boolean arePaymentLogosDisplayed() {
            return driver.findElements(paymentSystemsLogos).stream().allMatch(WebElement::isDisplayed);
        }

        public void selectServiceType(String serviceType) {
            driver.findElement(serviceTypeDropdown).sendKeys(serviceType);
        }

        public void enterPhoneNumber(String phoneNumber) {
            driver.findElement(phoneNumberField).sendKeys(phoneNumber);
        }

        public void enterAmount(String amount) {
            driver.findElement(amountField).sendKeys(amount);
        }

        public void clickContinue() {
            driver.findElement(continueButton).click();
        }
    }
}
