package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.setTraceEnabled */
public final class setTraceEnabled extends setCurrentItemInternal {
    @SerializedName("numOfTransaction")
    public final Integer IconCompatParcelizer;
    @SerializedName("transactions")
    public final List<C1224L> MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("pagination")
    public final cancelLoaderTask write;

    public setTraceEnabled() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setTraceEnabled)) {
            return false;
        }
        setTraceEnabled settraceenabled = (setTraceEnabled) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) settraceenabled.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) settraceenabled.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) settraceenabled.write);
    }

    public final int hashCode() {
        List<C1224L> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        Integer num = this.IconCompatParcelizer;
        int hashCode2 = num != null ? num.hashCode() : 0;
        cancelLoaderTask cancelloadertask = this.write;
        if (cancelloadertask != null) {
            i = cancelloadertask.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ECouponTransactionEntity(transactions=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", numOfTransaction=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", pagination=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    private /* synthetic */ setTraceEnabled(byte b) {
        this((List<C1224L>) null, 0, (cancelLoaderTask) null);
    }

    private setTraceEnabled(List<C1224L> list, Integer num, cancelLoaderTask cancelloadertask) {
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
        this.IconCompatParcelizer = num;
        this.write = null;
    }
}
