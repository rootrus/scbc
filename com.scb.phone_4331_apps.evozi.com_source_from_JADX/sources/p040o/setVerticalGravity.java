package p040o;

import java.util.HashSet;
import java.util.Locale;

/* renamed from: o.setVerticalGravity */
final class setVerticalGravity {
    private static final Locale[] read = new Locale[0];
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    final Locale[] MediaBrowserCompat$ItemReceiver;

    static {
        new setVerticalGravity(new Locale[0]);
        new Locale("en", "XA");
        new Locale("ar", "XB");
        String[] split = "en-Latn".split("-", -1);
        if (split.length > 2) {
            new Locale(split[0], split[1], split[2]);
        } else if (split.length > 1) {
            new Locale(split[0], split[1]);
        } else if (split.length == 1) {
            new Locale(split[0]);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Can not parse language tag: [");
            sb.append("en-Latn");
            sb.append("]");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof setVerticalGravity)) {
            return false;
        }
        Locale[] localeArr = ((setVerticalGravity) obj).MediaBrowserCompat$ItemReceiver;
        if (this.MediaBrowserCompat$ItemReceiver.length != localeArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            Locale[] localeArr2 = this.MediaBrowserCompat$ItemReceiver;
            if (i >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
            i++;
        }
    }

    public final int hashCode() {
        int i = 1;
        int i2 = 0;
        while (true) {
            Locale[] localeArr = this.MediaBrowserCompat$ItemReceiver;
            if (i2 >= localeArr.length) {
                return i;
            }
            i = (i * 31) + localeArr[i2].hashCode();
            i2++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.MediaBrowserCompat$ItemReceiver;
            if (i < localeArr.length) {
                sb.append(localeArr[i]);
                if (i < this.MediaBrowserCompat$ItemReceiver.length - 1) {
                    sb.append(',');
                }
                i++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }

    setVerticalGravity(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.MediaBrowserCompat$ItemReceiver = read;
            this.MediaBrowserCompat$CustomActionResultReceiver = "";
            return;
        }
        Locale[] localeArr2 = new Locale[localeArr.length];
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < localeArr.length) {
            Locale locale = localeArr[i];
            if (locale == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("list[");
                sb2.append(i);
                sb2.append("] is null");
                throw new NullPointerException(sb2.toString());
            } else if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                localeArr2[i] = locale2;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(locale2.getLanguage());
                String country = locale2.getCountry();
                if (country != null && !country.isEmpty()) {
                    sb3.append("-");
                    sb3.append(locale2.getCountry());
                }
                sb.append(sb3.toString());
                if (i < localeArr.length - 1) {
                    sb.append(',');
                }
                hashSet.add(locale2);
                i++;
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("list[");
                sb4.append(i);
                sb4.append("] is a repetition");
                throw new IllegalArgumentException(sb4.toString());
            }
        }
        this.MediaBrowserCompat$ItemReceiver = localeArr2;
        this.MediaBrowserCompat$CustomActionResultReceiver = sb.toString();
    }
}
