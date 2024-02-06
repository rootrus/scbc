package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.cancelLoaderTask */
public final class cancelLoaderTask {
    @SerializedName("pageSize")
    public final Integer IconCompatParcelizer;
    @SerializedName("hasPreviousPage")
    public final Boolean MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("hasNextPage")
    public final Boolean MediaBrowserCompat$ItemReceiver;
    @SerializedName("currentPage")
    public final Integer write;

    public cancelLoaderTask() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cancelLoaderTask)) {
            return false;
        }
        cancelLoaderTask cancelloadertask = (cancelLoaderTask) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) cancelloadertask.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) cancelloadertask.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) cancelloadertask.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) cancelloadertask.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        Integer num = this.write;
        int i = 0;
        int hashCode = num != null ? num.hashCode() : 0;
        Integer num2 = this.IconCompatParcelizer;
        int hashCode2 = num2 != null ? num2.hashCode() : 0;
        Boolean bool = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = bool != null ? bool.hashCode() : 0;
        Boolean bool2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ECouponTransactionPaginateEntity(currentPage=");
        sb.append(this.write);
        sb.append(", pageSize=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", hasNextPage=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", hasPreviousPage=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    private cancelLoaderTask(Integer num, Integer num2, Boolean bool, Boolean bool2) {
        this.write = num;
        this.IconCompatParcelizer = num2;
        this.MediaBrowserCompat$ItemReceiver = bool;
        this.MediaBrowserCompat$CustomActionResultReceiver = bool2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private /* synthetic */ cancelLoaderTask(byte r2) {
        /*
            r1 = this;
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.<init>(r0, r0, r2, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.cancelLoaderTask.<init>(byte):void");
    }
}
