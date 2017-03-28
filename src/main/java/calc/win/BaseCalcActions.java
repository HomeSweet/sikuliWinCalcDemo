package calc.win;

import calc.win.config.BaseCalcConfig;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


/**
 * Created by yegorm on 27.03.2017.
 */
public class BaseCalcActions {
    private Screen builder;

    /*DIGITS BUTTONS*/
    private Pattern zero = new Pattern(BaseCalcConfig.ZERO_BUTTON);
    private Pattern one = new Pattern(BaseCalcConfig.ONE_BUTTON);
    private Pattern two = new Pattern(BaseCalcConfig.TWO_BUTTON);
    private Pattern three = new Pattern(BaseCalcConfig.THREE_BUTTON);
    private Pattern forth = new Pattern(BaseCalcConfig.FORTH_BUTTON);
    private Pattern five = new Pattern(BaseCalcConfig.FIVE_BUTTON);
    private Pattern six = new Pattern(BaseCalcConfig.SIX_BUTTON);
    private Pattern seven = new Pattern(BaseCalcConfig.SEVEN_BUTTON);
    private Pattern eight = new Pattern(BaseCalcConfig.EIGHT_BUTTON);
    private Pattern nine = new Pattern(BaseCalcConfig.NINE_BUTTON);
    /*MEMORY BUTTONS*/
    private Pattern mc = new Pattern(BaseCalcConfig.MC_BUTTON);
    private Pattern mr = new Pattern(BaseCalcConfig.MR_BUTTON);
    private Pattern ms = new Pattern(BaseCalcConfig.MS_BUTTON);
    private Pattern mPlus = new Pattern(BaseCalcConfig.M_PLUS_BUTTON);
    private Pattern mMinus = new Pattern(BaseCalcConfig.M_MINUS_BUTTON);
    /*MANIPULATION BUTTON*/
    private Pattern backspace = new Pattern(BaseCalcConfig.BACKSPACE_BUTTON);
    private Pattern ce = new Pattern(BaseCalcConfig.CE_BUTTON);
    private Pattern c = new Pattern(BaseCalcConfig.C_BUTTON);
    /*OPERATIONS BUTTON*/
    private Pattern changeSign = new Pattern(BaseCalcConfig.CHANGE_SIGN_BUTTON);
    private Pattern sqrtRoot = new Pattern(BaseCalcConfig.SQUARE_ROOT_BUTTON);
    private Pattern module = new Pattern(BaseCalcConfig.MODULE_BUTTON);
    private Pattern divided = new Pattern(BaseCalcConfig.DIVIDED_BUTTON);
    private Pattern plus = new Pattern(BaseCalcConfig.PLUS_BUTTON);
    private Pattern minus = new Pattern(BaseCalcConfig.MINUS_BUTTON);
    private Pattern multiply = new Pattern(BaseCalcConfig.MULTIPLY_BUTTON);
    private Pattern reciprocal = new Pattern(BaseCalcConfig.RECIPROCAL_BUTTON);
    private Pattern result = new Pattern(BaseCalcConfig.RESULT_BUTTON);


    public BaseCalcActions(Screen builder) {
        this.builder = builder;
    }

    public void pressZero() throws FindFailed {
        builder.wait(zero.similar((float) 0.80), 5).click();
    }

    public void pressOne() throws FindFailed {
        builder.wait(one.similar((float) 0.80), 5).click();
    }

    public void pressTwo() throws FindFailed {
        builder.wait(two.similar((float) 0.80), 5).click();
    }

    public void pressThree() throws FindFailed {
        builder.wait(three.similar((float) 0.80), 5).click();
    }

    public void pressForth() throws FindFailed {
        builder.wait(forth.similar((float) 0.80), 5).click();
    }

    public void pressFive() throws FindFailed {
        builder.wait(five.similar((float) 0.80), 5).click();
    }

    public void pressSix() throws FindFailed {
        builder.wait(six.similar((float) 0.80), 5).click();
    }

    public void pressSeven() throws FindFailed {
        builder.wait(seven.similar((float) 0.80), 5).click();
    }

    public void pressEight() throws FindFailed {
        builder.wait(eight.similar((float) 0.80), 5).click();
    }

    public void pressNine() throws FindFailed {
        builder.wait(nine.similar((float) 0.80), 5).click();
    }

    public void pressMinus() throws FindFailed {
        builder.wait(minus.similar((float) 0.80), 5).click();
    }

    public void pressPlus() throws FindFailed {
        builder.wait(plus.similar((float) 0.80), 5).click();
    }

    public void pressDivided() throws FindFailed {
        builder.wait(divided.similar((float) 0.80), 5).click();
    }

    public void pressMultiply() throws FindFailed {
        builder.wait(multiply.similar((float) 0.80), 5).click();
    }

    public void pressModule() throws FindFailed {
        builder.wait(module.similar((float) 0.80), 5).click();
    }

    public void pressBackspace() throws FindFailed {
        builder.wait(backspace.similar((float) 0.80), 5).click();
    }

    public void pressChangeSign() throws FindFailed {
        builder.wait(changeSign.similar((float) 0.80), 5).click();
    }

    public void pressSqrRoot() throws FindFailed {
        builder.wait(sqrtRoot.similar((float) 0.80), 5).click();
    }

    public void pressResult() throws FindFailed {
        builder.wait(result.similar((float) 0.80), 5).click();
    }
}
