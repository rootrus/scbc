package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.Chart */
public final class Chart {
    @SerializedName("walletId")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("walletStatus")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("sortSequence")
    public final int read;
    @SerializedName("productType")
    public final PINBlockException write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Chart)) {
            return false;
        }
        Chart chart = (Chart) obj;
        return this.read == chart.read && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) chart.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) chart.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) chart.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        int i = this.read;
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        PINBlockException pINBlockException = this.write;
        int hashCode2 = pINBlockException != null ? pINBlockException.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return (((((i * 31) + hashCode) * 31) + hashCode2) * 31) + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UnregisteredMerchantWalletEntity(sortSequence=");
        sb.append(this.read);
        sb.append(", walletId=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", productType=");
        sb.append(this.write);
        sb.append(", walletStatus=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}
