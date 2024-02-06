package p040o;

import java.util.List;
import p040o.setTvRemark;

/* renamed from: o.callServiceStopSelfResult */
public final class callServiceStopSelfResult extends setTvRemark.IconCompatParcelizer {
    public SCBUniversalWebViewActivity$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver;
    public List<getContainerId> write;

    public callServiceStopSelfResult() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof callServiceStopSelfResult)) {
            return false;
        }
        callServiceStopSelfResult callservicestopselfresult = (callServiceStopSelfResult) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) callservicestopselfresult.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) callservicestopselfresult.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        List<getContainerId> list = this.write;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        SCBUniversalWebViewActivity$MediaBrowserCompat$ItemReceiver sCBUniversalWebViewActivity$MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (sCBUniversalWebViewActivity$MediaBrowserCompat$ItemReceiver != null) {
            i = sCBUniversalWebViewActivity$MediaBrowserCompat$ItemReceiver.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeejungPlanResponse(transactions=");
        sb.append(this.write);
        sb.append(", status=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ callServiceStopSelfResult(byte b) {
        this((List<getContainerId>) null, (SCBUniversalWebViewActivity$MediaBrowserCompat$ItemReceiver) null);
    }

    private callServiceStopSelfResult(List<getContainerId> list, SCBUniversalWebViewActivity$MediaBrowserCompat$ItemReceiver sCBUniversalWebViewActivity$MediaBrowserCompat$ItemReceiver) {
        this.write = null;
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
    }
}
