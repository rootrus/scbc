package p040o;

import java.math.BigDecimal;

/* renamed from: o.isJailbroken */
public final class isJailbroken extends remainingCapacity {
    public String IconCompatParcelizer;
    public BigDecimal MediaBrowserCompat$CustomActionResultReceiver;

    public static isJailbroken read() {
        return new isJailbroken();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        isJailbroken isjailbroken = (isJailbroken) obj;
        BigDecimal bigDecimal = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (bigDecimal == null ? isjailbroken.MediaBrowserCompat$CustomActionResultReceiver != null : !bigDecimal.equals(isjailbroken.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        String str = this.IconCompatParcelizer;
        String str2 = isjailbroken.IconCompatParcelizer;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        BigDecimal bigDecimal = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = bigDecimal != null ? bigDecimal.hashCode() : 0;
        String str = this.IconCompatParcelizer;
        if (str != null) {
            i = str.hashCode();
        }
        return (hashCode * 31) + i;
    }
}
