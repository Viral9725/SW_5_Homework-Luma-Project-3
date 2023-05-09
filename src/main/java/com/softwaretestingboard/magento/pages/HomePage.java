package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.customListeners.CustomListeners;
import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Women')]")
    WebElement WomenMenuOption;
    public void mouseHoverOnWomenMenuTab() {
        CustomListeners.test.log(Status.PASS, "mouseHoverOnWomen Menu Option");
        mouseHoverToElement(WomenMenuOption);
        Reporter.log("mouseHoverOnWomen Menu Option" + WomenMenuOption.toString());
    }
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-9']//span[contains(text(),'Tops')]")
    WebElement mouseHoverOnTopMenuOption;
    public void mouseHoverOnWomenTopMenuOption() {
        CustomListeners.test.log(Status.PASS, "mouseHoverOnWomenTop Menu Option");
        mouseHoverToElement(mouseHoverOnTopMenuOption);
        Reporter.log("mouseHoverOnWomenTop Menu Option" + mouseHoverOnTopMenuOption.toString());
    }
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-11']")
    WebElement jacketsOption;

    public void setJacketsOption() {
        CustomListeners.test.log(Status.PASS, "set Jackets Option");
        clickOnElement(jacketsOption);
        Reporter.log("set Jackets Option" + jacketsOption.toString());
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/select[1]")
    WebElement sortProductNameInDropDownOption;

    public void productSortByProductName(String product) {
        CustomListeners.test.log(Status.PASS, "product Sort By Product Name");
        selectByVisibleTextFromDropDown(sortProductNameInDropDownOption, product);
        Reporter.log("product Sort By Product Name" + sortProductNameInDropDownOption.toString());
    }
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Men']")
    WebElement menMenuOption;
    public void mouseHoverOnMenMenuTab() {
        CustomListeners.test.log(Status.PASS, "mouseHoverOn MenMenu Tab");
        mouseHoverToElement(menMenuOption);
        Reporter.log("mouseHoverOn MenMenu Tab" + menMenuOption.toString());
    }
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-18']")
    WebElement mouseHoverOnBottomsMenuOption;
    public void mouseHoverOnMenBottomsMenuOption() {
        CustomListeners.test.log(Status.PASS, "set Pants Option");
        mouseHoverToElement(mouseHoverOnBottomsMenuOption);
        Reporter.log("set Pants Option" + mouseHoverOnBottomsMenuOption.toString());
    }
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement pantsOption;
    public void setPantsOption() {
        CustomListeners.test.log(Status.PASS, "set Pants Option");
        clickOnElement(pantsOption);
        Reporter.log("set Pants Option" + pantsOption.toString());
    }
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
    WebElement mouseHoverOnProductNameOption;
    public void mouseHoverOnMenPantsProductNameOption() {
        CustomListeners.test.log(Status.PASS, "mouseHoverAndClickOn ProductName Option");
        mouseHoverToElement(mouseHoverOnProductNameOption);
        Reporter.log("mouseHoverAndClickOn ProductName Option" + mouseHoverOnProductNameOption.toString());
    }
    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-option text'])[1]")
    WebElement mouseHoverAndClickOnProductNameOption;
    public void mouseHoverOnProductNameCronusYogaPantAndClicksOnSizeOption(String pant) {
        CustomListeners.test.log(Status.PASS, "mouseHoverAndClickOn Cronus Yoga Pant and click on size");
        mouseHoverToElementAndClick(mouseHoverAndClickOnProductNameOption);
        Reporter.log("mouseHoverAndClickOn Cronus Yoga Pant and click on size" + mouseHoverAndClickOnProductNameOption.toString());
    }
    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-option color'])[1]")
    WebElement mouseHoverAndClickOnColourNameOption;
    public void mouseHoverOnProductNameCronusYogaPantAndClicksOnColourOption(String pant) {
        CustomListeners.test.log(Status.PASS, "mouseHoverAndClickOn ProductNameOption");
        mouseHoverToElementAndClick(mouseHoverAndClickOnColourNameOption);
        Reporter.log("mouseHoverAndClick On ProductNameOption" + mouseHoverAndClickOnColourNameOption.toString());
    }
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Add to Cart')])[1]")
    WebElement mouseHoverAndClickOnAddToCartOption;
    public void mouseHoverOnProductNameCronusYogaPantAndClicksOnAddToCartOption() {
        CustomListeners.test.log(Status.PASS, "mouseHoverAndClickOn AddToCartOption");
        mouseHoverToElementAndClick(mouseHoverAndClickOnAddToCartOption);
        Reporter.log("mouseHoverAndClick On AddToCartOption" + mouseHoverAndClickOnAddToCartOption.toString());
    }
    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement addedToYourShoppingCartMethodText;
    public String youAddedCronusYogaPantToYourShoppingCartMethodTextMethodText() {
        String message10 = getTextFromElement(addedToYourShoppingCartMethodText);
        CustomListeners.test.log(Status.PASS, "you Added CronusYogaPantTo Your ShoppingCart Method");
        Reporter.log("you Added CronusYogaPantTo Your ShoppingCart Method" + addedToYourShoppingCartMethodText.toString());
        return message10;
    }
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCartOption;
    public void clickOnShoppingCartOption() {
        CustomListeners.test.log(Status.PASS, "click on shopping Cart Option");
        clickOnElement(shoppingCartOption);
        Reporter.log("click on shopping Cart Option" + shoppingCartOption.toString());
    }
    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement shoppingCartTextMethod;
    public String shoppingCartText() {
        String message11 = getTextFromElement(shoppingCartTextMethod);
        CustomListeners.test.log(Status.PASS, "shoppingCart Text Method");
        Reporter.log("shoppingCart Text Method" + shoppingCartTextMethod.toString());
        return message11;
    }
    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement pantTextMethod;
    public String cronusPantText() {
        String message12 = getTextFromElement(pantTextMethod);
        CustomListeners.test.log(Status.PASS, "cronusPant Text");
        Reporter.log("cronusPant Text" + pantTextMethod.toString());
        return message12;
    }
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement sizeTextMethod;
    public String verifySizeText() {
        String message13 = getTextFromElement(sizeTextMethod);
        CustomListeners.test.log(Status.PASS, "Verify Size of Text");
        Reporter.log("Verify Size of Text" + sizeTextMethod.toString());
        return message13;
    }
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement colourTextMethod;
    public String verifyColourOfPantText() {
        String message14 = getTextFromElement(colourTextMethod);
        CustomListeners.test.log(Status.PASS, "Verify Color of PantText");
        Reporter.log("Verify Color of PantText" + colourTextMethod.toString());
        return message14;
    }
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Gear']")
    WebElement mouseHoverOnGearOption;
    public void mouseHoverOnGearMenuOption() {
        CustomListeners.test.log(Status.PASS, "mouseHoverOn Gear Option");
        mouseHoverToElement(mouseHoverOnGearOption);
        Reporter.log("mouseHoverOn Gear Option" + mouseHoverOnGearOption.toString());
    }
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Gear']")
    WebElement mouseHoverGearAndClickOption;
    public void mouseHoverOnGearMenuAndClicksOnBagsOption() {
        CustomListeners.test.log(Status.PASS, "mouseHover And Click On AddToCartOption");
        mouseHoverToElementAndClick(mouseHoverGearAndClickOption);
        Reporter.log("Clicking on duffleBagOption" + mouseHoverGearAndClickOption.toString());
    }
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Overnight Duffle']")
    WebElement duffleBagOption;
    public void clickODuffleBagOption() {
        CustomListeners.test.log(Status.PASS, "Click on duffleBagOption");
        clickOnElement(duffleBagOption);
        Reporter.log("Clicking on duffleBagOption" + duffleBagOption.toString());
    }
    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement overNightDuffleText;
    public String verifyOvernightDuffleText() {
        String message1 = getTextFromElement(overNightDuffleText);
        CustomListeners.test.log(Status.PASS, "get Message1");
        Reporter.log("Clicking on Login Link " + overNightDuffleText.toString());
        return message1;
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement quantityOption;
    public void quantitySpaceOption() {
        clickOnElement(quantityOption);
        sendTextToElement(quantityOption, Keys.CONTROL + "a"); // Select all existing text
        sendTextToElement(quantityOption, "3"); // Type in the new text
    }
    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement youAddedText;
    public String verifyYouAddedOvernightDuffleToYourShoppingCartText() {
        CustomListeners.test.log(Status.PASS, "Verify You Added night Duffle");
        Reporter.log("Verify You Added night Duffle" + youAddedText.toString());
        String textFromElement = getTextFromElement(youAddedText);
        return verifyOvernightDuffleTextMethod();
    }
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement cartOption;
    public void clickOnShoppingCartLinkOption() {
        CustomListeners.test.log(Status.PASS, "Click on login Button");
        clickOnElement(cartOption);
        Reporter.log("Click on login Button" + cartOption.toString());
    }
    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement nightDuffleText;
    public String verifyOvernightDuffleTextMethod() {
        String message16 = getTextFromElement(nightDuffleText);
        CustomListeners.test.log(Status.PASS, "verifyOvernight Duffle Text Method");
        Reporter.log("verifyOvernight Duffle Text Method" + nightDuffleText.toString());
        return message16;
    }
    @CacheLookup
    @FindBy(xpath = "//input[@title='Qty']")
    WebElement qtyText;
    public String verifyQuantityText() {
        String message17 = getTextFromElement(qtyText);
        CustomListeners.test.log(Status.PASS, "verifyQuantity Text");
        Reporter.log("verifyQuantity Text" + qtyText.toString());
        return message17;
    }
    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span)[2]")
    WebElement priceText;
    public String verifyProductPrice() {
        String message18 = getTextFromElement(priceText);
        CustomListeners.test.log(Status.PASS, "verify Product Price");
        Reporter.log("verify Product Price" + priceText.toString());
        return message18;
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement qtyOption;
    public void quantityUpdateText() {
        clickOnElement(qtyOption);
        sendTextToElement(qtyOption, Keys.CONTROL + "a"); // Select all existing text
        sendTextToElement(qtyOption, "5"); // Type in the new text
    }
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shopCartOption;
    public void clickOnShoppingCartButtonOption() {
        CustomListeners.test.log(Status.PASS, "click On Shopping Cart ButtonOption");
        clickOnElement(shopCartOption);
        Reporter.log("click On Shopping Cart ButtonOption" + shopCartOption.toString());
    }
    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span)[2]")
    WebElement priceTextMethod;
    public String verifyUpdatedPriceText()
    {
        String message19 = getTextFromElement(priceTextMethod);
        CustomListeners.test.log(Status.PASS, "verify Updated Price Text");
        Reporter.log("verify Updated Price Text" + priceTextMethod.toString());
        return message19;
    }
}