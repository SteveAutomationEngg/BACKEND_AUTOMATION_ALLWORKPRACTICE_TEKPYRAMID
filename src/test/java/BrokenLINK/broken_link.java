package BrokenLINK;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class broken_link {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.amazon.in/");
	
		List<WebElement> allLink =driver.findElements(By.tagName("a"));
		
		System.out.println(allLink);
		
		System.out.println("all links available are:" +allLink.size());
	
	List<String> urlList = new ArrayList<String>(); //empty list created
	
	int count = 0;
	for(WebElement link : allLink) {
		
		String linkUrl= link.getAttribute("href");
		
		urlList.add(linkUrl);
		
		try {
			URL url = new URL(linkUrl);	
			HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
			httpURLConnection.setConnectTimeout(5000);
			httpURLConnection.connect();
			
			if (httpURLConnection.getResponseCode() >=400) {
				System.out.println(linkUrl+"-------->"+httpURLConnection.getResponseMessage()+"This link is broken");
				count++;
			}else {
				System.out.println(linkUrl+"------->"+httpURLConnection.getResponseMessage());
			}
		} catch (Exception e) {
			
		}
	
	}
	System.out.println("total broken links are:  "+count);
	
		
	}
	
}
