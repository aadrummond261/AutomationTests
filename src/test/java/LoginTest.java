import amanidrummond.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();

        loginPage.login("student", "Password123");

        Assertions.assertTrue(
                loginPage.getCurrentUrl().contains("logged-in-successfully"),
                "User was not redirected to the success page."
        );

        Assertions.assertEquals(
                "Logged In Successfully",
                loginPage.getSuccessMessage(),
                "Success message did not match."
        );

        System.out.println("Login successful. Browser will close in 30 seconds...");

        // Wait 30 seconds so someone can see the logged-in page
        Thread.sleep(30000);
    }
}