package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helpers extends WebDriverManager  {

    protected void selectAdd(){
        WebElement add = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.id("Add")));
        add.click();
    }

    protected void setTitle(){
        WebElement title =  new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@value='Title']")));
        title.sendKeys("Event for testing purpose");
    }

    protected void selectLocation(){
        WebElement location =  new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(By.id("EventLocation")));
        location.click();
    }

    protected void selectCurrentLocation(){
        WebElement currentLocation =  new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(By.id("Current Location")));
        currentLocation.click();
    }

    protected void setNotes() {
        WebElement notes = new WebDriverWait(driver, 30)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@value='Notes']")));
        notes.sendKeys("Event for testing purpose Notes..........");
    }

    protected void jumpToDecember(){
        WebElement selectMonth = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(By.id("October")));
        selectMonth.click();

        WebElement selectYear = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(By.id("2018")));
        selectYear.click();

        WebElement selectDecember = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(By.id("December 2018")));
        selectDecember.click();

        WebElement onDecember = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(By.id("December 2018")));
        assert onDecember != null;
    }

    protected void addHideCalendars(){
        WebElement calendar = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(By.id("Calendars")));
        calendar.click();
        try {
            WebElement showAll = new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.elementToBeClickable(By.id("Show All")));
            showAll.click();
        } catch(Exception e) {
            WebElement hideAll = new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.elementToBeClickable(By.id("Hide All")));
            hideAll.click();
        }

        WebElement selectDone = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(By.id("Done")));
        selectDone.click();
    }

}
