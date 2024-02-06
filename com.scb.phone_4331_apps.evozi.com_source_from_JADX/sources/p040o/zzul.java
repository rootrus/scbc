package p040o;

/* renamed from: o.zzul */
public enum zzul {
    ALL("ALL"),
    PAID("PAID"),
    RETURN("RETURN"),
    PENDING("PENDING"),
    INSUFFUND("INSUFFUND"),
    DEFAULT("DEFAULT");
    
    public String status;

    private zzul(String str) {
        this.status = str;
    }

    public static zzul IconCompatParcelizer(String str) {
        for (zzul zzul : values()) {
            if (zzul.status.equalsIgnoreCase(str)) {
                return zzul;
            }
        }
        return DEFAULT;
    }
}
