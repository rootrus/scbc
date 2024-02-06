package p040o;

/* renamed from: o.ActivityRecognitionClient */
public final class ActivityRecognitionClient {
    public final String MediaBrowserCompat$ItemReceiver;
    public final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityRecognitionClient)) {
            return false;
        }
        ActivityRecognitionClient activityRecognitionClient = (ActivityRecognitionClient) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) activityRecognitionClient.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) activityRecognitionClient.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LoanOfferConsent(type=");
        sb.append(this.read);
        sb.append(", subType=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public ActivityRecognitionClient(String str, String str2) {
        this.read = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
    }
}
