package p040o;

/* renamed from: o.parseChars */
public enum parseChars {
    ADD_SHORTCUT,
    SCB,
    SHORTCUT,
    GROUP,
    STATIC_SHORTCUT,
    HEADER,
    LOADING,
    EMPTY,
    ERROR,
    STATIC_ERROR,
    STATIC_LOADING,
    PREDICTIVE,
    LEARN_MORE,
    PREDICTIVE_TILE_LOADING,
    SPLASH,
    NTB_SCB_CUSTOMER,
    NTB_PREDICTIVE,
    BANNER;
    
    private static parseChars[] allValues;

    static {
        allValues = values();
    }

    public static parseChars read(int i) {
        return allValues[i];
    }
}
