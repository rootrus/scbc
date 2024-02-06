package p040o;

/* renamed from: o.FragmentBuilder_BindHmlLandingFragment$MediaBrowserCompat$CustomActionResultReceiver */
public enum C6552xadbb583e {
    POSITIVE("positive"),
    NEGATIVE("negative"),
    NEUTRAL("neutral"),
    GENERIC("generic");
    
    String textValue;

    private C6552xadbb583e(String str) {
        this.textValue = str;
    }

    public final String toString() {
        return this.textValue;
    }

    public static C6552xadbb583e read(String str) {
        if (POSITIVE.toString().equals(str)) {
            return POSITIVE;
        }
        if (NEGATIVE.toString().equals(str)) {
            return NEGATIVE;
        }
        if (NEUTRAL.toString().equals(str)) {
            return NEUTRAL;
        }
        return GENERIC;
    }
}
