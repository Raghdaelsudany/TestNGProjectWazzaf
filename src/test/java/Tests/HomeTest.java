package Tests;

import Pages.HomePage;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;


public class HomeTest extends TestsBase{

    HomePage page;
    SoftAssert softAssert = new SoftAssert();

    Faker fake = new Faker();

    String fName = fake.name().firstName();
    String lName = fake.name().lastName();
    String email = fake.internet().safeEmailAddress();
    String password = fake.internet().password();



    @Test
    public void Tc1() throws InterruptedException {

        reportTest = report.createTest("Wazzaf");

        page = new HomePage(driver);

        page.searchInput("Software testing");
        page.search();

        Actions actions = new Actions(driver);

        actions.moveToElement(driver.findElement(By.className("css-1d5tds3")));
        actions.release().perform();

        page.datePosted();

        page.pastWeek();

        System.out.println(page.jobsNumber());

        Thread.sleep(3000);

        page.goToJob();

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        System.out.println(driver.getCurrentUrl());
        reportTest.pass("the apply job is shown now");

        Thread.sleep(2000);

        page.apply();

        Thread.sleep(1000);

        page.signUp(fName,lName,email,password);

        Thread.sleep(2000);

        page.chooseLevel();
        page.chooseCareerType();
        page.setWorkPlace();
        page.category();

        page.setSalary();

        page.saveAndContinue();


        Thread.sleep(2000);

        page.selectBirthdate();
        page.chooseGender();
        page.selectNationality();
        page.selectCity();
        page.contact();

        page.saveAndContinue();

        Thread.sleep(2000);

        page.setExperienceYear();
        page.education();

        page.degree();

        page.setLanguage();

        Thread.sleep(6000);
        page.tools();

        page.getStarted();



        softAssert.assertAll();
    }
}
