package p040o;

/* renamed from: o.zzwc$MediaBrowserCompat$CustomActionResultReceiver */
public final class zzwc$MediaBrowserCompat$CustomActionResultReceiver {
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzwc$MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        zzwc$MediaBrowserCompat$CustomActionResultReceiver zzwc_mediabrowsercompat_customactionresultreceiver = (zzwc$MediaBrowserCompat$CustomActionResultReceiver) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zzwc_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zzwc_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
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
        sb.append("Upload(documentId=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", imageName=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public zzwc$MediaBrowserCompat$CustomActionResultReceiver(String str, String str2) {
        onGetStartedClick.write((Object) str, "documentId");
        onGetStartedClick.write((Object) str2, "imageName");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
    }
}
