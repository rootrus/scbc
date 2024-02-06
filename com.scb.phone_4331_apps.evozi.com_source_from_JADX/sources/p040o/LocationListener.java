package p040o;

import java.util.List;

/* renamed from: o.LocationListener */
public final class LocationListener implements Comparable<LocationListener> {
    public final int IconCompatParcelizer;
    public final List<getFastestInterval> MediaBrowserCompat$CustomActionResultReceiver;
    public final int MediaBrowserCompat$ItemReceiver;
    public final boolean read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationListener)) {
            return false;
        }
        LocationListener locationListener = (LocationListener) obj;
        return this.IconCompatParcelizer == locationListener.IconCompatParcelizer && this.MediaBrowserCompat$ItemReceiver == locationListener.MediaBrowserCompat$ItemReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) locationListener.write) && this.read == locationListener.read && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) locationListener.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        int i = this.IconCompatParcelizer;
        int i2 = this.MediaBrowserCompat$ItemReceiver;
        String str = this.write;
        int i3 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        boolean z = this.read;
        if (z) {
            z = true;
        }
        List<getFastestInterval> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (list != null) {
            i3 = list.hashCode();
        }
        return (((((((i * 31) + i2) * 31) + hashCode) * 31) + (z ? 1 : 0)) * 31) + i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvestmentRiskAssessmentQuestion(section=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", questionNumber=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", question=");
        sb.append(this.write);
        sb.append(", isDisplay=");
        sb.append(this.read);
        sb.append(", answers=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public LocationListener(int i, int i2, String str, boolean z, List<getFastestInterval> list) {
        onGetStartedClick.write((Object) str, "question");
        onGetStartedClick.write((Object) list, "answers");
        this.IconCompatParcelizer = i;
        this.MediaBrowserCompat$ItemReceiver = i2;
        this.write = str;
        this.read = z;
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        LocationListener locationListener = (LocationListener) obj;
        onGetStartedClick.write((Object) locationListener, "other");
        return onGetStartedClick.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver, locationListener.MediaBrowserCompat$ItemReceiver);
    }
}
