package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getMarkers */
public final class getMarkers {
    @SerializedName("availableCredit")
    public final Double IconCompatParcelizer;
    @SerializedName("limitLabel")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("creditLimit")
    public final Double MediaBrowserCompat$ItemReceiver;
    @SerializedName("status")
    public final setOnPageChangeListener MediaMetadataCompat;
    @SerializedName("cardRefNo")
    public final String read;
    @SerializedName("creditUsed")
    public final Double write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getMarkers)) {
            return false;
        }
        getMarkers getmarkers = (getMarkers) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) getmarkers.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getmarkers.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getmarkers.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getmarkers.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getmarkers.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getmarkers.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        setOnPageChangeListener setonpagechangelistener = this.MediaMetadataCompat;
        int i = 0;
        int hashCode = setonpagechangelistener != null ? setonpagechangelistener.hashCode() : 0;
        Double d = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = d != null ? d.hashCode() : 0;
        Double d2 = this.write;
        int hashCode3 = d2 != null ? d2.hashCode() : 0;
        Double d3 = this.IconCompatParcelizer;
        int hashCode4 = d3 != null ? d3.hashCode() : 0;
        String str = this.read;
        int hashCode5 = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DepositAdditionalLimitEntity(status=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", creditLimit=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", creditUsed=");
        sb.append(this.write);
        sb.append(", availableCredit=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", cardRefNo=");
        sb.append(this.read);
        sb.append(", limitLabel=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
