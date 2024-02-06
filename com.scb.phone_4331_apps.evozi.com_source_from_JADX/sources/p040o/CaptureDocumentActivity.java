package p040o;

/* renamed from: o.CaptureDocumentActivity */
public final class CaptureDocumentActivity<S> {
    public final Object MediaBrowserCompat$ItemReceiver;
    public final FundActionsSuccessActivity<S> read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CaptureDocumentActivity)) {
            return false;
        }
        CaptureDocumentActivity captureDocumentActivity = (CaptureDocumentActivity) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) captureDocumentActivity.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, captureDocumentActivity.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        FundActionsSuccessActivity<S> fundActionsSuccessActivity = this.read;
        int i = 0;
        int hashCode = fundActionsSuccessActivity != null ? fundActionsSuccessActivity.hashCode() : 0;
        Object obj = this.MediaBrowserCompat$ItemReceiver;
        if (obj != null) {
            i = obj.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EpicInput(getState=");
        sb.append(this.read);
        sb.append(", action=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public CaptureDocumentActivity(FundActionsSuccessActivity<? extends S> fundActionsSuccessActivity, Object obj) {
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "getState");
        onGetStartedClick.write(obj, "action");
        this.read = fundActionsSuccessActivity;
        this.MediaBrowserCompat$ItemReceiver = obj;
    }
}
