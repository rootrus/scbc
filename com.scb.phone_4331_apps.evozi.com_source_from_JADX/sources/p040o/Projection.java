package p040o;

/* renamed from: o.Projection */
public enum Projection {
    STOCK_TYPE("STOCK"),
    BONDS_TYPE("BONDS"),
    FUNDS_TYPE("FUNDS"),
    TFEX_TYPE("TFEX"),
    OFFSHORE_STOCK("OFFSHORE_STOCK"),
    OTHER_TYPE("OTHER");
    
    public String type;

    private Projection(String str) {
        this.type = str;
    }

    public static Projection MediaBrowserCompat$CustomActionResultReceiver(String str) {
        if (STOCK_TYPE.type.equalsIgnoreCase(str)) {
            return STOCK_TYPE;
        }
        if (BONDS_TYPE.type.equalsIgnoreCase(str)) {
            return BONDS_TYPE;
        }
        if (FUNDS_TYPE.type.equalsIgnoreCase(str)) {
            return FUNDS_TYPE;
        }
        if (TFEX_TYPE.type.equalsIgnoreCase(str)) {
            return TFEX_TYPE;
        }
        if (OFFSHORE_STOCK.type.equalsIgnoreCase(str)) {
            return OFFSHORE_STOCK;
        }
        return OTHER_TYPE;
    }
}
