package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass
implements ITestListener {

    @Override
    public void onTestStart(
            ITestResult result) {

        System.out.println(
                result.getName()
                + " Started");
    }

    @Override
    public void onTestSuccess(
            ITestResult result) {

        System.out.println(
                result.getName()
                + " Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {

        System.out.println(
            result.getName() + " Failed");

        System.out.println(
            result.getThrowable());
    }

    @Override
    public void onTestSkipped(
            ITestResult result) {

        System.out.println(
                result.getName()
                + " Skipped");
    }
}