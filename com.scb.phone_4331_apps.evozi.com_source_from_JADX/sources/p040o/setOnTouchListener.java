package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.setOnTouchListener */
public final class setOnTouchListener extends setCurrentItemInternal {
    @SerializedName("transactionDateTime")
    public final String IconCompatParcelizer;
    @SerializedName("buttons")
    public final List<setNoDataTextTypeface> MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("merchantMetaData")
    public final onSnapshotReady MediaBrowserCompat$ItemReceiver;
    @SerializedName("remainingBalance")
    public final String read;
    @SerializedName("paymentId")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setOnTouchListener)) {
            return false;
        }
        setOnTouchListener setontouchlistener = (setOnTouchListener) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setontouchlistener.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setontouchlistener.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setontouchlistener.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setontouchlistener.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setontouchlistener.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        onSnapshotReady onsnapshotready = this.MediaBrowserCompat$ItemReceiver;
        int hashCode4 = onsnapshotready != null ? onsnapshotready.hashCode() : 0;
        List<setNoDataTextTypeface> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PurchasePaymentConfirmationDataEntity(paymentId=");
        sb.append(this.write);
        sb.append(", transactionDateTime=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", remainingBalance=");
        sb.append(this.read);
        sb.append(", merchantMetaData=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", buttons=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
