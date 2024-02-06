package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.StrokeContent */
public final class StrokeContent {
    @SerializedName("rate")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("amount")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrokeContent)) {
            return false;
        }
        StrokeContent strokeContent = (StrokeContent) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) strokeContent.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) strokeContent.write);
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
        sb.append("DutyStampFeeEntity(rate=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", amount=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
