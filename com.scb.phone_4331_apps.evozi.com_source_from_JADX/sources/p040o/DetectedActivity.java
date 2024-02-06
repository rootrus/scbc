package p040o;

import java.util.List;

/* renamed from: o.DetectedActivity */
public final class DetectedActivity {
    public final List<FusedLocationProviderApi> IconCompatParcelizer;
    public final boolean read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DetectedActivity)) {
            return false;
        }
        DetectedActivity detectedActivity = (DetectedActivity) obj;
        return this.read == detectedActivity.read && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) detectedActivity.IconCompatParcelizer);
    }

    public final int hashCode() {
        boolean z = this.read;
        if (z) {
            z = true;
        }
        List<FusedLocationProviderApi> list = this.IconCompatParcelizer;
        return ((z ? 1 : 0) * true) + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlOperatingAccount(hasSCBAsMOA=");
        sb.append(this.read);
        sb.append(", depositList=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public DetectedActivity(boolean z, List<FusedLocationProviderApi> list) {
        this.read = z;
        this.IconCompatParcelizer = list;
    }
}
