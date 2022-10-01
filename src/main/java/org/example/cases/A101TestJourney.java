package org.example.cases;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.utils.Constants;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class A101TestJourney {

    WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void startTest() throws InterruptedException {
        driver.get(Constants.BASE_URL);
        driver.manage().window().maximize();
        acceptCookies();
        clothingAndAccessory();
        womanUnderWear();
        kneeHighSocks();
        denierTrousersSocksBlack();
        addBasket();
        showBasket();
        approveBasket();
        withoutSignup();
        enterEmail();
        continueButton();
        createNewAddress();
        addAddressTitle();
        addFirstName();
        addSurname();
        addPhoneNumber();
        selectCity();
        selectTown();
        selectDistrict();
        enterFullAddress();
        clickSaveAddressButton();
        selectCargo();
        clickSaveAndContinueButton();
    }

    @After
    public void endTest() {
        driver.quit();
    }


    public void acceptCookies() {
        driver.findElement(By.xpath(Constants.XPATH.ACCEPT_COOKIES)).click();
    }

    public void clothingAndAccessory() {
        driver.findElement(By.xpath(Constants.XPATH.CLOTHING_AND_ACCESORY)).click();
    }

    public void womanUnderWear() throws InterruptedException {
        WebElement womanUnderWear = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath(Constants.XPATH.WOMAN_UNDERWEAR)));
        womanUnderWear.click();
        Thread.sleep(1000);
    }

    public void kneeHighSocks() throws InterruptedException {
        WebElement kneeHighSocks = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.linkText(Constants.XPATH.KNEE_HIGH_SOCKS)));
        kneeHighSocks.click();
        Thread.sleep(1000);
    }

    public void denierTrousersSocksBlack() throws InterruptedException {
        WebElement denierTrousersSocksBlack = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath(Constants.XPATH.DENIER_TROUSERS_SOCKS_BLACK)));
        denierTrousersSocksBlack.click();
        Thread.sleep(1000);
    }

    public void addBasket() throws InterruptedException {
        WebElement addBasket = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath(Constants.XPATH.ADD_BASKET)));
        addBasket.click();
        Thread.sleep(1000);
    }

    public void showBasket() throws InterruptedException {
        WebElement showBasket = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath(Constants.XPATH.SHOW_BASKET)));
        showBasket.click();
        Thread.sleep(1000);
    }

    public void approveBasket() throws InterruptedException {
        WebElement approveBasket = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath(Constants.XPATH.APPROVE_BASKET)));
        approveBasket.click();
        Thread.sleep(1000);
    }

    public void withoutSignup() throws InterruptedException {
        WebElement withoutSignup = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath(Constants.XPATH.WITHOUT_SIGNUP)));
        withoutSignup.click();
        Thread.sleep(1000);
    }

    public void enterEmail() throws InterruptedException {
        WebElement enterEmail = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath(Constants.XPATH.ENTER_EMAIL)));
        enterEmail.sendKeys("erikpetrov2@btcmod.com");
        Thread.sleep(1000);
    }

    public void continueButton() throws InterruptedException {
        WebElement continueButton = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath(Constants.XPATH.CONTINUE_BUTTON)));
        continueButton.click();
        Thread.sleep(1000);
    }

    public void createNewAddress() throws InterruptedException {
        WebElement createNewAddress = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath(Constants.XPATH.CREATE_NEW_ADDRESS)));
        createNewAddress.click();
        Thread.sleep(1000);
    }

    public void addAddressTitle() throws InterruptedException {
        WebElement addressTitle = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath(Constants.XPATH.ADDRESS_TITLE)));
        addressTitle.sendKeys("ev");
        Thread.sleep(1000);
    }

    public void addFirstName() throws InterruptedException {
        WebElement firstName = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath(Constants.XPATH.FIRST_NAME)));
        firstName.sendKeys("user name");
        Thread.sleep(1000);
    }

    public void addSurname() throws InterruptedException {
        WebElement surname = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath(Constants.XPATH.SURNAME)));
        surname.sendKeys("user surname");
        Thread.sleep(1000);
    }

    public void addPhoneNumber() throws InterruptedException {
        WebElement phoneNumber = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath(Constants.XPATH.PHONE_NUMBER)));
        phoneNumber.sendKeys("5526589284");
        Thread.sleep(1000);
    }
    public void selectCity() throws InterruptedException {
        WebElement cityDropDown = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath(Constants.XPATH.CITY_DROPDOWN)));
        cityDropDown.click();
        Thread.sleep(1000);
        WebElement getCity = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath(Constants.XPATH.CITY)));
        getCity.click();
        Thread.sleep(1000);
    }

    public void selectTown() throws InterruptedException {
        WebElement townDropDown = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath(Constants.XPATH.TOWN_DROPDOWN)));
        townDropDown.click();
        Thread.sleep(1000);
        WebElement getTown = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath(Constants.XPATH.TOWN)));
        getTown.click();
        Thread.sleep(1000);
    }

    public void selectDistrict() throws InterruptedException {
        WebElement districtDropDown = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath(Constants.XPATH.DISTRICT_DROPDOWN)));
        districtDropDown.click();
        Thread.sleep(1000);
        WebElement getDistrict = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath(Constants.XPATH.DISTRICT)));
        getDistrict.click();
        Thread.sleep(1000);
    }

    public void enterFullAddress() throws InterruptedException {
        WebElement enterAddress = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath(Constants.XPATH.FULL_ADDRESS)));
        enterAddress.sendKeys("full address");
        Thread.sleep(1000);
    }

    public void clickSaveAddressButton() throws InterruptedException {
        WebElement button = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath(Constants.XPATH.SAVE_ADDRESS_BUTTON)));
        button.click();
        Thread.sleep(1000);
    }

    public void selectCargo() throws InterruptedException {
        WebElement selectCargo = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath(Constants.XPATH.CARGO)));
        selectCargo.click();
        Thread.sleep(1000);
    }

    public void clickSaveAndContinueButton() {
        WebElement clickSaveAndContinueButton= new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath(Constants.XPATH.SAVE_AND_CONTINUE_BUTTON)));
        clickSaveAndContinueButton.click();
    }

}
