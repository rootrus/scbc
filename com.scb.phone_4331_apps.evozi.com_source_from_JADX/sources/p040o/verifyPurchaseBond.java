package p040o;

/* renamed from: o.verifyPurchaseBond */
public enum verifyPurchaseBond {
    PENDING_SUBSCRIBE("PENDING_SUBSCRIBE"),
    SUBSCRIBE("SUBSCRIBE"),
    REJECT("REJECT"),
    DEFAULT("DEFAULT");
    
    public String status;

    private verifyPurchaseBond(String str) {
        this.status = str;
    }

    public static verifyPurchaseBond IconCompatParcelizer(String str) {
        for (verifyPurchaseBond verifypurchasebond : values()) {
            if (verifypurchasebond.status.equalsIgnoreCase(str)) {
                return verifypurchasebond;
            }
        }
        return DEFAULT;
    }
}
