package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.fromAsset */
public final class fromAsset {
    @SerializedName("salesSheetFlag")
    public final int IconCompatParcelizer;
    @SerializedName("sortSequence")
    public final int MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("productName")
    public final String read;
    @SerializedName("productSalesSheet")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fromAsset)) {
            return false;
        }
        fromAsset fromasset = (fromAsset) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) fromasset.read) && this.MediaBrowserCompat$CustomActionResultReceiver == fromasset.MediaBrowserCompat$CustomActionResultReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) fromasset.write) && this.IconCompatParcelizer == fromasset.IconCompatParcelizer;
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        int i2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        String str2 = this.write;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (((((hashCode * 31) + i2) * 31) + i) * 31) + this.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SubSalesSheetEntity(productName=");
        sb.append(this.read);
        sb.append(", sortSequence=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", productSalesSheet=");
        sb.append(this.write);
        sb.append(", salesSheetFlag=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}
