package p040o;

/* renamed from: o.zzvu */
public enum zzvu {
    SPEEDY_LOAN("35"),
    MORTGAGE_LOAN("31"),
    COMMERCIAL_LOAN("30"),
    CAR_LOAN("97"),
    DEFAULT_LOAN("");
    
    private String type;

    private zzvu(String str) {
        this.type = str;
    }

    public static zzvu write(String str) {
        if (SPEEDY_LOAN.type.equalsIgnoreCase(str)) {
            return SPEEDY_LOAN;
        }
        if (MORTGAGE_LOAN.type.equalsIgnoreCase(str)) {
            return MORTGAGE_LOAN;
        }
        if (CAR_LOAN.type.equalsIgnoreCase(str)) {
            return CAR_LOAN;
        }
        if (COMMERCIAL_LOAN.type.equalsIgnoreCase(str)) {
            return COMMERCIAL_LOAN;
        }
        return DEFAULT_LOAN;
    }
}
