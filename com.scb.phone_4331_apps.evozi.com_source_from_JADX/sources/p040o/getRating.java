package p040o;

/* renamed from: o.getRating */
public final class getRating {
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getRating)) {
            return false;
        }
        getRating getrating = (getRating) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getrating.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getrating.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getrating.read);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SuitabilityAssessmentResult(name=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", totalScore=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", investmentType=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public getRating(String str, String str2, String str3) {
        onGetStartedClick.write((Object) str, "name");
        onGetStartedClick.write((Object) str2, "totalScore");
        onGetStartedClick.write((Object) str3, "investmentType");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.read = str3;
    }
}