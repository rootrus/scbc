package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setPaint */
public final class setPaint extends setCurrentItemInternal {
    @SerializedName("fee")
    public final String IconCompatParcelizer;
    @SerializedName("merchantMetaData")
    public final setOnChartGestureListener MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("cardIconUrl")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("remark")
    public final String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("transactionToken")
    public final String MediaDescriptionCompat;
    @SerializedName("partnerSubType")
    public final String MediaMetadataCompat;
    @SerializedName("email")
    public final String read;
    @SerializedName("cardHolderName")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setPaint)) {
            return false;
        }
        setPaint setpaint = (setPaint) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) setpaint.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) setpaint.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setpaint.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setpaint.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setpaint.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setpaint.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) setpaint.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setpaint.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.MediaDescriptionCompat;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaMetadataCompat;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.write;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.read;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        setOnChartGestureListener setonchartgesturelistener = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (setonchartgesturelistener != null) {
            i = setonchartgesturelistener.hashCode();
        }
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PurchaseVerificationDataEntity(transactionToken=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", partnerSubType=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", cardIconUrl=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", fee=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", cardHolderName=");
        sb.append(this.write);
        sb.append(", email=");
        sb.append(this.read);
        sb.append(", remark=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", merchantMetaData=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
