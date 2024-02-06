package p040o;

/* renamed from: o.setWatermarkEnabled */
public final class setWatermarkEnabled {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$MediaItem;
    public final String MediaBrowserCompat$SearchResultReceiver;
    public final String MediaMetadataCompat;
    public final String RatingCompat;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setWatermarkEnabled)) {
            return false;
        }
        setWatermarkEnabled setwatermarkenabled = (setWatermarkEnabled) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) setwatermarkenabled.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setwatermarkenabled.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setwatermarkenabled.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setwatermarkenabled.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) setwatermarkenabled.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) setwatermarkenabled.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setwatermarkenabled.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) setwatermarkenabled.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setwatermarkenabled.write);
    }

    public final int hashCode() {
        String str = this.RatingCompat;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$MediaItem;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.read;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.MediaMetadataCompat;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.write;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TransferRepeatResponse(transferType=");
        sb.append(this.RatingCompat);
        sb.append(", accountFrom=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", accountTo=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", accountToName=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", promptpayType=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", promptpayId=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", bankCode=");
        sb.append(this.read);
        sb.append(", transferAmount=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", bankLogo=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public setWatermarkEnabled(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        onGetStartedClick.write((Object) str, "transferType");
        onGetStartedClick.write((Object) str3, "accountTo");
        onGetStartedClick.write((Object) str4, "accountToName");
        onGetStartedClick.write((Object) str7, "bankCode");
        onGetStartedClick.write((Object) str9, "bankLogo");
        this.RatingCompat = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
        this.IconCompatParcelizer = str4;
        this.MediaBrowserCompat$SearchResultReceiver = str5;
        this.MediaBrowserCompat$MediaItem = str6;
        this.read = str7;
        this.MediaMetadataCompat = str8;
        this.write = str9;
    }
}
