package p040o;

/* renamed from: o.isFlat */
public enum isFlat {
    CREDIT("C"),
    DEBIT("D");
    
    public String type;

    private isFlat(String str) {
        this.type = str;
    }

    public static isFlat read(String str) {
        if (CREDIT.type.equals(str)) {
            return CREDIT;
        }
        return DEBIT;
    }
}
