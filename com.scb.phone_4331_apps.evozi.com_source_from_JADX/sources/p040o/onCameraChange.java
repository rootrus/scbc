package p040o;

import com.google.gson.annotations.SerializedName;
import org.threeten.p041bp.OffsetDateTime;
import p039io.beid.beidk.definitions.BeIDParams;

/* renamed from: o.onCameraChange */
public final class onCameraChange {
    @SerializedName("transactionDateTime")
    public final OffsetDateTime MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("remainingBalance")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("transactionId")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onCameraChange)) {
            return false;
        }
        onCameraChange oncamerachange = (onCameraChange) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) oncamerachange.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) oncamerachange.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) oncamerachange.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        OffsetDateTime offsetDateTime = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = offsetDateTime != null ? offsetDateTime.hashCode() : 0;
        String str = this.write;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrepaidRequestOtpConfirm(transactionDateTime=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", transactionId=");
        sb.append(this.write);
        sb.append(", remainingBalance=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public onCameraChange(OffsetDateTime offsetDateTime, String str, String str2) {
        onGetStartedClick.write((Object) str, BeIDParams.BEID_TRANSACTION_ID);
        onGetStartedClick.write((Object) str2, "remainingBalance");
        this.MediaBrowserCompat$CustomActionResultReceiver = offsetDateTime;
        this.write = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
    }
}
