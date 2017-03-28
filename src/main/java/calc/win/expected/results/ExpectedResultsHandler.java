package calc.win.expected.results;

import calc.win.config.BaseCalcConfig;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

/**
 * Created by yegorm on 28.03.2017.
 */
public class ExpectedResultsHandler {

    private Screen builder;

    private Pattern onePlusThree = new Pattern(BaseCalcConfig.ONE_PLUS_THREE);

    public ExpectedResultsHandler(Screen builder) {
        this.builder = builder;
    }

    public boolean onePlusThreeResult() throws FindFailed {
        return builder.find(onePlusThree).isValid();
    }
}
