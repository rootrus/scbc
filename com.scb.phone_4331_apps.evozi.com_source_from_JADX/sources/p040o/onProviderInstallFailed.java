package p040o;

import java.util.regex.Pattern;

/* renamed from: o.onProviderInstallFailed */
public final class onProviderInstallFailed {
    private final Pattern IconCompatParcelizer = Pattern.compile("^([0][0-9]{9})$");

    public final boolean read(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return this.IconCompatParcelizer.matcher(str).matches();
    }
}
