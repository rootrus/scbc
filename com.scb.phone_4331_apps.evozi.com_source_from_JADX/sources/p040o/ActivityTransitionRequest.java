package p040o;

/* renamed from: o.ActivityTransitionRequest */
public final class ActivityTransitionRequest {
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransitionRequest)) {
            return false;
        }
        ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) activityTransitionRequest.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) activityTransitionRequest.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlInterestRate(duration=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", rate=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public ActivityTransitionRequest(String str, String str2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.write = str2;
    }
}
