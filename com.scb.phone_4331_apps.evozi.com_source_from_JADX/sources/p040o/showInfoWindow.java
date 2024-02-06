package p040o;

import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.showInfoWindow */
public final class showInfoWindow {
    public final String MediaBrowserCompat$ItemReceiver;
    public final OffsetDateTime write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof showInfoWindow)) {
            return false;
        }
        showInfoWindow showinfowindow = (showInfoWindow) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) showinfowindow.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) showinfowindow.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        OffsetDateTime offsetDateTime = this.write;
        int i = 0;
        int hashCode = offsetDateTime != null ? offsetDateTime.hashCode() : 0;
        String str = this.MediaBrowserCompat$ItemReceiver;
        if (str != null) {
            i = str.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DirectDebitConfirmRegistration(transactionDateTime=");
        sb.append(this.write);
        sb.append(", transactionId=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public showInfoWindow(OffsetDateTime offsetDateTime, String str) {
        this.write = offsetDateTime;
        this.MediaBrowserCompat$ItemReceiver = str;
    }
}
