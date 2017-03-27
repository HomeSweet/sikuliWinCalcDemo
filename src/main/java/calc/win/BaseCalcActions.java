package calc.win;

import calc.win.config.BaseCalcConfig;
import org.sikuli.api.Screen;
import org.sikuli.script.Pattern;


/**
 * Created by yegorm on 27.03.2017.
 */
public class BaseCalcActions {
    private Screen builder;

    /*DIGITS BUTTONS*/
    private Pattern zeroButton = new Pattern(BaseCalcConfig.ZERO_BUTTON);
    private Pattern oneButton = new Pattern(BaseCalcConfig.ONE_BUTTON);
    private Pattern twoButton = new Pattern(BaseCalcConfig.TWO_BUTTON);
    private Pattern threeButton = new Pattern(BaseCalcConfig.THREE_BUTTON);
    private Pattern forthButton = new Pattern(BaseCalcConfig.FORTH_BUTTON);
    private Pattern fiveButton = new Pattern(BaseCalcConfig.FIVE_BUTTON);
    private Pattern sixButton = new Pattern(BaseCalcConfig.SIX_BUTTON);
    private Pattern sevenButton = new Pattern(BaseCalcConfig.SEVEN_BUTTON);
    private Pattern eightButton = new Pattern(BaseCalcConfig.EIGHT_BUTTON);
    private Pattern nineButton = new Pattern(BaseCalcConfig.NINE_BUTTON);
    /*MEMORY BUTTONS*/
    private Pattern
    private Pattern
    private Pattern
    private Pattern
    private Pattern
    private Pattern
    private Pattern
    private Pattern
    private Pattern
    private Pattern
   /*MANIPULATION BUTTON*/
    private Pattern
    private Pattern
    private Pattern
    private Pattern
    private Pattern
    private Pattern
    private Pattern
    private Pattern
    private Pattern
    private Pattern
   /*OPERATIONS BUTTON*/
    private Pattern
    private Pattern
    private Pattern
    private Pattern
    private Pattern
    private Pattern
    private Pattern
    private Pattern
    private Pattern

    private Pattern

    BaseCalcActions(Screen builder) {
        this.builder = builder;
    }
}
