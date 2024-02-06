package p040o;

import java.util.List;

/* renamed from: o.extractLocationAvailability */
public final class extractLocationAvailability {
    public final List<LocationListener> IconCompatParcelizer;
    public final List<LocationRequest> MediaBrowserCompat$ItemReceiver;
    public final int write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof extractLocationAvailability)) {
            return false;
        }
        extractLocationAvailability extractlocationavailability = (extractLocationAvailability) obj;
        return this.write == extractlocationavailability.write && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) extractlocationavailability.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) extractlocationavailability.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        int i = this.write;
        List<LocationListener> list = this.IconCompatParcelizer;
        int i2 = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        List<LocationRequest> list2 = this.MediaBrowserCompat$ItemReceiver;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return (((i * 31) + hashCode) * 31) + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvestmentRiskAssessment(preselect=");
        sb.append(this.write);
        sb.append(", assessments=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", summaries=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public extractLocationAvailability(int i, List<LocationListener> list, List<LocationRequest> list2) {
        onGetStartedClick.write((Object) list, "assessments");
        onGetStartedClick.write((Object) list2, "summaries");
        this.write = i;
        this.IconCompatParcelizer = list;
        this.MediaBrowserCompat$ItemReceiver = list2;
    }
}
