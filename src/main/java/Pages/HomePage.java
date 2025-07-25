package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase {

    public HomePage(WebDriver driver) {
        super(driver);
    }


    private final By searchInputLocator = By.cssSelector("input[name=\"q\"]");
    private final By searchLocator = By.cssSelector("button[class=\"css-11qi1o ezfki8j0\"]");
    private final By datePostedLocator = By.className("css-1d5tds3");
    private final By pastWeekLocator = By.cssSelector("div[class=\"css-ala0zs\"] div[class=\"css-19idom\"]:nth-child(3)");

    private final By jobsNumbersLocator = By.cssSelector("span[class=\"css-xkh9ud\"] strong");
    private final By firstJobLocator = By.cssSelector("a[href=\"https://wuzzuf.net/jobs/p/NkkNIZVJKYoo-Senior-Testing-Engineer-Fawry-for-Banking-Technology-and-Electronic-Payments-S-A-E-Giza-Egypt\"]");
    private final By applyLocator = By.xpath("//button[@class=\"css-1m0yk35 ezfki8j0\"]");

    private final By firstNameLocator = By.cssSelector("input[name=\"firstname\"]");
    private final By lastNameLocator = By.cssSelector("input[name=\"lastname\"]");
    private final By emailLocator = By.cssSelector("input[id=\"email\"]");
    private final By passwordLocator = By.cssSelector("div[class=\"css-sbn8kg e2hijbg0\"] form input[name=\"password\"]");
    private final By signupLocator = By.cssSelector("button[class=\"css-6lejne ezfki8j0\"]");

    private final By careerLevelLocator = By.cssSelector("div[name=\"careerLevel\"] div:nth-child(2)");
    private final By careerTypeLocator = By.cssSelector("button[title=\"Part Time\"]");
    private final By workPlaceLocator = By.cssSelector("button[title=\"Remote\"]");
    private final By categoryLocator = By.xpath("//form[@id=\"career-interests-form\"]/div[4]/div[2]/div[1]/div");
    private final By salaryLocator = By.cssSelector("input[name=\"minimumSalary\"]");
    private final By saveAndContinue = By.cssSelector("button[class=\"css-1wj05oe ezfki8j0\"]");


    private final By gender = By.cssSelector("input[value=\"female\"] ~ div");
    private final By contactInfo = By.cssSelector("input[name=\"primaryPhone\"]");


    private final By selectDate = By.cssSelector("div[class=\"css-1x21pox e6pv2vl4\"] div[class=\"col-2-lg col-12\"] div[class=\" css-1dgicot-container\"] div[class=\" css-zh6qap-control\"]");
    private final By selectMonth = By.cssSelector("div[class=\"css-1x21pox e6pv2vl4\"] div[class=\"col-3-lg col-12\"]:nth-child(2) div[class=\" css-1dgicot-container\"] div[class=\" css-zh6qap-control\"]");
    private final By selectYear = By.xpath("//div[@class=\"css-12119hv exkztdf0\"]/form/div[1]/div[3]/div/div[3]/div/div");

    private final By dayOption = By.xpath("//div[text() ='1']");
    private final By monthOption = By.xpath("//div[text() ='May']");
    private final By yearOption = By.xpath("//div[text() ='1991']");

    private final By selectNationality = By.xpath("//div[@class=\"css-12119hv exkztdf0\"]/form/div/div[5]/div/div[2]/div");
    private final By nationalityOption = By.xpath("//div[text()='Egypt']");

    private final By city = By.xpath(" //div[@class=\"css-12119hv exkztdf0\"]/form/div[2]/div[2]/div/div[2]/div");
    private final By cityOption = By.xpath("//div[text()='Riyadh']");

    private final By experienceYear = By.xpath("//div[@class=\" css-1h480x3 e1v1l3u10\"]/div/div/div/div");
    private final By experienceYearOption = By.xpath("//div[text()='No experience']");

    private final By educationLevel = By.cssSelector("div[class=\"css-1xcuv7b\"] div:nth-child(1)");

    private final By study = By.cssSelector("input[placeholder=\"e.g., Business, Accounting\"]");

    private final By university = By.xpath("//div[@class=\"css-12119hv exkztdf0\"]/form/div[2]/div[2]/div[2]/div[1]/div/div[2]/div/div/div");
    private final By universityOption = By.xpath("//div[text()='Misr University for Science and Technology (MUST)']");

    private final By degree = By.xpath("//div[@class=\"css-12119hv exkztdf0\"]/form/div[2]/div[2]/div[2]/div[3]/div/div/div/div");
    private final By degreeOption = By.xpath("//div[text()='2013']");

    private final By grade = By.xpath("//div[@class=\"css-12119hv exkztdf0\"]/form/div[2]/div[2]/div[2]/div[5]/div/div/div");
    private final By gradeOption = By.xpath("//div[text()='C / Good / 65 - 75%']");

    private final By language1 = By.xpath("//div[@class=\"css-1xrefku e6pv2vl1\"]/div[1]/div/div[2]/div");
    private final By Proficiency = By.xpath("//div[@class=\"css-1xrefku e6pv2vl1\"]/div[2]/div/div[2]/div");

    private final By addLanguage = By.cssSelector("button[class=\"css-ksyb00 ezfki8j0\"]");

    private final By langOption = By.xpath("//div[text()='English']");
    private final By ProficiencyOption = By.xpath("//div[text()='Advanced']");

    private final By tools = By.xpath("//form[@id=\"work-experience-form\"]/div[4]/div/div/div/div[1]");
    private final By toolsOption = By.xpath("//div[text()='UI','Computer Science']");

    private final By getStarted = By.cssSelector("button[class=\"css-1wj05oe ezfki8j0\"]");





    public void searchInput(String text){
        write(searchInputLocator,text);
    }

    public void search(){
        click(searchLocator);
    }

    public void datePosted() throws InterruptedException {
        Thread.sleep(2000);
        click(datePostedLocator);
    }

    public void pastWeek(){
        click(pastWeekLocator);
    }

    public String jobsNumber(){
        return returnText(jobsNumbersLocator);
    }

    public void goToJob() throws InterruptedException {
        Thread.sleep(3000);
        click(firstJobLocator);
    }

    public void apply() {
        click(applyLocator);
    }

    public void signUp(String fName, String lName, String email, String password){
        write(firstNameLocator,fName);
        write(lastNameLocator,lName);
        write(emailLocator,email);
        write(passwordLocator,password);
        click(signupLocator);
    }

    public void chooseLevel() {
        click(careerLevelLocator);
    }

    public void chooseCareerType() {
        click(careerTypeLocator);
    }

    public void setWorkPlace() {
        click(workPlaceLocator);
    }

    public void category(){
        click(categoryLocator);
    }

    public void setSalary(){
        write(salaryLocator,"2000");
    }

    public void saveAndContinue(){
        click(saveAndContinue);
    }

    public void selectBirthdate(){
        click(selectDate);
        click(dayOption);
        click(selectMonth);
        click(monthOption);
        click(selectYear);
        click(yearOption);
    }

    public void chooseGender(){
        click(gender);
    }

    public void selectNationality(){
        click(selectNationality);
        click(nationalityOption);
    }

    public void selectCity(){
        click(city);
        click(cityOption);
    }

    public void contact(){
        write(contactInfo,"01062889449");
    }

    public void setExperienceYear(){
        click(experienceYear);
        click(experienceYearOption);
    }

    public void education(){
        click(educationLevel);
    }

    public void degree() throws InterruptedException {
        write(study,"IT");
        Thread.sleep(2000);
        click(university);
        click(universityOption);
        click(degree);
        click(degreeOption);
        click(grade);
        click(gradeOption);
    }

    public void setLanguage(){
        click(language1);
        click(langOption);
        click(Proficiency);
        click(ProficiencyOption);
        click(addLanguage);
    }

    public void tools(){
        write(tools,"U");
        click(toolsOption);
    }

    public void getStarted(){
        click(getStarted);
    }




}
