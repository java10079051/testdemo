package testcase;

import io.qameta.allure.*;
import org.testng.annotations.Test;

@Feature("前线突击测试")
public class TestAllure {

    @Epic("用户管理")
    @Story("添加用户")
    @Description("lalala主要测试四种券发送")
    @Step("step测试步骤....")
    @Severity(SeverityLevel.CRITICAL)
    @Test(description = "成功打印aaaaa")
    public void testAAA(){
        System.out.println("aaaaaaa");
       // Assert.assertTrue(false);
    }

    @Epic("用户管理")
    @Story("添加用户-fail")
    @Description("lalala主要测试四种券发送")
    @Step("step测试步骤....")
    @Severity(SeverityLevel.CRITICAL)
    @Test(description = "测试报告")
    public void testAAAFail(){
        System.out.println("bbb");
       // Assert.assertTrue(false);

    }
}
