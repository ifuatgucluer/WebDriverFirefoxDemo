package org.example;

public class FirefoxTest {
        public static void main(String[] args) {
            // GeckoDriver'ın yolunu belirtin
            System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");

            // Firefox tarayıcısını başlatın
            WebDriver driver = new WebDriver();

            // Bir web sitesine gidin
            driver.get("https://www.example.com");

            // Sayfa başlığını yazdırın
            System.out.println("Page title is: " + driver.getTitle());

            // Tarayıcıyı kapatın
            driver.quit();
        }
    }

