package intime;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Desktop.Action;
import java.time.Duration;

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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


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
	@Test
	void karijeraTest() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement zatvoriNapomenu = webDriver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div[1]/div/button/div"));
		zatvoriNapomenu.click();
		Thread.sleep(3000);
		
		WebElement karijeraButton = webDriver.findElement(By.xpath("/html/body/div[2]/nav/div/div/ul[1]/li[5]/a"));
		karijeraButton.click();
		Thread.sleep(5000);
		
		WebElement Ime = webDriver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/form/div[2]/div[1]/div/input"));
		Ime.sendKeys("Test");
		Thread.sleep(2000);
		
		WebElement Prezime = webDriver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/form/div[2]/div[2]/div/input"));
		Prezime.sendKeys("Tester");
		Thread.sleep(2000);
		
		WebElement MjestoStanovanja = webDriver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/form/div[3]/input"));
		MjestoStanovanja.sendKeys("Testno mjesto");
		Thread.sleep(2000);
		
		WebElement Telefon = webDriver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/form/div[4]/input"));
		Telefon.sendKeys("033 333 333");
		Thread.sleep(2000);
		
		WebElement EmailAdresa = webDriver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/form/div[5]/input"));
		EmailAdresa.sendKeys("test.tester@gmail.com");
		Thread.sleep(2000);
		
		WebElement PrijavaNaRadno = webDriver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/form/div[6]/select"));
		PrijavaNaRadno.click();
		Thread.sleep(2000);
		
		WebElement ITSektor = webDriver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/form/div[6]/select/option[10]"));
		ITSektor.click();
		Thread.sleep(2000);
		
		WebElement PrijavaNaRadno2 = webDriver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/form/div[6]/select"));
		PrijavaNaRadno2.click();
		Thread.sleep(2000);
		
		WebElement Lokacija = webDriver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/form/div[7]/select"));
		Lokacija.click();
		Thread.sleep(2000);
		
		WebElement Sarajevo = webDriver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/form/div[7]/select/option[6]"));
		Sarajevo.click();
		Thread.sleep(2000);
		
		WebElement Lokacija2 = webDriver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/form/div[7]/select"));
		Lokacija2.click();
		Thread.sleep(2000);
		
		WebElement Poruka = webDriver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/form/div[8]/textarea"));
		Poruka.sendKeys("Test");
		Thread.sleep(2000);
		
		WebElement scroll = webDriver.findElement(By.xpath("/html/body/div[2]/footer/div[1]/div/div[3]/ul/li[3]/a"));
		scroll.sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(3000);
		
	}
	
	@Test
	void drustveneMreze() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement zatvoriNapomenu = webDriver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div[1]/div/button/div"));
		zatvoriNapomenu.click();
		Thread.sleep(3000);
		
		WebElement scroll = webDriver.findElement(By.xpath("/html/body/div[2]/footer/div[1]/div/div[1]/ul/li[2]/a"));
		scroll.sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(3000);
		
		
		String handle1 = webDriver.getWindowHandle();
		webDriver.findElement(By.xpath("/html/body/div[2]/footer/div[1]/div/div[1]/ul/li[1]/a")).click();
		
		for(String handle: webDriver.getWindowHandles()) {
			if (!handle.equals(handle1)) {
				webDriver.switchTo().window(handle);
				break;
			}
		}
		
		Thread.sleep(5000);
		webDriver.close();
		webDriver.switchTo().window(handle1);
		Thread.sleep(2000);
		
		webDriver.findElement(By.xpath("/html/body/div[2]/footer/div[1]/div/div[1]/ul/li[2]/a")).click();
		
		for(String handle: webDriver.getWindowHandles()) {
			if (!handle.equals(handle1)) {
				webDriver.switchTo().window(handle);
				break;
			}
		}
		
		Thread.sleep(5000);
		webDriver.close();
		webDriver.switchTo().window(handle1);
		Thread.sleep(2000);
		
}
	
	@Test
	void inTimeUsluge() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement zatvoriNapomenu = webDriver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div[1]/div/button/div"));
		zatvoriNapomenu.click();
		Thread.sleep(3000);
		
		WebElement Element = webDriver.findElement(By.xpath("/html/body/div[2]/section[1]/div/div[2]/div[1]/div"));
		JavascriptExecutor js = (JavascriptExecutor) webDriver;
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Thread.sleep(2000);
		
		WebElement medjunarodniTransport = webDriver.findElement(By.xpath("/html/body/div[2]/section[1]/div/div[2]/div[1]/div"));
		medjunarodniTransport.click();
		Thread.sleep(3000);
		
		WebElement zatvoriButton = webDriver.findElement(By.xpath("/html/body/div[2]/div[7]/div/div/div[3]/button"));
		zatvoriButton.click();
		Thread.sleep(3000);
		
		WebElement medjugradskaDostava = webDriver.findElement(By.xpath("/html/body/div[2]/section[1]/div/div[2]/div[2]/div"));
		medjugradskaDostava.click();
		Thread.sleep(3000);
		
		WebElement zatvoriButton2 = webDriver.findElement(By.xpath("/html/body/div[2]/div[8]/div/div/div[3]/button"));
		zatvoriButton2.click();
		Thread.sleep(3000);
		
		WebElement uvozIzvoz = webDriver.findElement(By.xpath("/html/body/div[2]/section[1]/div/div[2]/div[3]/div"));
		uvozIzvoz.click();
		Thread.sleep(3000);
		
		WebElement zatvoriButton3 = webDriver.findElement(By.xpath("/html/body/div[2]/div[9]/div/div/div[3]/button"));
		zatvoriButton3.click();
		Thread.sleep(3000);
		
		WebElement skladistenje = webDriver.findElement(By.xpath("/html/body/div[2]/section[1]/div/div[2]/div[4]/div"));
		skladistenje.click();
		Thread.sleep(3000);
		
		WebElement zatvoriButton4 = webDriver.findElement(By.xpath("/html/body/div[2]/div[10]/div/div/div[3]/button"));
		zatvoriButton4.click();
		Thread.sleep(3000);
		
		WebElement carinsko = webDriver.findElement(By.xpath("/html/body/div[2]/section[1]/div/div[2]/div[5]/div"));
		carinsko.click();
		Thread.sleep(3000);
		
		WebElement zatvoriButton5 = webDriver.findElement(By.xpath("/html/body/div[2]/div[11]/div/div/div[3]/button"));
		zatvoriButton5.click();
		Thread.sleep(3000);
		
		WebElement specijalneUsluge = webDriver.findElement(By.xpath("/html/body/div[2]/section[1]/div/div[2]/div[6]/div"));
		specijalneUsluge.click();
		Thread.sleep(3000);
		
		WebElement zatvoriButton6 = webDriver.findElement(By.xpath("/html/body/div[2]/div[12]/div/div/div[3]/button"));
		zatvoriButton6.click();
		Thread.sleep(3000);
	
}
	@Test
	void drugeStranice() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement zatvoriNapomenu = webDriver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div[1]/div/button/div"));
		zatvoriNapomenu.click();
		Thread.sleep(3000);
		
		String handle1 = webDriver.getWindowHandle();
		webDriver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/a[1]")).click();
		
		for(String handle: webDriver.getWindowHandles()) {
			if (!handle.equals(handle1)) {
				webDriver.switchTo().window(handle);
				break;
			}
		}
		
		Thread.sleep(5000);
		webDriver.close();
		webDriver.switchTo().window(handle1);
		Thread.sleep(2000);
		
		webDriver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/a[3]")).click();
		
		for(String handle: webDriver.getWindowHandles()) {
			if (!handle.equals(handle1)) {
				webDriver.switchTo().window(handle);
				break;
			}
		}
		
		Thread.sleep(5000);
		webDriver.close();
		webDriver.switchTo().window(handle1);
		Thread.sleep(2000);
		
		webDriver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/a[5]")).click();
		
		for(String handle: webDriver.getWindowHandles()) {
			if (!handle.equals(handle1)) {
				webDriver.switchTo().window(handle);
				break;
			}
		}
		
		Thread.sleep(5000);
		webDriver.close();
		webDriver.switchTo().window(handle1);
		Thread.sleep(2000);
		
		WebElement Element = webDriver.findElement(By.xpath("/html/body/div[2]/div[6]/div/div[3]/div[3]/div/a"));
		JavascriptExecutor js = (JavascriptExecutor) webDriver;
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Thread.sleep(2000);
		
		webDriver.findElement(By.xpath("/html/body/div[2]/div[6]/div/div[3]/div[1]/div/a")).click();
		
		for(String handle: webDriver.getWindowHandles()) {
			if (!handle.equals(handle1)) {
				webDriver.switchTo().window(handle);
				break;
			}
		}
		
		Thread.sleep(5000);
	}
	
	@Test
	void pracenjePosiljke() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement zatvoriNapomenu = webDriver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div[1]/div/button/div"));
		zatvoriNapomenu.click();
		Thread.sleep(3000);
		
		WebElement Element = webDriver.findElement(By.xpath("/html/body/div[2]/section[2]/div/div[2]/div/div/div[1]/div/h3"));
		JavascriptExecutor js = (JavascriptExecutor) webDriver;
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Thread.sleep(2000);
		
		WebElement Search = webDriver.findElement(By.xpath("/html/body/div[2]/section[2]/div/div[2]/div/div/div[1]/div/div[1]/div/input"));
		Search.sendKeys("Test");
		Thread.sleep(2000);
		
		WebElement INTime = webDriver.findElement(By.xpath("/html/body/div[2]/section[2]/div/div[2]/div/div/div[1]/div/div[2]/div[1]/div"));
		INTime.click();
		Thread.sleep(2000);
		
		WebElement TNTExpress = webDriver.findElement(By.xpath("/html/body/div[2]/section[2]/div/div[2]/div/div/div[1]/div/div[2]/div[2]/div"));
		TNTExpress.click();
		Thread.sleep(2000);
		
		WebElement Fedex = webDriver.findElement(By.xpath("/html/body/div[2]/section[2]/div/div[2]/div/div/div[1]/div/div[2]/div[3]/div"));
		Fedex.click();
		Thread.sleep(2000);
		
}
	@Test
	void usloviPoslovanja() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement zatvoriNapomenu = webDriver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div[1]/div/button/div"));
		zatvoriNapomenu.click();
		Thread.sleep(3000);
		
		WebElement Element = webDriver.findElement(By.xpath("/html/body/div[2]/footer/div[1]/div/div[2]/ul/li[1]/a"));
		JavascriptExecutor js = (JavascriptExecutor) webDriver;
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Thread.sleep(2000);
		
		WebElement INTimeUslovi = webDriver.findElement(By.xpath("/html/body/div[2]/footer/div[1]/div/div[2]/ul/li[1]/a"));
		INTimeUslovi.click();
		Thread.sleep(5000);
		
		WebElement Element2 = webDriver.findElement(By.xpath("/html/body/div[2]/footer/div[1]/div/div[2]/ul/li[1]/a"));
		JavascriptExecutor js2 = (JavascriptExecutor) webDriver;
		js2.executeScript("arguments[0].scrollIntoView();", Element2);
		Thread.sleep(2000);
		
		String handle1 = webDriver.getWindowHandle();
		webDriver.findElement(By.xpath("/html/body/div[2]/footer/div[1]/div/div[2]/ul/li[2]/a")).click();
		
		for(String handle: webDriver.getWindowHandles()) {
			if (!handle.equals(handle1)) {
				webDriver.switchTo().window(handle);
				break;
			}
		}
		
		Thread.sleep(5000);
		webDriver.close();
		webDriver.switchTo().window(handle1);
		Thread.sleep(2000);
		
		WebElement Element1 = webDriver.findElement(By.xpath("/html/body/div[2]/footer/div[1]/div/div[2]/ul/li[1]/a"));
		JavascriptExecutor js1 = (JavascriptExecutor) webDriver;
		js1.executeScript("arguments[0].scrollIntoView();", Element1);
		Thread.sleep(2000);
		
		webDriver.findElement(By.xpath("/html/body/div[2]/footer/div[1]/div/div[2]/ul/li[3]/a")).click();
		
		for(String handle: webDriver.getWindowHandles()) {
			if (!handle.equals(handle1)) {
				webDriver.switchTo().window(handle);
				break;
			}
		}
		
		Thread.sleep(5000);
		webDriver.close();
		webDriver.switchTo().window(handle1);
		Thread.sleep(2000);
		
}
	@Test
	void korisnickiLogin() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement zatvoriNapomenu = webDriver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div[1]/div/button/div"));
		zatvoriNapomenu.click();
		Thread.sleep(3000);
		
		String handle1 = webDriver.getWindowHandle();
		webDriver.findElement(By.xpath("/html/body/div[2]/nav/div/div/ul[2]/li/a")).click();
		
		for(String handle: webDriver.getWindowHandles()) {
			if (!handle.equals(handle1)) {
				webDriver.switchTo().window(handle);
				break;
			}
		}
		
		Thread.sleep(5000);
		
		WebElement login = webDriver.findElement(By.xpath("/html/body/div[1]/div/div[2]/ul[2]/li[2]/a"));
		login.click();
		Thread.sleep(2000);
		
		WebElement email = webDriver.findElement(By.xpath("/html/body/div[2]/div/div[1]/section/form/div[2]/div/input"));
		email.sendKeys("test.tester@gmail.com");
		Thread.sleep(2000);
		
		WebElement password = webDriver.findElement(By.xpath("/html/body/div[2]/div/div[1]/section/form/div[3]/div/input"));
		password.sendKeys("testnipassword");
		Thread.sleep(2000);
		
		WebElement rememberMe = webDriver.findElement(By.xpath("/html/body/div[2]/div/div[1]/section/form/div[4]/div/div/input[1]"));
		rememberMe.click();
		Thread.sleep(2000);
		
		WebElement loginButton = webDriver.findElement(By.xpath("/html/body/div[2]/div/div[1]/section/form/div[5]/div/input"));
		loginButton.click();
		Thread.sleep(2000);
	}
	
	@Test
	void oNamaTest() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement zatvoriNapomenu = webDriver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div[1]/div/button/div"));
		zatvoriNapomenu.click();
		Thread.sleep(3000);
		
		Actions actions = new Actions(webDriver);
    	WebElement menuOption = webDriver.findElement(By.xpath("/html/body/div[2]/nav/div/div/ul[1]/li[2]/a"));
    	actions.moveToElement(menuOption).perform();
    	Thread.sleep(2000);
		
		WebElement oNamaButton2 = webDriver.findElement(By.xpath("/html/body/div[2]/nav/div/div/ul[1]/li[2]/ul/li[1]/a"));
		oNamaButton2.click();
		Thread.sleep(6000);
		
		Actions actions2 = new Actions(webDriver);
    	WebElement menuOption2 = webDriver.findElement(By.xpath("/html/body/div[2]/nav/div/div/ul[1]/li[2]/a"));
    	actions2.moveToElement(menuOption2).perform();
    	
    	WebElement opciUsloviPoslovanja = webDriver.findElement(By.xpath("/html/body/div[2]/nav/div/div/ul[1]/li[2]/ul/li[2]/a"));
		opciUsloviPoslovanja.click();
		Thread.sleep(6000);		
	}
	
	@Test
	void TNTtest() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement zatvoriNapomenu = webDriver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div[1]/div/button/div"));
		zatvoriNapomenu.click();
		Thread.sleep(3000);
		
		Actions actions = new Actions(webDriver);
    	WebElement menuOption = webDriver.findElement(By.xpath("/html/body/div[2]/nav/div/div/ul[1]/li[3]/a"));
    	actions.moveToElement(menuOption).perform();
    	Thread.sleep(2000);
    	
    	WebElement TNTExpress = webDriver.findElement(By.xpath("/html/body/div[2]/nav/div/div/ul[1]/li[3]/ul/li[1]/a"));
		TNTExpress.click();
		Thread.sleep(6000);
		
		Actions actions2 = new Actions(webDriver);
    	WebElement menuOption2 = webDriver.findElement(By.xpath("/html/body/div[2]/nav/div/div/ul[1]/li[3]/a"));
    	actions2.moveToElement(menuOption2).perform();
    	Thread.sleep(2000);
    	
		
		String handle1 = webDriver.getWindowHandle();
		webDriver.findElement(By.xpath("/html/body/div[2]/nav/div/div/ul[1]/li[3]/ul/li[2]/a")).click();
		
		for(String handle: webDriver.getWindowHandles()) {
			if (!handle.equals(handle1)) {
				webDriver.switchTo().window(handle);
				break;
			}
		}
		
		Thread.sleep(5000);
		webDriver.close();
		webDriver.switchTo().window(handle1);
		Thread.sleep(2000);
		
		Actions actions3 = new Actions(webDriver);
    	WebElement menuOption3 = webDriver.findElement(By.xpath("/html/body/div[2]/nav/div/div/ul[1]/li[3]/a"));
    	actions3.moveToElement(menuOption3).perform();
    	Thread.sleep(2000);
    	
    	webDriver.findElement(By.xpath("/html/body/div[2]/nav/div/div/ul[1]/li[3]/ul/li[3]/a")).click();
		
		for(String handle2: webDriver.getWindowHandles()) {
			if (!handle2.equals(handle1)) {
				webDriver.switchTo().window(handle2);
				break;
			}
		}
		Thread.sleep(5000);
		webDriver.close();
		webDriver.switchTo().window(handle1);
		Thread.sleep(2000);
    	
}
	@Test
	void FedexTest() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement zatvoriNapomenu = webDriver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div[1]/div/button/div"));
		zatvoriNapomenu.click();
		Thread.sleep(3000);
		
		Actions actions = new Actions(webDriver);
    	WebElement menuOption = webDriver.findElement(By.xpath("/html/body/div[2]/nav/div/div/ul[1]/li[4]/a"));
    	actions.moveToElement(menuOption).perform();
    	Thread.sleep(2000);
    	
    	WebElement FEDex = webDriver.findElement(By.xpath("/html/body/div[2]/nav/div/div/ul[1]/li[4]/ul/li[1]/a"));
		FEDex.click();
		Thread.sleep(6000);
		
		Actions actions2 = new Actions(webDriver);
    	WebElement menuOption2 = webDriver.findElement(By.xpath("/html/body/div[2]/nav/div/div/ul[1]/li[4]/a"));
    	actions2.moveToElement(menuOption2).perform();
    	Thread.sleep(2000);
    	
		
		String handle1 = webDriver.getWindowHandle();
		webDriver.findElement(By.xpath("/html/body/div[2]/nav/div/div/ul[1]/li[4]/ul/li[2]/a")).click();
		
		for(String handle: webDriver.getWindowHandles()) {
			if (!handle.equals(handle1)) {
				webDriver.switchTo().window(handle);
				break;
			}
		}
		
		Thread.sleep(5000);
		webDriver.close();
		webDriver.switchTo().window(handle1);
		Thread.sleep(2000);
		
		Actions actions3 = new Actions(webDriver);
    	WebElement menuOption3 = webDriver.findElement(By.xpath("/html/body/div[2]/nav/div/div/ul[1]/li[4]/a"));
    	actions3.moveToElement(menuOption3).perform();
    	Thread.sleep(2000);
    	
    	webDriver.findElement(By.xpath("/html/body/div[2]/nav/div/div/ul[1]/li[4]/ul/li[3]/a")).click();
		
		for(String handle2: webDriver.getWindowHandles()) {
			if (!handle2.equals(handle1)) {
				webDriver.switchTo().window(handle2);
				break;
			}
		}
		Thread.sleep(5000);
		webDriver.close();
		webDriver.switchTo().window(handle1);
		Thread.sleep(2000);
    	
}
	
	@Test
	void dodatakNaGorivoTest() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement zatvoriNapomenu = webDriver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div[1]/div/button/div"));
		zatvoriNapomenu.click();
		Thread.sleep(3000);
		
		WebElement dodatak1 = webDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div[2]/div[2]/div/div/p[1]/a"));
		dodatak1.click();
		Thread.sleep(3000);
		
		WebElement zatvori = webDriver.findElement(By.xpath("/html/body/div[2]/div[13]/div/div/div[3]/button"));
		zatvori.click();
		Thread.sleep(3000);
		
		String handle1 = webDriver.getWindowHandle();
		webDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div[2]/div[2]/div/div/p[2]/a")).click();
		
		for(String handle: webDriver.getWindowHandles()) {
			if (!handle.equals(handle1)) {
				webDriver.switchTo().window(handle);
				break;
			}
		}
		
		Thread.sleep(5000);
		webDriver.close();
		webDriver.switchTo().window(handle1);
		Thread.sleep(2000);
		
		webDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div[2]/div[2]/div/div/p[3]/a")).click();
		
		for(String handle: webDriver.getWindowHandles()) {
			if (!handle.equals(handle1)) {
				webDriver.switchTo().window(handle);
				break;
			}
		}
		
		Thread.sleep(5000);
		webDriver.close();
		webDriver.switchTo().window(handle1);
		Thread.sleep(2000);
		
		



}}