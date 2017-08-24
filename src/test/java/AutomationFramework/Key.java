package AutomationFramework;


public enum Key {
    BACK_BUTTON(4),
    HOME_BUTTON(3),
    APP_SWITCH_BUTTON(187),
    ENTER_BUTTON(66),
    ;


    private int value;

    Key(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
