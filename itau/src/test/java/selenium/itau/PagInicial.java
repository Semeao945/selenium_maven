package selenium.itau;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

public class PagInicial {
	
	static String url = "https://www.itau.com.br/";
	 static WebDriver driver;
	

	public static void main(String[] args) {
		//acessandoPag();
		acessandoServicos();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public static void acessandoPag() {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/HP/chromedriver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.close();		
	}
	
	public static void acessandoServicos() {
		
		String agencia = "0866";
		String conta = "06082-5";
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/HP/chromedriver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to(url);
		
		//driver.findElement(By.id("#btOk")).click();
		driver.manage().window().maximize();
		
		driver.findElement(By.className("dropdown-toggle")).click();
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[1]/div/div[1]/div/app-commom-links[1]/div/section/ul/li[1]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"animate-00\"]/ul/li[1]/div/div/a/div/div/i")).click();
		//driver.findElement(By.className("shared-button-container")).click();
		driver.navigate().back();
		
		driver.findElement(By.id("agencia")).sendKeys(agencia);
		driver.findElement(By.id("conta")).sendKeys(conta);

			
		
		driver.close();
	}
		

}
