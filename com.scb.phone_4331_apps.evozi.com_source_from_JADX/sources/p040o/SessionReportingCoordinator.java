package p040o;

/* renamed from: o.SessionReportingCoordinator */
public final class SessionReportingCoordinator extends IdManager {
    public final String MediaBrowserCompat$SearchResultReceiver;
    public final String MediaMetadataCompat;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionReportingCoordinator)) {
            return false;
        }
        SessionReportingCoordinator sessionReportingCoordinator = (SessionReportingCoordinator) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) sessionReportingCoordinator.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) sessionReportingCoordinator.MediaMetadataCompat);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$SearchResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaMetadataCompat;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RegistrationAccountDisplay(branchCode=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", productType=");
        sb.append(this.MediaMetadataCompat);
        sb.append(")");
        return sb.toString();
    }

    public SessionReportingCoordinator(String str, String str2) {
        onGetStartedClick.write((Object) str, "branchCode");
        onGetStartedClick.write((Object) str2, "productType");
        this.MediaBrowserCompat$SearchResultReceiver = str;
        this.MediaMetadataCompat = str2;
    }
}
