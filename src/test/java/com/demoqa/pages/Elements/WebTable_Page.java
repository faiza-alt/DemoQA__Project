package com.demoqa.pages.Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebTable_Page {

    @FindBy(xpath = "//span[text()='Web Tables']")
    WebElement webTable;


    @FindBy(xpath = "//div[@class='rt-table']/div[2]//div[@class='rt-tr-group']//div")
    List<WebElement> webTableRows;

    @FindBy(xpath = "//div[@class='rt-table']/div[2]/div[2]//div[4]")
    WebElement cellData;

  public   WebTable_Page(WebDriver driver){
      PageFactory.initElements(driver,this);
  }

  public void navigateToTheWebTablePage(){
  webTable.click();
  }

  public void getRows(){
      for (WebElement row: webTableRows){
          System.out.print(row.getSize());
          System.out.print(row.getText());
          break;
      }
  }

  public void gettingCellData(){
      System.out.println("-----------------------------------------------------------------------");
      System.out.println("CELL DATA :      "+cellData.getText());
  }
}
