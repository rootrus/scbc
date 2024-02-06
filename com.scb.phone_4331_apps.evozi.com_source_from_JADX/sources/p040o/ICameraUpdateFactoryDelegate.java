package p040o;

/* renamed from: o.ICameraUpdateFactoryDelegate */
public enum ICameraUpdateFactoryDelegate {
    TYPE_DENOMINATION("TP"),
    TYPE_RANGE("RF");
    
    private String value;

    private ICameraUpdateFactoryDelegate(String str) {
        this.value = str;
    }

    public static ICameraUpdateFactoryDelegate IconCompatParcelizer(String str) {
        if (TYPE_DENOMINATION.value.equals(str)) {
            return TYPE_DENOMINATION;
        }
        return TYPE_RANGE;
    }
}
