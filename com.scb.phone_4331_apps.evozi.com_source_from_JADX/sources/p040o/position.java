package p040o;

/* renamed from: o.position */
public enum position {
    NORMALL_BILLER(""),
    ONUS_BILLER("S"),
    OFFUS_BILLER("O");
    
    public String type;

    private position(String str) {
        this.type = str;
    }

    public static position IconCompatParcelizer(String str) {
        if (NORMALL_BILLER.type.equalsIgnoreCase(str)) {
            return NORMALL_BILLER;
        }
        if (ONUS_BILLER.type.equalsIgnoreCase(str)) {
            return ONUS_BILLER;
        }
        if (OFFUS_BILLER.type.equalsIgnoreCase(str)) {
            return OFFUS_BILLER;
        }
        return NORMALL_BILLER;
    }
}
