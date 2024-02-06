package p040o;

/* renamed from: o.IGoogleMapDelegate */
public enum IGoogleMapDelegate {
    OWN,
    SCB,
    OTHER,
    PROMPTPAY;

    public final String toString() {
        if (this == OTHER) {
            return "orft";
        }
        return name().toLowerCase();
    }
}
