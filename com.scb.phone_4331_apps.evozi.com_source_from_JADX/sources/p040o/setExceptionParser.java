package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setExceptionParser */
public final class setExceptionParser {
    @SerializedName("interestAmount")
    public final Double IconCompatParcelizer;
    @SerializedName("interestRate")
    public final Double MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("amount")
    public final Double MediaBrowserCompat$ItemReceiver;
    @SerializedName("number")
    public final String MediaBrowserCompat$MediaItem;
    @SerializedName("netAmount")
    public final Double MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("tax")
    public final Double MediaDescriptionCompat;
    @SerializedName("status")
    public final zzaf MediaMetadataCompat;
    @SerializedName("maturityDate")
    public final String read;
    @SerializedName("depositDate")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setExceptionParser)) {
            return false;
        }
        setExceptionParser setexceptionparser = (setExceptionParser) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) setexceptionparser.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) setexceptionparser.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setexceptionparser.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setexceptionparser.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setexceptionparser.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) setexceptionparser.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setexceptionparser.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setexceptionparser.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) setexceptionparser.MediaMetadataCompat);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$MediaItem;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        Double d = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode2 = d != null ? d.hashCode() : 0;
        Double d2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = d2 != null ? d2.hashCode() : 0;
        Double d3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = d3 != null ? d3.hashCode() : 0;
        Double d4 = this.IconCompatParcelizer;
        int hashCode5 = d4 != null ? d4.hashCode() : 0;
        Double d5 = this.MediaDescriptionCompat;
        int hashCode6 = d5 != null ? d5.hashCode() : 0;
        String str2 = this.write;
        int hashCode7 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode8 = str3 != null ? str3.hashCode() : 0;
        zzaf zzaf = this.MediaMetadataCompat;
        if (zzaf != null) {
            i = zzaf.hashCode();
        }
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SubDepositEntity(number=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", netAmount=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", amount=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", interestRate=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", interestAmount=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", tax=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", depositDate=");
        sb.append(this.write);
        sb.append(", maturityDate=");
        sb.append(this.read);
        sb.append(", status=");
        sb.append(this.MediaMetadataCompat);
        sb.append(")");
        return sb.toString();
    }
}
