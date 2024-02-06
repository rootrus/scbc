package p040o;

import org.bouncycastle.i18n.ErrorBundle;

/* renamed from: o.LocationRequest */
public final class LocationRequest implements Comparable<LocationRequest> {
    public final int IconCompatParcelizer;
    public final int read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        return this.read == locationRequest.read && this.IconCompatParcelizer == locationRequest.IconCompatParcelizer && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) locationRequest.write);
    }

    public final int hashCode() {
        int i = this.read;
        int i2 = this.IconCompatParcelizer;
        String str = this.write;
        return (((i * 31) + i2) * 31) + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvestmentRiskAssessmentQuestionSummary(section=");
        sb.append(this.read);
        sb.append(", questionNumber=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", summary=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public LocationRequest(int i, int i2, String str) {
        onGetStartedClick.write((Object) str, ErrorBundle.SUMMARY_ENTRY);
        this.read = i;
        this.IconCompatParcelizer = i2;
        this.write = str;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        LocationRequest locationRequest = (LocationRequest) obj;
        onGetStartedClick.write((Object) locationRequest, "other");
        return onGetStartedClick.IconCompatParcelizer(this.IconCompatParcelizer, locationRequest.IconCompatParcelizer);
    }
}
