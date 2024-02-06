package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setDragDecelerationFrictionCoef */
public final class setDragDecelerationFrictionCoef {
    @SerializedName("productType")
    public final PINBlockException MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("cardRefNo")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("cardMask")
    public final String read;
    @SerializedName("sortSequence")
    public final int write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setDragDecelerationFrictionCoef)) {
            return false;
        }
        setDragDecelerationFrictionCoef setdragdecelerationfrictioncoef = (setDragDecelerationFrictionCoef) obj;
        return this.write == setdragdecelerationfrictioncoef.write && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setdragdecelerationfrictioncoef.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setdragdecelerationfrictioncoef.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setdragdecelerationfrictioncoef.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        int i = this.write;
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        PINBlockException pINBlockException = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (pINBlockException != null) {
            i2 = pINBlockException.hashCode();
        }
        return (((((i * 31) + hashCode) * 31) + hashCode2) * 31) + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UnregisteredPrepaidCardsEntity(sortSequence=");
        sb.append(this.write);
        sb.append(", cardRefNo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", cardMask=");
        sb.append(this.read);
        sb.append(", productType=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
