package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.setRenderer */
public final class setRenderer {
    @SerializedName("creditcardInstallment")
    public final setMarkerView IconCompatParcelizer;
    @SerializedName("partnerId")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("billPayment")
    public final setHighlighter MediaBrowserCompat$ItemReceiver;
    @SerializedName("partnerTransactionId")
    public final String MediaBrowserCompat$MediaItem;
    @SerializedName("partnerName")
    public final String MediaDescriptionCompat;
    @SerializedName("partnerType")
    public final String MediaMetadataCompat;
    @SerializedName("partnerSubType")
    public final List<String> RatingCompat;
    @SerializedName("creditCardFullAmount")
    public final setLogEnabled read;
    @SerializedName("merchantMetaData")
    public final setOnChartGestureListener write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setRenderer)) {
            return false;
        }
        setRenderer setrenderer = (setRenderer) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setrenderer.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setrenderer.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) setrenderer.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) setrenderer.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) setrenderer.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) setrenderer.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setrenderer.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setrenderer.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setrenderer.write);
    }

    public final int hashCode() {
        setMarkerView setmarkerview = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = setmarkerview != null ? setmarkerview.hashCode() : 0;
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.MediaDescriptionCompat;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$MediaItem;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaMetadataCompat;
        int hashCode5 = str4 != null ? str4.hashCode() : 0;
        List<String> list = this.RatingCompat;
        int hashCode6 = list != null ? list.hashCode() : 0;
        setHighlighter sethighlighter = this.MediaBrowserCompat$ItemReceiver;
        int hashCode7 = sethighlighter != null ? sethighlighter.hashCode() : 0;
        setLogEnabled setlogenabled = this.read;
        int hashCode8 = setlogenabled != null ? setlogenabled.hashCode() : 0;
        setOnChartGestureListener setonchartgesturelistener = this.write;
        if (setonchartgesturelistener != null) {
            i = setonchartgesturelistener.hashCode();
        }
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PurchaseSourceOfFundEntity(creditCardInstallment=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", partnerId=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", partnerName=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", partnerTransactionId=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", partnerType=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", partnerSubType=");
        sb.append(this.RatingCompat);
        sb.append(", billPayment=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", creditCardFullAmount=");
        sb.append(this.read);
        sb.append(", merchantMetaData=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
