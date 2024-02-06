package p040o;

/* renamed from: o.CrashlyticsReportWithSessionId */
public final class CrashlyticsReportWithSessionId {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$MediaItem;
    public final String MediaBrowserCompat$SearchResultReceiver;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final String RatingCompat;
    public final populateSessionDeviceData read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReportWithSessionId)) {
            return false;
        }
        CrashlyticsReportWithSessionId crashlyticsReportWithSessionId = (CrashlyticsReportWithSessionId) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) crashlyticsReportWithSessionId.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) crashlyticsReportWithSessionId.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) crashlyticsReportWithSessionId.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) crashlyticsReportWithSessionId.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) crashlyticsReportWithSessionId.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) crashlyticsReportWithSessionId.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) crashlyticsReportWithSessionId.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) crashlyticsReportWithSessionId.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) crashlyticsReportWithSessionId.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) crashlyticsReportWithSessionId.MediaDescriptionCompat);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaMetadataCompat;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.RatingCompat;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        populateSessionDeviceData populatesessiondevicedata = this.read;
        int hashCode8 = populatesessiondevicedata != null ? populatesessiondevicedata.hashCode() : 0;
        String str8 = this.MediaBrowserCompat$MediaItem;
        int hashCode9 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.MediaDescriptionCompat;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RecommendDisplay(assetType=");
        sb.append(this.write);
        sb.append(", fundPicturePath=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", caption=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", fundCode=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", fundDayEndNav=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", fundChange=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", fundNavDate=");
        sb.append(this.RatingCompat);
        sb.append(", changeType=");
        sb.append(this.read);
        sb.append(", ipoFundName=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", ipoPeriodDate=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(")");
        return sb.toString();
    }

    public CrashlyticsReportWithSessionId(String str, String str2, String str3, String str4, String str5, String str6, String str7, populateSessionDeviceData populatesessiondevicedata, String str8, String str9) {
        onGetStartedClick.write((Object) str, "assetType");
        onGetStartedClick.write((Object) str2, "fundPicturePath");
        onGetStartedClick.write((Object) str3, "caption");
        onGetStartedClick.write((Object) str4, "fundCode");
        onGetStartedClick.write((Object) str5, "fundDayEndNav");
        onGetStartedClick.write((Object) str6, "fundChange");
        onGetStartedClick.write((Object) str7, "fundNavDate");
        onGetStartedClick.write((Object) populatesessiondevicedata, "changeType");
        onGetStartedClick.write((Object) str8, "ipoFundName");
        onGetStartedClick.write((Object) str9, "ipoPeriodDate");
        this.write = str;
        this.MediaBrowserCompat$SearchResultReceiver = str2;
        this.IconCompatParcelizer = str3;
        this.MediaBrowserCompat$ItemReceiver = str4;
        this.MediaMetadataCompat = str5;
        this.MediaBrowserCompat$CustomActionResultReceiver = str6;
        this.RatingCompat = str7;
        this.read = populatesessiondevicedata;
        this.MediaBrowserCompat$MediaItem = str8;
        this.MediaDescriptionCompat = str9;
    }
}
