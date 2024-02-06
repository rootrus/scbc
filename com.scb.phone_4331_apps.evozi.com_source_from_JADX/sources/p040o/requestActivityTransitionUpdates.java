package p040o;

/* renamed from: o.requestActivityTransitionUpdates */
public final class requestActivityTransitionUpdates {
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof requestActivityTransitionUpdates)) {
            return false;
        }
        requestActivityTransitionUpdates requestactivitytransitionupdates = (requestActivityTransitionUpdates) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) requestactivitytransitionupdates.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) requestactivitytransitionupdates.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InstallmentFrequency(unit=");
        sb.append(this.write);
        sb.append(", perUnit=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public requestActivityTransitionUpdates(String str, String str2) {
        onGetStartedClick.write((Object) str, "unit");
        onGetStartedClick.write((Object) str2, "perUnit");
        this.write = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
    }
}
