package intime;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Desktop.Action;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


class intime {
	private static WebDriver webDriver;
	private static String baseUrl;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		webDriver.quit();
	}

	@BeforeEach
	void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:/Users/Ervin/eclipse-workspace/.metadata/Selenium-Testing/code/chromedriver/chromedriver.exe");
		webDriver= new ChromeDriver();
		baseUrl="https://in-time.ba/";
	}

	@AfterEach
	void tearDown() throws Exception {
		

}
	@Test
	void kontaktTest() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement zatvoriNapomenu = webDriver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div[1]/div/button/div"));
		zatvoriNapomenu.click();
		Thread.sleep(3000);
		
		WebElement kontaktButton = webDriver.findElement(By.xpath("/html/body/div[2]/nav/div/div/ul[1]/li[6]/a"));
		kontaktButton.click();
		Thread.sleep(5000);
		
		WebElement distributivniCentarSarajevo = webDriver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/h2/button"));
		distributivniCentarSarajevo.click();
		Thread.sleep(2000);
		
		WebElement distributivniCentarSarajevoZatvori = webDriver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/h2/button"));
		distributivniCentarSarajevoZatvori.click();
		Thread.sleep(2000);
		
		WebElement poslovnicaMostar = webDriver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[7]/h2/button"));
		poslovnicaMostar.click();
		Thread.sleep(2000);
		
		WebElement poslovnicaMostarZatvori = webDriver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[7]/h2/button"));
		poslovnicaMostarZatvori.click();
		Thread.sleep(3000);
		
		JavascriptExecutor scroll = (JavascriptExecutor) webDriver;
		scroll.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(2000);
		
		WebElement ImeiPrezime = webDriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/div[2]/input"));
		ImeiPrezime.sendKeys("Test Tester");
		Thread.sleep(2000);
		
		WebElement Email = webDriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/div[4]/input"));
		Email.sendKeys("test.tester@gmail.com");
		Thread.sleep(2000);
		
		WebElement Broj = webDriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/div[5]/input"));
		Broj.sendKeys("033 333 333");
		Thread.sleep(2000);
		
		WebElement Naslov = webDriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/div[6]/input"));
		Naslov.sendKeys("Test");
		Thread.sleep(2000);
		
		WebElement Poruka = webDriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/div[7]/textarea"));
		Poruka.sendKeys("Testna poruka");
		Thread.sleep(2000);
		

		
}






}