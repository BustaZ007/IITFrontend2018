package com.example.tests;

import com.codeborne.selenide.testng.annotations.Report;
import com.example.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

@Test
@Report
public class GoogleTest extends BaseTest {
    @Test
    public void searchSelenideInGoogle() {
        open("https://google.com/ncr");
        $(By.name("q")).val("selenide").pressEnter();
        $$("#search .r").shouldHave(sizeGreaterThan(1));
        $("#search .r").shouldHave(text("selenide"));
    }
}
