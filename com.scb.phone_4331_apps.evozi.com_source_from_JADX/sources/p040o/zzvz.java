package p040o;

/* renamed from: o.zzvz */
public enum zzvz {
    UNPAID("UNPAID"),
    PARTIAL("PARTIAL"),
    PAID("PAID"),
    OVERPAID("OVERPAID"),
    NA("N/A");
    
    private String status;

    private zzvz(String str) {
        this.status = str;
    }

    public static zzvz read(String str) {
        if (UNPAID.status.equals(str)) {
            return UNPAID;
        }
        if (PARTIAL.status.equals(str)) {
            return PARTIAL;
        }
        if (PAID.status.equals(str)) {
            return PAID;
        }
        if (OVERPAID.status.equals(str)) {
            return OVERPAID;
        }
        return NA;
    }
}
