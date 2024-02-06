package p040o;

/* renamed from: o.newJsonReader */
public class newJsonReader extends writeUInt64NoTag<getGender> {
    @HmlPinActivity
    public newJsonReader(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver(String str, String str2) {
        return !str.isEmpty() && !str2.isEmpty() && str.matches("^[a-zA-Z0-9]*$") && IconCompatParcelizer(str2);
    }

    public static boolean read(String str) {
        return str.matches("^[a-zA-Z0-9]*$");
    }

    public final boolean IconCompatParcelizer(String str) {
        if (!(!(str == null || str.equals("")) && !Character.isWhitespace(str.charAt(0)) && !str.startsWith("-")) || !str.matches("[a-zA-Z- ]{1,5}")) {
            return false;
        }
        return true;
    }
}
