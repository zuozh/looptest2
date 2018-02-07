package com.commens.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

import java.util.List;

/**
 * Created by YUY on 2018/1/29.
 */
public class ChooseNodePage {

    WebDriver driver;

    public ChooseNodePage(WebDriver driver) {
        this.driver = driver;
    }

    // 业务节点
    @FindAll({@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[2]/div[1]/label")})
    List<WebElement> nodes;

    // 确定按钮
    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[3]/div/button[2]/span")
    WebElement confirmButton;

    // 定义动作

    // 选择
    public void clickOnNode(int num) {
        nodes.get(num-1).click();
    }

    // 确定
    public void clickOnConfirmButton() {
        confirmButton.click();
    }

}
