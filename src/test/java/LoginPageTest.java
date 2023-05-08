import com.bridgelabz.Base.BaseClass;
import com.bridgelabz.Page.HomePage;
import com.bridgelabz.Page.LoginPage;
import com.bridgelabz.util.Utility;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass {
    LoginPage loginPage;
    HomePage homePage;


    @BeforeMethod
    public void setup(){
        launchBrowser();
        loginPage = new LoginPage();
    }


    @Test
    public void verifyLoginPageTitleTest(){
        String loginPageTitle = loginPage.verifyLoginPageTitle();
        Assert.assertEquals(loginPageTitle,"Bewakoof: Log In ");
    }

    @DataProvider
    public Object[][] getLoginTestData(){
        return Utility.getTestData("BewakoofData");
    }

    @Test(dataProvider = "getLoginTestData")
    public void loginTest(String username,String password){
        homePage = loginPage.login(username, password);
    }
    @AfterMethod
    public void tearDown() throws InterruptedException{
        Thread.sleep(5000);
        driver.quit();
    }
}


