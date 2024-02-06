package p040o;

/* renamed from: o.RpLivenessCheckActivity */
public final class RpLivenessCheckActivity {
    public final NdidIdpShareSuccessActivity MediaBrowserCompat$ItemReceiver;

    public RpLivenessCheckActivity(NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity) {
        onGetStartedClick.write((Object) ndidIdpShareSuccessActivity, "ref");
        this.MediaBrowserCompat$ItemReceiver = ndidIdpShareSuccessActivity;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Removed[");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(']');
        return sb.toString();
    }
}
