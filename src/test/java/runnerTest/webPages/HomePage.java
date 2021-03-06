package runnerTest.webPages;

import Utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.*;

public class HomePage extends ElementUtil {
    private By inputBox= By.xpath("//form[@id='searchForm']/input[@type='text']");
    private By searchButton = By.className("searchButton");
    private By minTop = By.xpath("//span[@class='low-temp-text']");
    private By maxTop = By.xpath("//span[@class='high-temp-text']");
    private By minTemp=By.xpath("//a[@data-day='0']//span[@class='minTemp']");
    private By maxTemp=By.xpath("//a[@data-day='0']//span[@class='maxTemp']");
    private By hours= By.xpath("//div[@class='scroll-container']//span[@class='hour']");
    private By plusBtn= By.xpath("(//span[@class='open'])");//[1]
    private By temp= By.xpath("//div[@class='dayDetails revealed']//span[contains(@style,'opacity')]");

    public String getTitle() throws InterruptedException {
        Thread.sleep(1000);
        return BasePage.get().getTitle();
    }

    public void selectCity() throws InterruptedException {
        clear(inputBox);
        Thread.sleep(2000);
        sendValue(inputBox, "Fillmore St, San Francisco, CA");
        Thread.sleep(2000);
        clickOn(searchButton);
        Thread.sleep(2000);

    }
    public List<Integer> getTimeline(){
        List<WebElement>hour= webElements(hours);
        List<Integer>time=new ArrayList<Integer>();
        for(WebElement e:hour){
            String t= e.getText();
            if(!t.isEmpty()){
                int th=Integer.parseInt(t.replaceAll("[a-z]", ""));
                time.add(th);}
        }
        return time;
    }

    public boolean verifyHourFormat(String zoneId){
        ZoneId timezone = ZoneId.of(zoneId);
        int hour  = LocalTime.now(timezone).getHour();
        List<Integer> lists=new ArrayList<>();
        for(int i=0; i<getTimeline().size(); i++){
            if(hour<11) hour+=2;
            else  hour-=10;
            lists.add(hour);
        }

        return lists.equals(getTimeline());
    }

    public void expandToday(){
        scrollByPixel("0", "1000");
        clickElementByJS(plusBtn);
    }

    public List<Integer> getTimeLineTemps(){
        List<WebElement> temps= webElements(temp);
        List<Integer> tempInt = new ArrayList<>();
        for(WebElement e: temps){
            int t= Integer.parseInt(e.getText().replaceAll("[^0-9]",""));
            tempInt.add(t);
        }
        return tempInt;
    }

    public int findMax(List<Integer> list) {
        int max=list.get(0);
        for(int i: list)
            if(i>max){
                max=i;
            }
        return max;
    }

    public int findMin(List<Integer> list) {
        int min=list.get(0);
        for(int i: list)
            if(i<min){
                min=i;
            }
        return min;
    }


    public boolean verifyMinTemp(){
        String temp1= getTextFromElement(minTop);
        String temp2= getTextFromElement(minTemp);
        return temp1.equals(temp2);
    }
    public boolean verifyMaxTemp(){
        String temp1= getTextFromElement(maxTop);
        String temp2= getTextFromElement(maxTemp);
        return temp1.equals(temp2);
    }


}