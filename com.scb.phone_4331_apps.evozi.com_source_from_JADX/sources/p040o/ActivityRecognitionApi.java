package p040o;

/* renamed from: o.ActivityRecognitionApi */
public final class ActivityRecognitionApi {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityRecognitionApi)) {
            return false;
        }
        ActivityRecognitionApi activityRecognitionApi = (ActivityRecognitionApi) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) activityRecognitionApi.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) activityRecognitionApi.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlUploadedDocument(documentId=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", imageName=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public ActivityRecognitionApi(String str, String str2) {
        onGetStartedClick.write((Object) str, "documentId");
        onGetStartedClick.write((Object) str2, "imageName");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.IconCompatParcelizer = str2;
    }
}
