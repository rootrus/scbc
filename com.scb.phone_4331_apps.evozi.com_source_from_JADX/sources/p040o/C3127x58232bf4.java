package p040o;

/* renamed from: o.BinaryImagesConverter$MediaBrowserCompat$CustomActionResultReceiver */
public final class C3127x58232bf4 {
    private C3127x58232bf4() {
    }

    public /* synthetic */ C3127x58232bf4(byte b) {
        this();
    }

    public static NativeFileUtils MediaBrowserCompat$ItemReceiver(String str) {
        onGetStartedClick.write((Object) str, "type");
        String upperCase = str.toUpperCase();
        onGetStartedClick.IconCompatParcelizer((Object) upperCase, "(this as java.lang.String).toUpperCase()");
        int hashCode = upperCase.hashCode();
        if (hashCode != -1891801960) {
            if (hashCode != 2571565) {
                if (hashCode == 1782537993 && upperCase.equals("MINI_QR")) {
                    return NativeFileUtils.MINI_QR;
                }
            } else if (upperCase.equals("TEXT")) {
                return NativeFileUtils.TEXT;
            }
        } else if (upperCase.equals("TEXT_TWO_COLUMNS")) {
            return NativeFileUtils.TEXT_TWO_COLUMNS;
        }
        return NativeFileUtils.UNKNOWN;
    }
}
