package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.encodedPath */
public final class encodedPath extends setCurrentItemInternal {
    @SerializedName("accountNumber")
    public final String IconCompatParcelizer;
    @SerializedName("maxAmount")
    public final Double MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("limitAmount")
    public final Double MediaBrowserCompat$ItemReceiver;
    @SerializedName("limitStepSize")
    public final Double read;
    @SerializedName("minAmount")
    public final Double write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof encodedPath)) {
            return false;
        }
        encodedPath encodedpath = (encodedPath) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) encodedpath.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) encodedpath.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) encodedpath.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) encodedpath.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) encodedpath.read);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        Double d = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = d != null ? d.hashCode() : 0;
        Double d2 = this.write;
        int hashCode3 = d2 != null ? d2.hashCode() : 0;
        Double d3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = d3 != null ? d3.hashCode() : 0;
        Double d4 = this.read;
        if (d4 != null) {
            i = d4.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("QrBScanCEntity(accountNumber=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", limitAmount=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", minAmount=");
        sb.append(this.write);
        sb.append(", maxAmount=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", limitStepSize=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
