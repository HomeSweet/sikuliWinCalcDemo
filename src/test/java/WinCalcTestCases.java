import calc.win.BaseCalcActions;
import calc.win.expected.results.ExpectedResultsHandler;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by yegorm on 27.03.2017.
 */
public class WinCalcTestCases {
    Screen builder = new Screen();

    @Test
    public void verifyAdd() throws FindFailed {

        BaseCalcActions calc = new BaseCalcActions(builder);
        try {
            calc.pressOne();
            calc.pressPlus();
            calc.pressTwo();
            calc.pressResult();
            ExpectedResultsHandler expectedResultsHandler = new ExpectedResultsHandler(builder);
            Assert.assertTrue(expectedResultsHandler.onePlusThreeResult());
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
            Assert.assertTrue(false);
        }
    }
}
