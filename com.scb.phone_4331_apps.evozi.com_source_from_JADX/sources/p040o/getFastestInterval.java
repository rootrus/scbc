package p040o;

/* renamed from: o.getFastestInterval */
public final class getFastestInterval {
    public final boolean MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getFastestInterval)) {
            return false;
        }
        getFastestInterval getfastestinterval = (getFastestInterval) obj;
        return this.MediaBrowserCompat$CustomActionResultReceiver == getfastestinterval.MediaBrowserCompat$CustomActionResultReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getfastestinterval.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getfastestinterval.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        boolean z = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (z) {
            z = true;
        }
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((z ? 1 : 0) * true) + hashCode) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvestmentRiskAssessmentAnswer(isSelected=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", choice=");
        sb.append(this.write);
        sb.append(", score=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public getFastestInterval(boolean z, String str, String str2) {
        onGetStartedClick.write((Object) str, "choice");
        onGetStartedClick.write((Object) str2, "score");
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
        this.write = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
    }
}
