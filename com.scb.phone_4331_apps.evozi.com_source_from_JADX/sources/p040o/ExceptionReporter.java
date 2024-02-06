package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.ExceptionReporter */
public final class ExceptionReporter {
    @SerializedName("remark")
    public final String IconCompatParcelizer;
    @SerializedName("pagingOffset")
    public final Integer MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("transactions")
    public final List<onBind> MediaBrowserCompat$ItemReceiver;
    @SerializedName("totalCount")
    public final int read;
    @SerializedName("endOfListFlag")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExceptionReporter)) {
            return false;
        }
        ExceptionReporter exceptionReporter = (ExceptionReporter) obj;
        return this.read == exceptionReporter.read && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) exceptionReporter.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) exceptionReporter.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) exceptionReporter.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) exceptionReporter.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        int i = this.read;
        String str = this.write;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        Integer num = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = num != null ? num.hashCode() : 0;
        List<onBind> list = this.MediaBrowserCompat$ItemReceiver;
        if (list != null) {
            i2 = list.hashCode();
        }
        return (((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TransferHistoryEntity(totalCount=");
        sb.append(this.read);
        sb.append(", endOfListFlag=");
        sb.append(this.write);
        sb.append(", remark=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", pagingOffset=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", transactions=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}
