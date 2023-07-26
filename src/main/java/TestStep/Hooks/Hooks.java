package TestStep.Hooks;

import BaseClass.BaseSetUp;
import BaseClass.BaseStep;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.io.IOException;

public class Hooks extends BaseStep {

    @Before
    public void setUp() throws IOException {
        BaseSetUp.getDriver();
        BaseSetUp.openWebsite(BaseSetUp.getUrl());
        BaseSetUp.maximizeWebsite();
    }

    @After
    public void tearDown() {
        try {
            Thread.sleep(5000);
            BaseSetUp.quitWebsite();
        } catch (Exception ignored) {
        }

    }

}
