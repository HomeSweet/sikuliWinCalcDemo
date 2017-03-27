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


    BaseCalcActions(Screen builder) {
        this.builder = builder;
    }
}
